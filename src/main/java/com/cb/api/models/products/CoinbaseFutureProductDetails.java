package com.cb.api.models.products;


import java.io.Serializable;
import java.time.Instant;


public interface CoinbaseFutureProductDetails extends Serializable
{

  /**
   * @return the contractCode
   */

  String getContractCode();


  /**
   * @return the contractDisplayName
   */

  String getContractDisplayName();


  /**
   * @return the contractExpiry
   */

  Instant getContractExpiry();


  /**
   * @return the contractExpiryTimezone
   */

  String getContractExpiryTimezone();


  /**
   * @return the contractExpiryType
   */

  String getContractExpiryType();


  /**
   * @return the contractRootUnit
   */

  String getContractRootUnit();


  /**
   * @return the contractSize
   */

  String getContractSize();


  /**
   * @return the groupDescription
   */

  String getGroupDescription();


  /**
   * @return the group_short_description
   */

  String getGroupShortDescription();


  /**
   * @return the perpetualDetails
   */

  CoinbasePerpetualDetails getPerpetualDetails();


  /**
   * @return the riskManagedBy
   */

  String getRiskManagedBy();


  /**
   * @return the venue
   */

  String getVenue();


  /**
   * @param contractCode the contractCode to set
   */

  void setContractCode(
    String contractCode);


  /**
   * @param contractDisplayName the contractDisplayName to set
   */

  void setContractDisplayName(
    String contractDisplayName);


  /**
   * @param contractExpiry the contractExpiry to set
   */

  void setContractExpiry(
    Instant contractExpiry);


  /**
   * @param contractExpiryTimezone the contractExpiryTimezone to set
   */

  void setContractExpiryTimezone(
    String contractExpiryTimezone);


  /**
   * @param contractExpiryType the contractExpiryType to set
   */

  void setContractExpiryType(
    String contractExpiryType);


  /**
   * @param contractRootUnit the contractRootUnit to set
   */

  void setContractRootUnit(
    String contractRootUnit);


  /**
   * @param contractSize the contractSize to set
   */

  void setContractSize(
    String contractSize);


  /**
   * @param group_short_description the group_short_description to set
   */

  void setGroupShortDescription(
    String group_short_description);


  /**
   * @param groupDescription the groupDescription to set
   */

  void setGroupDescription(
    String groupDescription);


  /**
   * @param perpetualDetails the perpetualDetails to set
   */

  void setPerpetualDetails(
    CoinbasePerpetualDetails perpetualDetails);


  /**
   * @param riskManagedBy the riskManagedBy to set
   */

  void setRiskManagedBy(
    String riskManagedBy);


  /**
   * @param venue the venue to set
   */

  void setVenue(
    String venue);

}