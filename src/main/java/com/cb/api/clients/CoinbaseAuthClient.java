package com.cb.api.clients;


import com.cb.api.dto.auth.AccessToken;


public interface CoinbaseAuthClient
{
  public final static String BASE_URL = "https://login.coinbase.com";

  /**
   * 3. Exchange code for an access token
   * <p>
   * Note that Step 2 was performed by Coinbase as a callback to your site.
   * </p>
   * After you have received the temporary code in Step 2, you can exchange it for valid access and refresh tokens. This can be done by making a POST call:
   * <pre><code>
   * POST https://login.coinbase.com/oauth2/token?grant_type=authorization_code&code=TEMP_CODE&client_id=YOUR_CLIENT_ID&client_secret=YOUR_CLIENT_SECRET&redirect_uri=YOUR_REDIRECT_URL'
   * </code></pre>
   * 
   * 
   * @param grantType Required. Value "authorization_code"
   * @param code Required. Value from step 2
   * @param clientId Required. The client ID you received after registering your application.
   * @param clientSecret Required. The client secret you received after registering your application.
   * @param redirectUrl Required. Your application's redirect URI
   * @return a valid access token 
   */
  public AccessToken getToken(
    String grantType,
    String code,
    String clientId,
    String clientSecret,
    String redirectUrl);

}
