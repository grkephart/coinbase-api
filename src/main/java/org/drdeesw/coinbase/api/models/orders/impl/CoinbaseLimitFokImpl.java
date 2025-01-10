/**
 * 
 */
package org.drdeesw.coinbase.api.models.orders.impl;


import org.drdeesw.coinbase.api.models.orders.CoinbaseLimitFok;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class CoinbaseLimitFokImpl implements CoinbaseLimitFok
{
  /**
   * Amount of base currency to spend on order
   */
  @JsonProperty("base_size")
  private String baseSize;

  /**
   *  Ceiling price for which the order should get filled.
   *  FOK orders must be marketable, so this is required to be at most 20% 
   *  away from mid market.
   */
  @JsonProperty("limit_price")
  private String limitPrice;

  /**
   * 
   */
  public CoinbaseLimitFokImpl()
  {
    super();
  }


  /**
   * @param baseSize
   * @param limitPrice
   */
  public CoinbaseLimitFokImpl(String baseSize, String limitPrice)
  {
    super();
    this.baseSize = StringUtils.hasText(baseSize) ? baseSize : null;
    this.limitPrice = StringUtils.hasText(limitPrice) ? limitPrice : null;
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

}
