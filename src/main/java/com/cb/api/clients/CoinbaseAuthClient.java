package com.cb.api.clients;


public interface CoinbaseAuthClient
{
  public final static String BASE_URL = "https://login.coinbase.com";


  /**
   * @param responseType Required. Value "code"
   * @param clientId Required. The client ID you received after registering your application.
   * @param redirectUri Optional. The URL in your app where users will be sent after authorization (see below). This value needs to be URL encoded. If left out, your application's first redirect URI will be used by default.
   * @param state Optional. An unguessable random string to protect against cross-site request forgery attacks. Must be at least 8 characters long. 
   * @param scope Optional. Comma separated list of permissions (scopes) your application requests access to. Required scopes are listed under endpoints in the Full Scopes List.
   * @return
   */
  public String requestAccess(
    String responseType,
    String clientId,
    String redirectUri,
    String state,
    String scope);
}
