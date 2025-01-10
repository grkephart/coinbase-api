/**
 * 
 */
package org.drdeesw.coinbase.api.models;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
@SuppressWarnings("serial")
public class AccountResponse implements Serializable
{
  @JsonProperty("accounts")
  private Account[] accounts;
  @JsonProperty("cursor")
  private String    cursor;
  @JsonProperty("has_next")
  private boolean   hasNext;
  @JsonProperty("size")
  private Integer   size;

  /**
   * @return the accounts
   */
  public Account[] getAccounts()
  {
    return accounts;
  }


  /**
   * @return the cursor
   */
  public String getCursor()
  {
    return cursor;
  }


  /**
   * @return the size
   */
  public Integer getSize()
  {
    return size;
  }


  /**
   * @return the hasNext
   */
  public boolean isHasNext()
  {
    return hasNext;
  }


  /**
   * @param accounts the accounts to set
   */
  public void setAccounts(
    Account[] accounts)
  {
    this.accounts = accounts;
  }


  /**
   * @param cursor the cursor to set
   */
  public void setCursor(
    String cursor)
  {
    this.cursor = cursor;
  }


  /**
   * @param hasNext the hasNext to set
   */
  public void setHasNext(
    boolean hasNext)
  {
    this.hasNext = hasNext;
  }


  /**
   * @param size the size to set
   */
  public void setSize(
    Integer size)
  {
    this.size = size;
  }
}
