/**
 * 
 */
package com.cb.api.models;


import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Good-'til-date limit. 
 */
@SuppressWarnings("serial")
public class LimitGtd implements Serializable
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
  public LimitGtd()
  {
    super();
  }


  /**
   * @param baseSize
   * @param endTime
   * @param limitPrice
   * @param postOnly
   */
  public LimitGtd(String baseSize, String endTime, String limitPrice, boolean postOnly)
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
   * @return the postOnly
   */
  public boolean isPostOnly()
  {
    return postOnly;
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
   * @param postOnly the postOnly to set
   */
  public void setPostOnly(
    boolean postOnly)
  {
    this.postOnly = postOnly;
  }

}
