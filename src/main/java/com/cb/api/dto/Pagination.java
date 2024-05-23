/**
 * 
 */
package com.cb.api.dto;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
public class Pagination
{
  /**
   * Pagination cursor. Resource ID that defines your place in the list.
   */
  @JsonProperty("ending_before")
  private String  endingBefore;
  /**
   *  Number of results per call. Accepted values: 0 - 100 (default 25)
   */
  @JsonProperty("limit")
  private Integer limit;

  /**
   * 
   */
  @JsonProperty("next_uri")
  private String  nextUri;

  /**
   * Result order. Accepted values: asc, desc (default)
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * 
   */
  @JsonProperty("previous_uri")
  private String  previousUri;

  /**
   * Pagination cursor. Resource ID that defines your place in the list.
   */
  @JsonProperty("starting_after")
  private String  startingAfter;

  /**
   * @return the endingBefore
   */
  public String getEndingBefore()
  {
    return endingBefore;
  }


  /**
   * @return the limit
   */
  public Integer getLimit()
  {
    return limit;
  }


  /**
   * @return the nextUri
   */
  public String getNextUri()
  {
    return nextUri;
  }


  /**
   * @return the order
   */
  public Integer getOrder()
  {
    return order;
  }


  /**
   * @return the previousUri
   */
  public String getPreviousUri()
  {
    return previousUri;
  }


  /**
   * @return the startingAfter
   */
  public String getStartingAfter()
  {
    return startingAfter;
  }


  /**
   * @param endingBefore the endingBefore to set
   */
  public void setEndingBefore(
    String endingBefore)
  {
    this.endingBefore = endingBefore;
  }


  /**
   * @param limit the limit to set
   */
  public void setLimit(
    Integer limit)
  {
    this.limit = limit;
  }


  /**
   * @param nextUri the nextUri to set
   */
  public void setNextUri(
    String nextUri)
  {
    this.nextUri = nextUri;
  }


  /**
   * @param order the order to set
   */
  public void setOrder(
    Integer order)
  {
    this.order = order;
  }


  /**
   * @param previousUri the previousUri to set
   */
  public void setPreviousUri(
    String previousUri)
  {
    this.previousUri = previousUri;
  }


  /**
   * @param startingAfter the startingAfter to set
   */
  public void setStartingAfter(
    String startingAfter)
  {
    this.startingAfter = startingAfter;
  }
}
