package com.cb.api.models.orders;

import java.io.Serializable;

public interface CoinbaseLimitGtd extends Serializable
{

  /**
   * @return the baseSize
   */
  String getBaseSize();


  /**
   * @return the endTime
   */
  String getEndTime();


  /**
   * @return the limitPrice
   */
  String getLimitPrice();


  /**
   * @return the postOnly
   */
  boolean isPostOnly();


  /**
   * @param baseSize the baseSize to set
   */
  void setBaseSize(
    String baseSize);


  /**
   * @param endTime the endTime to set
   */
  void setEndTime(
    String endTime);


  /**
   * @param limitPrice the limitPrice to set
   */
  void setLimitPrice(
    String limitPrice);


  /**
   * @param postOnly the postOnly to set
   */
  void setPostOnly(
    boolean postOnly);

}