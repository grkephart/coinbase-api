/**
 * 
 */
package com.cb.api.service;

import com.cb.api.dto.auth.AccessToken;

/**
 * This is for your app to get authorized by Coinbase. No users involved.
 * 
 */
public interface CoinbaseAuthService
{
  public AccessToken getAccessToken();

  /**
   * @return getAccessToken().getAccessToken()
   */
  public String getAuthorization();
}
