package com.cb.api.models.orders;


import java.io.Serializable;


public interface CoinbaseStopLimitGtd extends Serializable
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
   * @return the stopDirection
   */
  StopDirection getStopDirection();


  /**
   * @return the stopPrice
   */
  String getStopPrice();


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
   * @param stopDirection the stopDirection to set
   */
  void setStopDirection(
    StopDirection stopDirection);


  /**
   * @param stopPrice the stopPrice to set
   */
  void setStopPrice(
    String stopPrice);

}