/**
 * 
 */
package com.cb.api.clients;


import java.time.Instant;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.cb.api.models.Account;
import com.cb.api.models.AccountResponse;
import com.cb.api.models.ContractExpiryType;
import com.cb.api.models.CreateOrderResponse;
import com.cb.api.models.NewOrder;
import com.cb.api.models.Order;
import com.cb.api.models.OrderPlacementSource;
import com.cb.api.models.OrderStatus;
import com.cb.api.models.OrderType;
import com.cb.api.models.Product;
import com.cb.api.models.ProductCandleResponse;
import com.cb.api.models.ProductResponse;
import com.cb.api.models.ProductType;
import com.cb.api.models.Side;


/**
 * The Advanced Trade REST API.
 * The Advanced Trade API lets you manage orders, portfolios, products, and fees with our new v3 endpoints.
 * Contains the Advanced Trade Endpoints.
 * Advanced Trade endpoint URL: https://api.coinbase.com/api/v3/brokerage/{resource}
 */
@FeignClient(value = "coinbaseService", url = "${coinbase.service.url}")
public interface CoinbaseFeignClient extends CoinbaseClient
{

  /**
   * Create an order with a specified product_id (asset-pair), side (buy/sell), etc.
   */
  @PostMapping("orders")
  @Override
  CreateOrderResponse createOrder(
    @RequestHeader("Authorization")
    String authorization,
    NewOrder order);


  /**
   *
   */
  @Override
  @GetMapping("accounts")
  Account getAccount(
    @RequestHeader("Authorization")
    String authorization,
    @RequestParam("uuid")
    String uuid);


  @Override
  @GetMapping("orders/historical/{id}")
  Order getOrder(
    @RequestHeader("Authorization")
    String authorization,
    @PathVariable("order_id")
    String id);


  /**
   * Get information on a single product by product ID.
   * 
   * @param product_id
   * @return
   */
  @Override
  @GetMapping("products/{id}")
  Product getProduct(
    @RequestHeader("Authorization")
    String authorization,
    @PathVariable("id")
    String id);


  /**
   * Get rates for a single product by product ID, grouped in buckets.
   * 
   * @param authorization
   * @param productId The trading pair (e.g. 'BTC-USD').
   * @param start Timestamp for starting range of aggregations, in UNIX time.
   * @param end Timestamp for ending range of aggregations, in UNIX time.
   * @param granularity The time slice value for each candle.
   * @return
   */
  @Override
  @GetMapping("products/{id}/candles")
  ProductCandleResponse getProductCandles(
    @RequestHeader("Authorization")
    String authorization,
    @PathVariable("id")
    String productId,
    @RequestParam("start")
    String start,
    @RequestParam("end")
    String end,
    @RequestParam("granularity")
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
  @Override
  @GetMapping("products")
  ProductResponse getProducts(
    @RequestHeader("Authorization")
    String authorization,
    @RequestParam("limit")
    Integer limit,
    @RequestParam("starting_after")
    String startingAfter,
    @RequestParam("offset")
    Integer offset,
    @RequestParam("product_type")
    String productType,
    @RequestParam("product_ids")
    String[] productIds,
    @RequestParam("contract_expiry_type")
    String contractExpiryType,
    @RequestParam("expiring_contract_status")
    String expiringContractStatus);


  /**
   *
   */
  @Override
  @GetMapping("accounts")
  AccountResponse listAccounts(
    @RequestHeader("Authorization")
    String authorization,
    @RequestParam("limit")
    Integer limit,
    @RequestParam("cursor")
    String cursor,
    @RequestParam("retail_portfolio_id")
    String retailPortfolioId);


  /**
   *
   */
  @Override
  @GetMapping("orders/historical/batch")
  Order listOrders(
    @RequestHeader("Authorization")
    String authorization,
    @RequestParam("product_id")
    String productId,
    @RequestParam("order_status")
    OrderStatus[] orderStatus,
    @RequestParam("limit")
    int limit,
    @RequestParam("start_date")
    Instant startDate,
    @RequestParam("end_date")
    Instant endDate,
    @RequestParam("order_type")
    OrderType orderType,
    @RequestParam("order_side")
    Side orderSide,
    @RequestParam("cursor")
    String cursor,
    @RequestParam("product_type")
    ProductType productType,
    @RequestParam("order_placement_source")
    OrderPlacementSource orderPlacementSource,
    @RequestParam("contract_expiry_type")
    ContractExpiryType contractExpiryType,
    @RequestParam("asset_filters")
    String[] assetFilters,
    @RequestParam("retail_portfolio_id")
    String retailPortfolioId);
}
