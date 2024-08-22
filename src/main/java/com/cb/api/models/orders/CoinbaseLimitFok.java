package com.cb.api.models.orders;

import java.io.Serializable;

public interface CoinbaseLimitFok extends Serializable
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
   * @param baseSize the baseSize to set
   */
  void setBaseSize(
    String baseSize);


  /**
   * @param limitPrice the limitPrice to set
   */
  void setLimitPrice(
    String limitPrice);

}