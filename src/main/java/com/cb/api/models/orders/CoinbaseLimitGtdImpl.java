/**
 * 
 */
package com.cb.api.models.orders;


import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Good-'til-date limit. 
 */
@SuppressWarnings("serial")
public class CoinbaseLimitGtdImpl implements CoinbaseLimitGtd
{
  /**
   * Amount of base currency to spend on order
   */
  @JsonProperty("base_size")
  private String  baseSize;

  /**
   *  Time at which the order should be cancelled if it's not filled.
   *  RFC3339 Timestamp.
   */
  @JsonProperty("end_time")
  private String  endTime;

  /**
   *  Ceiling price for which the order should get filled.
   */
  @JsonProperty("limit_price")
  private String  limitPrice;

  /**
   * The post-only flag indicates that the order should only make liquidity. 
   * If any part of the order results in taking liquidity, the order will be 
   * rejected and no part of it will execute.
   */
  @JsonProperty("post_only")
  private boolean postOnly;

  /**
   * 
   */
  public CoinbaseLimitGtdImpl()
  {
    super();
  }


  /**
   * @param baseSize
   * @param endTime
   * @param limitPrice
   * @param postOnly
   */
  public CoinbaseLimitGtdImpl(String baseSize, String endTime, String limitPrice, boolean postOnly)
  {
    super();
    this.baseSize = StringUtils.hasText(baseSize) ? baseSize : null;
    this.limitPrice = StringUtils.hasText(limitPrice) ? limitPrice : null;
    this.endTime = endTime;
    this.postOnly = postOnly;
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
   * @return the postOnly
   */
  @Override
  public boolean isPostOnly()
  {
    return postOnly;
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
   * @param postOnly the postOnly to set
   */
  @Override
  public void setPostOnly(
    boolean postOnly)
  {
    this.postOnly = postOnly;
  }

}
