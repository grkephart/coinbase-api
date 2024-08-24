package com.cb.api.models.orders;

import java.io.Serializable;

public interface CoinbaseNewOrder<OC extends CoinbaseOrderConfiguration> extends Serializable
{

  /**
   * @return the clientOrderId
   */
  String getClientOrderId();


  /**
   * @return the configuration
   */
  OC getConfiguration();


  /**
   * @return the leverage
   */
  String getLeverage();


  /**
   * @return the marginType
   */
  MarginType getMarginType();


  /**
   * @return the productId
   */
  String getProductId();


  /**
   * @return the retailPortfolioId
   */
  String getRetailPortfolioId();


  /**
   * @return the selfTradePreventionId
   */
  String getSelfTradePreventionId();


  /**
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
    OC configuration);


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