

# AnalyticObjectDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analyticObjectId** | **String** | The unique ID of the analytic object. |  [optional] |
|**displayName** | **String** | An identifiable name to display in Visier, such as \&quot;Employee\&quot;. |  [optional] |
|**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | The analytic object type. |  [optional] |
|**relatedObjects** | [**List&lt;RelatedAnalyticObjectDTO&gt;**](RelatedAnalyticObjectDTO.md) | The analytic objects related to the data security object. |  [optional] |
|**securableProperties** | [**List&lt;SecurablePropertyDTO&gt;**](SecurablePropertyDTO.md) | All available properties from the data security object and its related analytic objects that you can configure data access for. |  [optional] |
|**securableDimensions** | [**List&lt;SecurableDimensionDTO&gt;**](SecurableDimensionDTO.md) | A list of dimensions that are available to define population access filters in the permission. |  [optional] |



## Enum: ObjectTypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;Event&quot; |
| SUBJECT | &quot;Subject&quot; |
| BUSINESSOUTCOMEOVERLAY | &quot;BusinessOutcomeOverlay&quot; |
| PLANORBUDGETOVERLAY | &quot;PlanOrBudgetOverlay&quot; |
| EXTERNALBENCHMARK | &quot;ExternalBenchmark&quot; |
| VISIERBENCHMARK | &quot;VisierBenchmark&quot; |
| USAGEOVERLAY | &quot;UsageOverlay&quot; |
| OTHEROVERLAY | &quot;OtherOverlay&quot; |
| INTERNALCOMPARISON | &quot;InternalComparison&quot; |
| PLANANALYTICOBJECT | &quot;PlanAnalyticObject&quot; |



