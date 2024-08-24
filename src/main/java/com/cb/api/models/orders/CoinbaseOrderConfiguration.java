package com.cb.api.models.orders;


import java.io.Serializable;


public interface CoinbaseOrderConfiguration<LF extends CoinbaseLimitFok, LGC extends CoinbaseLimitGtc, LGD extends CoinbaseLimitGtd, MI extends CoinbaseMarketIoc, SLI extends CoinbaseSorLimitIoc, SLGC extends CoinbaseStopLimitGtc, SLGD extends CoinbaseStopLimitGtd, TBGC extends CoinbaseTriggerBracketGtc, TBGD extends CoinbaseTriggerBracketGtd>
    extends Serializable
{

  /**
   * @return the limitFok
   */
  LF getLimitFok();


  /**
   * @return the limitGtc
   */
  LGC getLimitGtc();


  /**
   * @return the limitGtd
   */
  LGD getLimitGtd();


  /**
   * @return the marketIoc
   */
  MI getMarketIoc();


  /**
   * @return the sorLimitIoc
   */
  SLI getSorLimitIoc();


  /**
   * @return the stopLimitGtc
   */
  SLGC getStopLimitGtc();


  /**
   * @return the stopLimitGtd
   */
  SLGD getStopLimitGtd();


  /**
   * @return the triggerBracketGtc
   */
  TBGC getTriggerBracketGtc();


  /**
   * @return the triggerBracketGtd
   */
  TBGD getTriggerBracketGtd();


  /**
   * @param limitFok the limitFok to set
   */
  void setLimitFok(
    LF limitFok);


  /**
   * @param limitGtc the limitGtc to set
   */
  void setLimitGtc(
    LGC limitGtc);


  /**
   * @param limitGtd the limitGtd to set
   */
  void setLimitGtd(
    LGD limitGtd);


  /**
   * @param marketIoc the marketIoc to set
   */
  void setMarketIoc(
    MI marketIoc);


  /**
   * @param sorLimitIoc the sorLimitIoc to set
   */
  void setSorLimitIoc(
    SLI sorLimitIoc);


  /**
   * @param stopLimitGtc the stopLimitGtc to set
   */
  void setStopLimitGtc(
    SLGC stopLimitGtc);


  /**
   * @param stopLimitGtd the stopLimitGtd to set
   */
  void setStopLimitGtd(
    SLGD stopLimitGtd);


  /**
   * @param triggerBracketGtc the triggerBracketGtc to set
   */
  void setTriggerBracketGtc(
    TBGC triggerBracketGtc);


  /**
   * @param triggerBracketGtd the triggerBracketGtd to set
   */
  void setTriggerBracketGtd(
    TBGD triggerBracketGtd);

}