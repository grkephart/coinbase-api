/**
 * 
 */
package com.cb.api.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author gary_kephart
 *
 */
@FeignClient(value = "coinbaseAccountService", url = "https://login.coinbase.com/oauth2")
public interface CoinbaseAccountService
{
  @GetMapping("/auth")
  public String getAuth(
    AuthTokenRequest authTokenRequest);


  @GetMapping("/token")
  public String getToken(
    AuthTokenRequest authTokenRequest);
}
