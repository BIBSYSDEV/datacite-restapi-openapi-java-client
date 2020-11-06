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
import no.unit.nva.doi.datacite.client.model.Doi;

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


public class DoisApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public DoisApi() {
    this(new ApiClient());
  }

  public DoisApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Return a list of dois.
   * 
   * @param query  (optional)
   * @param created  (optional)
   * @param registered  (optional)
   * @param providerId  (optional)
   * @param clientId  (optional)
   * @param personId  (optional)
   * @param resourceTypeId  (optional)
   * @param subject  (optional)
   * @param schemaVersion  (optional)
   * @param random  (optional)
   * @param sampleSize  (optional)
   * @param sampleGroup  (optional)
   * @param pageNumber  (optional)
   * @param pageSize  (optional)
   * @param pageCursor  (optional)
   * @param include  (optional)
   * @param sort  (optional)
   * @return Doi
   * @throws ApiException if fails to make API call
   */
  public Doi doisGet(String query, BigDecimal created, BigDecimal registered, String providerId, String clientId, String personId, String resourceTypeId, String subject, String schemaVersion, Boolean random, BigDecimal sampleSize, String sampleGroup, BigDecimal pageNumber, BigDecimal pageSize, BigDecimal pageCursor, String include, String sort) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dois";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("query", query));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("created", created));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("registered", registered));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("provider-id", providerId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("client-id", clientId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("person-id", personId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("resource-type-id", resourceTypeId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("subject", subject));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("schema-version", schemaVersion));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("random", random));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sample-size", sampleSize));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sample-group", sampleGroup));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page[number]", pageNumber));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page[size]", pageSize));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page[cursor]", pageCursor));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("include", include));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sort", sort));

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
            "doisGet call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Doi>() {});
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
  /**
   * Delete a doi.
   * 
   * @param id DOI (required)
   * @throws ApiException if fails to make API call
   */
  public void doisIdDelete(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling doisIdDelete");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dois/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
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
            "doisIdDelete call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Returns a doi.
   * 
   * @param id DOI (required)
   * @return Doi
   * @throws ApiException if fails to make API call
   */
  public Doi doisIdGet(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling doisIdGet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dois/{id}"
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
            "doisIdGet call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Doi>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Update a doi.
   * 
   * @param id DOI (required)
   * @param doi  (required)
   * @throws ApiException if fails to make API call
   */
  public void doisIdPut(String id, Doi doi) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling doisIdPut");
    }
    // verify the required parameter 'doi' is set
    if (doi == null) {
      throw new ApiException(400, "Missing the required parameter 'doi' when calling doisIdPut");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dois/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(doi);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
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
            "doisIdPut call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Add a new doi.
   * 
   * @param doi  (required)
   * @throws ApiException if fails to make API call
   */
  public void doisPost(Doi doi) throws ApiException {
    // verify the required parameter 'doi' is set
    if (doi == null) {
      throw new ApiException(400, "Missing the required parameter 'doi' when calling doisPost");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dois";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(doi);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
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
            "doisPost call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}