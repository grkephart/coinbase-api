/**
 * 
 */
package org.drdeesw.coinbase.api.models.products;


import java.io.Serializable;

import org.drdeesw.coinbase.api.models.Pagination;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class ProductCandleResponse implements Serializable
{
  @JsonProperty("candles")
  private CoinbaseProductCandleImpl[] candles;

  @JsonProperty("pagination")
  private Pagination      pagination;

  /**
   * @return
   */
  public CoinbaseProductCandleImpl[] getProductCandles()
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
  public void setProductCandles(
    CoinbaseProductCandleImpl[] candles)
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
