/**
 * 
 */
package com.cb.api.models.orders.impl;


import com.cb.api.models.orders.CoinbaseNewOrder;
import com.cb.api.models.orders.CoinbaseOrderConfiguration;
import com.cb.api.models.orders.MarginType;
import com.cb.api.models.orders.Side;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class CoinbaseNewOrderImpl implements CoinbaseNewOrder
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
  private CoinbaseOrderConfigurationImpl configuration;

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
  public CoinbaseNewOrderImpl()
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
  public CoinbaseNewOrderImpl(String clientOrderId, String productInternalId, Side side,
                  CoinbaseOrderConfiguration coinbaseOrderConfiguration, String selfTradePreventionId,
                  String leverage, MarginType marginType, String retailPortfolioId)
  {
    this.clientOrderId = clientOrderId;
    this.productId = productInternalId;
    this.side = side;
    this.configuration = (CoinbaseOrderConfigurationImpl)coinbaseOrderConfiguration;
    this.selfTradePreventionId = selfTradePreventionId;
    this.leverage = leverage;
    this.marginType = marginType;
    this.retailPortfolioId = retailPortfolioId;
  }


  /**
   * @return the clientOrderId
   */
  @Override
  public String getClientOrderId()
  {
    return clientOrderId;
  }


  /**
   * @return the configuration
   */
  @Override
  public CoinbaseOrderConfiguration getConfiguration()
  {
    return configuration;
  }


  /**
   * @return the leverage
   */
  @Override
  public String getLeverage()
  {
    return leverage;
  }


  /**
   * @return the marginType
   */
  @Override
  public MarginType getMarginType()
  {
    return marginType;
  }


  /**
   * @return the productId
   */
  @Override
  public String getProductId()
  {
    return productId;
  }


  /**
   * @return the retailPortfolioId
   */
  @Override
  public String getRetailPortfolioId()
  {
    return retailPortfolioId;
  }


  /**
   * @return the selfTradePreventionId
   */
  @Override
  public String getSelfTradePreventionId()
  {
    return selfTradePreventionId;
  }


  /**
   * @return the side
   */
  @Override
  public Side getSide()
  {
    return side;
  }


  /**
   * @param clientOrderId the clientOrderId to set
   */
  @Override
  public void setClientOrderId(
    String clientOrderId)
  {
    this.clientOrderId = clientOrderId;
  }


  /**
   * @param configuration the configuration to set
   */
  @Override
  public void setConfiguration(
    CoinbaseOrderConfiguration configuration)
  {
    this.configuration = (CoinbaseOrderConfigurationImpl)configuration;
  }


  /**
   * @param leverage the leverage to set
   */
  @Override
  public void setLeverage(
    String leverage)
  {
    this.leverage = leverage;
  }


  /**
   * @param marginType the marginType to set
   */
  @Override
  public void setMarginType(
    MarginType marginType)
  {
    this.marginType = marginType;
  }


  /**
   * @param productId the productId to set
   */
  @Override
  public void setProductId(
    String productId)
  {
    this.productId = productId;
  }


  /**
   * @param retailPortfolioId the retailPortfolioId to set
   */
  @Override
  public void setRetailPortfolioId(
    String retailPortfolioId)
  {
    this.retailPortfolioId = retailPortfolioId;
  }


  /**
   * @param selfTradePreventionId the selfTradePreventionId to set
   */
  @Override
  public void setSelfTradePreventionId(
    String selfTradePreventionId)
  {
    this.selfTradePreventionId = selfTradePreventionId;
  }


  /**
   * @param side the side to set
   */
  @Override
  public void setSide(
    Side side)
  {
    this.side = side;
  }

}
