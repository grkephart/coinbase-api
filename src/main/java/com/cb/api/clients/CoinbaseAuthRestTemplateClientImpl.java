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
            .addHeader("User-Agent", "Mozilla/5.0")//
            .addHeader("CB-VERSION", "2017-05-19")//
            .addParam("grant_type", grantType)//
            .addParam("code", code)//
            .addParam("client_id", clientId)//
            .addParam("client_secret", clientSecret)//
            .addParam("redirect_uri", redirectUrl)//
            .exchange(httpUrl, HttpMethod.POST, AccessToken.class);

    return responseEntity.getBody();
  }

}
