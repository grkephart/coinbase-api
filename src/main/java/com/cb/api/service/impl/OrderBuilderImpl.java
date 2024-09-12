/**
 * 
 */
package com.cb.api.service.impl;


import com.cb.api.models.orders.CoinbaseMarketIoc;
import com.cb.api.models.orders.CoinbaseNewOrder;
import com.cb.api.models.orders.CoinbaseOrderConfiguration;
import com.cb.api.models.orders.MarginType;
import com.cb.api.models.orders.Side;
import com.cb.api.models.orders.impl.CoinbaseMarketIocImpl;
import com.cb.api.models.orders.impl.CoinbaseNewOrderImpl;
import com.cb.api.models.orders.impl.CoinbaseOrderConfigurationImpl;
import com.cb.api.service.OrderBuilder;


/**
 * 
 */
public class OrderBuilderImpl implements OrderBuilder
{

  @Override
  public CoinbaseNewOrder buildMarketOrder(
    String clientOrderId,
    String productId,
    Side side,
    String baseSize,
    String quoteSize)
  {
    String selfTradePreventionId = null;
    String leverage = null;
    MarginType marginType = null;
    String retailPortfolioId = null;

    return buildMarketOrder(clientOrderId, productId, side, baseSize, quoteSize,
      selfTradePreventionId, leverage, marginType, retailPortfolioId);
  }


  @Override
  public CoinbaseNewOrder buildMarketOrder(
    String clientOrderId,
    String productId,
    Side side,
    String baseSize,
    String quoteSize,
    String selfTradePreventionId,
    String leverage,
    MarginType marginType,
    String retailPortfolioId)
  {
    CoinbaseMarketIoc marketIoc = new CoinbaseMarketIocImpl(quoteSize, baseSize);
    CoinbaseOrderConfiguration coinbaseOrderConfiguration = new CoinbaseOrderConfigurationImpl(
        marketIoc);
    CoinbaseNewOrder order = new CoinbaseNewOrderImpl(clientOrderId, productId, side,
        coinbaseOrderConfiguration, selfTradePreventionId, leverage, marginType, retailPortfolioId);

    return order;
  }

}
