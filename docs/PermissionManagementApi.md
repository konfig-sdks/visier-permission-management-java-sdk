# PermissionManagementApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPermissions**](PermissionManagementApi.md#createPermissions) | **POST** /v1/admin/permissions | Create permissions |
| [**deletePermissions**](PermissionManagementApi.md#deletePermissions) | **DELETE** /v1/admin/permissions | Delete permissions |
| [**getCapabilities**](PermissionManagementApi.md#getCapabilities) | **GET** /v1/admin/capabilities | Retrieve a list of all permission capabilities |
| [**getCapability**](PermissionManagementApi.md#getCapability) | **GET** /v1/admin/capabilities/{capabilityId} | Retrieve a permission capability&#39;s details |
| [**getContentPackage**](PermissionManagementApi.md#getContentPackage) | **GET** /v1/admin/content-packages/{contentPackageId} | Retrieve a content package&#39;s details |
| [**getContentPackages**](PermissionManagementApi.md#getContentPackages) | **GET** /v1/admin/content-packages | Retrieve a list of all content packages |
| [**getDataSecurityObjects**](PermissionManagementApi.md#getDataSecurityObjects) | **GET** /v1/admin/data-security-objects | Retrieve a list of data security objects |
| [**getPermission**](PermissionManagementApi.md#getPermission) | **GET** /v1/admin/permissions/{permissionId} | Retrieve a permission&#39;s details |
| [**getPermissions**](PermissionManagementApi.md#getPermissions) | **GET** /v1/admin/permissions | Retrieve a list of all permissions |
| [**updatePermissions**](PermissionManagementApi.md#updatePermissions) | **PUT** /v1/admin/permissions | Update permissions |


<a name="createPermissions"></a>
# **createPermissions**
> PermissionBulkOperationResponseDTO createPermissions(permissionsListDTO).tenantCode(tenantCode).execute();

Create permissions

This API allows you to create new permissions. Administrating tenant users can specify the tenant in which to add these permissions.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    List<PermissionDTO> permissions = Arrays.asList(); // The list of permissions that will be created or updated
    String tenantCode = "tenantCode_example"; // Specify the tenant to create permissions in.
    try {
      PermissionBulkOperationResponseDTO result = client
              .permissionManagement
              .createPermissions()
              .permissions(permissions)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccesses());
      System.out.println(result.getFailures());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#createPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionBulkOperationResponseDTO> response = client
              .permissionManagement
              .createPermissions()
              .permissions(permissions)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#createPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **permissionsListDTO** | [**PermissionsListDTO**](PermissionsListDTO.md)|  | |
| **tenantCode** | **String**| Specify the tenant to create permissions in. | [optional] |

### Return type

[**PermissionBulkOperationResponseDTO**](PermissionBulkOperationResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="deletePermissions"></a>
# **deletePermissions**
> PermissionBulkOperationResponseDTO deletePermissions(body).tenantCode(tenantCode).execute();

Delete permissions

This API allows you to delete existing permissions.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to delete permissions from.
    try {
      PermissionBulkOperationResponseDTO result = client
              .permissionManagement
              .deletePermissions()
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccesses());
      System.out.println(result.getFailures());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#deletePermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionBulkOperationResponseDTO> response = client
              .permissionManagement
              .deletePermissions()
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#deletePermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**|  | |
| **tenantCode** | **String**| Specify the tenant to delete permissions from. | [optional] |

### Return type

[**PermissionBulkOperationResponseDTO**](PermissionBulkOperationResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getCapabilities"></a>
# **getCapabilities**
> GetCapabilitiesAPIResponseDTO getCapabilities().tenantCode(tenantCode).execute();

Retrieve a list of all permission capabilities

This API allows you to retrieve all the permission capabilities in your tenant.  You can use the returned capabilities in other API calls when creating or updating permissions to assign the capability to the permission.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve the capabilities from.
    try {
      GetCapabilitiesAPIResponseDTO result = client
              .permissionManagement
              .getCapabilities()
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getCapabilities());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getCapabilities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetCapabilitiesAPIResponseDTO> response = client
              .permissionManagement
              .getCapabilities()
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getCapabilities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| Specify the tenant to retrieve the capabilities from. | [optional] |

### Return type

[**GetCapabilitiesAPIResponseDTO**](GetCapabilitiesAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getCapability"></a>
# **getCapability**
> CapabilityDTO getCapability(capabilityId).tenantCode(tenantCode).execute();

Retrieve a permission capability&#39;s details

This API allows you to retrieve the details of a specific capability.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    String capabilityId = "capabilityId_example"; // The unique identifier of the capability you want to retrieve.
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve a capability from.
    try {
      CapabilityDTO result = client
              .permissionManagement
              .getCapability(capabilityId)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getDisplayName());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getCapability");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CapabilityDTO> response = client
              .permissionManagement
              .getCapability(capabilityId)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getCapability");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **capabilityId** | **String**| The unique identifier of the capability you want to retrieve. | |
| **tenantCode** | **String**| Specify the tenant to retrieve a capability from. | [optional] |

### Return type

[**CapabilityDTO**](CapabilityDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getContentPackage"></a>
# **getContentPackage**
> ContentPackageDTO getContentPackage(contentPackageId).tenantCode(tenantCode).execute();

Retrieve a content package&#39;s details

This API allows you to retrieve the details of a specific content package.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    String contentPackageId = "contentPackageId_example"; // The unique identifier of the content package you want to retrieve.
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve a content package from.
    try {
      ContentPackageDTO result = client
              .permissionManagement
              .getContentPackage(contentPackageId)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getContentPackageId());
      System.out.println(result.getDisplayName());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getContentPackage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContentPackageDTO> response = client
              .permissionManagement
              .getContentPackage(contentPackageId)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getContentPackage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentPackageId** | **String**| The unique identifier of the content package you want to retrieve. | |
| **tenantCode** | **String**| Specify the tenant to retrieve a content package from. | [optional] |

### Return type

[**ContentPackageDTO**](ContentPackageDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getContentPackages"></a>
# **getContentPackages**
> GetContentPackagesAPIResponseDTO getContentPackages().tenantCode(tenantCode).searchString(searchString).execute();

Retrieve a list of all content packages

This API allows you to retrieve the list of available content packages.  You can use the returned content packages in other API calls when creating or updating permissions to add the content package to the permission.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve the content packages from.
    String searchString = "searchString_example"; // Optional search string to return only content packages whose display name or description contains that search string.  If searchString is empty or not provided, the response returns a list of all content packages.
    try {
      GetContentPackagesAPIResponseDTO result = client
              .permissionManagement
              .getContentPackages()
              .tenantCode(tenantCode)
              .searchString(searchString)
              .execute();
      System.out.println(result);
      System.out.println(result.getContentPackages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getContentPackages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetContentPackagesAPIResponseDTO> response = client
              .permissionManagement
              .getContentPackages()
              .tenantCode(tenantCode)
              .searchString(searchString)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getContentPackages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| Specify the tenant to retrieve the content packages from. | [optional] |
| **searchString** | **String**| Optional search string to return only content packages whose display name or description contains that search string.  If searchString is empty or not provided, the response returns a list of all content packages. | [optional] |

### Return type

[**GetContentPackagesAPIResponseDTO**](GetContentPackagesAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getDataSecurityObjects"></a>
# **getDataSecurityObjects**
> GetDataSecurityObjectsAPIResponseDTO getDataSecurityObjects().id(id).includeDetails(includeDetails).tenantCode(tenantCode).execute();

Retrieve a list of data security objects

This API allows you to retrieve the list of available data security objects.  Data security objects are analytic objects and their related objects that are available to define  permissions’ data security profiles.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    List<String> id = Arrays.asList(); // The unique identifiers of the data security objects (analytic objects) to retrieve.  Default is all data security objects.
    Boolean includeDetails = true; // If true, the response includes the analytic objects (display name, ID, and object type), related objects,  securable properties, and securable dimensions. If false, the response only includes analytic objects  (display name, ID, and object type). Default is false.
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve data security objects from.
    try {
      GetDataSecurityObjectsAPIResponseDTO result = client
              .permissionManagement
              .getDataSecurityObjects()
              .id(id)
              .includeDetails(includeDetails)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnalyticObjects());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getDataSecurityObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetDataSecurityObjectsAPIResponseDTO> response = client
              .permissionManagement
              .getDataSecurityObjects()
              .id(id)
              .includeDetails(includeDetails)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getDataSecurityObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the data security objects (analytic objects) to retrieve.  Default is all data security objects. | [optional] |
| **includeDetails** | **Boolean**| If true, the response includes the analytic objects (display name, ID, and object type), related objects,  securable properties, and securable dimensions. If false, the response only includes analytic objects  (display name, ID, and object type). Default is false. | [optional] |
| **tenantCode** | **String**| Specify the tenant to retrieve data security objects from. | [optional] |

### Return type

[**GetDataSecurityObjectsAPIResponseDTO**](GetDataSecurityObjectsAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getPermission"></a>
# **getPermission**
> PermissionDTO getPermission(permissionId).tenantCode(tenantCode).execute();

Retrieve a permission&#39;s details

This API allows you to retrieve the details for a specified permission.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    String permissionId = "permissionId_example"; // The unique identifier of the permission you want to retrieve.
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve a permission from.
    try {
      PermissionDTO result = client
              .permissionManagement
              .getPermission(permissionId)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getPermissionId());
      System.out.println(result.getDisplayName());
      System.out.println(result.getDataSecurityProfiles());
      System.out.println(result.getAdminCapabilityConfig());
      System.out.println(result.getRoleModulesConfig());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getPermission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionDTO> response = client
              .permissionManagement
              .getPermission(permissionId)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getPermission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **permissionId** | **String**| The unique identifier of the permission you want to retrieve. | |
| **tenantCode** | **String**| Specify the tenant to retrieve a permission from. | [optional] |

### Return type

[**PermissionDTO**](PermissionDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getPermissions"></a>
# **getPermissions**
> GetPermissionsAPIResponseDTO getPermissions().tenantCode(tenantCode).includeDetails(includeDetails).execute();

Retrieve a list of all permissions

This API allows you to retrieve the full list of user permissions in your tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve the permissions from.
    Boolean includeDetails = true; // If true, returns the permission's details. If false, only returns the permissions' ID, display name,  and description. Default is false.
    try {
      GetPermissionsAPIResponseDTO result = client
              .permissionManagement
              .getPermissions()
              .tenantCode(tenantCode)
              .includeDetails(includeDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getPermissions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPermissionsAPIResponseDTO> response = client
              .permissionManagement
              .getPermissions()
              .tenantCode(tenantCode)
              .includeDetails(includeDetails)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#getPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| Specify the tenant to retrieve the permissions from. | [optional] |
| **includeDetails** | **Boolean**| If true, returns the permission&#39;s details. If false, only returns the permissions&#39; ID, display name,  and description. Default is false. | [optional] |

### Return type

[**GetPermissionsAPIResponseDTO**](GetPermissionsAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="updatePermissions"></a>
# **updatePermissions**
> PermissionBulkOperationResponseDTO updatePermissions(permissionsListDTO).tenantCode(tenantCode).execute();

Update permissions

This API allows you to update existing permissions.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierPermissionManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PermissionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierPermissionManagement client = new VisierPermissionManagement(configuration);
    List<PermissionDTO> permissions = Arrays.asList(); // The list of permissions that will be created or updated
    String tenantCode = "tenantCode_example"; // Specify the tenant to update permissions in.
    try {
      PermissionBulkOperationResponseDTO result = client
              .permissionManagement
              .updatePermissions()
              .permissions(permissions)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccesses());
      System.out.println(result.getFailures());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#updatePermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionBulkOperationResponseDTO> response = client
              .permissionManagement
              .updatePermissions()
              .permissions(permissions)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionManagementApi#updatePermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **permissionsListDTO** | [**PermissionsListDTO**](PermissionsListDTO.md)|  | |
| **tenantCode** | **String**| Specify the tenant to update permissions in. | [optional] |

### Return type

[**PermissionBulkOperationResponseDTO**](PermissionBulkOperationResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

