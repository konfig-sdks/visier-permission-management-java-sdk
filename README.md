<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for managing permissions within an organization

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=PermissionManagement&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-permission-management-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-permission-management-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-permission-management-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PermissionManagementApi* | [**createPermissions**](docs/PermissionManagementApi.md#createPermissions) | **POST** /v1/admin/permissions | Create permissions
*PermissionManagementApi* | [**deletePermissions**](docs/PermissionManagementApi.md#deletePermissions) | **DELETE** /v1/admin/permissions | Delete permissions
*PermissionManagementApi* | [**getCapabilities**](docs/PermissionManagementApi.md#getCapabilities) | **GET** /v1/admin/capabilities | Retrieve a list of all permission capabilities
*PermissionManagementApi* | [**getCapability**](docs/PermissionManagementApi.md#getCapability) | **GET** /v1/admin/capabilities/{capabilityId} | Retrieve a permission capability&#39;s details
*PermissionManagementApi* | [**getContentPackage**](docs/PermissionManagementApi.md#getContentPackage) | **GET** /v1/admin/content-packages/{contentPackageId} | Retrieve a content package&#39;s details
*PermissionManagementApi* | [**getContentPackages**](docs/PermissionManagementApi.md#getContentPackages) | **GET** /v1/admin/content-packages | Retrieve a list of all content packages
*PermissionManagementApi* | [**getDataSecurityObjects**](docs/PermissionManagementApi.md#getDataSecurityObjects) | **GET** /v1/admin/data-security-objects | Retrieve a list of data security objects
*PermissionManagementApi* | [**getPermission**](docs/PermissionManagementApi.md#getPermission) | **GET** /v1/admin/permissions/{permissionId} | Retrieve a permission&#39;s details
*PermissionManagementApi* | [**getPermissions**](docs/PermissionManagementApi.md#getPermissions) | **GET** /v1/admin/permissions | Retrieve a list of all permissions
*PermissionManagementApi* | [**updatePermissions**](docs/PermissionManagementApi.md#updatePermissions) | **PUT** /v1/admin/permissions | Update permissions


## Documentation for Models

 - [AdminCapabilityConfigDTO](docs/AdminCapabilityConfigDTO.md)
 - [AnalyticObjectDTO](docs/AnalyticObjectDTO.md)
 - [CapabilityDTO](docs/CapabilityDTO.md)
 - [ContentPackageDTO](docs/ContentPackageDTO.md)
 - [DataSecurityProfileDTO](docs/DataSecurityProfileDTO.md)
 - [DimensionFilterDTO](docs/DimensionFilterDTO.md)
 - [DynamicDimensionFilterDTO](docs/DynamicDimensionFilterDTO.md)
 - [DynamicPropertyMappingDTO](docs/DynamicPropertyMappingDTO.md)
 - [GetCapabilitiesAPIResponseDTO](docs/GetCapabilitiesAPIResponseDTO.md)
 - [GetContentPackagesAPIResponseDTO](docs/GetContentPackagesAPIResponseDTO.md)
 - [GetDataSecurityObjectsAPIResponseDTO](docs/GetDataSecurityObjectsAPIResponseDTO.md)
 - [GetPermissionsAPIResponseDTO](docs/GetPermissionsAPIResponseDTO.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [HierarchyPropertyDTO](docs/HierarchyPropertyDTO.md)
 - [InheritedAccessConfigDTO](docs/InheritedAccessConfigDTO.md)
 - [MemberFilterConfigDTO](docs/MemberFilterConfigDTO.md)
 - [MemberSelectionDTO](docs/MemberSelectionDTO.md)
 - [PermissionBulkOperationResponseDTO](docs/PermissionBulkOperationResponseDTO.md)
 - [PermissionDTO](docs/PermissionDTO.md)
 - [PermissionErrorDTO](docs/PermissionErrorDTO.md)
 - [PermissionFailureDTO](docs/PermissionFailureDTO.md)
 - [PermissionSuccessDTO](docs/PermissionSuccessDTO.md)
 - [PermissionsListDTO](docs/PermissionsListDTO.md)
 - [PropertyAccessConfigDTO](docs/PropertyAccessConfigDTO.md)
 - [PropertySetConfigDTO](docs/PropertySetConfigDTO.md)
 - [RelatedAnalyticObjectDTO](docs/RelatedAnalyticObjectDTO.md)
 - [RoleModulesConfigDTO](docs/RoleModulesConfigDTO.md)
 - [SecurableDimensionDTO](docs/SecurableDimensionDTO.md)
 - [SecurablePropertyDTO](docs/SecurablePropertyDTO.md)
 - [StaticDimensionFilterDTO](docs/StaticDimensionFilterDTO.md)
 - [Status](docs/Status.md)
 - [UserPropertyDTO](docs/UserPropertyDTO.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
