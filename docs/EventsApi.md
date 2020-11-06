# EventsApi

All URIs are relative to *https://api.test.datacite.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsGet**](EventsApi.md#eventsGet) | **GET** /events | Returns a list of events.
[**eventsIdDelete**](EventsApi.md#eventsIdDelete) | **DELETE** /events/{id} | Delete an event.
[**eventsIdGet**](EventsApi.md#eventsIdGet) | **GET** /events/{id} | Returns an event.
[**eventsIdPut**](EventsApi.md#eventsIdPut) | **PUT** /events/{id} | Update an event.
[**eventsPost**](EventsApi.md#eventsPost) | **POST** /events | Add a new event.



## eventsGet

> Event eventsGet(query, subjId, objId, doi, orcid, prefix, subtype, citationType, sourceId, registrantId, relationTypeId, issn, publicationYear, yearMonth, pageNumber, pageSize, pageCursor, include, sort)

Returns a list of events.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String query = "query_example"; // String | 
        String subjId = "subjId_example"; // String | 
        String objId = "objId_example"; // String | 
        String doi = "doi_example"; // String | 
        String orcid = "orcid_example"; // String | 
        String prefix = "prefix_example"; // String | 
        String subtype = "subtype_example"; // String | 
        String citationType = "citationType_example"; // String | 
        String sourceId = "sourceId_example"; // String | 
        String registrantId = "registrantId_example"; // String | 
        String relationTypeId = "relationTypeId_example"; // String | 
        String issn = "issn_example"; // String | 
        String publicationYear = "publicationYear_example"; // String | 
        String yearMonth = "yearMonth_example"; // String | 
        BigDecimal pageNumber = new BigDecimal(); // BigDecimal | 
        BigDecimal pageSize = new BigDecimal(); // BigDecimal | 
        BigDecimal pageCursor = new BigDecimal(); // BigDecimal | 
        String include = "include_example"; // String | 
        String sort = "sort_example"; // String | 
        try {
            Event result = apiInstance.eventsGet(query, subjId, objId, doi, orcid, prefix, subtype, citationType, sourceId, registrantId, relationTypeId, issn, publicationYear, yearMonth, pageNumber, pageSize, pageCursor, include, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#eventsGet");
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
 **subjId** | **String**|  | [optional]
 **objId** | **String**|  | [optional]
 **doi** | **String**|  | [optional]
 **orcid** | **String**|  | [optional]
 **prefix** | **String**|  | [optional]
 **subtype** | **String**|  | [optional]
 **citationType** | **String**|  | [optional]
 **sourceId** | **String**|  | [optional]
 **registrantId** | **String**|  | [optional]
 **relationTypeId** | **String**|  | [optional]
 **issn** | **String**|  | [optional]
 **publicationYear** | **String**|  | [optional]
 **yearMonth** | **String**|  | [optional]
 **pageNumber** | **BigDecimal**|  | [optional]
 **pageSize** | **BigDecimal**|  | [optional]
 **pageCursor** | **BigDecimal**|  | [optional]
 **include** | **String**|  | [optional] [enum: subj, obj]
 **sort** | **String**|  | [optional] [enum: relevance, name, -name, created, -created]

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of events. |  -  |


## eventsIdDelete

> eventsIdDelete(id)

Delete an event.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        String id = "id_example"; // String | Event
        try {
            apiInstance.eventsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#eventsIdDelete");
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
 **id** | **String**| Event |

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


## eventsIdGet

> Event eventsIdGet(id)

Returns an event.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.datacite.org");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String id = "id_example"; // String | Event
        try {
            Event result = apiInstance.eventsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#eventsIdGet");
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
 **id** | **String**| Event |

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.datacite.datacite+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON array of events. |  -  |


## eventsIdPut

> eventsIdPut(id, event)

Update an event.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        String id = "id_example"; // String | Event
        Event event = new Event(); // Event | 
        try {
            apiInstance.eventsIdPut(id, event);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#eventsIdPut");
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
 **id** | **String**| Event |
 **event** | [**Event**](Event.md)|  |

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


## eventsPost

> eventsPost(event)

Add a new event.

### Example

```java
// Import classes:
import no.unit.nva.doi.datacite.client.invoker.ApiClient;
import no.unit.nva.doi.datacite.client.invoker.ApiException;
import no.unit.nva.doi.datacite.client.invoker.Configuration;
import no.unit.nva.doi.datacite.client.invoker.auth.*;
import no.unit.nva.doi.datacite.client.invoker.models.*;
import no.unit.nva.doi.datacite.client.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        Event event = new Event(); // Event | 
        try {
            apiInstance.eventsPost(event);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#eventsPost");
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
 **event** | [**Event**](Event.md)|  |

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

