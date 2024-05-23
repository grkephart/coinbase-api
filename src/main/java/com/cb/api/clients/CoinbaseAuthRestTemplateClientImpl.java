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


@Service
public class CoinbaseAuthRestTemplateClientImpl implements CoinbaseAuthRestTemplateClient
{

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
