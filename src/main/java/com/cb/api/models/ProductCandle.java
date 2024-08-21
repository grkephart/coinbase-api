/**
 * 
 */
package com.cb.api.models;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Rates for a single product.
 * The ID is the productId. 
 */
@SuppressWarnings("serial")
public class ProductCandle implements Serializable
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
  public ProductCandle()
  {

  }


  public String getClose()
  {
    return close;
  }


  public String getHigh()
  {
    return high;
  }


  public String getInternalId()
  {
    return this.internalId;
  }


  public String getLow()
  {
    return low;
  }


  public String getOpen()
  {
    return open;
  }


  public String getStart()
  {
    return start;
  }


  public String getVolume()
  {
    return volume;
  }


  public void setClose(
    String close)
  {
    this.close = close;
  }


  public void setHigh(
    String high)
  {
    this.high = high;
  }


  /**
   * @param internalId the internalId to set
   */
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
  }


  public void setLow(
    String low)
  {
    this.low = low;
  }


  public void setOpen(
    String open)
  {
    this.open = open;
  }


  public void setStart(
    String start)
  {
    this.start = start;
  }


  public void setVolume(
    String volume)
  {
    this.volume = volume;
  }

}
