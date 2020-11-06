# ActivitiesApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activitiesGet**](ActivitiesApi.md#activitiesGet) | **GET** /activities | Get a JSON API result of activities.
[**activitiesIdGet**](ActivitiesApi.md#activitiesIdGet) | **GET** /activities/{id} | Get a JSON API result of a specific activity
[**doisIdActivitiesGet**](ActivitiesApi.md#doisIdActivitiesGet) | **GET** /dois/{id}/activities | Returns activity for a specific DOI



## activitiesGet

> Activity activitiesGet(id, ids, query, pageNumber, pageSize, pageCursor)

Get a JSON API result of activities.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        String id = "id_example"; // String | Find activity by an id
        List<String> ids = Arrays.asList(); // List<String> | Find activities by array of activity ids
        String query = "query_example"; // String | Search the index by keyword or query string syntax.
        BigDecimal pageNumber = new BigDecimal(); // BigDecimal | Pagination - page number
        BigDecimal pageSize = new BigDecimal(); // BigDecimal | Pagination - page size
        BigDecimal pageCursor = new BigDecimal(); // BigDecimal | Pagination - page cursor (used instead of page[number])
        try {
            Activity result = apiInstance.activitiesGet(id, ids, query, pageNumber, pageSize, pageCursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#activitiesGet");
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
 **id** | **String**| Find activity by an id | [optional]
 **ids** | [**List&lt;String&gt;**](String.md)| Find activities by array of activity ids | [optional]
 **query** | **String**| Search the index by keyword or query string syntax. | [optional]
 **pageNumber** | **BigDecimal**| Pagination - page number | [optional]
 **pageSize** | **BigDecimal**| Pagination - page size | [optional]
 **pageCursor** | **BigDecimal**| Pagination - page cursor (used instead of page[number]) | [optional]

### Return type

[**Activity**](Activity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON API result of activities. |  -  |


## activitiesIdGet

> Activity activitiesIdGet(id)

Get a JSON API result of a specific activity

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ActivitiesApi;

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

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        String id = "id_example"; // String | Activity ID
        try {
            Activity result = apiInstance.activitiesIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#activitiesIdGet");
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
 **id** | **String**| Activity ID |

### Return type

[**Activity**](Activity.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object. |  -  |


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
import no.unit.nva.doi.datacite.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        String id = "id_example"; // String | DOI
        try {
            Activity result = apiInstance.doisIdActivitiesGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#doisIdActivitiesGet");
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
- **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object. |  -  |

