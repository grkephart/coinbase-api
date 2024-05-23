/**
 * 
 */
package com.cb.api.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class ProductResponse implements Serializable
{
  @JsonProperty("num_products")
  private int       numProducts;
  
  @JsonProperty("pagination")
  private Pagination pagination;
  
  @JsonProperty("products")
  private Product[] products;
  
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
