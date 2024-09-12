/**
 * 
 */
package com.cb.api.models.orders.impl;


import com.cb.api.models.orders.CoinbaseLimitFok;
import com.cb.api.models.orders.CoinbaseLimitGtc;
import com.cb.api.models.orders.CoinbaseLimitGtd;
import com.cb.api.models.orders.CoinbaseMarketIoc;
import com.cb.api.models.orders.CoinbaseOrderConfiguration;
import com.cb.api.models.orders.CoinbaseSorLimitIoc;
import com.cb.api.models.orders.CoinbaseStopLimitGtc;
import com.cb.api.models.orders.CoinbaseStopLimitGtd;
import com.cb.api.models.orders.CoinbaseTriggerBracketGtc;
import com.cb.api.models.orders.CoinbaseTriggerBracketGtd;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class CoinbaseOrderConfigurationImpl implements CoinbaseOrderConfiguration
{
  @JsonProperty("limit_limit_fok")
  private CoinbaseLimitFokImpl          limitFok;

  @JsonProperty("limit_limit_gtc")
  private CoinbaseLimitGtcImpl          limitGtc;

  @JsonProperty("limit_limit_gtd")
  private CoinbaseLimitGtdImpl          limitGtd;

  @JsonProperty("market_market_ioc")
  private CoinbaseMarketIocImpl         marketIoc;

  @JsonProperty("sor_limit_ioc")
  private CoinbaseSorLimitIocImpl       sorLimitIoc;

  @JsonProperty("stop_limit_stop_limit_gtc")
  private CoinbaseStopLimitGtcImpl      stopLimitGtc;

  @JsonProperty("stop_limit_stop_limit_gtd")
  private CoinbaseStopLimitGtdImpl      stopLimitGtd;

  @JsonProperty("trigger_bracket_gtc")
  private CoinbaseTriggerBracketGtcImpl triggerBracketGtc;

  @JsonProperty("trigger_bracket_gtd")
  private CoinbaseTriggerBracketGtdImpl triggerBracketGtd;

  /**
   * 
   */
  public CoinbaseOrderConfigurationImpl()
  {
  }


  /**
   * @param marketIoc
   */
  public CoinbaseOrderConfigurationImpl(CoinbaseMarketIoc marketIoc)
  {
    this.marketIoc = (CoinbaseMarketIocImpl)marketIoc;
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
  public CoinbaseLimitGtd getLimitGtd()
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
    this.limitFok = (CoinbaseLimitFokImpl)limitFok;
  }


  /**
   * @param limitGtc the limitGtc to set
   */
  @Override
  public void setLimitGtc(
    CoinbaseLimitGtc limitGtc)
  {
    this.limitGtc = (CoinbaseLimitGtcImpl)limitGtc;
  }


  /**
   * @param limitGtd the limitGtd to set
   */
  @Override
  public void setLimitGtd(
    CoinbaseLimitGtd limitGtd)
  {
    this.limitGtd = (CoinbaseLimitGtdImpl)limitGtd;
  }


  /**
   * @param marketIoc the marketIoc to set
   */
  @Override
  public void setMarketIoc(
    CoinbaseMarketIoc marketIoc)
  {
    this.marketIoc = (CoinbaseMarketIocImpl)marketIoc;
  }


  /**
   * @param sorLimitIoc the sorLimitIoc to set
   */
  @Override
  public void setSorLimitIoc(
    CoinbaseSorLimitIoc sorLimitIoc)
  {
    this.sorLimitIoc = (CoinbaseSorLimitIocImpl)sorLimitIoc;
  }


  /**
   * @param stopLimitGtc the stopLimitGtc to set
   */
  @Override
  public void setStopLimitGtc(
    CoinbaseStopLimitGtc stopLimitGtc)
  {
    this.stopLimitGtc = (CoinbaseStopLimitGtcImpl)stopLimitGtc;
  }


  /**
   * @param stopLimitGtd the stopLimitGtd to set
   */
  @Override
  public void setStopLimitGtd(
    CoinbaseStopLimitGtd stopLimitGtd)
  {
    this.stopLimitGtd = (CoinbaseStopLimitGtdImpl)stopLimitGtd;
  }


  /**
   * @param triggerBracketGtc the triggerBracketGtc to set
   */
  @Override
  public void setTriggerBracketGtc(
    CoinbaseTriggerBracketGtc triggerBracketGtc)
  {
    this.triggerBracketGtc = (CoinbaseTriggerBracketGtcImpl)triggerBracketGtc;
  }


  /**
   * @param triggerBracketGtd the triggerBracketGtd to set
   */
  @Override
  public void setTriggerBracketGtd(
    CoinbaseTriggerBracketGtd triggerBracketGtd)
  {
    this.triggerBracketGtd = (CoinbaseTriggerBracketGtdImpl)triggerBracketGtd;
  }

}
