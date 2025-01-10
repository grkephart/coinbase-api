/**
 * 
 */
package org.drdeesw.coinbase.api.models.orders.impl;


import org.drdeesw.coinbase.api.models.orders.CoinbaseTriggerBracketGtd;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Good-'til-canceled 
 */
@SuppressWarnings("serial")
public class CoinbaseTriggerBracketGtdImpl implements CoinbaseTriggerBracketGtd
{
  /**
   * Amount of base currency to spend on order
   */
  @JsonProperty("base_size")
  private String baseSize;

  /**
   *  Time at which the order should be cancelled if it's not filled.
   *  RFC3339 Timestamp.
   */
  @JsonProperty("end_time")
  private String endTime;

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
  public CoinbaseTriggerBracketGtdImpl()
  {
    super();
  }


  /**
   * @param baseSize
   * @param endTime
   * @param limitPrice
   * @param stopTriggerPrice
   */
  public CoinbaseTriggerBracketGtdImpl(String baseSize, String endTime, String limitPrice,
                                       String stopTriggerPrice)
  {
    super();
    this.baseSize = StringUtils.hasText(baseSize) ? baseSize : null;
    this.limitPrice = StringUtils.hasText(limitPrice) ? limitPrice : null;
    this.endTime = endTime;
    this.stopTriggerPrice = StringUtils.hasText(stopTriggerPrice) ? stopTriggerPrice : null;
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
   * @return the endTime
   */
  @Override
  public String getEndTime()
  {
    return endTime;
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
   * @return the stopTriggerPrice
   */
  @Override
  public String getStopTriggerPrice()
  {
    return stopTriggerPrice;
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
   * @param endTime the endTime to set
   */
  @Override
  public void setEndTime(
    String endTime)
  {
    this.endTime = endTime;
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
   * @param stopTriggerPrice the stopTriggerPrice to set
   */
  @Override
  public void setStopTriggerPrice(
    String stopTriggerPrice)
  {
    this.stopTriggerPrice = stopTriggerPrice;
  }

}
