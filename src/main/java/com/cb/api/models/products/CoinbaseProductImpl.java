/**
 * 
 */
package com.cb.api.models.products;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class CoinbaseProductImpl implements CoinbaseProduct
{
  /**
   * CoinbaseProductImpl id for the corresponding unified book.
   */
  @JsonProperty("alias")
  private String                   alias;

  /**
   * CoinbaseProductImpl ids that this product serves as an alias for.
   */
  @JsonProperty("alias_to")
  private String[]                 aliasTo;

  /**
   * Whether or not the product is in auction mode. Required.
   */
  @JsonProperty("auction_mode")
  private boolean                  auctionMode;

  /**
   *  Symbol of the base currency.
   */
  @JsonProperty("base_currency_id")
  private String                   baseCurrencyId;

  /**
   * Symbol of the base display currency. Required.
   */
  @JsonProperty("base_display_symbol")
  private String                   baseDisplaySymbol;

  /**
   * Minimum amount base value can be increased or decreased at once. Required.
   */
  @JsonProperty("base_increment")
  private String                   baseIncrement;

  /**
   * Maximum size that can be represented of base currency. Required.
   */
  @JsonProperty("base_max_size")
  private String                   baseMaxSize;

  /**
   *  Minimum size that can be represented of base currency. Required.
   */
  @JsonProperty("base_min_size")
  private String                   baseMinSize;

  /**
   * Name of the base currency. Required.
   */
  @JsonProperty("base_name")
  private String                   baseName;

  /**
   * Whether or not orders of the product can only be cancelled, not placed or edited. Required.
   */
  @JsonProperty("cancel_only")
  private boolean                  cancelOnly;

  /**
   * Whether or not the product is disabled for trading. Required.
   */
  @JsonProperty("is_disabled")
  private boolean                  disabled;

  /**
   *  
   */
  @JsonProperty("fcm_trading_session_details")
  private CoinbaseFcmTradingSessionDetails fcmTradingSessionDetails;

  /**
   *
   */
  @JsonProperty("future_product_details")
  private CoinbaseFutureProductDetails     futureProductDetails;

  /**
   * Whether or not the product is 'new'. Required.
   */
  @JsonProperty("new")
  private boolean                  isNew;

  /**
   * Whether or not orders of the product can only be limit orders, not market orders. Required.
   */
  @JsonProperty("limit_only")
  private boolean                  limitOnly;

  /**
   * The current midpoint of the bid-ask spread, in quote currency.
   */
  @JsonProperty("mid_market_price")
  private String                   midMarketPrice;

  /**
   * Whether or not orders of the product can only be posted, not cancelled. Required.
   */
  @JsonProperty("post_only")
  private boolean                  postOnly;

  /**
   * The current price for the product, in quote currency. Required.
   */
  @JsonProperty("price")
  private String                   price;

  /**
   * Minimum amount price can be increased or decreased at once.
   */
  @JsonProperty("price_increment")
  private String                   priceIncrement;

  /**
   * The amount the price of the product has changed, in percent, in the last 24 hours. Required.
   */
  @JsonProperty("price_percentage_change_24h")
  private String                   pricePctChange24h;

  /**
   * The trading pair (eg: "BTC-USD"). Required.
   */
  @JsonProperty("product_id")
  private String                   productId;

  /**
   *  Possible values: [SPOT, FUTURE].
   */
  @JsonProperty("product_type")
  private String                   productType;

  /**
   *  Symbol of the quote currency.
   */
  @JsonProperty("quote_currency_id")
  private String                   quoteCurrencyId;

  /**
   * Symbol of the quote display currency. Required.
   */
  @JsonProperty("quote_display_symbol")
  private String                   quoteDisplaySymbol;

  /**
   * Minimum amount quote value can be increased or decreased at once. Required.
   */
  @JsonProperty("quote_increment")
  private String                   quoteIncrement;

  /**
   * Maximum size that can be represented of quote currency. Required.
   */
  @JsonProperty("quote_max_size")
  private String                   quoteMaxSize;

  /**
   * Minimum size that can be represented of quote currency. Required.
   */
  @JsonProperty("quote_min_size")
  private String                   quoteMinSize;

  /**
   *  Name of the quote currency. Required.
   */
  @JsonProperty("quote_name")
  private String                   quoteName;

  /**
   *  Status of the product. Required.
   */
  @JsonProperty("status")
  private String                   status;

  /**
   * Whether or not the product is disabled for trading for all market participants. Required.
   */
  @JsonProperty("trading_disabled")
  private boolean                  tradingDisabled;

  /**
   * Whether or not the product is in view only mode.
   */
  @JsonProperty("view_only")
  private Boolean                  viewOnly;

  /**
   * The trading volume for the product in the last 24 hours. Required.
   */
  @JsonProperty("volume_24h")
  private String                   volume24h;

  /**
   * The percentage amount the volume of the product has changed in the last 24 hours. Required.
   */
  @JsonProperty("volume_percentage_change_24h")
  private String                   volumePercentageChange24h;

  /**
   * Whether or not the product is on the user's watchlist. Required.
   */
  @JsonProperty("watched")
  private boolean                  watched;

  /**
   * 
   */
  public CoinbaseProductImpl()
  {
    this.fcmTradingSessionDetails = new CoinbaseFcmTradingSessionDetailsImpl();
    this.futureProductDetails = new CoinbaseFutureProductDetailsImpl();
  }


  /**
   * Unit testing.
   * 
   * @param productId
   */
  public CoinbaseProductImpl(String productId)
  {
    this.productId = productId;
  }


  /**
   * @return the alias
   */
  @Override
  public String getAlias()
  {
    return alias;
  }


  /**
   * @return the aliasTo
   */
  @Override
  public String[] getAliasTo()
  {
    return aliasTo;
  }


  /**
   * @return the baseCurrencyId
   */
  @Override
  public String getBaseCurrencyId()
  {
    return baseCurrencyId;
  }


  /**
   * @return the baseDisplaySymbol
   */
  @Override
  public String getBaseDisplaySymbol()
  {
    return baseDisplaySymbol;
  }


  /**
   * @return the baseIncrement
   */
  @Override
  public String getBaseIncrement()
  {
    return baseIncrement;
  }


  /**
   * @return the baseMaxSize
   */
  @Override
  public String getBaseMaxSize()
  {
    return baseMaxSize;
  }


  /**
   * @return the baseMinSize
   */
  @Override
  public String getBaseMinSize()
  {
    return baseMinSize;
  }


  /**
   * @return the baseName
   */
  @Override
  public String getBaseName()
  {
    return baseName;
  }


  /**
   * @return the fcmTradingSessionDetails
   */
  @Override
  public CoinbaseFcmTradingSessionDetails getFcmTradingSessionDetails()
  {
    return fcmTradingSessionDetails;
  }


  /**
   * @return the futureProductDetails
   */
  @Override
  public CoinbaseFutureProductDetails getFutureProductDetails()
  {
    return futureProductDetails;
  }


  /**
   * @return the midMarketPrice
   */
  @Override
  public String getMidMarketPrice()
  {
    return midMarketPrice;
  }


  /**
   * @return the price
   */
  @Override
  public String getPrice()
  {
    return price;
  }


  /**
   * @return the priceIncrement
   */
  @Override
  public String getPriceIncrement()
  {
    return priceIncrement;
  }


  /**
   * @return the pricePctChange24h
   */
  @Override
  public String getPricePctChange24h()
  {
    return pricePctChange24h;
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
   * @return the productType
   */
  @Override
  public String getProductType()
  {
    return productType;
  }


  /**
   * @return the quoteCurrencyId
   */
  @Override
  public String getQuoteCurrencyId()
  {
    return quoteCurrencyId;
  }


  /**
   * @return the quoteDisplaySymbol
   */
  @Override
  public String getQuoteDisplaySymbol()
  {
    return quoteDisplaySymbol;
  }


  /**
   * @return the quoteIncrement
   */
  @Override
  public String getQuoteIncrement()
  {
    return quoteIncrement;
  }


  /**
   * @return the quoteMaxSize
   */
  @Override
  public String getQuoteMaxSize()
  {
    return quoteMaxSize;
  }


  /**
   * @return the quoteMinSize
   */
  @Override
  public String getQuoteMinSize()
  {
    return quoteMinSize;
  }


  /**
   * @return the quoteName
   */
  public String getQuoteName()
  {
    return quoteName;
  }


  /**
   * @return the status
   */
  public String getStatus()
  {
    return status;
  }


  /**
   * @return the viewOnly
   */
  public Boolean getViewOnly()
  {
    return viewOnly;
  }


  /**
   * @return the volume24h
   */
  @Override
  public String getVolume24h()
  {
    return volume24h;
  }


  /**
   * @return the volumePercentageChange24h
   */
  @Override
  public String getVolumePercentageChange24h()
  {
    return volumePercentageChange24h;
  }


  /**
   * @return the auctionMode
   */
  @Override
  public boolean isAuctionMode()
  {
    return auctionMode;
  }


  /**
   * @return the cancelOnly
   */
  @Override
  public boolean isCancelOnly()
  {
    return cancelOnly;
  }


  /**
   * @return the disabled
   */
  @Override
  public boolean isDisabled()
  {
    return disabled;
  }


  /**
   * @return the limitOnly
   */
  @Override
  public boolean isLimitOnly()
  {
    return limitOnly;
  }


  /**
   * @return the isNew
   */
  @Override
  public boolean isNew()
  {
    return isNew;
  }


  /**
   * @return the postOnly
   */
  @Override
  public boolean isPostOnly()
  {
    return postOnly;
  }


  /**
   * @return the tradingDisabled
   */
  @Override
  public boolean isTradingDisabled()
  {
    return tradingDisabled;
  }


  /**
   * @return the watched
   */
  @Override
  public boolean isWatched()
  {
    return watched;
  }


  /**
   * @param alias the alias to set
   */
  @Override
  public void setAlias(
    String alias)
  {
    this.alias = alias;
  }


  /**
   * @param aliasTo the aliasTo to set
   */
  @Override
  public void setAliasTo(
    String[] aliasTo)
  {
    this.aliasTo = aliasTo;
  }


  /**
   * @param auctionMode the auctionMode to set
   */
  @Override
  public void setAuctionMode(
    boolean auctionMode)
  {
    this.auctionMode = auctionMode;
  }


  /**
   * @param baseCurrencyId the baseCurrencyId to set
   */
  @Override
  public void setBaseCurrencyId(
    String baseCurrencyId)
  {
    this.baseCurrencyId = baseCurrencyId;
  }


  /**
   * @param baseDisplaySymbol the baseDisplaySymbol to set
   */
  @Override
  public void setBaseDisplaySymbol(
    String baseDisplaySymbol)
  {
    this.baseDisplaySymbol = baseDisplaySymbol;
  }


  /**
   * @param baseIncrement the baseIncrement to set
   */
  @Override
  public void setBaseIncrement(
    String baseIncrement)
  {
    this.baseIncrement = baseIncrement;
  }


  /**
   * @param baseMaxSize the baseMaxSize to set
   */
  @Override
  public void setBaseMaxSize(
    String baseMaxSize)
  {
    this.baseMaxSize = baseMaxSize;
  }


  /**
   * @param baseMinSize the baseMinSize to set
   */
  @Override
  public void setBaseMinSize(
    String baseMinSize)
  {
    this.baseMinSize = baseMinSize;
  }


  /**
   * @param baseName the baseName to set
   */
  @Override
  public void setBaseName(
    String baseName)
  {
    this.baseName = baseName;
  }


  /**
   * @param cancelOnly the cancelOnly to set
   */
  @Override
  public void setCancelOnly(
    boolean cancelOnly)
  {
    this.cancelOnly = cancelOnly;
  }


  /**
   * @param disabled the disabled to set
   */
  @Override
  public void setDisabled(
    boolean disabled)
  {
    this.disabled = disabled;
  }


  /**
   * @param fcmTradingSessionDetails the fcmTradingSessionDetails to set
   */
  @Override
  public void setFcmTradingSessionDetails(
    CoinbaseFcmTradingSessionDetails fcmTradingSessionDetails)
  {
    this.fcmTradingSessionDetails = fcmTradingSessionDetails;
  }


  /**
   * @param futureProductDetails the futureProductDetails to set
   */
  @Override
  public void setFutureProductDetails(
    CoinbaseFutureProductDetails futureProductDetails)
  {
    this.futureProductDetails = futureProductDetails;
  }


  /**
   * @param limitOnly the limitOnly to set
   */
  @Override
  public void setLimitOnly(
    boolean limitOnly)
  {
    this.limitOnly = limitOnly;
  }


  /**
   * @param midMarketPrice the midMarketPrice to set
   */
  @Override
  public void setMidMarketPrice(
    String midMarketPrice)
  {
    this.midMarketPrice = midMarketPrice;
  }


  /**
   * @param isNew the isNew to set
   */
  @Override
  public void setNew(
    boolean isNew)
  {
    this.isNew = isNew;
  }


  /**
   * @param postOnly the postOnly to set
   */
  @Override
  public void setPostOnly(
    boolean postOnly)
  {
    this.postOnly = postOnly;
  }


  /**
   * @param price the price to set
   */
  @Override
  public void setPrice(
    String price)
  {
    this.price = price;
  }


  /**
   * @param priceIncrement the priceIncrement to set
   */
  @Override
  public void setPriceIncrement(
    String priceIncrement)
  {
    this.priceIncrement = priceIncrement;
  }


  /**
   * @param pricePctChange24h the pricePctChange24h to set
   */
  @Override
  public void setPricePctChange24h(
    String pricePctChange24h)
  {
    this.pricePctChange24h = pricePctChange24h;
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
   * @param productType the productType to set
   */
  @Override
  public void setProductType(
    String productType)
  {
    this.productType = productType;
  }


  /**
   * @param quoteCurrencyId the quoteCurrencyId to set
   */
  @Override
  public void setQuoteCurrencyId(
    String quoteCurrencyId)
  {
    this.quoteCurrencyId = quoteCurrencyId;
  }


  /**
   * @param quoteDisplaySymbol the quoteDisplaySymbol to set
   */
  @Override
  public void setQuoteDisplaySymbol(
    String quoteDisplaySymbol)
  {
    this.quoteDisplaySymbol = quoteDisplaySymbol;
  }


  /**
   * @param quoteIncrement the quoteIncrement to set
   */
  @Override
  public void setQuoteIncrement(
    String quoteIncrement)
  {
    this.quoteIncrement = quoteIncrement;
  }


  /**
   * @param quoteMaxSize the quoteMaxSize to set
   */
  public void setQuoteMaxSize(
    String quoteMaxSize)
  {
    this.quoteMaxSize = quoteMaxSize;
  }


  /**
   * @param quoteMinSize the quoteMinSize to set
   */
  public void setQuoteMinSize(
    String quoteMinSize)
  {
    this.quoteMinSize = quoteMinSize;
  }


  /**
   * @param quoteName the quoteName to set
   */
  public void setQuoteName(
    String quoteName)
  {
    this.quoteName = quoteName;
  }


  /**
   * @param status the status to set
   */
  public void setStatus(
    String status)
  {
    this.status = status;
  }


  /**
   * @param tradingDisabled the tradingDisabled to set
   */
  public void setTradingDisabled(
    boolean tradingDisabled)
  {
    this.tradingDisabled = tradingDisabled;
  }


  /**
   * @param viewOnly the viewOnly to set
   */
  @Override
  public void setViewOnly(
    Boolean viewOnly)
  {
    this.viewOnly = viewOnly;
  }


  /**
   * @param volume24h the volume24h to set
   */
  @Override
  public void setVolume24h(
    String volume24h)
  {
    this.volume24h = volume24h;
  }


  /**
   * @param volumePercentageChange24h the volumePercentageChange24h to set
   */
  @Override
  public void setVolumePercentageChange24h(
    String volumePercentageChange24h)
  {
    this.volumePercentageChange24h = volumePercentageChange24h;
  }


  /**
   * @param watched the watched to set
   */
  @Override
  public void setWatched(
    boolean watched)
  {
    this.watched = watched;
  }

}
