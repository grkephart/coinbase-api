/**
 * 
 */
package org.drdeesw.coinbase.api.models.products;


import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class CoinbaseFcmTradingSessionDetailsImpl implements CoinbaseFcmTradingSessionDetails
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
  @Override
  public Instant getCloseTime()
  {
    return closeTime;
  }


  /**
   * @return the openTime
   */
  @Override
  public Instant getOpenTime()
  {
    return openTime;
  }


  /**
   * @return the sessionOpen
   */
  @Override
  public boolean isSessionOpen()
  {
    return sessionOpen;
  }


  /**
   * @param closeTime the closeTime to set
   */
  @Override
  public void setCloseTime(
    Instant closeTime)
  {
    this.closeTime = closeTime;
  }


  /**
   * @param openTime the openTime to set
   */
  @Override
  public void setOpenTime(
    Instant openTime)
  {
    this.openTime = openTime;
  }


  /**
   * @param sessionOpen the sessionOpen to set
   */
  @Override
  public void setSessionOpen(
    boolean sessionOpen)
  {
    this.sessionOpen = sessionOpen;
  }

}
