/**
 * 
 */
package com.cb.api.models.products;


import java.io.Serializable;


/**
 * 
 */
public interface CoinbaseProduct<FTSD extends CoinbaseFcmTradingSessionDetails, FPD extends CoinbaseFutureProductDetails<PD>, PD extends CoinbasePerpetualDetails> extends Serializable
{

  /**
   * @return the alias
   */

  String getAlias();


  /**
   * @return the aliasTo
   */

  String[] getAliasTo();


  /**
   * @return the baseCurrencyId
   */

  String getBaseCurrencyId();


  /**
   * @return the baseDisplaySymbol
   */

  String getBaseDisplaySymbol();


  /**
   * @return the baseIncrement
   */

  String getBaseIncrement();


  /**
   * @return the baseMaxSize
   */

  String getBaseMaxSize();


  /**
   * @return the baseMinSize
   */

  String getBaseMinSize();


  /**
   * @return the baseName
   */

  String getBaseName();


  /**
   * @return the fcmTradingSessionDetails
   */

  FTSD getFcmTradingSessionDetails();


  /**
   * @return the futureProductDetails
   */

  FPD getFutureProductDetails();


  /**
   * @return the midMarketPrice
   */

  String getMidMarketPrice();


  /**
   * @return the price
   */

  String getPrice();


  /**
   * @return the priceIncrement
   */

  String getPriceIncrement();


  /**
   * @return the pricePctChange24h
   */

  String getPricePctChange24h();


  /**
   * @return the productId
   */

  String getProductId();


  /**
   * @return the productType
   */

  String getProductType();


  /**
   * @return the quoteCurrencyId
   */

  String getQuoteCurrencyId();


  /**
   * @return the quoteDisplaySymbol
   */

  String getQuoteDisplaySymbol();


  /**
   * @return the quoteIncrement
   */

  String getQuoteIncrement();


  /**
   * @return the quoteMaxSize
   */

  String getQuoteMaxSize();


  /**
   * @return the quoteMinSize
   */

  String getQuoteMinSize();


  /**
   * @return the quoteName
   */
  String getQuoteName();


  /**
   * @return the status
   */
  String getStatus();


  /**
   * @return the viewOnly
   */
  Boolean getViewOnly();


  /**
   * @return the volume24h
   */

  String getVolume24h();


  /**
   * @return the volumePercentageChange24h
   */

  String getVolumePercentageChange24h();


  /**
   * @return the auctionMode
   */

  boolean isAuctionMode();


  /**
   * @return the cancelOnly
   */

  boolean isCancelOnly();


  /**
   * @return the disabled
   */

  boolean isDisabled();


  /**
   * @return the limitOnly
   */

  boolean isLimitOnly();


  /**
   * @return the isNew
   */

  boolean isNew();


  /**
   * @return the postOnly
   */

  boolean isPostOnly();


  /**
   * @return the tradingDisabled
   */

  boolean isTradingDisabled();


  /**
   * @return the watched
   */

  boolean isWatched();


  /**
   * @param alias the alias to set
   */

  void setAlias(
    String alias);


  /**
   * @param aliasTo the aliasTo to set
   */

  void setAliasTo(
    String[] aliasTo);


  /**
   * @param auctionMode the auctionMode to set
   */

  void setAuctionMode(
    boolean auctionMode);


  /**
   * @param baseCurrencyId the baseCurrencyId to set
   */

  void setBaseCurrencyId(
    String baseCurrencyId);


  /**
   * @param baseDisplaySymbol the baseDisplaySymbol to set
   */

  void setBaseDisplaySymbol(
    String baseDisplaySymbol);


  /**
   * @param baseIncrement the baseIncrement to set
   */

  void setBaseIncrement(
    String baseIncrement);


  /**
   * @param baseMaxSize the baseMaxSize to set
   */

  void setBaseMaxSize(
    String baseMaxSize);


  /**
   * @param baseMinSize the baseMinSize to set
   */

  void setBaseMinSize(
    String baseMinSize);


  /**
   * @param baseName the baseName to set
   */

  void setBaseName(
    String baseName);


  /**
   * @param cancelOnly the cancelOnly to set
   */

  void setCancelOnly(
    boolean cancelOnly);


  /**
   * @param disabled the disabled to set
   */

  void setDisabled(
    boolean disabled);


  /**
   * @param fcmTradingSessionDetails the fcmTradingSessionDetails to set
   */

  void setFcmTradingSessionDetails(
    FTSD fcmTradingSessionDetails);


  /**
   * @param futureProductDetails the futureProductDetails to set
   */

  void setFutureProductDetails(
    FPD futureProductDetails);


  /**
   * @param limitOnly the limitOnly to set
   */

  void setLimitOnly(
    boolean limitOnly);


  /**
   * @param midMarketPrice the midMarketPrice to set
   */

  void setMidMarketPrice(
    String midMarketPrice);


  /**
   * @param isNew the isNew to set
   */

  void setNew(
    boolean isNew);


  /**
   * @param postOnly the postOnly to set
   */

  void setPostOnly(
    boolean postOnly);


  /**
   * @param price the price to set
   */

  void setPrice(
    String price);


  /**
   * @param priceIncrement the priceIncrement to set
   */

  void setPriceIncrement(
    String priceIncrement);


  /**
   * @param pricePctChange24h the pricePctChange24h to set
   */

  void setPricePctChange24h(
    String pricePctChange24h);


  /**
   * @param productId the productId to set
   */

  void setProductId(
    String productId);


  /**
   * @param productType the productType to set
   */

  void setProductType(
    String productType);


  /**
   * @param quoteCurrencyId the quoteCurrencyId to set
   */

  void setQuoteCurrencyId(
    String quoteCurrencyId);


  /**
   * @param quoteDisplaySymbol the quoteDisplaySymbol to set
   */

  void setQuoteDisplaySymbol(
    String quoteDisplaySymbol);


  /**
   * @param quoteIncrement the quoteIncrement to set
   */

  void setQuoteIncrement(
    String quoteIncrement);


  /**
   * @param quoteMaxSize the quoteMaxSize to set
   */
  void setQuoteMaxSize(
    String quoteMaxSize);


  /**
   * @param quoteMinSize the quoteMinSize to set
   */
  void setQuoteMinSize(
    String quoteMinSize);


  /**
   * @param quoteName the quoteName to set
   */
  void setQuoteName(
    String quoteName);


  /**
   * @param status the status to set
   */
  void setStatus(
    String status);


  /**
   * @param tradingDisabled the tradingDisabled to set
   */
  void setTradingDisabled(
    boolean tradingDisabled);


  /**
   * @param viewOnly the viewOnly to set
   */
  void setViewOnly(
    Boolean viewOnly);


  /**
   * @param volume24h the volume24h to set
   */
  void setVolume24h(
    String volume24h);


  /**
   * @param volumePercentageChange24h the volumePercentageChange24h to set
   */
  void setVolumePercentageChange24h(
    String volumePercentageChange24h);


  /**
   * @param watched the watched to set
   */
  void setWatched(
    boolean watched);
}
