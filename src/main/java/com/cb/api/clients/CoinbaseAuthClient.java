/**
 * 
 */
package com.cb.api.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cb.api.dto.auth.AccessToken;
import com.cb.api.dto.auth.AuthTokenRequest;


/**
 * @author gary_kephart
 *
 */
@FeignClient(value = "coinbaseAuthClient", url = "https://login.coinbase.com/oauth2")
public interface CoinbaseAuthClient
{
  public static final String APP_REQUEST_URI    = "urn:ietf:wg:oauth:2.0:oob";
  public static final String GRANT_TYPE         = "authorization_code";
  public static final String REFRESH_GRANT_TYPE = "refresh_token";
  public static final String RESPONSE_TYPE      = "code";

  /**
   * This is for 1. Redirect users to request Coinbase access.
   * The requestUri is "urn:ietf:wg:oauth:2.0:oob" for app to app and no users are involved.
   * 
   * @param authTokenRequest, with isAuth = true
   * @return a blank page with the authorization code in the URL and title of the page
   */
  @GetMapping(value = "/auth")
  public String getAuth(
    @RequestParam("response_type")
    String responseType,

    @RequestParam("client_id")
    String clientId,

    @RequestParam("redirect_uri")
    String redirectUri,

    @RequestParam("state")
    String state,

    @RequestParam("scope")
    String scope);


  /**
   * This is for 3. Exchange code for an access token.
   * 
   * @param authTokenRequest, with isAuth = false
   * @return
   */
  @PostMapping(value = "/token", consumes = "application/json")
  public AccessToken getToken(
    AuthTokenRequest authTokenRequest);
}
