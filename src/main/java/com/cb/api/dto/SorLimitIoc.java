/**
 * 
 */
package com.cb.api.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class SorLimitIoc implements Serializable
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
  public SorLimitIoc()
  {
    super();
  }


  /**
   * @param baseSize
   * @param limitPrice
   */
  public SorLimitIoc(String baseSize, String limitPrice)
  {
    super();
    this.baseSize = baseSize;
    this.limitPrice = limitPrice;
  }


  /**
   * @return the baseSize
   */
  public String getBaseSize()
  {
    return baseSize;
  }


  /**
   * @return the limitPrice
   */
  public String getLimitPrice()
  {
    return limitPrice;
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
   * @param limitPrice the limitPrice to set
   */
  public void setLimitPrice(
    String limitPrice)
  {
    this.limitPrice = limitPrice;
  }

}
