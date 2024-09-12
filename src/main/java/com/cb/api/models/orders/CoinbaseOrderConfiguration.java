package com.cb.api.models.orders;


import java.io.Serializable;


public interface CoinbaseOrderConfiguration extends Serializable
{

  /**
   * @return the limitFok
   */
  CoinbaseLimitFok getLimitFok();


  /**
   * @return the limitGtc
   */
  CoinbaseLimitGtc getLimitGtc();


  /**
   * @return the limitGtd
   */
  CoinbaseLimitGtd getLimitGtd();


  /**
   * @return the marketIoc
   */
  CoinbaseMarketIoc getMarketIoc();


  /**
   * @return the sorLimitIoc
   */
  CoinbaseSorLimitIoc getSorLimitIoc();


  /**
   * @return the stopLimitGtc
   */
  CoinbaseStopLimitGtc getStopLimitGtc();


  /**
   * @return the stopLimitGtd
   */
  CoinbaseStopLimitGtd getStopLimitGtd();


  /**
   * @return the triggerBracketGtc
   */
  CoinbaseTriggerBracketGtc getTriggerBracketGtc();


  /**
   * @return the triggerBracketGtd
   */
  CoinbaseTriggerBracketGtd getTriggerBracketGtd();


  /**
   * @param limitFok the limitFok to set
   */
  void setLimitFok(
    CoinbaseLimitFok limitFok);


  /**
   * @param limitGtc the limitGtc to set
   */
  void setLimitGtc(
    CoinbaseLimitGtc limitGtc);


  /**
   * @param limitGtd the limitGtd to set
   */
  void setLimitGtd(
    CoinbaseLimitGtd limitGtd);


  /**
   * @param marketIoc the marketIoc to set
   */
  void setMarketIoc(
    CoinbaseMarketIoc marketIoc);


  /**
   * @param sorLimitIoc the sorLimitIoc to set
   */
  void setSorLimitIoc(
    CoinbaseSorLimitIoc sorLimitIoc);


  /**
   * @param stopLimitGtc the stopLimitGtc to set
   */
  void setStopLimitGtc(
    CoinbaseStopLimitGtc stopLimitGtc);


  /**
   * @param stopLimitGtd the stopLimitGtd to set
   */
  void setStopLimitGtd(
    CoinbaseStopLimitGtd stopLimitGtd);


  /**
   * @param triggerBracketGtc the triggerBracketGtc to set
   */
  void setTriggerBracketGtc(
    CoinbaseTriggerBracketGtc triggerBracketGtc);


  /**
   * @param triggerBracketGtd the triggerBracketGtd to set
   */
  void setTriggerBracketGtd(
    CoinbaseTriggerBracketGtd triggerBracketGtd);

}