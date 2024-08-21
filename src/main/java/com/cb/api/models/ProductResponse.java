/**
 * 
 */
package com.cb.api.models;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class ProductResponse implements Serializable
{
  @JsonProperty("code")
  private Integer    code;

  @JsonProperty("error")
  private String     error;

  @JsonProperty("message")
  private String     message;

  @JsonProperty("num_products")
  private int        numProducts;

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("products")
  private Product[]  products;

  /**
   * 
   */
  public ProductResponse()
  {

  }


  /**
   * @param products
   */
  public ProductResponse(Product[] products)
  {
    this.products = products;
  }


  /**
   * @return the code
   */
  public Integer getCode()
  {
    return code;
  }


  /**
   * @return the error
   */
  public String getError()
  {
    return error;
  }


  /**
   * @return the message
   */
  public String getMessage()
  {
    return message;
  }


  /**
   * @return
   */
  public int getNumProducts()
  {
    return numProducts;
  }


  /**
   * @return the pagination
   */
  public Pagination getPagination()
  {
    return pagination;
  }


  public Product[] getProducts()
  {
    return products;
  }


  /**
   * @param code the code to set
   */
  public void setCode(
    Integer code)
  {
    this.code = code;
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
   * @param message the message to set
   */
  public void setMessage(
    String message)
  {
    this.message = message;
  }


  public void setNumProducts(
    int numProducts)
  {
    this.numProducts = numProducts;
  }


  /**
   * @param pagination the pagination to set
   */
  public void setPagination(
    Pagination pagination)
  {
    this.pagination = pagination;
  }


  public void setProducts(
    Product[] products)
  {
    this.products = products;
  }
}
