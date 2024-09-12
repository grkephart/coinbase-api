/**
 * 
 */
package com.cb.api.service;


import com.cb.api.models.orders.CoinbaseNewOrder;
import com.cb.api.models.orders.MarginType;
import com.cb.api.models.orders.Side;


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
