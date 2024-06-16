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
public class NewOrder implements Serializable
{
  /**
   * Client specified ID of order.
   */
  @JsonProperty("client_order_id")
  private String             clientOrderId;
  /**
   * 
   */
  @JsonProperty("order_configuration")
  private OrderConfiguration configuration;

  @JsonProperty("leverage")
  private String             leverage;

  @JsonProperty("margin_type")
  private MarginType         marginType;

  /**
   * The product this order was created for e.g. 'BTC-USD'
   */
  @JsonProperty("product_id")
  private String             productId;

  @JsonProperty("retail_portfolio_id")
  private String             retailPortfolioId;

  @JsonProperty("self_trade_prevention_id")
  private String             selfTradePreventionId;

  /**
   * Possible values: [BUY, SELL]
   */
  @JsonProperty("side")
  private Side               side;

  /**
   * 
   */
  public NewOrder()
  {

  }


  /**
   * @param clientOrderId
   * @param productInternalId
   * @param side
   * @param coinbaseOrderConfiguration
   * @param selfTradePreventionId
   * @param leverage
   * @param marginType
   * @param retailPortfolioId
   */
  public NewOrder(String clientOrderId, String productInternalId, Side side,
                  OrderConfiguration coinbaseOrderConfiguration, String selfTradePreventionId,
                  String leverage, MarginType marginType, String retailPortfolioId)
  {
    this.clientOrderId = clientOrderId;
    this.productId = productInternalId;
    this.side = side;
    this.configuration = coinbaseOrderConfiguration;
    this.selfTradePreventionId = selfTradePreventionId;
    this.leverage = leverage;
    this.marginType = marginType;
    this.retailPortfolioId = retailPortfolioId;
  }


  /**
   * @return the clientOrderId
   */
  public String getClientOrderId()
  {
    return clientOrderId;
  }


  /**
   * @return the configuration
   */
  public OrderConfiguration getConfiguration()
  {
    return configuration;
  }


  /**
   * @return the leverage
   */
  public String getLeverage()
  {
    return leverage;
  }


  /**
   * @return the marginType
   */
  public MarginType getMarginType()
  {
    return marginType;
  }


  /**
   * @return the productId
   */
  public String getProductId()
  {
    return productId;
  }


  /**
   * @return the retailPortfolioId
   */
  public String getRetailPortfolioId()
  {
    return retailPortfolioId;
  }


  /**
   * @return the selfTradePreventionId
   */
  public String getSelfTradePreventionId()
  {
    return selfTradePreventionId;
  }


  /**
   * @return the side
   */
  public Side getSide()
  {
    return side;
  }


  /**
   * @param clientOrderId the clientOrderId to set
   */
  public void setClientOrderId(
    String clientOrderId)
  {
    this.clientOrderId = clientOrderId;
  }


  /**
   * @param configuration the configuration to set
   */
  public void setConfiguration(
    OrderConfiguration configuration)
  {
    this.configuration = configuration;
  }


  /**
   * @param leverage the leverage to set
   */
  public void setLeverage(
    String leverage)
  {
    this.leverage = leverage;
  }


  /**
   * @param marginType the marginType to set
   */
  public void setMarginType(
    MarginType marginType)
  {
    this.marginType = marginType;
  }


  /**
   * @param productId the productId to set
   */
  public void setProductId(
    String productId)
  {
    this.productId = productId;
  }


  /**
   * @param retailPortfolioId the retailPortfolioId to set
   */
  public void setRetailPortfolioId(
    String retailPortfolioId)
  {
    this.retailPortfolioId = retailPortfolioId;
  }


  /**
   * @param selfTradePreventionId the selfTradePreventionId to set
   */
  public void setSelfTradePreventionId(
    String selfTradePreventionId)
  {
    this.selfTradePreventionId = selfTradePreventionId;
  }


  /**
   * @param side the side to set
   */
  public void setSide(
    Side side)
  {
    this.side = side;
  }

}
