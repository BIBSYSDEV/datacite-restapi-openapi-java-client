# ProvidersApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**providersGet**](ProvidersApi.md#providersGet) | **GET** /providers | A JSON array of providers.
[**providersIdDelete**](ProvidersApi.md#providersIdDelete) | **DELETE** /providers/{id} | Delete a provider.
[**providersIdGet**](ProvidersApi.md#providersIdGet) | **GET** /providers/{id} | A provider.
[**providersIdPut**](ProvidersApi.md#providersIdPut) | **PUT** /providers/{id} | Update a provider.
[**providersPost**](ProvidersApi.md#providersPost) | **POST** /providers | Add a new provider.
[**providersTotalsGet**](ProvidersApi.md#providersTotalsGet) | **GET** /providers/totals | Returns Providers DOI production statistics.



## providersGet

> Provider providersGet(query, year, region, organizationType, focusArea, pageNumber, pageSize, sort)

A JSON array of providers.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        String query = "query_example"; // String | 
        BigDecimal year = new BigDecimal(); // BigDecimal | 
        String region = "region_example"; // String | 
        String organizationType = "organizationType_example"; // String | 
        String focusArea = "focusArea_example"; // String | 
        BigDecimal pageNumber = new BigDecimal(); // BigDecimal | 
        BigDecimal pageSize = new BigDecimal(); // BigDecimal | 
        String sort = "sort_example"; // String | 
        try {
            Provider result = apiInstance.providersGet(query, year, region, organizationType, focusArea, pageNumber, pageSize, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#providersGet");
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
 **year** | **BigDecimal**|  | [optional]
 **region** | **String**|  | [optional] [enum: amer, apac, emea]
 **organizationType** | **String**|  | [optional] [enum: academicInstitution, academicLibrary, governmentAgency, nationalInstitution, nationalLibrary, publisher, professionalSociety, researchInstitution, serviceProvider, vendor]
 **focusArea** | **String**|  | [optional] [enum: amer, apac, emea]
 **pageNumber** | **BigDecimal**|  | [optional]
 **pageSize** | **BigDecimal**|  | [optional]
 **sort** | **String**|  | [optional] [enum: relevance, name, -name, created, -created]

### Return type

[**Provider**](Provider.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of prefixes. |  -  |


## providersIdDelete

> providersIdDelete(id)

Delete a provider.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ProvidersApi;

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

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        String id = "id_example"; // String | DOI
        try {
            apiInstance.providersIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#providersIdDelete");
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


## providersIdGet

> Provider providersIdGet(id)

A provider.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ProvidersApi;

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

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        String id = "id_example"; // String | DOI
        try {
            Provider result = apiInstance.providersIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#providersIdGet");
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

[**Provider**](Provider.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object. |  -  |


## providersIdPut

> providersIdPut(id, provider)

Update a provider.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ProvidersApi;

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

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        String id = "id_example"; // String | DOI
        Provider provider = new Provider(); // Provider | 
        try {
            apiInstance.providersIdPut(id, provider);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#providersIdPut");
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
 **provider** | [**Provider**](Provider.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/vnd.api+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## providersPost

> providersPost(provider)

Add a new provider.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ProvidersApi;

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

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        Provider provider = new Provider(); // Provider | 
        try {
            apiInstance.providersPost(provider);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#providersPost");
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
 **provider** | [**Provider**](Provider.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/vnd.api+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## providersTotalsGet

> providersTotalsGet(state)

Returns Providers DOI production statistics.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        String state = "state_example"; // String | 
        try {
            apiInstance.providersTotalsGet(state);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#providersTotalsGet");
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
| **200** | A JSON array of providers stats. |  -  |

