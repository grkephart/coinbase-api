/**
 * 
 */
package org.drdeesw.coinbase.api.service;

import org.drdeesw.coinbase.api.models.auth.AccessToken;

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
