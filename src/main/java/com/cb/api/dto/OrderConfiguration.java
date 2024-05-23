/**
 * 
 */
package com.cb.api.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrderConfiguration implements Serializable
{
  @JsonProperty("limit_limit_fok")
  private LimitFok          limitFok;

  @JsonProperty("limit_limit_gtc")
  private LimitGtc          limitGtc;

  @JsonProperty("limit_limit_gtd")
  private LimitGtd          limitGtd;

  @JsonProperty("market_market_ioc")
  private MarketIoc         marketIoc;

  @JsonProperty("sor_limit_ioc")
  private SorLimitIoc       sorLimitIoc;

  @JsonProperty("stop_limit_stop_limit_gtc")
  private StopLimitGtc      stopLimitGtc;

  @JsonProperty("stop_limit_stop_limit_gtd")
  private StopLimitGtd      stopLimitGtd;

  @JsonProperty("trigger_bracket_gtc")
  private TriggerBracketGtc triggerBracketGtc;

  @JsonProperty("trigger_bracket_gtd")
  private TriggerBracketGtd triggerBracketGtd;

  /**
   * 
   */
  public OrderConfiguration()
  {
  }


  /**
   * @param limitFok
   * @param limitGtc
   * @param limitGtd
   * @param marketIoc
   * @param sorLimitIoc
   * @param stopLimitGtc
   * @param stopLimitGtd
   * @param triggerBracketGtc
   * @param triggerBracketGtd
   */
  public OrderConfiguration(LimitFok limitFok, LimitGtc limitGtc, LimitGtd limitGtd,
                            MarketIoc marketIoc, SorLimitIoc sorLimitIoc, StopLimitGtc stopLimitGtc,
                            StopLimitGtd stopLimitGtd, TriggerBracketGtc triggerBracketGtc,
                            TriggerBracketGtd triggerBracketGtd)
  {
    super();
    this.limitFok = limitFok;
    this.limitGtc = limitGtc;
    this.limitGtd = limitGtd;
    this.marketIoc = marketIoc;
    this.sorLimitIoc = sorLimitIoc;
    this.stopLimitGtc = stopLimitGtc;
    this.stopLimitGtd = stopLimitGtd;
    this.triggerBracketGtc = triggerBracketGtc;
    this.triggerBracketGtd = triggerBracketGtd;
  }


  /**
   * @return the limitFok
   */
  public LimitFok getLimitFok()
  {
    return limitFok;
  }


  /**
   * @return the limitGtc
   */
  public LimitGtc getLimitGtc()
  {
    return limitGtc;
  }


  /**
   * @return the limitGtd
   */
  public LimitGtd getLimitGtd()
  {
    return limitGtd;
  }


  /**
   * @return the marketIoc
   */
  public MarketIoc getMarketIoc()
  {
    return marketIoc;
  }


  /**
   * @return the sorLimitIoc
   */
  public SorLimitIoc getSorLimitIoc()
  {
    return sorLimitIoc;
  }


  /**
   * @return the stopLimitGtc
   */
  public StopLimitGtc getStopLimitGtc()
  {
    return stopLimitGtc;
  }


  /**
   * @return the stopLimitGtd
   */
  public StopLimitGtd getStopLimitGtd()
  {
    return stopLimitGtd;
  }


  /**
   * @return the triggerBracketGtc
   */
  public TriggerBracketGtc getTriggerBracketGtc()
  {
    return triggerBracketGtc;
  }


  /**
   * @param limitFok the limitFok to set
   */
  public void setLimitFok(
    LimitFok limitFok)
  {
    this.limitFok = limitFok;
  }


  /**
   * @param limitGtc the limitGtc to set
   */
  public void setLimitGtc(
    LimitGtc limitGtc)
  {
    this.limitGtc = limitGtc;
  }


  /**
   * @param limitGtd the limitGtd to set
   */
  public void setLimitGtd(
    LimitGtd limitGtd)
  {
    this.limitGtd = limitGtd;
  }


  /**
   * @param marketIoc the marketIoc to set
   */
  public void setMarketIoc(
    MarketIoc marketIoc)
  {
    this.marketIoc = marketIoc;
  }


  /**
   * @param sorLimitIoc the sorLimitIoc to set
   */
  public void setSorLimitIoc(
    SorLimitIoc sorLimitIoc)
  {
    this.sorLimitIoc = sorLimitIoc;
  }


  /**
   * @param stopLimitGtc the stopLimitGtc to set
   */
  public void setStopLimitGtc(
    StopLimitGtc stopLimitGtc)
  {
    this.stopLimitGtc = stopLimitGtc;
  }


  /**
   * @param stopLimitGtd the stopLimitGtd to set
   */
  public void setStopLimitGtd(
    StopLimitGtd stopLimitGtd)
  {
    this.stopLimitGtd = stopLimitGtd;
  }


  /**
   * @param triggerBracketGtc the triggerBracketGtc to set
   */
  public void setTriggerBracketGtc(
    TriggerBracketGtc triggerBracketGtc)
  {
    this.triggerBracketGtc = triggerBracketGtc;
  }

}
