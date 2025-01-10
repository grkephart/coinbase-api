/**
 * 
 */
package org.drdeesw.coinbase.api.service;


import org.drdeesw.coinbase.api.models.orders.CoinbaseNewOrder;
import org.drdeesw.coinbase.api.models.orders.MarginType;
import org.drdeesw.coinbase.api.models.orders.Side;


/**
 * 
 */
public interface OrderBuilder
{
  CoinbaseNewOrder buildMarketOrder(
    String clientOrderId,
    String productId,
    Side side,
    String baseSize,
    String quoteSize);


  CoinbaseNewOrder buildMarketOrder(
    String clientOrderId,
    String productId,
    Side side,
    String baseSize,
    String quoteSize,
    String selfTradePreventionId,
    String leverage,
    MarginType marginType,
    String retailPortfolioId);
}
