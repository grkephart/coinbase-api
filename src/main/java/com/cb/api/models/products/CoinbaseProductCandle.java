package com.cb.api.models.products;


import java.io.Serializable;


public interface CoinbaseProductCandle extends Serializable
{

  String getClose();


  String getHigh();


  String getInternalId();


  String getLow();


  String getOpen();


  String getStart();


  String getVolume();


  void setClose(
    String close);


  void setHigh(
    String high);


  /**
   * @param internalId the internalId to set
   */
  void setInternalId(
    String internalId);


  void setLow(
    String low);


  void setOpen(
    String open);


  void setStart(
    String start);


  void setVolume(
    String volume);

}