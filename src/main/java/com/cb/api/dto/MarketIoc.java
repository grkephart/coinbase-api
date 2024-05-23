/**
 * 
 */
package com.cb.api.dto;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Immediate or Close.
 */
public class MarketIoc
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
  public MarketIoc()
  {
    super();
  }


  /**
   * @param baseSize
   * @param quoteSize
   */
  public MarketIoc(String baseSize, String quoteSize)
  {
    super();
    this.baseSize = baseSize;
    this.quoteSize = quoteSize;
  }


  public String getBaseSize()
  {
    return baseSize;
  }


  public String getQuoteSize()
  {
    return quoteSize;
  }


  public void setBaseSize(
    String baseSize)
  {
    this.baseSize = baseSize;
  }


  public void setQuoteSize(
    String quoteSize)
  {
    this.quoteSize = quoteSize;
  }

}
