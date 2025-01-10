/**
 * 
 */
package org.drdeesw.coinbase.api.models.auth;


import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * @author gary_kephart
 *
 */
@JsonDeserialize(using = AccessTokenDeserializer.class)
public class AccessToken
{
  public static final int MINUTES_30 = 1800;
  @JsonProperty("access_token")
  private String          accessToken;
  @JsonIgnore
  private Instant         expirationInstant;
  @JsonProperty("expires_in")
  private int             expiresIn;
  @JsonProperty("refresh_token")
  private String          refreshToken; // TODO how do we use this?
  @JsonProperty("token_type")
  private String          tokenType; // TODO what is this? Is it useful?

  /**
   * 
   */
  public AccessToken()
  {

  }


  /**
   * @param accessTokenValue
   * @param tokenType
   * @param expiresIn
   */
  public AccessToken(String accessTokenValue, String tokenType, int expiresIn, String refreshToken)
  {
    Instant now = Instant.now();

    this.expirationInstant = Instant.ofEpochSecond(now.getEpochSecond() + expiresIn);
    this.accessToken = accessTokenValue;
    this.tokenType = tokenType;
    this.expiresIn = expiresIn;
    this.refreshToken = refreshToken;
  }


  /**
   * For dev token.
   * 
   * @param devToken
   */
  public AccessToken(String devToken)
  {
    Instant now = Instant.now();

    this.expirationInstant = Instant.ofEpochSecond(now.getEpochSecond() + MINUTES_30);
    this.accessToken = devToken;
    this.tokenType = "";
    ;
    this.expiresIn = MINUTES_30;
    this.refreshToken = "";
  }


  /**
   * @return the accessToken
   */
  public String getAccessToken()
  {
    return accessToken;
  }


  /**
   * @return the expiresIn
   */
  public int getExpiresIn()
  {
    return expiresIn;
  }


  /**
   * @return the refreshToken
   */
  public String getRefreshToken()
  {
    return refreshToken;
  }


  /**
   * @return the tokenType
   */
  public String getTokenType()
  {
    return tokenType;
  }


  /**
   * @return
   */
  public boolean isExpired()
  {
    Instant now = Instant.now();

    return now.isAfter(this.expirationInstant);
  }


  /**
   * @param access_token the access_token to set
   */
  public void setAccessToken(
    String access_token)
  {
    this.accessToken = access_token;
  }


  /**
   * @param devToken
   */
  public void setDevToken(
    String devToken)
  {
    Instant now = Instant.now();

    this.accessToken = devToken;
    this.expiresIn = MINUTES_30;
    this.expirationInstant = Instant.ofEpochSecond(now.getEpochSecond() + expiresIn);
  }


  /**
   * @param expiresIn the expiresIn to set
   */
  public void setExpiresIn(
    int expiresIn)
  {
    this.expiresIn = expiresIn;
  }


  /**
   * @param refreshToken the refreshToken to set
   */
  public void setRefreshToken(
    String refreshToken)
  {
    this.refreshToken = refreshToken;
  }


  /**
   * @param tokenType the tokenType to set
   */
  public void setTokenType(
    String tokenType)
  {
    this.tokenType = tokenType;
  }
}
