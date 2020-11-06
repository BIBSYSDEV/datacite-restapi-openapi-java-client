# PrefixesApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**prefixesGet**](PrefixesApi.md#prefixesGet) | **GET** /prefixes | Returns a list of prefixes.
[**prefixesIdGet**](PrefixesApi.md#prefixesIdGet) | **GET** /prefixes/{id} | A prefix.
[**prefixesTotalsGet**](PrefixesApi.md#prefixesTotalsGet) | **GET** /prefixes/totals | Returns prefixes DOI production statistics.



## prefixesGet

> Prefix prefixesGet()

Returns a list of prefixes.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.PrefixesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        PrefixesApi apiInstance = new PrefixesApi(defaultClient);
        try {
            Prefix result = apiInstance.prefixesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrefixesApi#prefixesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Prefix**](Prefix.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of prefixes. |  -  |


## prefixesIdGet

> Prefix prefixesIdGet(id)

A prefix.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.PrefixesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        PrefixesApi apiInstance = new PrefixesApi(defaultClient);
        String id = "id_example"; // String | DOI
        try {
            Prefix result = apiInstance.prefixesIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrefixesApi#prefixesIdGet");
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

[**Prefix**](Prefix.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a prefix. |  -  |


## prefixesTotalsGet

> prefixesTotalsGet(clientId, state)

Returns prefixes DOI production statistics.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.PrefixesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        PrefixesApi apiInstance = new PrefixesApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String state = "state_example"; // String | 
        try {
            apiInstance.prefixesTotalsGet(clientId, state);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrefixesApi#prefixesTotalsGet");
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
 **clientId** | **String**|  | [optional]
 **state** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of prefixes stats. |  -  |

