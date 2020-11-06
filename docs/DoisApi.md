# DoisApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doisGet**](DoisApi.md#doisGet) | **GET** /dois | Return a list of dois.
[**doisIdActivitiesGet**](DoisApi.md#doisIdActivitiesGet) | **GET** /dois/{id}/activities | Returns activity for a specific DOI
[**doisIdDelete**](DoisApi.md#doisIdDelete) | **DELETE** /dois/{id} | Delete a doi.
[**doisIdGet**](DoisApi.md#doisIdGet) | **GET** /dois/{id} | Returns a doi.
[**doisIdPut**](DoisApi.md#doisIdPut) | **PUT** /dois/{id} | Update a doi.
[**doisPost**](DoisApi.md#doisPost) | **POST** /dois | Add a new doi.



## doisGet

> Doi doisGet(query, created, registered, providerId, clientId, personId, resourceTypeId, subject, schemaVersion, random, sampleSize, sampleGroup, pageNumber, pageSize, pageCursor, include, sort)

Return a list of dois.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.DoisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        DoisApi apiInstance = new DoisApi(defaultClient);
        String query = "query_example"; // String | 
        BigDecimal created = new BigDecimal(); // BigDecimal | 
        BigDecimal registered = new BigDecimal(); // BigDecimal | 
        String providerId = "providerId_example"; // String | 
        String clientId = "clientId_example"; // String | 
        String personId = "personId_example"; // String | 
        String resourceTypeId = "resourceTypeId_example"; // String | 
        String subject = "subject_example"; // String | 
        String schemaVersion = "schemaVersion_example"; // String | 
        Boolean random = true; // Boolean | 
        BigDecimal sampleSize = new BigDecimal(); // BigDecimal | 
        String sampleGroup = "sampleGroup_example"; // String | 
        BigDecimal pageNumber = new BigDecimal(); // BigDecimal | 
        BigDecimal pageSize = new BigDecimal(); // BigDecimal | 
        BigDecimal pageCursor = new BigDecimal(); // BigDecimal | 
        String include = "include_example"; // String | 
        String sort = "sort_example"; // String | 
        try {
            Doi result = apiInstance.doisGet(query, created, registered, providerId, clientId, personId, resourceTypeId, subject, schemaVersion, random, sampleSize, sampleGroup, pageNumber, pageSize, pageCursor, include, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DoisApi#doisGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  | [optional]
 **created** | **BigDecimal**|  | [optional]
 **registered** | **BigDecimal**|  | [optional]
 **providerId** | **String**|  | [optional]
 **clientId** | **String**|  | [optional]
 **personId** | **String**|  | [optional]
 **resourceTypeId** | **String**|  | [optional]
 **subject** | **String**|  | [optional]
 **schemaVersion** | **String**|  | [optional]
 **random** | **Boolean**|  | [optional]
 **sampleSize** | **BigDecimal**|  | [optional]
 **sampleGroup** | **String**|  | [optional] [enum: client, provider, resource-type]
 **pageNumber** | **BigDecimal**|  | [optional]
 **pageSize** | **BigDecimal**|  | [optional]
 **pageCursor** | **BigDecimal**|  | [optional]
 **include** | **String**|  | [optional] [enum: client, media]
 **sort** | **String**|  | [optional] [enum: relevance, name, -name, created, -created, updated, -updated]

### Return type

[**Doi**](Doi.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of dois. |  -  |


## doisIdActivitiesGet

> Activity doisIdActivitiesGet(id)

Returns activity for a specific DOI

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.DoisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        DoisApi apiInstance = new DoisApi(defaultClient);
        String id = "id_example"; // String | DOI
        try {
            Activity result = apiInstance.doisIdActivitiesGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DoisApi#doisIdActivitiesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| DOI |

### Return type

[**Activity**](Activity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object. |  -  |


## doisIdDelete

> doisIdDelete(id)

Delete a doi.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.DoisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DoisApi apiInstance = new DoisApi(defaultClient);
        String id = "id_example"; // String | DOI
        try {
            apiInstance.doisIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DoisApi#doisIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| DOI |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |


## doisIdGet

> Doi doisIdGet(id)

Returns a doi.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.DoisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        DoisApi apiInstance = new DoisApi(defaultClient);
        String id = "id_example"; // String | DOI
        try {
            Doi result = apiInstance.doisIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DoisApi#doisIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| DOI |

### Return type

[**Doi**](Doi.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object. |  -  |


## doisIdPut

> doisIdPut(id, doi)

Update a doi.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.DoisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DoisApi apiInstance = new DoisApi(defaultClient);
        String id = "id_example"; // String | DOI
        Doi doi = new Doi(); // Doi | 
        try {
            apiInstance.doisIdPut(id, doi);
        } catch (ApiException e) {
            System.err.println("Exception when calling DoisApi#doisIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| DOI |
 **doi** | [**Doi**](Doi.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/vnd.datacite.datacite+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## doisPost

> doisPost(doi)

Add a new doi.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.DoisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DoisApi apiInstance = new DoisApi(defaultClient);
        Doi doi = new Doi(); // Doi | 
        try {
            apiInstance.doisPost(doi);
        } catch (ApiException e) {
            System.err.println("Exception when calling DoisApi#doisPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doi** | [**Doi**](Doi.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/vnd.datacite.datacite+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

