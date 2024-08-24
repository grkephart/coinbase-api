package com.cb.api.models.products;


import java.io.Serializable;


public interface CoinbaseProductCandle extends Serializable
{

  String getClose();


  String getHigh();


  /**
   * Something Coinbase should provide, but doesn't.
   * This will be productId + "-" + start + "-" + granularity.
   * 
   * @return the candle's internal id
   */
  String getInternalId();


  String getLow();


  String getOpen();


  String getStart();


  String getVolume();


  void setClose(
    String close);


  void setHigh(
    String high);


  void setInternalId(
    String internalId);


  /**
   * @param productId
   * @param granularity
   */
  void setInternalId(
    String productId,
    Granularity granularity);


  void setLow(
    String low);


  void setOpen(
    String open);


  void setStart(
    String start);


  void setVolume(
    String volume);

}