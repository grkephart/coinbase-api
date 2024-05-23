/**
 * 
 */
package com.cb.api.dto;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
public class ProductCandleResponse
{
  @JsonProperty("candles")
  private ProductCandle[] candles;

  @JsonProperty("pagination")
  private Pagination      pagination;

  /**
   * @return
   */
  public ProductCandle[] getCandles()
  {
    return candles;
  }


  /**
   * @return the pagination
   */
  public Pagination getPagination()
  {
    return pagination;
  }


  /**
   * @param candles
   */
  public void setCandles(
    ProductCandle[] candles)
  {
    this.candles = candles;
  }


  /**
   * @param pagination the pagination to set
   */
  public void setPagination(
    Pagination pagination)
  {
    this.pagination = pagination;
  }

}
