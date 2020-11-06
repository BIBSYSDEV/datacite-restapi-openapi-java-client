# ClientsApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsGet**](ClientsApi.md#clientsGet) | **GET** /clients | Returns a list of clients.
[**clientsIdDelete**](ClientsApi.md#clientsIdDelete) | **DELETE** /clients/{id} | Delete a client.
[**clientsIdGet**](ClientsApi.md#clientsIdGet) | **GET** /clients/{id} | Returns a client.
[**clientsIdPut**](ClientsApi.md#clientsIdPut) | **PUT** /clients/{id} | Update a client.
[**clientsPost**](ClientsApi.md#clientsPost) | **POST** /clients | Add a new client.
[**clientsTotalsGet**](ClientsApi.md#clientsTotalsGet) | **GET** /clients/totals | Returns Clients DOI production statistics.



## clientsGet

> Client clientsGet(query, year, providerId, software, pageNumber, pageSize, include, sort)

Returns a list of clients.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String query = "query_example"; // String | 
        BigDecimal year = new BigDecimal(); // BigDecimal | 
        String providerId = "providerId_example"; // String | 
        String software = "software_example"; // String | 
        BigDecimal pageNumber = new BigDecimal(); // BigDecimal | 
        BigDecimal pageSize = new BigDecimal(); // BigDecimal | 
        String include = "include_example"; // String | 
        String sort = "sort_example"; // String | 
        try {
            Client result = apiInstance.clientsGet(query, year, providerId, software, pageNumber, pageSize, include, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#clientsGet");
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
 **providerId** | **String**|  | [optional]
 **software** | **String**|  | [optional] [enum: ckan, dataverse, dspace, eprints, escidoc, fedora, hal, invenio, islandora, mysql, nesstar, opus]
 **pageNumber** | **BigDecimal**|  | [optional]
 **pageSize** | **BigDecimal**|  | [optional]
 **include** | **String**|  | [optional] [enum: provider, repository]
 **sort** | **String**|  | [optional] [enum: relevance, name, -name, created, -created]

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of clients. |  -  |


## clientsIdDelete

> clientsIdDelete(id)

Delete a client.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String id = "id_example"; // String | Client ID
        try {
            apiInstance.clientsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#clientsIdDelete");
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
 **id** | **String**| Client ID |

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


## clientsIdGet

> Client clientsIdGet(id)

Returns a client.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String id = "id_example"; // String | Client ID
        try {
            Client result = apiInstance.clientsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#clientsIdGet");
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
 **id** | **String**| Client ID |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object. |  -  |


## clientsIdPut

> clientsIdPut(id, client)

Update a client.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String id = "id_example"; // String | Client ID
        Client client = new Client(); // Client | 
        try {
            apiInstance.clientsIdPut(id, client);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#clientsIdPut");
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
 **id** | **String**| Client ID |
 **client** | [**Client**](Client.md)|  |

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


## clientsPost

> clientsPost(client)

Add a new client.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        Client client = new Client(); // Client | 
        try {
            apiInstance.clientsPost(client);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#clientsPost");
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
 **client** | [**Client**](Client.md)|  |

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


## clientsTotalsGet

> clientsTotalsGet(providerId, state)

Returns Clients DOI production statistics.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String providerId = "providerId_example"; // String | 
        String state = "state_example"; // String | 
        try {
            apiInstance.clientsTotalsGet(providerId, state);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#clientsTotalsGet");
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
 **providerId** | **String**|  | [optional]
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
| **200** | A JSON array of clients stats. |  -  |

