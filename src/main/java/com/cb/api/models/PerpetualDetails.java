/**
 *
 */
package com.cb.api.models;


import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 *
 */
@SuppressWarnings("serial")
public class PerpetualDetails implements Serializable
{

  /**
   *
   */
  @JsonProperty("funding_rate")
  private String  fundingRate;

  /**
   *
   */
  @JsonProperty("funding_time")
  private Instant fundingTime;

  /**
   *
   */
  @JsonProperty("open_interest")
  private String  openInterest;

  /**
   * @return the fundingRate
   */
  public String getFundingRate()
  {
    return fundingRate;
  }


  /**
   * @return the fundingTime
   */
  public Instant getFundingTime()
  {
    return fundingTime;
  }


  /**
   * @return the openInterest
   */
  public String getOpenInterest()
  {
    return openInterest;
  }


  /**
   * @param fundingRate the fundingRate to set
   */
  public void setFundingRate(
    String fundingRate)
  {
    this.fundingRate = fundingRate;
  }


  /**
   * @param fundingTime the fundingTime to set
   */
  public void setFundingTime(
    Instant fundingTime)
  {
    this.fundingTime = fundingTime;
  }


  /**
   * @param openInterest the openInterest to set
   */
  public void setOpenInterest(
    String openInterest)
  {
    this.openInterest = openInterest;
  }

}
