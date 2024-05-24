/**
 * 
 */
package com.cb.api.clients;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


/**
 * @author gary_kephart
 *
 */
public class BetterRestTemplate<T> extends RestTemplate
{
  private MultiValueMap<String, String> params;
  private HttpHeaders                   headers;

  /**
   * @param contentType
   */
  public BetterRestTemplate(MediaType contentType)
  {
    this.params = new LinkedMultiValueMap<>();
    this.headers = new HttpHeaders();

    this.headers.setContentType(contentType);
  }


  /**
   * @param key
   * @param value
   * @return
   */
  public BetterRestTemplate<T> addParam(
    String key,
    String value)
  {
    this.params.add(key, value);

    return this;
  }


  /**
   * @param key
   * @param value
   * @return
   */
  public BetterRestTemplate<T> addOptionalParam(
    String key,
    String value)
  {
    if (value != null)
    {
      addParam(key, value);
    }

    return this;
  }


  /**
   * @param httpUrl
   * @param method
   * @param clazz
   * @return
   */
  public ResponseEntity<T> exchange(
    String httpUrl,
    HttpMethod method,
    Class<T> clazz)
  {
    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(httpUrl).queryParams(params);
    HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(this.params,
        this.headers);

    return super.exchange(builder.toUriString(), method, requestEntity, clazz);
  }
}
