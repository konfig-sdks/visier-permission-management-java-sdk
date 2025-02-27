/*
 * Visier Permission Management APIs
 * Visier APIs for managing permissions within an organization
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.RelatedAnalyticObjectDTO;
import com.konfigthis.client.model.SecurableDimensionDTO;
import com.konfigthis.client.model.SecurablePropertyDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * AnalyticObjectDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnalyticObjectDTO {
  public static final String SERIALIZED_NAME_ANALYTIC_OBJECT_ID = "analyticObjectId";
  @SerializedName(SERIALIZED_NAME_ANALYTIC_OBJECT_ID)
  private String analyticObjectId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * The analytic object type.
   */
  @JsonAdapter(ObjectTypeEnum.Adapter.class)
 public enum ObjectTypeEnum {
    EVENT("Event"),
    
    SUBJECT("Subject"),
    
    BUSINESSOUTCOMEOVERLAY("BusinessOutcomeOverlay"),
    
    PLANORBUDGETOVERLAY("PlanOrBudgetOverlay"),
    
    EXTERNALBENCHMARK("ExternalBenchmark"),
    
    VISIERBENCHMARK("VisierBenchmark"),
    
    USAGEOVERLAY("UsageOverlay"),
    
    OTHEROVERLAY("OtherOverlay"),
    
    INTERNALCOMPARISON("InternalComparison"),
    
    PLANANALYTICOBJECT("PlanAnalyticObject");

    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectTypeEnum fromValue(String value) {
      for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private ObjectTypeEnum objectType;

  public static final String SERIALIZED_NAME_RELATED_OBJECTS = "relatedObjects";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECTS)
  private List<RelatedAnalyticObjectDTO> relatedObjects = null;

  public static final String SERIALIZED_NAME_SECURABLE_PROPERTIES = "securableProperties";
  @SerializedName(SERIALIZED_NAME_SECURABLE_PROPERTIES)
  private List<SecurablePropertyDTO> securableProperties = null;

  public static final String SERIALIZED_NAME_SECURABLE_DIMENSIONS = "securableDimensions";
  @SerializedName(SERIALIZED_NAME_SECURABLE_DIMENSIONS)
  private List<SecurableDimensionDTO> securableDimensions = null;

  public AnalyticObjectDTO() {
  }

  public AnalyticObjectDTO analyticObjectId(String analyticObjectId) {
    
    
    
    
    this.analyticObjectId = analyticObjectId;
    return this;
  }

   /**
   * The unique ID of the analytic object.
   * @return analyticObjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the analytic object.")

  public String getAnalyticObjectId() {
    return analyticObjectId;
  }


  public void setAnalyticObjectId(String analyticObjectId) {
    
    
    
    this.analyticObjectId = analyticObjectId;
  }


  public AnalyticObjectDTO displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * An identifiable name to display in Visier, such as \&quot;Employee\&quot;.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifiable name to display in Visier, such as \"Employee\".")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public AnalyticObjectDTO objectType(ObjectTypeEnum objectType) {
    
    
    
    
    this.objectType = objectType;
    return this;
  }

   /**
   * The analytic object type.
   * @return objectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The analytic object type.")

  public ObjectTypeEnum getObjectType() {
    return objectType;
  }


  public void setObjectType(ObjectTypeEnum objectType) {
    
    
    
    this.objectType = objectType;
  }


  public AnalyticObjectDTO relatedObjects(List<RelatedAnalyticObjectDTO> relatedObjects) {
    
    
    
    
    this.relatedObjects = relatedObjects;
    return this;
  }

  public AnalyticObjectDTO addRelatedObjectsItem(RelatedAnalyticObjectDTO relatedObjectsItem) {
    if (this.relatedObjects == null) {
      this.relatedObjects = new ArrayList<>();
    }
    this.relatedObjects.add(relatedObjectsItem);
    return this;
  }

   /**
   * The analytic objects related to the data security object.
   * @return relatedObjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The analytic objects related to the data security object.")

  public List<RelatedAnalyticObjectDTO> getRelatedObjects() {
    return relatedObjects;
  }


  public void setRelatedObjects(List<RelatedAnalyticObjectDTO> relatedObjects) {
    
    
    
    this.relatedObjects = relatedObjects;
  }


  public AnalyticObjectDTO securableProperties(List<SecurablePropertyDTO> securableProperties) {
    
    
    
    
    this.securableProperties = securableProperties;
    return this;
  }

  public AnalyticObjectDTO addSecurablePropertiesItem(SecurablePropertyDTO securablePropertiesItem) {
    if (this.securableProperties == null) {
      this.securableProperties = new ArrayList<>();
    }
    this.securableProperties.add(securablePropertiesItem);
    return this;
  }

   /**
   * All available properties from the data security object and its related analytic objects that you can configure data access for.
   * @return securableProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All available properties from the data security object and its related analytic objects that you can configure data access for.")

  public List<SecurablePropertyDTO> getSecurableProperties() {
    return securableProperties;
  }


  public void setSecurableProperties(List<SecurablePropertyDTO> securableProperties) {
    
    
    
    this.securableProperties = securableProperties;
  }


  public AnalyticObjectDTO securableDimensions(List<SecurableDimensionDTO> securableDimensions) {
    
    
    
    
    this.securableDimensions = securableDimensions;
    return this;
  }

  public AnalyticObjectDTO addSecurableDimensionsItem(SecurableDimensionDTO securableDimensionsItem) {
    if (this.securableDimensions == null) {
      this.securableDimensions = new ArrayList<>();
    }
    this.securableDimensions.add(securableDimensionsItem);
    return this;
  }

   /**
   * A list of dimensions that are available to define population access filters in the permission.
   * @return securableDimensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of dimensions that are available to define population access filters in the permission.")

  public List<SecurableDimensionDTO> getSecurableDimensions() {
    return securableDimensions;
  }


  public void setSecurableDimensions(List<SecurableDimensionDTO> securableDimensions) {
    
    
    
    this.securableDimensions = securableDimensions;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AnalyticObjectDTO instance itself
   */
  public AnalyticObjectDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticObjectDTO analyticObjectDTO = (AnalyticObjectDTO) o;
    return Objects.equals(this.analyticObjectId, analyticObjectDTO.analyticObjectId) &&
        Objects.equals(this.displayName, analyticObjectDTO.displayName) &&
        Objects.equals(this.objectType, analyticObjectDTO.objectType) &&
        Objects.equals(this.relatedObjects, analyticObjectDTO.relatedObjects) &&
        Objects.equals(this.securableProperties, analyticObjectDTO.securableProperties) &&
        Objects.equals(this.securableDimensions, analyticObjectDTO.securableDimensions)&&
        Objects.equals(this.additionalProperties, analyticObjectDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyticObjectId, displayName, objectType, relatedObjects, securableProperties, securableDimensions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticObjectDTO {\n");
    sb.append("    analyticObjectId: ").append(toIndentedString(analyticObjectId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    relatedObjects: ").append(toIndentedString(relatedObjects)).append("\n");
    sb.append("    securableProperties: ").append(toIndentedString(securableProperties)).append("\n");
    sb.append("    securableDimensions: ").append(toIndentedString(securableDimensions)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("analyticObjectId");
    openapiFields.add("displayName");
    openapiFields.add("objectType");
    openapiFields.add("relatedObjects");
    openapiFields.add("securableProperties");
    openapiFields.add("securableDimensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnalyticObjectDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnalyticObjectDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyticObjectDTO is not found in the empty JSON string", AnalyticObjectDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("analyticObjectId") != null && !jsonObj.get("analyticObjectId").isJsonNull()) && !jsonObj.get("analyticObjectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `analyticObjectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("analyticObjectId").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("objectType") != null && !jsonObj.get("objectType").isJsonNull()) && !jsonObj.get("objectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectType").toString()));
      }
      if (jsonObj.get("relatedObjects") != null && !jsonObj.get("relatedObjects").isJsonNull()) {
        JsonArray jsonArrayrelatedObjects = jsonObj.getAsJsonArray("relatedObjects");
        if (jsonArrayrelatedObjects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("relatedObjects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `relatedObjects` to be an array in the JSON string but got `%s`", jsonObj.get("relatedObjects").toString()));
          }

          // validate the optional field `relatedObjects` (array)
          for (int i = 0; i < jsonArrayrelatedObjects.size(); i++) {
            RelatedAnalyticObjectDTO.validateJsonObject(jsonArrayrelatedObjects.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("securableProperties") != null && !jsonObj.get("securableProperties").isJsonNull()) {
        JsonArray jsonArraysecurableProperties = jsonObj.getAsJsonArray("securableProperties");
        if (jsonArraysecurableProperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("securableProperties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `securableProperties` to be an array in the JSON string but got `%s`", jsonObj.get("securableProperties").toString()));
          }

          // validate the optional field `securableProperties` (array)
          for (int i = 0; i < jsonArraysecurableProperties.size(); i++) {
            SecurablePropertyDTO.validateJsonObject(jsonArraysecurableProperties.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("securableDimensions") != null && !jsonObj.get("securableDimensions").isJsonNull()) {
        JsonArray jsonArraysecurableDimensions = jsonObj.getAsJsonArray("securableDimensions");
        if (jsonArraysecurableDimensions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("securableDimensions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `securableDimensions` to be an array in the JSON string but got `%s`", jsonObj.get("securableDimensions").toString()));
          }

          // validate the optional field `securableDimensions` (array)
          for (int i = 0; i < jsonArraysecurableDimensions.size(); i++) {
            SecurableDimensionDTO.validateJsonObject(jsonArraysecurableDimensions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyticObjectDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyticObjectDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyticObjectDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyticObjectDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyticObjectDTO>() {
           @Override
           public void write(JsonWriter out, AnalyticObjectDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyticObjectDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnalyticObjectDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyticObjectDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyticObjectDTO
  * @throws IOException if the JSON string is invalid with respect to AnalyticObjectDTO
  */
  public static AnalyticObjectDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyticObjectDTO.class);
  }

 /**
  * Convert an instance of AnalyticObjectDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

