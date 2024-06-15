/**
 * 
 */
package com.cb.api.dto;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
public class CreateOrderResponse
{
  static class ErrorResponse
  {
    @JsonProperty("error")
    private String error;
    @JsonProperty("error_details")
    private String errorDetails;
    @JsonProperty("message")
    private String message;
    @JsonProperty("new_order_failure_reason")
    private String newOrderFailureReason;
    @JsonProperty("previewFailureReason")
    private String previewFailureReason;

    /**
     * @return the error
     */
    public String getError()
    {
      return error;
    }


    /**
     * @return the errorDetails
     */
    public String getErrorDetails()
    {
      return errorDetails;
    }


    /**
     * @return the message
     */
    public String getMessage()
    {
      return message;
    }


    /**
     * @return the newOrderFailureReason
     */
    public String getNewOrderFailureReason()
    {
      return newOrderFailureReason;
    }


    /**
     * @return the previewFailureReason
     */
    public String getPreviewFailureReason()
    {
      return previewFailureReason;
    }


    /**
     * @param error the error to set
     */
    public void setError(
      String error)
    {
      this.error = error;
    }


    /**
     * @param errorDetails the errorDetails to set
     */
    public void setErrorDetails(
      String errorDetails)
    {
      this.errorDetails = errorDetails;
    }


    /**
     * @param message the message to set
     */
    public void setMessage(
      String message)
    {
      this.message = message;
    }


    /**
     * @param newOrderFailureReason the newOrderFailureReason to set
     */
    public void setNewOrderFailureReason(
      String newOrderFailureReason)
    {
      this.newOrderFailureReason = newOrderFailureReason;
    }


    /**
     * @param previewFailureReason the previewFailureReason to set
     */
    public void setPreviewFailureReason(
      String previewFailureReason)
    {
      this.previewFailureReason = previewFailureReason;
    }
  }


  static class SuccessResponse
  {
    @JsonProperty("client_orderId")
    private String clientOrderId;
    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("side")
    private String side;

    /**
     * @return the client_orderId
     */
    public String getClientOrderId()
    {
      return clientOrderId;
    }


    /**
     * @return the orderId
     */
    public String getOrderId()
    {
      return orderId;
    }


    /**
     * @return the productId
     */
    public String getProductId()
    {
      return productId;
    }


    /**
     * @return the side
     */
    public String getSide()
    {
      return side;
    }


    /**
     * @param client_orderId the client_orderId to set
     */
    public void setClientOrderId(
      String client_orderId)
    {
      this.clientOrderId = client_orderId;
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
     * @param productId the productId to set
     */
    public void setProductId(
      String productId)
    {
      this.productId = productId;
    }


    /**
     * @param side the side to set
     */
    public void setSide(
      String side)
    {
      this.side = side;
    }
  }

  @JsonProperty("error_response")
  private ErrorResponse      errorResponse;
  @JsonProperty("failure_reason")
  private String             failureReason;
  @JsonProperty("order_configuration")
  private OrderConfiguration orderConfiguration;
  @JsonProperty("order_id")
  private String             orderId;
  private boolean            success;
  @JsonProperty("success_response")
  private SuccessResponse    successResponse;

  /**
   * @return the errorResponse
   */
  public ErrorResponse getErrorResponse()
  {
    return errorResponse;
  }


  /**
   * @return the failureReason
   */
  public String getFailureReason()
  {
    return failureReason;
  }


  /**
   * @return the orderConfiguration
   */
  public OrderConfiguration getOrderConfiguration()
  {
    return orderConfiguration;
  }


  /**
   * @return the orderId
   */
  public String getOrderId()
  {
    return orderId;
  }


  /**
   * @return the successResponse
   */
  public SuccessResponse getSuccessResponse()
  {
    return successResponse;
  }


  /**
   * @return the success
   */
  public boolean isSuccess()
  {
    return success;
  }


  /**
   * @param errorResponse the errorResponse to set
   */
  public void setErrorResponse(
    ErrorResponse errorResponse)
  {
    this.errorResponse = errorResponse;
  }


  /**
   * @param failureReason the failureReason to set
   */
  public void setFailureReason(
    String failureReason)
  {
    this.failureReason = failureReason;
  }


  /**
   * @param orderConfiguration the orderConfiguration to set
   */
  public void setOrderConfiguration(
    OrderConfiguration orderConfiguration)
  {
    this.orderConfiguration = orderConfiguration;
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
   * @param success the success to set
   */
  public void setSuccess(
    boolean success)
  {
    this.success = success;
  }


  /**
   * @param successResponse the successResponse to set
   */
  public void setSuccessResponse(
    SuccessResponse successResponse)
  {
    this.successResponse = successResponse;
  }
}
