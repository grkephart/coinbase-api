/**
 *
 */
package com.cb.api.models.products;


import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 *
 */
@SuppressWarnings("serial")
public class CoinbaseFutureProductDetailsImpl implements CoinbaseFutureProductDetails<CoinbasePerpetualDetailsImpl>
{

  /**
   *
   */
  @JsonProperty("contract_code")
  private String           contractCode;

  /**
   *
   */
  @JsonProperty("contract_display_name")
  private String           contractDisplayName;

  /**
   *
   */
  @JsonProperty("contract_expiry")
  private Instant          contractExpiry;

  /**
   *
   */
  @JsonProperty("contract_expiry_timezone")
  private String           contractExpiryTimezone;

  /**
   * Possible values: [UNKNOWN_CONTRACT_EXPIRY_TYPE, EXPIRING]
   */
  @JsonProperty("contract_expiry_type")
  private String           contractExpiryType;

  /**
   *
   */
  @JsonProperty("contract_root_unit")
  private String           contractRootUnit;

  /**
   *
   */
  @JsonProperty("contract_size")
  private String           contractSize;

  /**
   * Descriptive name for the product series, eg "Nano Bitcoin Futures".
   */
  @JsonProperty("group_description")
  private String           groupDescription;

  /**
   * Short version of the group_description, eg "Nano BTC".
   */
  @JsonProperty("group_short_description")
  private String           groupShortDescription;

  /**
  *
  */
  @JsonProperty("perpetual_details")
  private CoinbasePerpetualDetailsImpl perpetualDetails;

  /**
   * Possible values: [UNKNOWN_RISK_MANAGEMENT_TYPE, MANAGED_BY_FCM, MANAGED_BY_VENUE]
   */
  @JsonProperty("risk_managed_by")
  private String           riskManagedBy;

  /**
   *
   */
  @JsonProperty("venue")
  private String           venue;

  /**
   * 
   */
  public CoinbaseFutureProductDetailsImpl()
  {
    this.perpetualDetails = new CoinbasePerpetualDetailsImpl();
  }


  /**
   * @return the contractCode
   */

  @Override
  public String getContractCode()
  {
    return contractCode;
  }


  /**
   * @return the contractDisplayName
   */

  @Override
  public String getContractDisplayName()
  {
    return contractDisplayName;
  }


  /**
   * @return the contractExpiry
   */

  @Override
  public Instant getContractExpiry()
  {
    return contractExpiry;
  }


  /**
   * @return the contractExpiryTimezone
   */

  @Override
  public String getContractExpiryTimezone()
  {
    return contractExpiryTimezone;
  }


  /**
   * @return the contractExpiryType
   */

  @Override
  public String getContractExpiryType()
  {
    return contractExpiryType;
  }


  /**
   * @return the contractRootUnit
   */

  @Override
  public String getContractRootUnit()
  {
    return contractRootUnit;
  }


  /**
   * @return the contractSize
   */

  @Override
  public String getContractSize()
  {
    return contractSize;
  }


  /**
   * @return the groupDescription
   */

  @Override
  public String getGroupDescription()
  {
    return groupDescription;
  }


  /**
   * @return the group_short_description
   */

  @Override
  public String getGroupShortDescription()
  {
    return groupShortDescription;
  }


  /**
   * @return the perpetualDetails
   */

  @Override
  public CoinbasePerpetualDetailsImpl getPerpetualDetails()
  {
    return perpetualDetails;
  }


  /**
   * @return the riskManagedBy
   */

  @Override
  public String getRiskManagedBy()
  {
    return riskManagedBy;
  }


  /**
   * @return the venue
   */

  @Override
  public String getVenue()
  {
    return venue;
  }


  /**
   * @param contractCode the contractCode to set
   */

  @Override
  public void setContractCode(
    String contractCode)
  {
    this.contractCode = contractCode;
  }


  /**
   * @param contractDisplayName the contractDisplayName to set
   */

  @Override
  public void setContractDisplayName(
    String contractDisplayName)
  {
    this.contractDisplayName = contractDisplayName;
  }


  /**
   * @param contractExpiry the contractExpiry to set
   */

  @Override
  public void setContractExpiry(
    Instant contractExpiry)
  {
    this.contractExpiry = contractExpiry;
  }


  /**
   * @param contractExpiryTimezone the contractExpiryTimezone to set
   */

  @Override
  public void setContractExpiryTimezone(
    String contractExpiryTimezone)
  {
    this.contractExpiryTimezone = contractExpiryTimezone;
  }


  /**
   * @param contractExpiryType the contractExpiryType to set
   */

  @Override
  public void setContractExpiryType(
    String contractExpiryType)
  {
    this.contractExpiryType = contractExpiryType;
  }


  /**
   * @param contractRootUnit the contractRootUnit to set
   */

  @Override
  public void setContractRootUnit(
    String contractRootUnit)
  {
    this.contractRootUnit = contractRootUnit;
  }


  /**
   * @param contractSize the contractSize to set
   */

  @Override
  public void setContractSize(
    String contractSize)
  {
    this.contractSize = contractSize;
  }


  /**
   * @param group_short_description the group_short_description to set
   */

  @Override
  public void setGroupShortDescription(
    String group_short_description)
  {
    this.groupShortDescription = group_short_description;
  }


  /**
   * @param groupDescription the groupDescription to set
   */

  @Override
  public void setGroupDescription(
    String groupDescription)
  {
    this.groupDescription = groupDescription;
  }


  /**
   * @param perpetualDetails the perpetualDetails to set
   */

  @Override
  public void setPerpetualDetails(
    CoinbasePerpetualDetailsImpl perpetualDetails)
  {
    this.perpetualDetails = perpetualDetails;
  }


  /**
   * @param riskManagedBy the riskManagedBy to set
   */

  @Override
  public void setRiskManagedBy(
    String riskManagedBy)
  {
    this.riskManagedBy = riskManagedBy;
  }


  /**
   * @param venue the venue to set
   */

  @Override
  public void setVenue(
    String venue)
  {
    this.venue = venue;
  }

}
