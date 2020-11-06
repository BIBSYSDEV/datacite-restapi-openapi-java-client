# ClientPrefixesApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientPrefixesGet**](ClientPrefixesApi.md#clientPrefixesGet) | **GET** /client-prefixes | Returns a list of client-prefixes.



## clientPrefixesGet

> ClientPrefix clientPrefixesGet(query, year, clientId, prefixId, page, sort)

Returns a list of client-prefixes.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ClientPrefixesApi;

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

        ClientPrefixesApi apiInstance = new ClientPrefixesApi(defaultClient);
        String query = "query_example"; // String | 
        BigDecimal year = new BigDecimal(); // BigDecimal | 
        String clientId = "clientId_example"; // String | 
        String prefixId = "prefixId_example"; // String | 
        BigDecimal page = new BigDecimal(); // BigDecimal | 
        String sort = "sort_example"; // String | 
        try {
            ClientPrefix result = apiInstance.clientPrefixesGet(query, year, clientId, prefixId, page, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientPrefixesApi#clientPrefixesGet");
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
 **clientId** | **String**|  | [optional]
 **prefixId** | **String**|  | [optional]
 **page** | **BigDecimal**|  | [optional]
 **sort** | **String**|  | [optional] [enum: name, -name, created, -created]

### Return type

[**ClientPrefix**](ClientPrefix.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of client-prefixes. |  -  |

