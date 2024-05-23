package com.cb.api.clients;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
    RestTemplate restTemplate = new RestTemplate();
    MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
    HttpHeaders headers = new HttpHeaders();

    params.add("grant_type", grantType);
    params.add("code", code);
    params.add("client_id", clientId);
    params.add("client_secret", clientSecret);
    params.add("redirect_uri", redirectUrl);

    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(BASE_URL + "/oauth2/token")
        .queryParams(params);

    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);

    // Send the HTTP POST request
    ResponseEntity<AccessToken> responseEntity = restTemplate.exchange(builder.toUriString(),
      HttpMethod.POST, requestEntity, AccessToken.class);

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
    RestTemplate restTemplate = new RestTemplate();
    MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
    HttpHeaders headers = new HttpHeaders();

    params.add("response_type", responseType);
    params.add("client_id", clientId);

    if (redirectUri != null)
    {
      params.add("redirect_uri", redirectUri);
    }
    if (state != null)
    {
      params.add("state", state);
    }
    if (scope != null)
    {
      params.add("scope", scope);
    }

    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(BASE_URL + "/oauth2/auth")
        .queryParams(params);

    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);

    // Send the HTTP GET request
    ResponseEntity<String> responseEntity = restTemplate.exchange(builder.toUriString(),
      HttpMethod.GET, requestEntity, String.class);

    return responseEntity.getBody();
  }
}
