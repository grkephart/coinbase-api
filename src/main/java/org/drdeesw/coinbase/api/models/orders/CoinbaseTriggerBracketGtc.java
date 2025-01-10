package org.drdeesw.coinbase.api.models.orders;

import java.io.Serializable;

public interface CoinbaseTriggerBracketGtc extends Serializable
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
   * @return the stopTriggerPrice
   */
  String getStopTriggerPrice();


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
   * @param stopTriggerPrice the stopTriggerPrice to set
   */
  void setStopTriggerPrice(
    String stopTriggerPrice);

}