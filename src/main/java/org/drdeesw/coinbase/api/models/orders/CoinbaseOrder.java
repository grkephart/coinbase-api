package org.drdeesw.coinbase.api.models.orders;


import java.time.Instant;

import org.drdeesw.coinbase.api.models.products.ProductType;


public interface CoinbaseOrder extends CoinbaseNewOrder
{

  /**
   * @return the averageFilledPrice
   */
  String getAverageFilledPrice();


  /**
   * @return the cancelMessage
   */
  String getCancelMessage();


  /**
   * @return the completionPercentage
   */
  String getCompletionPercentage();


  /**
   * @return the createdTime
   */
  Instant getCreatedTime();


  /**
   * @return the editHistory
   */
  EditHistory[] getEditHistory();


  /**
   * @return the filledSize
   */
  String getFilledSize();


  /**
   * @return the filledValue
   */
  String getFilledValue();


  /**
   * @return the lastFillTime
   */
  Instant getLastFillTime();


  /**
   * @return the numberOfFills
   */
  String getNumberOfFills();


  /**
   * @return the orderPlacementSource
   */
  OrderPlacementSource getOrderPlacementSource();


  /**
   * @return the orderType
   */
  OrderType getOrderType();


  /**
   * @return the productType
   */
  ProductType getProductType();


  /**
   * @return the rejectMessage
   */
  String getRejectMessage();


  /**
   * @return the rejectReason
   */
  RejectReason getRejectReason();


  /**
   * @return the settled
   */
  Boolean getSettled();


  /**
   * @return the status
   */
  OrderStatus getStatus();


  /**
   * @return the timeInForce
   */
  OrderTimeInForce getTimeInForce();


  /**
   * @return the totalFees
   */
  String getTotalFees();


  /**
   * @return the totalValueAfterFees
   */
  String getTotalValueAfterFees();


  /**
   * @return the triggerStatus
   */
  TriggerStatus getTriggerStatus();


  /**
   * @return the userId
   */
  String getUserId();


  /**
   * @return the isLiquidation
   */
  boolean isLiquidation();


  /**
   * @return the outstandingHoldAmount
   */
  boolean isOutstandingHoldAmount();


  /**
   * @return the pendingCancel
   */
  boolean isPendingCancel();


  /**
   * @return the sizeInclusiveOfFees
   */
  boolean isSizeInclusiveOfFees();


  /**
   * @return the sizeInQuote
   */
  boolean isSizeInQuote();


  /**
   * @param averageFilledPrice the averageFilledPrice to set
   */
  void setAverageFilledPrice(
    String averageFilledPrice);


  /**
   * @param cancelMessage the cancelMessage to set
   */
  void setCancelMessage(
    String cancelMessage);


  /**
   * @param completionPercentage the completionPercentage to set
   */
  void setCompletionPercentage(
    String completionPercentage);


  /**
   * @param createdTime the createdTime to set
   */
  void setCreatedTime(
    Instant createdTime);


  /**
   * @param editHistory the editHistory to set
   */
  void setEditHistory(
    EditHistory[] editHistory);


  /**
   * @param filledSize the filledSize to set
   */
  void setFilledSize(
    String filledSize);


  /**
   * @param filledValue the filledValue to set
   */
  void setFilledValue(
    String filledValue);


  /**
   * @param lastFillTime the lastFillTime to set
   */
  void setLastFillTime(
    Instant lastFillTime);


  /**
   * @param isLiquidation the isLiquidation to set
   */
  void setLiquidation(
    boolean isLiquidation);


  /**
   * @param numberOfFills the numberOfFills to set
   */
  void setNumberOfFills(
    String numberOfFills);


  /**
   * @param orderPlacementSource the orderPlacementSource to set
   */
  void setOrderPlacementSource(
    OrderPlacementSource orderPlacementSource);


  /**
   * @param orderType the orderType to set
   */
  void setOrderType(
    OrderType orderType);


  /**
   * @param outstandingHoldAmount the outstandingHoldAmount to set
   */
  void setOutstandingHoldAmount(
    boolean outstandingHoldAmount);


  /**
   * @param pendingCancel the pendingCancel to set
   */
  void setPendingCancel(
    boolean pendingCancel);


  /**
   * @param productType the productType to set
   */
  void setProductType(
    ProductType productType);


  /**
   * @param rejectMessage the rejectMessage to set
   */
  void setRejectMessage(
    String rejectMessage);


  /**
   * @param rejectReason the rejectReason to set
   */
  void setRejectReason(
    RejectReason rejectReason);


  /**
   * @param settled the settled to set
   */
  void setSettled(
    Boolean settled);


  /**
   * @param sizeInclusiveOfFees the sizeInclusiveOfFees to set
   */
  void setSizeInclusiveOfFees(
    boolean sizeInclusiveOfFees);


  /**
   * @param sizeInQuote the sizeInQuote to set
   */
  void setSizeInQuote(
    boolean sizeInQuote);


  /**
   * @param status the status to set
   */
  void setStatus(
    OrderStatus status);


  /**
   * @param timeInForce the timeInForce to set
   */
  void setTimeInForce(
    OrderTimeInForce timeInForce);


  /**
   * @param totalFees the totalFees to set
   */
  void setTotalFees(
    String totalFees);


  /**
   * @param totalValueAfterFees the totalValueAfterFees to set
   */
  void setTotalValueAfterFees(
    String totalValueAfterFees);


  /**
   * @param triggerStatus the triggerStatus to set
   */
  void setTriggerStatus(
    TriggerStatus triggerStatus);


  /**
   * @param userId the userId to set
   */
  void setUserId(
    String userId);

}