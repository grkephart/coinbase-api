/**
 * 
 */
package com.cb.api.dto;


import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
public class FcmTradingSessionDetails
{

  /**
   * 
   */
  @JsonProperty("close_time")
  private Instant closeTime;

  /**
   * 
   */
  @JsonProperty("open_time")
  private Instant openTime;

  /**
   * 
   */
  @JsonProperty("is_session_open")
  private boolean sessionOpen;

  /**
   * @return the closeTime
   */
  public Instant getCloseTime()
  {
    return closeTime;
  }


  /**
   * @return the openTime
   */
  public Instant getOpenTime()
  {
    return openTime;
  }


  /**
   * @return the sessionOpen
   */
  public boolean isSessionOpen()
  {
    return sessionOpen;
  }


  /**
   * @param closeTime the closeTime to set
   */
  public void setCloseTime(
    Instant closeTime)
  {
    this.closeTime = closeTime;
  }


  /**
   * @param openTime the openTime to set
   */
  public void setOpenTime(
    Instant openTime)
  {
    this.openTime = openTime;
  }


  /**
   * @param sessionOpen the sessionOpen to set
   */
  public void setSessionOpen(
    boolean sessionOpen)
  {
    this.sessionOpen = sessionOpen;
  }

}
