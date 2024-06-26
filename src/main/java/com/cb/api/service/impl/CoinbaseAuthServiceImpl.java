/**
 * 
 */
package com.cb.api.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
  private AccessToken        accessToken;
  @Autowired
  private CoinbaseAuthClient client;
  @Value("${spring.security.oauth2.client.registration.coinbase.client-id}")
  private String             clientId;
  @Value("${spring.security.oauth2.client.registration.coinbase.client-secret}")
  private String             clientSecret;
  @Value("${spring.security.oauth2.client.registration.coinbase.scope:#{null}}")
  private String             scope;
  @Value("${spring.security.oauth2.client.registration.coinbase.state:#{null}}")
  private String             state;

  /**
   * @return
   */
  public AccessToken getAccessToken()
  {
    if (this.accessToken == null || this.accessToken.isExpired())
    {
      String page = this.client.getAuth(CoinbaseAuthClient.RESPONSE_TYPE, this.clientId,
        CoinbaseAuthClient.APP_REQUEST_URI, this.state, this.scope);
      String code = page.substring(0, 1);// TODO
      String newState = page.substring(0, 1);// TODO      

      if (this.state == null || this.state.equals(newState))
      {
        AuthTokenRequest authTokenRequest = new AuthTokenRequest(CoinbaseAuthClient.GRANT_TYPE,
            code, this.clientId, this.clientSecret, CoinbaseAuthClient.APP_REQUEST_URI);

        this.accessToken = this.client.getToken(authTokenRequest);
      }
    }

    return accessToken;
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
