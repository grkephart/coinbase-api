/**
 * 
 */
package com.cb.api.models.orders;


import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Good-'til-canceled 
 */
@SuppressWarnings("serial")
public class CoinbaseStopLimitGtcImpl implements CoinbaseStopLimitGtc
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
  public CoinbaseStopLimitGtcImpl()
  {
    super();
  }


  /**
   * @param baseSize
   * @param limitPrice
   * @param stopDirection
   * @param stopPrice
   */
  public CoinbaseStopLimitGtcImpl(String baseSize, String limitPrice, StopDirection stopDirection,
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
  @Override
  public String getBaseSize()
  {
    return baseSize;
  }


  /**
   * @return the limitPrice
   */
  @Override
  public String getLimitPrice()
  {
    return limitPrice;
  }


  /**
   * @return the stopDirection
   */
  @Override
  public StopDirection getStopDirection()
  {
    return stopDirection;
  }


  /**
   * @return the stopPrice
   */
  @Override
  public String getStopPrice()
  {
    return stopPrice;
  }


  /**
   * @param baseSize the baseSize to set
   */
  @Override
  public void setBaseSize(
    String baseSize)
  {
    this.baseSize = baseSize;
  }


  /**
   * @param limitPrice the limitPrice to set
   */
  @Override
  public void setLimitPrice(
    String limitPrice)
  {
    this.limitPrice = limitPrice;
  }


  /**
   * @param stopDirection the stopDirection to set
   */
  @Override
  public void setStopDirection(
    StopDirection stopDirection)
  {
    this.stopDirection = stopDirection;
  }


  /**
   * @param stopPrice the stopPrice to set
   */
  @Override
  public void setStopPrice(
    String stopPrice)
  {
    this.stopPrice = stopPrice;
  }

}
