package com.cb.api.models.products;


import java.time.Instant;


public interface CoinbasePerpetualDetails
{

  /**
   * @return the fundingRate
   */
  String getFundingRate();


  /**
   * @return the fundingTime
   */
  Instant getFundingTime();


  /**
   * @return the openInterest
   */
  String getOpenInterest();


  /**
   * @param fundingRate the fundingRate to set
   */
  void setFundingRate(
    String fundingRate);


  /**
   * @param fundingTime the fundingTime to set
   */
  void setFundingTime(
    Instant fundingTime);


  /**
   * @param openInterest the openInterest to set
   */
  void setOpenInterest(
    String openInterest);

}