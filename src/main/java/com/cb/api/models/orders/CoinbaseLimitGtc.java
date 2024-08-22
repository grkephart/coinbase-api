package com.cb.api.models.orders;


import java.io.Serializable;


public interface CoinbaseLimitGtc extends Serializable
{

  /**
   * @return the baseSize
   */
  String getBaseSize();


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