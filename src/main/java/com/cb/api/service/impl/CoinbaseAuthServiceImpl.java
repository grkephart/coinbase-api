/**
 * 
 */
package com.cb.api.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cb.api.clients.CoinbaseAuthClient;
import com.cb.api.dto.auth.AccessToken;
import com.cb.api.dto.auth.AuthTokenRequest;
import com.cb.api.service.CoinbaseAuthService;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This is for your app to get authorized by Coinbase
 */
@Service
public class CoinbaseAuthServiceImpl implements CoinbaseAuthService
{
  private static final String CLIENT_ID_KEY     = "client-id";
  private static final String CLIENT_SECRET_KEY = "client-secret";
  private static final String CLIENT_SCOPE_KEY  = "scope";
  private static final String CLIENT_STATE_KEY  = "state";
  private AccessToken         accessToken;
  @Autowired
  private CoinbaseAuthClient  client;
  @Autowired
  private Environment         env;

  /**
   * Note that since this library can be used by apps that have users and those
   * that don't, we can't make the properties class-level using the Value
   * annotation because we can't require the app to have both these properties
   * and the spring.security.oauth2.client.registration.* properties on 
   * application startup.
   * 
   * @return the access token
   */
  public AccessToken getAccessToken()
  {
    String clientId = this.env.getProperty(CLIENT_ID_KEY);
    String clientSecret = this.env.getProperty(CLIENT_SECRET_KEY);

    if (this.accessToken == null)
    {
      String scope = this.env.getProperty(CLIENT_SCOPE_KEY);
      String state = this.env.getProperty(CLIENT_STATE_KEY);
      String page = this.client.getAuth(CoinbaseAuthClient.RESPONSE_TYPE, clientId,
        CoinbaseAuthClient.APP_REQUEST_URI, state, scope);
      String code = page.substring(0, 1);// TODO
      String newState = page.substring(0, 1);// TODO      

      if (state == null || state.equals(newState))
      {
        AuthTokenRequest authTokenRequest = new AuthTokenRequest(CoinbaseAuthClient.GRANT_TYPE,
            code, clientId, clientSecret, CoinbaseAuthClient.APP_REQUEST_URI);

        this.accessToken = this.client.getToken(authTokenRequest);
      }
    }
    else if (this.accessToken.isExpired())
    {
      AuthTokenRequest authTokenRequest = new AuthTokenRequest(
          CoinbaseAuthClient.REFRESH_GRANT_TYPE, clientId, clientSecret,
          this.accessToken.getRefreshToken());

      this.accessToken = this.client.getToken(authTokenRequest);
    }

    return this.accessToken;
  }


  /**
   *
   */
  @Override
  public String getAuthorization()
  {
    return getAccessToken().getAccessToken();
  }

}
