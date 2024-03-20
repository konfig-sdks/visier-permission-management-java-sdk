

# DataSecurityProfileDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analyticObjectId** | **String** | The analytic object ID associated with the data security profile. |  [optional] |
|**propertySetConfig** | [**PropertySetConfigDTO**](PropertySetConfigDTO.md) | The property set configuration that defines which properties and access level to allow for each filtered record. |  [optional] |
|**allDataPointAccess** | **Boolean** | The flag for giving all access to data points when creating a population. |  [optional] |
|**memberFilterConfigs** | [**List&lt;MemberFilterConfigDTO&gt;**](MemberFilterConfigDTO.md) | The member filter configurations that defines the population. |  [optional] |
|**inheritedAccessConfigs** | [**List&lt;InheritedAccessConfigDTO&gt;**](InheritedAccessConfigDTO.md) | A list of objects representing the inherited access configurations associated with the data security profile.  By default all related objects of a top level analytic object will inherit access.  To remove access to a related analytic object, add it to the list of inherited access configurations with removeAccess: true.  To add custom filters to a related analytic object, add the analytic object to the list of inherited access configurations and then add the custom filters to its list of member filter configurations. |  [optional] |



