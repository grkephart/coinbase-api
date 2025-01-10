package org.drdeesw.coinbase.api.models.orders;


import java.io.Serializable;


public interface CoinbaseTriggerBracketGtd extends Serializable
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
   * @return the stopTriggerPrice
   */
  String getStopTriggerPrice();


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
   * @param stopTriggerPrice the stopTriggerPrice to set
   */
  void setStopTriggerPrice(
    String stopTriggerPrice);

}