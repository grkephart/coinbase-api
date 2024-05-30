/**
 * 
 */
package com.cb.api.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cb.api.dto.auth.AccessToken;


/**
 * Use OAuth authentication if you're building an application for many users on
 * top of the Advanced Trade APIs. See Sign in with Coinbase OAuth2 Integration
 * to get a client set up and make authenticated calls. Authorize URL:
 * https://login.coinbase.com/oauth2/auth Access Token URL:
 * https://login.coinbase.com/oauth2/token
 * 
 */
@FeignClient(value = "coinbaseAuthService", url = CoinbaseAuthClient.BASE_URL)
public interface CoinbaseAuthFeignClient extends CoinbaseAuthClient
{
  /**
   * Requests an authorization token.
   * 
   * @param authTokenRequest an object containing grantType (always
   *                         'client_credentials'), client_id and client_secret)
   * @return an access token to be used in other requests
   */
  // @Headers("Content-Type: application/x-www-form-urlencoded")
  @PostMapping(value = "/oauth2/token", //
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, //
      produces = MediaType.APPLICATION_JSON_VALUE)
  public AccessToken getToken(//
    @RequestParam("grant_type")
    String grantType, //
    @RequestParam("code")
    String code, //
    @RequestParam("client_id")
    String clientId, //
    @RequestParam("client_secret")
    String clientSecret, //
    @RequestParam("redirect_uri")
    String redirectUrl);


  /**
   * Requests an authorization token.
   * 
   * @param authTokenRequest an object containing grantType (always
   *                         'client_credentials'), client_id and client_secret)
   * @return an access token to be used in other requests
   */
  // @Headers("Content-Type: application/x-www-form-urlencoded")
  @PostMapping(value = "/oauth2/token", //
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, //
      produces = MediaType.APPLICATION_JSON_VALUE)
  public AccessToken refreshToken(//
    @RequestParam("grant_type")
    String grantType, //
    @RequestParam("client_id")
    String clientId, //
    @RequestParam("client_secret")
    String clientSecret, //
    @RequestParam("refresh_token")
    String refreshToken);
}
