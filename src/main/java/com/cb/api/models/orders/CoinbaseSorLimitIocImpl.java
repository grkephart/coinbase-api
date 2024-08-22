/**
 * 
 */
package com.cb.api.models.orders;


import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class CoinbaseSorLimitIocImpl implements Serializable, CoinbaseSorLimitIoc
{
  /**
   * Amount of base currency to spend on order.
   */
  @JsonProperty("base_size")
  private String baseSize;

  /**
   * Ceiling price for which the order should get filled.
   */
  @JsonProperty("limit_price")
  private String limitPrice;

  /**
   * 
   */
  public CoinbaseSorLimitIocImpl()
  {
    super();
  }


  /**
   * @param baseSize
   * @param limitPrice
   */
  public CoinbaseSorLimitIocImpl(String baseSize, String limitPrice)
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
