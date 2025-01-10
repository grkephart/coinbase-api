/**
 * 
 */
package org.drdeesw.coinbase.api.converters;


import java.io.IOException;

import org.drdeesw.coinbase.api.models.auth.AuthTokenRequest;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;


/**
 * 
 */
public class AuthTokenRequestDeserializer extends JsonDeserializer<AuthTokenRequest>
{

  @Override
  public AuthTokenRequest deserialize(
    JsonParser parser,
    DeserializationContext context) throws IOException, JacksonException
  {
    JsonNode node = parser.getCodec().readTree(parser);
    String clientId = deserialize(node, "client_id");
    String clientSecret = deserialize(node, "client_secret");
    String code = deserialize(node, "code");
    String grantType = deserialize(node, "grant_type");
    String redirectUri = deserialize(node, "redirect_uri");
    String responseType = deserialize(node, "response_type");
    String scope = deserialize(node, "scope");
    String state = deserialize(node, "state");

    return new AuthTokenRequest(clientId, clientSecret, code, grantType, redirectUri, responseType,
        scope, state);
  }


  /**
   * @param node
   * @return
   */
  private String deserialize(
    JsonNode node,
    String name)
  {
    JsonNode elementNode = node.get(name);

    return elementNode == null || elementNode instanceof NullNode ? null : elementNode.asText();
  }

}
