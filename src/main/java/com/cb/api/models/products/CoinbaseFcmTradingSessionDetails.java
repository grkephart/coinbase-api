package com.cb.api.models.products;


import java.io.Serializable;
import java.time.Instant;


public interface CoinbaseFcmTradingSessionDetails extends Serializable
{

  /**
   * @return the closeTime
   */
  Instant getCloseTime();


  /**
   * @return the openTime
   */
  Instant getOpenTime();


  /**
   * @return the sessionOpen
   */
  boolean isSessionOpen();


  /**
   * @param closeTime the closeTime to set
   */
  void setCloseTime(
    Instant closeTime);


  /**
   * @param openTime the openTime to set
   */
  void setOpenTime(
    Instant openTime);


  /**
   * @param sessionOpen the sessionOpen to set
   */
  void setSessionOpen(
    boolean sessionOpen);

}