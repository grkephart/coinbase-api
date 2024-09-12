/**
 * 
 */
package com.cb.api.models.orders.impl;


import org.springframework.util.StringUtils;

import com.cb.api.models.orders.CoinbaseMarketIoc;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Immediate or Close.
 */
@SuppressWarnings("serial")
public class CoinbaseMarketIocImpl implements CoinbaseMarketIoc
{
  /**
   * Amount of base currency to spend on order. Required for SELL orders.
   */
  @JsonProperty("base_size")
  private String baseSize;

  /**
   * Amount of quote currency to spend on order. Required for BUY orders.
   */
  @JsonProperty("quote_size")
  private String quoteSize;

  /**
   * 
   */
  public CoinbaseMarketIocImpl()
  {
    super();
  }


  /**
   * @param baseSize
   * @param quoteSize
   */
  public CoinbaseMarketIocImpl(String baseSize, String quoteSize)
  {
    super();
    this.baseSize = StringUtils.hasText(baseSize) ? baseSize : null;
    this.quoteSize = StringUtils.hasText(quoteSize) ? quoteSize : null;
  }


  @Override
  public String getBaseSize()
  {
    return baseSize;
  }


  @Override
  public String getQuoteSize()
  {
    return quoteSize;
  }


  @Override
  public void setBaseSize(
    String baseSize)
  {
    this.baseSize = baseSize;
  }


  @Override
  public void setQuoteSize(
    String quoteSize)
  {
    this.quoteSize = quoteSize;
  }

}
