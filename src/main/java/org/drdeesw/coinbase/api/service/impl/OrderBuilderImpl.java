/**
 * 
 */
package org.drdeesw.coinbase.api.service.impl;


import org.drdeesw.coinbase.api.models.orders.CoinbaseMarketIoc;
import org.drdeesw.coinbase.api.models.orders.CoinbaseNewOrder;
import org.drdeesw.coinbase.api.models.orders.CoinbaseOrderConfiguration;
import org.drdeesw.coinbase.api.models.orders.MarginType;
import org.drdeesw.coinbase.api.models.orders.Side;
import org.drdeesw.coinbase.api.models.orders.impl.CoinbaseMarketIocImpl;
import org.drdeesw.coinbase.api.models.orders.impl.CoinbaseNewOrderImpl;
import org.drdeesw.coinbase.api.models.orders.impl.CoinbaseOrderConfigurationImpl;
import org.drdeesw.coinbase.api.service.OrderBuilder;


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
