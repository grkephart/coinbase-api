/**
 * 
 */
package com.cb.api.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Good-'til-date 
 */
@SuppressWarnings("serial")
public class StopLimitGtd implements Serializable
{
  /**
   * Amount of base currency to spend on order
   */
  @JsonProperty("base_size")
  private String        baseSize;

  /**
   *  Time at which the order should be cancelled if it's not filled.
   *  RFC3339 Timestamp.
   */
  @JsonProperty("end_time")
  private String        endTime;

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
  public StopLimitGtd()
  {
    super();
    // TODO Auto-generated constructor stub
  }


  /**
   * @param baseSize
   * @param endTime
   * @param limitPrice
   * @param stopDirection
   * @param stopPrice
   */
  public StopLimitGtd(String baseSize, String endTime, String limitPrice,
                      StopDirection stopDirection, String stopPrice)
  {
    super();
    this.baseSize = baseSize;
    this.endTime = endTime;
    this.limitPrice = limitPrice;
    this.stopDirection = stopDirection;
    this.stopPrice = stopPrice;
  }


  /**
   * @return the baseSize
   */
  public String getBaseSize()
  {
    return baseSize;
  }


  /**
   * @return the endTime
   */
  public String getEndTime()
  {
    return endTime;
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
   * @param endTime the endTime to set
   */
  public void setEndTime(
    String endTime)
  {
    this.endTime = endTime;
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
