/**
 * 
 */
package org.drdeesw.coinbase.api.converters;

import java.io.IOException;

import org.drdeesw.coinbase.api.models.auth.AccessToken;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 */
public class AccessTokenDeserializer extends JsonDeserializer<AccessToken>
{

  @Override
  public AccessToken deserialize(
    JsonParser parser,
    DeserializationContext context) throws IOException, JacksonException
  {
    JsonNode node = parser.getCodec().readTree(parser);
    String accessToken = node.get("access_token").asText();
    String tokenType = node.get("token_type").asText();
    int expiresIn = node.get("expires_in").asInt();
    String refreshToken = node.get("refresh_token").asText();

    return new AccessToken(accessToken, tokenType, expiresIn, refreshToken);
  }

}
