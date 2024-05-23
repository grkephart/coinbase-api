/**
 * 
 */
package com.cb.api.dto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
public class EditHistory
{

  @JsonProperty("price")
  private String  price;

  @JsonProperty("replace_accept_timestamp")
  private Instant replaceAcceptTimestamp;

  @JsonProperty("size")
  private String  size;

  /**
   * @return the price
   */
  public String getPrice()
  {
    return price;
  }


  /**
   * @return the replaceAcceptTimestamp
   */
  public Instant getReplaceAcceptTimestamp()
  {
    return replaceAcceptTimestamp;
  }


  /**
   * @return the size
   */
  public String getSize()
  {
    return size;
  }


  /**
   * @param price the price to set
   */
  public void setPrice(
    String price)
  {
    this.price = price;
  }


  /**
   * @param replaceAcceptTimestamp the replaceAcceptTimestamp to set
   */
  public void setReplaceAcceptTimestamp(
    Instant replaceAcceptTimestamp)
  {
    this.replaceAcceptTimestamp = replaceAcceptTimestamp;
  }


  /**
   * @param size the size to set
   */
  public void setSize(
    String size)
  {
    this.size = size;
  }
}
