/**
 * 
 */
package com.cb.api.models.products;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Rates for a single product.
 * The ID is the productId. 
 */
@SuppressWarnings("serial")
public class CoinbaseProductCandleImpl implements CoinbaseProductCandle
{
  /**
   *  Closing price (last trade) in the bucket interval.
   */
  @JsonProperty("close")
  private String close;
  /**
   * Highest price during the bucket interval.
   */
  @JsonProperty("high")
  private String high;

  /**
   * Something Coinbase should provide, but doesn't.
   * This will be productId + "-" + start + "-" + granularity.
   */
  private String internalId;

  /**
   *  Lowest price during the bucket interval.
   */
  @JsonProperty("low")
  private String low;

  /**
   *   Opening price (first trade) in the bucket interval.
   */
  @JsonProperty("open")
  private String open;

  /**
   * Timestamp for bucket start time, in UNIX time.
   */
  @JsonProperty("start")
  private String start;

  /**
   *  Volume of trading activity during the bucket interval.
   */
  @JsonProperty("volume")
  private String volume;

  /**
   * Called when being constructed via client.
   */
  public CoinbaseProductCandleImpl()
  {

  }


  @Override
  public String getClose()
  {
    return close;
  }


  @Override
  public String getHigh()
  {
    return high;
  }


  @Override
  public String getInternalId()
  {
    return this.internalId;
  }


  @Override
  public String getLow()
  {
    return low;
  }


  @Override
  public String getOpen()
  {
    return open;
  }


  @Override
  public String getStart()
  {
    return start;
  }


  @Override
  public String getVolume()
  {
    return volume;
  }


  @Override
  public void setClose(
    String close)
  {
    this.close = close;
  }


  @Override
  public void setHigh(
    String high)
  {
    this.high = high;
  }


  /**
   * @param internalId the internalId to set
   */
  @Override
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
  }


  @Override
  public void setLow(
    String low)
  {
    this.low = low;
  }


  @Override
  public void setOpen(
    String open)
  {
    this.open = open;
  }


  @Override
  public void setStart(
    String start)
  {
    this.start = start;
  }


  @Override
  public void setVolume(
    String volume)
  {
    this.volume = volume;
  }

}
