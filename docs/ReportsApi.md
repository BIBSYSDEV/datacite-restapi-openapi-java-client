# ReportsApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsGet**](ReportsApi.md#reportsGet) | **GET** /reports | A JSON array of reports.
[**reportsIdDelete**](ReportsApi.md#reportsIdDelete) | **DELETE** /reports/{id} | Delete a report.
[**reportsIdGet**](ReportsApi.md#reportsIdGet) | **GET** /reports/{id} | A report.
[**reportsIdPut**](ReportsApi.md#reportsIdPut) | **PUT** /reports/{id} | Update a report.
[**reportsPost**](ReportsApi.md#reportsPost) | **POST** /reports | Add a new report.



## reportsGet

> Report reportsGet(platform, reportName, reportId, release, created, createdBy, pageNumber, pageSize)

A JSON array of reports.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String platform = "platform_example"; // String | Name of the Platform the usage is being requested for. This can be omitted if the service provides usage for only one platform.
        String reportName = "reportName_example"; // String | The long name of the report.
        String reportId = "reportId_example"; // String | The report ID or code or shortname. Typically this will be the same code provided in the Report parameter of the request.
        String release = "release_example"; // String | The release or version of the report.
        String created = "created_example"; // String | Time the report was prepared. Format as defined by date-time - RFC3339
        String createdBy = "createdBy_example"; // String | Name of the organization producing the report.
        BigDecimal pageNumber = new BigDecimal(); // BigDecimal | 
        BigDecimal pageSize = new BigDecimal(); // BigDecimal | 
        try {
            Report result = apiInstance.reportsGet(platform, reportName, reportId, release, created, createdBy, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsGet");
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
 **platform** | **String**| Name of the Platform the usage is being requested for. This can be omitted if the service provides usage for only one platform. | [optional]
 **reportName** | **String**| The long name of the report. | [optional]
 **reportId** | **String**| The report ID or code or shortname. Typically this will be the same code provided in the Report parameter of the request. | [optional]
 **release** | **String**| The release or version of the report. | [optional]
 **created** | **String**| Time the report was prepared. Format as defined by date-time - RFC3339 | [optional]
 **createdBy** | **String**| Name of the organization producing the report. | [optional]
 **pageNumber** | **BigDecimal**|  | [optional]
 **pageSize** | **BigDecimal**|  | [optional]

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of reports. |  -  |


## reportsIdDelete

> reportsIdDelete(id)

Delete a report.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ReportsApi;

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

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | Report
        try {
            apiInstance.reportsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsIdDelete");
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
 **id** | **String**| Report |

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


## reportsIdGet

> Report reportsIdGet(id)

A report.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ReportsApi;

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

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | Report
        try {
            Report result = apiInstance.reportsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsIdGet");
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
 **id** | **String**| Report |

### Return type

[**Report**](Report.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object. |  -  |


## reportsIdPut

> reportsIdPut(id, report)

Update a report.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ReportsApi;

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

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | Report
        Report report = new Report(); // Report | 
        try {
            apiInstance.reportsIdPut(id, report);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsIdPut");
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
 **id** | **String**| Report |
 **report** | [**Report**](Report.md)|  |

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


## reportsPost

> reportsPost(report)

Add a new report.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.ReportsApi;

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

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        Report report = new Report(); // Report | 
        try {
            apiInstance.reportsPost(report);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#reportsPost");
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
 **report** | [**Report**](Report.md)|  |

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

