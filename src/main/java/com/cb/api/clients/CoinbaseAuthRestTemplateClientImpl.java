package com.cb.api.clients;


import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cb.api.dto.auth.AccessToken;


@Service
public class CoinbaseAuthRestTemplateClientImpl implements CoinbaseAuthRestTemplateClient
{

  @Override
  public AccessToken getToken(
    String grantType,
    String code,
    String clientId,
    String clientSecret,
    String redirectUrl)
  {
    final String httpUrl = BASE_URL + "/oauth2/token";
    ResponseEntity<AccessToken> responseEntity = new BetterRestTemplate<AccessToken>(
        MediaType.APPLICATION_FORM_URLENCODED)//
            .addParam("grant_type", grantType)//
            .addParam("code", code)//
            .addParam("client_id", clientId)//
            .addParam("client_secret", clientSecret)//
            .addParam("redirect_uri", redirectUrl)//
            .exchange(httpUrl, HttpMethod.POST, AccessToken.class);

    return responseEntity.getBody();
  }


  /* (non-Javadoc)
   * @see com.example.demo.cbapi.clients.CoinbaseAuthRestTemplateClient#requestAccess(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
   */
  public String requestAccess(
    String responseType,
    String clientId,
    String redirectUri,
    String state,
    String scope)
  {
    final String httpUrl = BASE_URL + "/oauth2/auth";
    ResponseEntity<String> responseEntity = new BetterRestTemplate<String>(
        MediaType.APPLICATION_FORM_URLENCODED)//
            .addParam("response_type", responseType)//
            .addParam("client_id", clientId)//
            .addOptionalParam("redirect_uri", redirectUri)//
            .addOptionalParam("state", state)//
            .addOptionalParam("scope", scope)//
            .exchange(httpUrl, HttpMethod.GET, String.class);

    return responseEntity.getBody();
  }
}
