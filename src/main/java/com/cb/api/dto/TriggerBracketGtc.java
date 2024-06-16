/**
 * 
 */
package com.cb.api.dto;


import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Good-'til-canceled 
 */
@SuppressWarnings("serial")
public class TriggerBracketGtc implements Serializable
{
  /**
   * Amount of base currency to spend on order
   */
  @JsonProperty("base_size")
  private String baseSize;

  /**
   *  Ceiling price for which the order should get filled.
   */
  @JsonProperty("limit_price")
  private String limitPrice;

  /**
   *  If the last market trade rises below this price for a BUY, and below 
   *  this price for a SELL, the system will re-price the order at 5% 
   *  above the stop_trigger_price for a BUY, and 5% below 
   *  stop_triggered_price for a SELL.
   */
  @JsonProperty("stop_trigger_price")
  private String stopTriggerPrice;

  /**
   * 
   */
  public TriggerBracketGtc()
  {
    super();
  }


  /**
   * @param baseSize
   * @param limitPrice
   * @param stopTriggerPrice
   */
  public TriggerBracketGtc(String baseSize, String limitPrice, String stopTriggerPrice)
  {
    super();
    this.baseSize = StringUtils.hasText(baseSize) ? baseSize : null;
    this.limitPrice = StringUtils.hasText(limitPrice) ? limitPrice : null;
    this.stopTriggerPrice = StringUtils.hasText(stopTriggerPrice) ? stopTriggerPrice : null;
  }


  /**
   * @return the baseSize
   */
  public String getBaseSize()
  {
    return baseSize;
  }


  /**
   * @return the limitPrice
   */
  public String getLimitPrice()
  {
    return limitPrice;
  }


  /**
   * @return the stopTriggerPrice
   */
  public String getStopTriggerPrice()
  {
    return stopTriggerPrice;
  }


  /**
   * @param baseSize the baseSize to set
   */
  public void setBaseSize(
    String baseSize)
  {
    this.baseSize = baseSize;
  }


  /**
   * @param limitPrice the limitPrice to set
   */
  public void setLimitPrice(
    String limitPrice)
  {
    this.limitPrice = limitPrice;
  }


  /**
   * @param stopTriggerPrice the stopTriggerPrice to set
   */
  public void setStopTriggerPrice(
    String stopTriggerPrice)
  {
    this.stopTriggerPrice = stopTriggerPrice;
  }

}
