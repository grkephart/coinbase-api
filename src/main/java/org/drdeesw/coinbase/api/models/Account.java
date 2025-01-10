/**
 *
 */
package org.drdeesw.coinbase.api.models;


import java.io.Serializable;
import java.time.Instant;


/**
 *
 */
@SuppressWarnings("serial")
public class Account implements Serializable
{
  private Boolean active;
  private Money   availableBalance;
  private Instant creationDate;
  private String  currency;
  private Boolean defaultAccount;
  private Instant deletionDate;
  private Money   hold;
  private Long    id;
  private Instant lastUpdateDate;
  private String  name;
  private Boolean ready;
  private String  type;
  private String  uuid;

  /**
   * @return the active
   */
  public Boolean getActive()
  {
    return active;
  }


  /**
   * @return the availableBalance
   */

  public Money getAvailableBalance()
  {
    return availableBalance;
  }


  /**
   * @return the creationDate
   */

  public Instant getCreationDate()
  {
    return creationDate;
  }


  /**
   * @return the currency
   */

  public String getCurrency()
  {
    return currency;
  }


  /**
   * @return the defaultAccount
   */

  public Boolean getDefaultAccount()
  {
    return defaultAccount;
  }


  /**
   * @return the deletionDate
   */

  public Instant getDeletionDate()
  {
    return deletionDate;
  }


  /**
   * @return the hold
   */

  public Money getHold()
  {
    return hold;
  }


  /**
   * @return the id
   */

  public Long getId()
  {
    return id;
  }


  /**
   * @return the lastUpdateDate
   */

  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  /**
   * @return the name
   */

  public String getName()
  {
    return name;
  }


  /**
   * @return the ready
   */

  public Boolean getReady()
  {
    return ready;
  }


  /**
   * @return the type
   */

  public String getType()
  {
    return type;
  }


  /**
   * @return the uuid
   */

  public String getUuid()
  {
    return uuid;
  }


  /**
   * @param active the active to set
   */

  public void setActive(
    Boolean active)
  {
    this.active = active;
  }


  /**
   * @param availableBalance the availableBalance to set
   */

  public void setAvailableBalance(
    Money availableBalance)
  {
    this.availableBalance = availableBalance;
  }


  /**
   * @param creationDate the creationDate to set
   */

  public void setCreationDate(
    Instant creationDate)
  {
    this.creationDate = creationDate;
  }


  /**
   * @param currency the currency to set
   */

  public void setCurrency(
    String currency)
  {
    this.currency = currency;
  }


  /**
   * @param defaultAccount the defaultAccount to set
   */

  public void setDefaultAccount(
    Boolean defaultAccount)
  {
    this.defaultAccount = defaultAccount;
  }


  /**
   * @param deletionDate the deletionDate to set
   */

  public void setDeletionDate(
    Instant deletionDate)
  {
    this.deletionDate = deletionDate;
  }


  /**
   * @param hold the hold to set
   */

  public void setHold(
    Money hold)
  {
    this.hold = hold;
  }


  /**
   * @param id the id to set
   */

  public void setId(
    Long id)
  {
    this.id = id;
  }


  /**
   * @param lastUpdateDate the lastUpdateDate to set
   */

  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  /**
   * @param name the name to set
   */

  public void setName(
    String name)
  {
    this.name = name;
  }


  /**
   * @param ready the ready to set
   */

  public void setReady(
    Boolean ready)
  {
    this.ready = ready;
  }


  /**
   * @param type the type to set
   */

  public void setType(
    String type)
  {
    this.type = type;
  }


  /**
   * @param uuid the uuid to set
   */

  public void setUuid(
    String uuid)
  {
    this.uuid = uuid;
  }
}