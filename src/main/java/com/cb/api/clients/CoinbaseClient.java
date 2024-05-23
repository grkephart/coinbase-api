/**
 * 
 */
package com.cb.api.clients;


import java.time.Instant;

import com.cb.api.dto.Account;
import com.cb.api.dto.AccountResponse;
import com.cb.api.dto.ContractExpiryType;
import com.cb.api.dto.MarginType;
import com.cb.api.dto.Order;
import com.cb.api.dto.OrderConfiguration;
import com.cb.api.dto.OrderPlacementSource;
import com.cb.api.dto.OrderStatus;
import com.cb.api.dto.OrderType;
import com.cb.api.dto.Product;
import com.cb.api.dto.ProductCandleResponse;
import com.cb.api.dto.ProductResponse;
import com.cb.api.dto.ProductType;
import com.cb.api.dto.Side;


/**
 * The Advanced Trade REST API.
 * The Advanced Trade API lets you manage orders, portfolios, products, and fees with our new v3 endpoints.
 * Contains the Advanced Trade Endpoints.
 * Advanced Trade endpoint URL: https://api.coinbase.com/api/v3/brokerage/{resource}
 */
public interface CoinbaseClient
{
  public static final String URL = "https://api.coinbase.com/api/v3/brokerage/";

  /**
   * Create an order with a specified product_id (asset-pair), side (buy/sell), etc.
   * 
   * @param authorization
   * @param clientOrderId A unique ID provided by the client for their own identification purposes. This ID differs from the order_id generated for the order. If the ID provided is not unique, the order fails to be created and the order corresponding to that ID is returned.
   * @param productId The product this order was created for e.g. 'BTC-USD'
   * @param side Possible values: [BUY, SELL]
   * @param orderConfiguration
   * @param selfTradePreventionId Self trade prevention ID, to prevent an order crossing against the same user
   * @param leverage Leverage for this order; default value is 1.0
   * @param marginType Possible values: [ISOLATED, CROSS]
   * @param retailPortfolioId Retail portfolio uuid, to associate this order with a retail portfolio
   */
  public void createOrder(
    String authorization,
    String clientOrderId,
    String productId,
    Side side, 
    OrderConfiguration orderConfiguration,
    String selfTradePreventionId,
    String leverage,
    MarginType marginType,
    String retailPortfolioId);


  /**
   * Get a list of information about an account, given an account UUID.
   * 
   * @param authorization
   * @param uuid
   * @return
   */
  Account getAccount(
    String authorization,
    String uuid);


  /**
   * Get a single order by order ID.
   * 
   * @param id
   * @return
   */
  Order getOrder(
    String authorization,
    String id);


  /**
   * Get information on a single product by product ID.
   * 
   * @param product_id
   * @return
   */
  Product getProduct(
    String authorization,
    String id);


  /**
   * Get rates for a single product by product ID, grouped in buckets.
   * 
   * @param authorization
   * @param productId The trading pair.
   * @param start Timestamp for starting range of aggregations, in UNIX time.
   * @param end Timestamp for ending range of aggregations, in UNIX time.
   * @param granularity The time slice value for each candle.
   * @return
   */
  ProductCandleResponse getProductCandles(
    String authorization,
    String productId,
    String start,
    String end,
    String granularity);


  /**
   * Get a list of the available currency pairs for trading.
   * 
   * @param limit A limit describing how many products to return.
   * @param offset Number of products to offset before returning.
   * @param productType Type of products to return
   * @param productIds List of product IDs to return.
   * @param contractExpiryType
   * @param expiringContractStatus
   * @return
   */
  ProductResponse getProducts(
    String authorization,
    int limit,
    String startingAfter,
    Integer offset,
    String productType,
    String[] productIds,
    String contractExpiryType,
    String expiringContractStatus);


  /**
   * Get a list of authenticated accounts for the current user.
   * 
   * @param limit A pagination limit with default of 49 and maximum of 250. If has_next is true, additional orders are available to be fetched with pagination and the cursor value in the response can be passed as cursor parameter in the subsequent request.
   * @param cursor Cursor used for pagination. When provided, the response returns responses after this cursor.
   * @param retailPortfolioId Only accounts matching this retail portfolio id are returned. If omitted, returns accounts for all retail portfolios permissioned for the API key.
   * @return
   */
  AccountResponse listAccounts(
    String authorization,
    Integer limit,
    String cursor,
    String retailPortfolioId);


  /**
   * Get a single order by order ID.
   * 
   * @param id
   * @return
   */
  Order listOrders(
    String authorization,
    String productId,
    OrderStatus[] orderStatus,
    int limit,
    Instant startDate,
    Instant endDate,
    OrderType orderType,
    Side orderSide,
    String cursor,
    ProductType productType,
    OrderPlacementSource orderPlacementSource,
    ContractExpiryType contractExpiryType,
    String[] assetFilters,
    String retailPortfolioId);
}
