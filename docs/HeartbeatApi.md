# HeartbeatApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**heartbeatGet**](HeartbeatApi.md#heartbeatGet) | **GET** /heartbeat | This resource returns the current status of the REST API.



## heartbeatGet

> String heartbeatGet()

This resource returns the current status of the REST API.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.HeartbeatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        HeartbeatApi apiInstance = new HeartbeatApi(defaultClient);
        try {
            String result = apiInstance.heartbeatGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HeartbeatApi#heartbeatGet");
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

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | REST API is operating normally. |  -  |
| **500** | REST API is not working properly. |  -  |

