/*
 * REST API
 * The REST API is used for all API interactions with DataCite services.
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: support@datacite.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package no.unit.nva.doi.datacite.client.api;

import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Pair;

import no.unit.nva.doi.datacite.client.model.Activity;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;


public class ActivitiesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public ActivitiesApi() {
    this(new ApiClient());
  }

  public ActivitiesApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Get a JSON API result of activities.
   * 
   * @param id Find activity by an id (optional)
   * @param ids Find activities by array of activity ids (optional
   * @param query Search the index by keyword or query string syntax. (optional)
   * @param pageNumber Pagination - page number (optional)
   * @param pageSize Pagination - page size (optional)
   * @param pageCursor Pagination - page cursor (used instead of page[number]) (optional)
   * @return Activity
   * @throws ApiException if fails to make API call
   */
  public Activity activitiesGet(String id, List<String> ids, String query, BigDecimal pageNumber, BigDecimal pageSize, BigDecimal pageCursor) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activities";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("id", id));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "ids", ids));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("query", query));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page[number]", pageNumber));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page[size]", pageSize));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page[cursor]", pageCursor));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "activitiesGet call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Activity>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get a JSON API result of a specific activity
   * 
   * @param id Activity ID (required)
   * @return Activity
   * @throws ApiException if fails to make API call
   */
  public Activity activitiesIdGet(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling activitiesIdGet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activities/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "activitiesIdGet call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Activity>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Returns activity for a specific DOI
   * 
   * @param id DOI (required)
   * @return Activity
   * @throws ApiException if fails to make API call
   */
  public Activity doisIdActivitiesGet(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling doisIdActivitiesGet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dois/{id}/activities"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "doisIdActivitiesGet call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Activity>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}