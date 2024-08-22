/**
 *
 */
package com.cb.api.models.products;


import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 *
 */
@SuppressWarnings("serial")
public class CoinbasePerpetualDetailsImpl implements Serializable, CoinbasePerpetualDetails
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
  @Override
  public String getFundingRate()
  {
    return fundingRate;
  }


  /**
   * @return the fundingTime
   */
  @Override
  public Instant getFundingTime()
  {
    return fundingTime;
  }


  /**
   * @return the openInterest
   */
  @Override
  public String getOpenInterest()
  {
    return openInterest;
  }


  /**
   * @param fundingRate the fundingRate to set
   */
  @Override
  public void setFundingRate(
    String fundingRate)
  {
    this.fundingRate = fundingRate;
  }


  /**
   * @param fundingTime the fundingTime to set
   */
  @Override
  public void setFundingTime(
    Instant fundingTime)
  {
    this.fundingTime = fundingTime;
  }


  /**
   * @param openInterest the openInterest to set
   */
  @Override
  public void setOpenInterest(
    String openInterest)
  {
    this.openInterest = openInterest;
  }

}
