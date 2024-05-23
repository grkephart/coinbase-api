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


  /**
   * Step 1. Redirect users to request Coinbase access
   * <p>
   * Example:
   * </p>
   * <pre><code>
   * GET https://login.coinbase.com/oauth2/auth?response_type=code&client_id=YOUR_CLIENT_ID&redirect_uri=YOUR_REDIRECT_URL&state=SECURE_RANDOM&scope=wallet:accounts:read
   * </code></pre>
   * 
   * <p>
   * RedirectUri can/should be "urn:ietf:wg:oauth:2.0:oob" when you're developing on your localhost.
   * </p>
   * Note that Step 2 is performed by Coinbase as a callback to your site.
   * 
   * @param responseType Required. Value "code"
   * @param clientId Required. The client ID you received after registering your application.
   * @param redirectUri Optional. The URL in your app where users will be sent after authorization (see below). This value needs to be URL encoded. If left out, your application's first redirect URI will be used by default.
   * @param state Optional. An unguessable random string to protect against cross-site request forgery attacks. Must be at least 8 characters long. 
   * @param scope Optional. Comma separated list of permissions (scopes) your application requests access to. Required scopes are listed under endpoints in the Full Scopes List.
   * @return sometimes an HTML page. There's no specific documentation on this.
   * @see <a href="https://docs.cdp.coinbase.com/sign-in-with-coinbase/docs/sign-in-with-coinbase-integration/">Sign in with Coinbase OAuth2 Integration</a>
   * @see <a href="https://docs.cdp.coinbase.com/sign-in-with-coinbase/docs/sign-in-with-coinbase-mobile.html">OAuth2 Settings for Mobile Applications</a>
   */
  public String requestAccess(
    String responseType,
    String clientId,
    String redirectUri,
    String state,
    String scope);
}
