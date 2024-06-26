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
  @JsonProperty("grant_type")
  private String grantType;

  /**
   * 
   */
  public AuthTokenRequest()
  {
  }


  /**
   * @param grant_type
   * @param client_id
   * @param client_secret
   */
  public AuthTokenRequest(String grant_type, String client_id, String client_secret)
  {
    super();
    this.grantType = grant_type;
    this.clientId = client_id;
    this.clientSecret = client_secret;
  }


  /**
   * @return the clientId
   */
  public String getClient_id()
  {
    return clientId;
  }


  /**
   * @return the clientSecret
   */
  public String getClient_secret()
  {
    return clientSecret;
  }


  /**
   * @return the grantType
   */
  public String getGrant_type()
  {
    return grantType;
  }


  /**
   * @param client_id the client_id to set
   */
  public void setClient_id(
    String client_id)
  {
    this.clientId = client_id;
  }


  /**
   * @param client_secret the client_secret to set
   */
  public void setClient_secret(
    String client_secret)
  {
    this.clientSecret = client_secret;
  }


  /**
   * @param grant_type the grant_type to set
   */
  public void setGrant_type(
    String grant_type)
  {
    this.grantType = grant_type;
  }

}
