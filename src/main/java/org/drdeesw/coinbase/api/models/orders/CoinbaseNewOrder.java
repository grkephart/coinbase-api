package org.drdeesw.coinbase.api.models.orders;

import java.io.Serializable;

public interface CoinbaseNewOrder extends Serializable
{

  /**
   * A unique ID provided for the order (used for identification purposes).
   * If the ID provided is not unique, the order will not be created and the order corresponding with that ID will be returned instead.
   *  
   * @return the clientOrderId
   */
  String getClientOrderId();


  /**
   * The configuration of the order (e.g. the order type, size, etc).
   * 
   * @return the configuration
   */
  CoinbaseOrderConfiguration getConfiguration();


  /**
   * The amount of leverage for the order (default is 1.0).
   * @return the leverage
   */
  String getLeverage();


  /**
   * Possible values: [CROSS, ISOLATED]
   * 
   * @return the marginType
   */
  MarginType getMarginType();


  /**
   * The trading pair (e.g. 'BTC-USD').
   * 
   * @return the productId
   */
  String getProductId();


  /**
   * (Deprecated) The ID of the portfolio to associate the order with. Only applicable for legacy keys. CDP keys will default to the key's permissioned portfolio.
   * 
   * @return the retailPortfolioId
   */
  String getRetailPortfolioId();


  /**
   * @return the selfTradePreventionId
   */
  String getSelfTradePreventionId();


  /**
   * Possible values: [BUY, SELL]
   * 
   * @return the side
   */
  Side getSide();


  /**
   * @param clientOrderId the clientOrderId to set
   */
  void setClientOrderId(
    String clientOrderId);


  /**
   * @param configuration the configuration to set
   */
  void setConfiguration(
    CoinbaseOrderConfiguration configuration);


  /**
   * @param leverage the leverage to set
   */
  void setLeverage(
    String leverage);


  /**
   * @param marginType the marginType to set
   */
  void setMarginType(
    MarginType marginType);


  /**
   * @param productId the productId to set
   */
  void setProductId(
    String productId);


  /**
   * @param retailPortfolioId the retailPortfolioId to set
   */
  void setRetailPortfolioId(
    String retailPortfolioId);


  /**
   * @param selfTradePreventionId the selfTradePreventionId to set
   */
  void setSelfTradePreventionId(
    String selfTradePreventionId);


  /**
   * @param side the side to set
   */
  void setSide(
    Side side);

}