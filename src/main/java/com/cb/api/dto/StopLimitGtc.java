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
public class StopLimitGtc implements Serializable
{
  /**
   * Amount of base currency to spend on order
   */
  @JsonProperty("base_size")
  private String        baseSize;

  /**
   *  Ceiling price for which the order should get filled.
   */
  @JsonProperty("limit_price")
  private String        limitPrice;

  /**
   *  Possible values: [STOP_DIRECTION_STOP_UP, STOP_DIRECTION_STOP_DOWN]
   */
  @JsonProperty("stop_direction")
  private StopDirection stopDirection;

  /**
   *  Price at which the order should trigger - if stop direction is Up, then 
   *  the order will trigger when the last trade price goes above this, 
   *  otherwise order will trigger when last trade price goes below this price.
   */
  @JsonProperty("stop_price")
  private String        stopPrice;

  /**
   * 
   */
  public StopLimitGtc()
  {
    super();
  }


  /**
   * @param baseSize
   * @param limitPrice
   * @param stopDirection
   * @param stopPrice
   */
  public StopLimitGtc(String baseSize, String limitPrice, StopDirection stopDirection,
                      String stopPrice)
  {
    super();
    this.baseSize = StringUtils.hasText(baseSize) ? baseSize : null;
    this.limitPrice = StringUtils.hasText(limitPrice) ? limitPrice : null;
    this.stopDirection = stopDirection;
    this.stopPrice = StringUtils.hasText(stopPrice) ? stopPrice : null;
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
   * @return the stopDirection
   */
  public StopDirection getStopDirection()
  {
    return stopDirection;
  }


  /**
   * @return the stopPrice
   */
  public String getStopPrice()
  {
    return stopPrice;
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
   * @param stopDirection the stopDirection to set
   */
  public void setStopDirection(
    StopDirection stopDirection)
  {
    this.stopDirection = stopDirection;
  }


  /**
   * @param stopPrice the stopPrice to set
   */
  public void setStopPrice(
    String stopPrice)
  {
    this.stopPrice = stopPrice;
  }

}
