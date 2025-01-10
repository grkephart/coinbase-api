/**
 *
 */
package org.drdeesw.coinbase.api.models;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 *
 */
@SuppressWarnings("serial")
public class Money implements Serializable
{
  @JsonProperty("currency")
  private String currency;
  @JsonProperty("value")
  private double value;



  /**
   * @return the currency
   */
  public String getCurrency()
  {
    return currency;
  }


  /**
   * @return the value
   */
  public double getValue()
  {
    return value;
  }


  /**
   * @param currency the currency to set
   */
  public void setCurrency(
    String currency)
  {
    this.currency = currency;
  }


  /**
   * @param value the value to set
   */
  public void setValue(
    double value)
  {
    this.value = value;
  }
}
