/**
 * 
 */
package com.cb.api.models.orders;


import java.time.Instant;

import com.cb.api.models.products.ProductType;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class CoinbaseOrderImpl extends CoinbaseNewOrderImpl implements CoinbaseOrder<CoinbaseOrderConfiguration>
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
  public CoinbaseOrderImpl()
  {

  }


  /**
   * @return the averageFilledPrice
   */
  @Override
  public String getAverageFilledPrice()
  {
    return averageFilledPrice;
  }


  /**
   * @return the cancelMessage
   */
  @Override
  public String getCancelMessage()
  {
    return cancelMessage;
  }


  /**
   * @return the completionPercentage
   */
  @Override
  public String getCompletionPercentage()
  {
    return completionPercentage;
  }


  /**
   * @return the createdTime
   */
  @Override
  public Instant getCreatedTime()
  {
    return createdTime;
  }


  /**
   * @return the editHistory
   */
  @Override
  public EditHistory[] getEditHistory()
  {
    return editHistory;
  }


  /**
   * @return the filledSize
   */
  @Override
  public String getFilledSize()
  {
    return filledSize;
  }


  /**
   * @return the filledValue
   */
  @Override
  public String getFilledValue()
  {
    return filledValue;
  }


  /**
   * @return the lastFillTime
   */
  @Override
  public Instant getLastFillTime()
  {
    return lastFillTime;
  }


  /**
   * @return the numberOfFills
   */
  @Override
  public String getNumberOfFills()
  {
    return numberOfFills;
  }


  /**
   * @return the orderPlacementSource
   */
  @Override
  public OrderPlacementSource getOrderPlacementSource()
  {
    return orderPlacementSource;
  }


  /**
   * @return the orderType
   */
  @Override
  public OrderType getOrderType()
  {
    return orderType;
  }


  /**
   * @return the productType
   */
  @Override
  public ProductType getProductType()
  {
    return productType;
  }


  /**
   * @return the rejectMessage
   */
  @Override
  public String getRejectMessage()
  {
    return rejectMessage;
  }


  /**
   * @return the rejectReason
   */
  @Override
  public RejectReason getRejectReason()
  {
    return rejectReason;
  }


  /**
   * @return the settled
   */
  @Override
  public Boolean getSettled()
  {
    return settled;
  }


  /**
   * @return the status
   */
  @Override
  public OrderStatus getStatus()
  {
    return status;
  }


  /**
   * @return the timeInForce
   */
  @Override
  public OrderTimeInForce getTimeInForce()
  {
    return timeInForce;
  }


  /**
   * @return the totalFees
   */
  @Override
  public String getTotalFees()
  {
    return totalFees;
  }


  /**
   * @return the totalValueAfterFees
   */
  @Override
  public String getTotalValueAfterFees()
  {
    return totalValueAfterFees;
  }


  /**
   * @return the triggerStatus
   */
  @Override
  public TriggerStatus getTriggerStatus()
  {
    return triggerStatus;
  }


  /**
   * @return the userId
   */
  @Override
  public String getUserId()
  {
    return userId;
  }


  /**
   * @return the isLiquidation
   */
  @Override
  public boolean isLiquidation()
  {
    return isLiquidation;
  }


  /**
   * @return the outstandingHoldAmount
   */
  @Override
  public boolean isOutstandingHoldAmount()
  {
    return outstandingHoldAmount;
  }


  /**
   * @return the pendingCancel
   */
  @Override
  public boolean isPendingCancel()
  {
    return pendingCancel;
  }


  /**
   * @return the sizeInclusiveOfFees
   */
  @Override
  public boolean isSizeInclusiveOfFees()
  {
    return sizeInclusiveOfFees;
  }


  /**
   * @return the sizeInQuote
   */
  @Override
  public boolean isSizeInQuote()
  {
    return sizeInQuote;
  }


  /**
   * @param averageFilledPrice the averageFilledPrice to set
   */
  @Override
  public void setAverageFilledPrice(
    String averageFilledPrice)
  {
    this.averageFilledPrice = averageFilledPrice;
  }


  /**
   * @param cancelMessage the cancelMessage to set
   */
  @Override
  public void setCancelMessage(
    String cancelMessage)
  {
    this.cancelMessage = cancelMessage;
  }


  /**
   * @param completionPercentage the completionPercentage to set
   */
  @Override
  public void setCompletionPercentage(
    String completionPercentage)
  {
    this.completionPercentage = completionPercentage;
  }


  /**
   * @param createdTime the createdTime to set
   */
  @Override
  public void setCreatedTime(
    Instant createdTime)
  {
    this.createdTime = createdTime;
  }


  /**
   * @param editHistory the editHistory to set
   */
  @Override
  public void setEditHistory(
    EditHistory[] editHistory)
  {
    this.editHistory = editHistory;
  }


  /**
   * @param filledSize the filledSize to set
   */
  @Override
  public void setFilledSize(
    String filledSize)
  {
    this.filledSize = filledSize;
  }


  /**
   * @param filledValue the filledValue to set
   */
  @Override
  public void setFilledValue(
    String filledValue)
  {
    this.filledValue = filledValue;
  }


  /**
   * @param lastFillTime the lastFillTime to set
   */
  @Override
  public void setLastFillTime(
    Instant lastFillTime)
  {
    this.lastFillTime = lastFillTime;
  }


  /**
   * @param isLiquidation the isLiquidation to set
   */
  @Override
  public void setLiquidation(
    boolean isLiquidation)
  {
    this.isLiquidation = isLiquidation;
  }


  /**
   * @param numberOfFills the numberOfFills to set
   */
  @Override
  public void setNumberOfFills(
    String numberOfFills)
  {
    this.numberOfFills = numberOfFills;
  }



  /**
   * @param orderPlacementSource the orderPlacementSource to set
   */
  @Override
  public void setOrderPlacementSource(
    OrderPlacementSource orderPlacementSource)
  {
    this.orderPlacementSource = orderPlacementSource;
  }


  /**
   * @param orderType the orderType to set
   */
  @Override
  public void setOrderType(
    OrderType orderType)
  {
    this.orderType = orderType;
  }


  /**
   * @param outstandingHoldAmount the outstandingHoldAmount to set
   */
  @Override
  public void setOutstandingHoldAmount(
    boolean outstandingHoldAmount)
  {
    this.outstandingHoldAmount = outstandingHoldAmount;
  }


  /**
   * @param pendingCancel the pendingCancel to set
   */
  @Override
  public void setPendingCancel(
    boolean pendingCancel)
  {
    this.pendingCancel = pendingCancel;
  }


  /**
   * @param productType the productType to set
   */
  @Override
  public void setProductType(
    ProductType productType)
  {
    this.productType = productType;
  }


  /**
   * @param rejectMessage the rejectMessage to set
   */
  @Override
  public void setRejectMessage(
    String rejectMessage)
  {
    this.rejectMessage = rejectMessage;
  }


  /**
   * @param rejectReason the rejectReason to set
   */
  @Override
  public void setRejectReason(
    RejectReason rejectReason)
  {
    this.rejectReason = rejectReason;
  }


  /**
   * @param settled the settled to set
   */
  @Override
  public void setSettled(
    Boolean settled)
  {
    this.settled = settled;
  }


  /**
   * @param sizeInclusiveOfFees the sizeInclusiveOfFees to set
   */
  @Override
  public void setSizeInclusiveOfFees(
    boolean sizeInclusiveOfFees)
  {
    this.sizeInclusiveOfFees = sizeInclusiveOfFees;
  }


  /**
   * @param sizeInQuote the sizeInQuote to set
   */
  @Override
  public void setSizeInQuote(
    boolean sizeInQuote)
  {
    this.sizeInQuote = sizeInQuote;
  }


  /**
   * @param status the status to set
   */
  @Override
  public void setStatus(
    OrderStatus status)
  {
    this.status = status;
  }


  /**
   * @param timeInForce the timeInForce to set
   */
  @Override
  public void setTimeInForce(
    OrderTimeInForce timeInForce)
  {
    this.timeInForce = timeInForce;
  }


  /**
   * @param totalFees the totalFees to set
   */
  @Override
  public void setTotalFees(
    String totalFees)
  {
    this.totalFees = totalFees;
  }


  /**
   * @param totalValueAfterFees the totalValueAfterFees to set
   */
  @Override
  public void setTotalValueAfterFees(
    String totalValueAfterFees)
  {
    this.totalValueAfterFees = totalValueAfterFees;
  }


  /**
   * @param triggerStatus the triggerStatus to set
   */
  @Override
  public void setTriggerStatus(
    TriggerStatus triggerStatus)
  {
    this.triggerStatus = triggerStatus;
  }


  /**
   * @param userId the userId to set
   */
  @Override
  public void setUserId(
    String userId)
  {
    this.userId = userId;
  }

}
