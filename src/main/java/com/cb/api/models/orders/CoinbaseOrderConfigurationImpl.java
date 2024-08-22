/**
 * 
 */
package com.cb.api.models.orders;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class CoinbaseOrderConfigurationImpl implements CoinbaseOrderConfiguration
{
  @JsonProperty("limit_limit_fok")
  private CoinbaseLimitFok         limitFok;

  @JsonProperty("limit_limit_gtc")
  private CoinbaseLimitGtc         limitGtc;

  @JsonProperty("limit_limit_gtd")
  private CoinbaseLimitCoinbaseGtd limitGtd;

  @JsonProperty("market_market_ioc")
  private CoinbaseMarketIoc        marketIoc;

  @JsonProperty("sor_limit_ioc")
  private CoinbaseSorLimitIoc      sorLimitIoc;

  @JsonProperty("stop_limit_stop_limit_gtc")
  private CoinbaseStopLimitGtc             stopLimitGtc;

  @JsonProperty("stop_limit_stop_limit_gtd")
  private CoinbaseStopLimitGtd             stopLimitGtd;

  @JsonProperty("trigger_bracket_gtc")
  private CoinbaseTriggerBracketGtc        triggerBracketGtc;

  @JsonProperty("trigger_bracket_gtd")
  private CoinbaseTriggerBracketGtd        triggerBracketGtd;

  /**
   * 
   */
  public CoinbaseOrderConfigurationImpl()
  {
  }


  /**
   * @return the limitFok
   */
  @Override
  public CoinbaseLimitFok getLimitFok()
  {
    return limitFok;
  }


  /**
   * @return the limitGtc
   */
  @Override
  public CoinbaseLimitGtc getLimitGtc()
  {
    return limitGtc;
  }


  /**
   * @return the limitGtd
   */
  @Override
  public CoinbaseLimitCoinbaseGtd getLimitGtd()
  {
    return limitGtd;
  }


  /**
   * @return the marketIoc
   */
  @Override
  public CoinbaseMarketIoc getMarketIoc()
  {
    return marketIoc;
  }


  /**
   * @return the sorLimitIoc
   */
  @Override
  public CoinbaseSorLimitIoc getSorLimitIoc()
  {
    return sorLimitIoc;
  }


  /**
   * @return the stopLimitGtc
   */
  @Override
  public CoinbaseStopLimitGtc getStopLimitGtc()
  {
    return stopLimitGtc;
  }


  /**
   * @return the stopLimitGtd
   */
  @Override
  public CoinbaseStopLimitGtd getStopLimitGtd()
  {
    return stopLimitGtd;
  }


  /**
   * @return the triggerBracketGtc
   */
  @Override
  public CoinbaseTriggerBracketGtc getTriggerBracketGtc()
  {
    return triggerBracketGtc;
  }


  /**
   * @return the triggerBracketGtd
   */
  @Override
  public CoinbaseTriggerBracketGtd getTriggerBracketGtd()
  {
    return triggerBracketGtd;
  }


  /**
   * @param limitFok the limitFok to set
   */
  @Override
  public void setLimitFok(
    CoinbaseLimitFok limitFok)
  {
    this.limitFok = limitFok;
  }


  /**
   * @param limitGtc the limitGtc to set
   */
  @Override
  public void setLimitGtc(
    CoinbaseLimitGtc limitGtc)
  {
    this.limitGtc = limitGtc;
  }


  /**
   * @param limitGtd the limitGtd to set
   */
  @Override
  public void setLimitGtd(
    CoinbaseLimitCoinbaseGtd limitGtd)
  {
    this.limitGtd = limitGtd;
  }


  /**
   * @param marketIoc the marketIoc to set
   */
  @Override
  public void setMarketIoc(
    CoinbaseMarketIoc marketIoc)
  {
    this.marketIoc = marketIoc;
  }


  /**
   * @param sorLimitIoc the sorLimitIoc to set
   */
  @Override
  public void setSorLimitIoc(
    CoinbaseSorLimitIoc sorLimitIoc)
  {
    this.sorLimitIoc = sorLimitIoc;
  }


  /**
   * @param stopLimitGtc the stopLimitGtc to set
   */
  @Override
  public void setStopLimitGtc(
    CoinbaseStopLimitGtc stopLimitGtc)
  {
    this.stopLimitGtc = stopLimitGtc;
  }


  /**
   * @param stopLimitGtd the stopLimitGtd to set
   */
  @Override
  public void setStopLimitGtd(
    CoinbaseStopLimitGtd stopLimitGtd)
  {
    this.stopLimitGtd = stopLimitGtd;
  }


  /**
   * @param triggerBracketGtc the triggerBracketGtc to set
   */
  @Override
  public void setTriggerBracketGtc(
    CoinbaseTriggerBracketGtc triggerBracketGtc)
  {
    this.triggerBracketGtc = triggerBracketGtc;
  }


  /**
   * @param triggerBracketGtd the triggerBracketGtd to set
   */
  @Override
  public void setTriggerBracketGtd(
    CoinbaseTriggerBracketGtd triggerBracketGtd)
  {
    this.triggerBracketGtd = triggerBracketGtd;
  }

}
