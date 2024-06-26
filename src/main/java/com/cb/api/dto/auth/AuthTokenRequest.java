/**
 * 
 */
package com.cb.api.dto.auth;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author gary_kephart
 *
 */
public class AuthTokenRequest
{
  @JsonProperty("client_id")
  private String clientId;

  @JsonProperty("client_secret")
  private String clientSecret;

  @JsonProperty("code")
  private String code;

  @JsonProperty("grant_type")
  private String grantType;

  @JsonProperty("redirect_uri")
  private String redirectUri;

  @JsonProperty("response_type")
  private String responseType;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("state")
  private String state;

  /**
   * 
   */
  public AuthTokenRequest()
  {
  }


  /**
   * @param grantType
   * @param code
   * @param clientId
   * @param clientSecret
   * @param redirectUri
   */
  public AuthTokenRequest(String grantType, String code, String clientId, String clientSecret,
                          String redirectUri)
  {
    super();
    this.grantType = grantType;
    this.code = code;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.redirectUri = redirectUri;
  }


  /**
   * For use with AuthTokenRequestDeserializer.
   * 
   * @param clientId
   * @param clientSecret
   * @param code
   * @param grantType
   * @param redirectUri
   * @param responseType
   * @param scope
   * @param state
   */
  public AuthTokenRequest(String clientId, String clientSecret, String code, String grantType,
                          String redirectUri, String responseType, String scope, String state)
  {
    super();
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.code = code;
    this.grantType = grantType;
    this.redirectUri = redirectUri;
    this.responseType = responseType;
    this.scope = scope;
    this.state = state;
  }


  /**
   * @return the clientId
   */
  public String getClientId()
  {
    return clientId;
  }


  /**
   * @return the clientSecret
   */
  public String getClientSecret()
  {
    return clientSecret;
  }


  /**
   * @return the code
   */
  public String getCode()
  {
    return code;
  }


  /**
   * @return the grantType
   */
  public String getGrantType()
  {
    return grantType;
  }


  /**
   * @return the redirectUri
   */
  public String getRedirectUri()
  {
    return redirectUri;
  }


  /**
   * @return the responseType
   */
  public String getResponseType()
  {
    return responseType;
  }


  /**
   * @return the scope
   */
  public String getScope()
  {
    return scope;
  }


  /**
   * @return the state
   */
  public String getState()
  {
    return state;
  }


  /**
   * @param clientId the clientId to set
   */
  public void setClientId(
    String clientId)
  {
    this.clientId = clientId;
  }


  /**
   * @param clientSecret the clientSecret to set
   */
  public void setClientSecret(
    String clientSecret)
  {
    this.clientSecret = clientSecret;
  }


  /**
   * @param code the code to set
   */
  public void setCode(
    String code)
  {
    this.code = code;
  }


  /**
   * @param grantType the grantType to set
   */
  public void setGrantType(
    String grantType)
  {
    this.grantType = grantType;
  }


  /**
   * @param redirectUri the redirectUri to set
   */
  public void setRedirectUri(
    String redirectUri)
  {
    this.redirectUri = redirectUri;
  }


  /**
   * @param responseType the responseType to set
   */
  public void setResponseType(
    String responseType)
  {
    this.responseType = responseType;
  }


  /**
   * @param scope the scope to set
   */
  public void setScope(
    String scope)
  {
    this.scope = scope;
  }


  /**
   * @param state the state to set
   */
  public void setState(
    String state)
  {
    this.state = state;
  }

}
