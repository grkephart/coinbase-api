package org.drdeesw.coinbase.api.models.orders;

import java.io.Serializable;

public interface CoinbaseSorLimitIoc extends Serializable
{

  /**
   * @return the baseSize
   */
  String getBaseSize();


  /**
   * @return the limitPrice
   */
  String getLimitPrice();


  /**
   * @param baseSize the baseSize to set
   */
  void setBaseSize(
    String baseSize);


  /**
   * @param limitPrice the limitPrice to set
   */
  void setLimitPrice(
    String limitPrice);

}