

# PropertyAccessConfigDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**propertyId** | **String** | The property ID associated with the property access configuration. |  [optional] |
|**analyticObjectId** | **String** | The analytic object ID of the property. |  [optional] |
|**analyticObjectReferencePaths** | **List&lt;String&gt;** | The path to the analytic object reference or empty if the configuration is not a reference. |  [optional] |
|**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) | The access level of the property. Valid values are: Aggregate, Sensitive |  [optional] |



## Enum: AccessLevelEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| AGGREGATE | &quot;Aggregate&quot; |
| DETAILED | &quot;Detailed&quot; |



