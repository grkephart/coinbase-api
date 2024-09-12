/**
 * 
 */
package com.cb.api.models.orders.impl;


import org.springframework.util.StringUtils;

import com.cb.api.models.orders.CoinbaseLimitGtc;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Good-'til-canceled 
 */
@SuppressWarnings("serial")
public class CoinbaseLimitGtcImpl implements CoinbaseLimitGtc
{
  /**
   * Amount of base currency to spend on order
   */
  @JsonProperty("base_size")
  private String  baseSize;

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
  public CoinbaseLimitGtcImpl()
  {
    super();
  }


  /**
   * @param baseSize
   * @param limitPrice
   * @param postOnly
   */
  public CoinbaseLimitGtcImpl(String baseSize, String limitPrice, boolean postOnly)
  {
    super();
    this.baseSize = StringUtils.hasText(baseSize) ? baseSize : null;
    this.limitPrice = StringUtils.hasText(limitPrice) ? limitPrice : null;
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
