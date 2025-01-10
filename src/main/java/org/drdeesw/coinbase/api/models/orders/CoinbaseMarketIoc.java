package org.drdeesw.coinbase.api.models.orders;

import java.io.Serializable;

public interface CoinbaseMarketIoc extends Serializable
{

  String getBaseSize();


  String getQuoteSize();


  void setBaseSize(
    String baseSize);


  void setQuoteSize(
    String quoteSize);

}