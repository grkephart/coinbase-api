/**
 * 
 */
package com.cb.api.dto;


/**
 * 
 */
public enum Granularity {
  UNKNOWN_GRANULARITY("UNKNOWN_GRANULARITY"), //
  ONE_MINUTE("ONE_MINUTE"), //
  FIVE_MINUTE("FIVE_MINUTE"), //
  FIFTEEN_MINUTE("FIFTEEN_MINUTE"), //
  THIRTY_MINUTE("THIRTY_MINUTE"), //
  ONE_HOUR("ONE_HOUR"), //
  TWO_HOUR("TWO_HOUR"), //
  SIX_HOUR("SIX_HOUR"), //
  ONE_DAY("ONE_DAY");//

  private String text;

  Granularity(String text)
  {
    this.text = text;
  }


  @Override
  public String toString()
  {
    return this.text;
  }

}
