/**
 * 
 */
package com.cb.api.models;


import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class Order extends NewOrder implements Serializable
{

  /**
   * The average of all prices of fills for this order
   */
  @JsonProperty("average_filled_price")
  private String               averageFilledPrice;

  @JsonProperty("cancel_message")
  private String               cancelMessage;

  /**
   * The percent of total order amount that has been filled
   */
  @JsonProperty("completion_percentage")
  private String               completionPercentage;

  /**
   * Timestamp for when the order was created
   */
  @JsonProperty("created_time")
  private Instant              createdTime;

  /**
   * An array of the latest 5 edits per order
   */
  @JsonProperty("edit_history")
  private EditHistory[]        editHistory;

  /**
   * The portion (in base currency) of total order amount that has been filled 
   */
  @JsonProperty("filled_size")
  private String               filledSize;

  /**
   *  The amount -- in quote currency -- of the total order that has been filled
   */
  @JsonProperty("filled_value")
  private String               filledValue;

  /**
   * True if order is of liquidation type.
   */
  @JsonProperty("is_liquidation")
  private boolean              isLiquidation;

  /**
   * Time of the most recent fill for this order
   */
  @JsonProperty("last_fill_time")
  private Instant              lastFillTime;

  /**
   * Number of fills that have been posted for this order
   */
  @JsonProperty("number_of_fills")
  private String               numberOfFills;

  /**
   * The unique id for this order
   */
  @JsonProperty("order_id")
  private String               orderId;

  /**
   * Possible values: [RETAIL_SIMPLE, RETAIL_ADVANCED]
   */
  @JsonProperty("order_placement_source")
  private OrderPlacementSource orderPlacementSource;

  /**
   * Possible values: [UNKNOWN_ORDER_TYPE, MARKET, LIMIT, STOP, STOP_LIMIT, BRACKET]
   */
  @JsonProperty("")
  private OrderType            orderType;

  /**
   * The remaining hold amount calculated as (holdAmount - holdAmountReleased). 
   * If the hold is released, returns 0.
   */
  @JsonProperty("outstanding_hold_amount")
  private boolean              outstandingHoldAmount;

  /**
   * Whether a cancel request has been initiated for the order, and not yet completed
   */
  @JsonProperty("pending_cancel")
  private boolean              pendingCancel;

  /**
   * Possible values: [SPOT, FUTURE]
   */
  @JsonProperty("product_type")
  private ProductType          productType;

  /**
   *  Message stating why the order was rejected.
   */
  @JsonProperty("reject_message")
  private String               rejectMessage;

  /**
   * Possible values: [REJECT_REASON_UNSPECIFIED]
   */
  @JsonProperty("reject_reason")
  private RejectReason         rejectReason;

  /**
   *  True if the order is fully filled, false otherwise.
   */
  @JsonProperty("settled")
  private Boolean              settled;

  /**
   * Whether the order size includes fees
   */
  @JsonProperty("size_inclusive_of_fees")
  private boolean              sizeInclusiveOfFees;

  /**
   * Whether the order was placed with quote currency
   */
  @JsonProperty("size_in_quote")
  private boolean              sizeInQuote;

  /**
   * Possible values: [OPEN, FILLED, CANCELLED, EXPIRED, FAILED, UNKNOWN_ORDER_STATUS]
   */
  @JsonProperty("status")
  private OrderStatus          status;

  /**
   * Possible values: [UNKNOWN_TIME_IN_FORCE, GOOD_UNTIL_DATE_TIME, GOOD_UNTIL_CANCELLED, IMMEDIATE_OR_CANCEL, FILL_OR_KILL]
   */
  @JsonProperty("time_in_force")
  private OrderTimeInForce     timeInForce;

  /**
   *  The total fees for the order
   */
  @JsonProperty("total_fees")
  private String               totalFees;

  /**
   * Derived field defined as (filled_value + total_fees) for buy orders and 
   * (filled_value - total_fees) for sell orders.
   */
  @JsonProperty("total_value_after_fees")
  private String               totalValueAfterFees;

  /**
   * Possible values: [UNKNOWN_TRIGGER_STATUS, INVALID_ORDER_TYPE, STOP_PENDING, STOP_TRIGGERED]
   */
  @JsonProperty("trigger_status")
  private TriggerStatus        triggerStatus;

  /**
   * The id of the User owning this OrderPojo
   */
  @JsonProperty("user_id")
  private String               userId;

  /**
   * 
   */
  public Order()
  {

  }


  /**
   * @return the averageFilledPrice
   */
  public String getAverageFilledPrice()
  {
    return averageFilledPrice;
  }


  /**
   * @return the cancelMessage
   */
  public String getCancelMessage()
  {
    return cancelMessage;
  }


  /**
   * @return the completionPercentage
   */
  public String getCompletionPercentage()
  {
    return completionPercentage;
  }


  /**
   * @return the createdTime
   */
  public Instant getCreatedTime()
  {
    return createdTime;
  }


  /**
   * @return the editHistory
   */
  public EditHistory[] getEditHistory()
  {
    return editHistory;
  }


  /**
   * @return the filledSize
   */
  public String getFilledSize()
  {
    return filledSize;
  }


  /**
   * @return the filledValue
   */
  public String getFilledValue()
  {
    return filledValue;
  }


  /**
   * @return the lastFillTime
   */
  public Instant getLastFillTime()
  {
    return lastFillTime;
  }


  /**
   * @return the numberOfFills
   */
  public String getNumberOfFills()
  {
    return numberOfFills;
  }


  /**
   * @return the orderId
   */
  public String getOrderId()
  {
    return orderId;
  }


  /**
   * @return the orderPlacementSource
   */
  public OrderPlacementSource getOrderPlacementSource()
  {
    return orderPlacementSource;
  }


  /**
   * @return the orderType
   */
  public OrderType getOrderType()
  {
    return orderType;
  }


  /**
   * @return the productType
   */
  public ProductType getProductType()
  {
    return productType;
  }


  /**
   * @return the rejectMessage
   */
  public String getRejectMessage()
  {
    return rejectMessage;
  }


  /**
   * @return the rejectReason
   */
  public RejectReason getRejectReason()
  {
    return rejectReason;
  }


  /**
   * @return the settled
   */
  public Boolean getSettled()
  {
    return settled;
  }


  /**
   * @return the status
   */
  public OrderStatus getStatus()
  {
    return status;
  }


  /**
   * @return the timeInForce
   */
  public OrderTimeInForce getTimeInForce()
  {
    return timeInForce;
  }


  /**
   * @return the totalFees
   */
  public String getTotalFees()
  {
    return totalFees;
  }


  /**
   * @return the totalValueAfterFees
   */
  public String getTotalValueAfterFees()
  {
    return totalValueAfterFees;
  }


  /**
   * @return the triggerStatus
   */
  public TriggerStatus getTriggerStatus()
  {
    return triggerStatus;
  }


  /**
   * @return the userId
   */
  public String getUserId()
  {
    return userId;
  }


  /**
   * @return the isLiquidation
   */
  public boolean isLiquidation()
  {
    return isLiquidation;
  }


  /**
   * @return the outstandingHoldAmount
   */
  public boolean isOutstandingHoldAmount()
  {
    return outstandingHoldAmount;
  }


  /**
   * @return the pendingCancel
   */
  public boolean isPendingCancel()
  {
    return pendingCancel;
  }


  /**
   * @return the sizeInclusiveOfFees
   */
  public boolean isSizeInclusiveOfFees()
  {
    return sizeInclusiveOfFees;
  }


  /**
   * @return the sizeInQuote
   */
  public boolean isSizeInQuote()
  {
    return sizeInQuote;
  }


  /**
   * @param averageFilledPrice the averageFilledPrice to set
   */
  public void setAverageFilledPrice(
    String averageFilledPrice)
  {
    this.averageFilledPrice = averageFilledPrice;
  }


  /**
   * @param cancelMessage the cancelMessage to set
   */
  public void setCancelMessage(
    String cancelMessage)
  {
    this.cancelMessage = cancelMessage;
  }


  /**
   * @param completionPercentage the completionPercentage to set
   */
  public void setCompletionPercentage(
    String completionPercentage)
  {
    this.completionPercentage = completionPercentage;
  }


  /**
   * @param createdTime the createdTime to set
   */
  public void setCreatedTime(
    Instant createdTime)
  {
    this.createdTime = createdTime;
  }


  /**
   * @param editHistory the editHistory to set
   */
  public void setEditHistory(
    EditHistory[] editHistory)
  {
    this.editHistory = editHistory;
  }


  /**
   * @param filledSize the filledSize to set
   */
  public void setFilledSize(
    String filledSize)
  {
    this.filledSize = filledSize;
  }


  /**
   * @param filledValue the filledValue to set
   */
  public void setFilledValue(
    String filledValue)
  {
    this.filledValue = filledValue;
  }


  /**
   * @param lastFillTime the lastFillTime to set
   */
  public void setLastFillTime(
    Instant lastFillTime)
  {
    this.lastFillTime = lastFillTime;
  }


  /**
   * @param isLiquidation the isLiquidation to set
   */
  public void setLiquidation(
    boolean isLiquidation)
  {
    this.isLiquidation = isLiquidation;
  }


  /**
   * @param numberOfFills the numberOfFills to set
   */
  public void setNumberOfFills(
    String numberOfFills)
  {
    this.numberOfFills = numberOfFills;
  }


  /**
   * @param orderId the orderId to set
   */
  public void setOrderId(
    String orderId)
  {
    this.orderId = orderId;
  }


  /**
   * @param orderPlacementSource the orderPlacementSource to set
   */
  public void setOrderPlacementSource(
    OrderPlacementSource orderPlacementSource)
  {
    this.orderPlacementSource = orderPlacementSource;
  }


  /**
   * @param orderType the orderType to set
   */
  public void setOrderType(
    OrderType orderType)
  {
    this.orderType = orderType;
  }


  /**
   * @param outstandingHoldAmount the outstandingHoldAmount to set
   */
  public void setOutstandingHoldAmount(
    boolean outstandingHoldAmount)
  {
    this.outstandingHoldAmount = outstandingHoldAmount;
  }


  /**
   * @param pendingCancel the pendingCancel to set
   */
  public void setPendingCancel(
    boolean pendingCancel)
  {
    this.pendingCancel = pendingCancel;
  }


  /**
   * @param productType the productType to set
   */
  public void setProductType(
    ProductType productType)
  {
    this.productType = productType;
  }


  /**
   * @param rejectMessage the rejectMessage to set
   */
  public void setRejectMessage(
    String rejectMessage)
  {
    this.rejectMessage = rejectMessage;
  }


  /**
   * @param rejectReason the rejectReason to set
   */
  public void setRejectReason(
    RejectReason rejectReason)
  {
    this.rejectReason = rejectReason;
  }


  /**
   * @param settled the settled to set
   */
  public void setSettled(
    Boolean settled)
  {
    this.settled = settled;
  }


  /**
   * @param sizeInclusiveOfFees the sizeInclusiveOfFees to set
   */
  public void setSizeInclusiveOfFees(
    boolean sizeInclusiveOfFees)
  {
    this.sizeInclusiveOfFees = sizeInclusiveOfFees;
  }


  /**
   * @param sizeInQuote the sizeInQuote to set
   */
  public void setSizeInQuote(
    boolean sizeInQuote)
  {
    this.sizeInQuote = sizeInQuote;
  }


  /**
   * @param status the status to set
   */
  public void setStatus(
    OrderStatus status)
  {
    this.status = status;
  }


  /**
   * @param timeInForce the timeInForce to set
   */
  public void setTimeInForce(
    OrderTimeInForce timeInForce)
  {
    this.timeInForce = timeInForce;
  }


  /**
   * @param totalFees the totalFees to set
   */
  public void setTotalFees(
    String totalFees)
  {
    this.totalFees = totalFees;
  }


  /**
   * @param totalValueAfterFees the totalValueAfterFees to set
   */
  public void setTotalValueAfterFees(
    String totalValueAfterFees)
  {
    this.totalValueAfterFees = totalValueAfterFees;
  }


  /**
   * @param triggerStatus the triggerStatus to set
   */
  public void setTriggerStatus(
    TriggerStatus triggerStatus)
  {
    this.triggerStatus = triggerStatus;
  }


  /**
   * @param userId the userId to set
   */
  public void setUserId(
    String userId)
  {
    this.userId = userId;
  }

}
