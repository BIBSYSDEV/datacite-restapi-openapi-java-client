/*
 * REST API
 * The REST API is used for all API interactions with DataCite services.
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: support@datacite.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.unit.nva.doi.datacite.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * EventDataAttributes
 */
@JsonPropertyOrder({
  EventDataAttributes.JSON_PROPERTY_SUBJ_ID,
  EventDataAttributes.JSON_PROPERTY_OBJ_ID,
  EventDataAttributes.JSON_PROPERTY_MESSAGE_ACTION,
  EventDataAttributes.JSON_PROPERTY_RELATION_TYPE_ID,
  EventDataAttributes.JSON_PROPERTY_SOURCE_TOKEN,
  EventDataAttributes.JSON_PROPERTY_SOURCE_ID,
  EventDataAttributes.JSON_PROPERTY_TOTAL,
  EventDataAttributes.JSON_PROPERTY_LICENSE,
  EventDataAttributes.JSON_PROPERTY_OCCURED_AT,
  EventDataAttributes.JSON_PROPERTY_TIMESTAMP,
  EventDataAttributes.JSON_PROPERTY_SUBJ,
  EventDataAttributes.JSON_PROPERTY_OBJ
})

public class EventDataAttributes {
  public static final String JSON_PROPERTY_SUBJ_ID = "subjId";
  private String subjId;

  public static final String JSON_PROPERTY_OBJ_ID = "objId";
  private String objId;

  /**
   * Gets or Sets messageAction
   */
  public enum MessageActionEnum {
    CREATE("create"),
    
    DELETE("delete");

    private String value;

    MessageActionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MessageActionEnum fromValue(String value) {
      for (MessageActionEnum b : MessageActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MESSAGE_ACTION = "messageAction";
  private MessageActionEnum messageAction;

  public static final String JSON_PROPERTY_RELATION_TYPE_ID = "relationTypeId";
  private String relationTypeId;

  public static final String JSON_PROPERTY_SOURCE_TOKEN = "sourceToken";
  private String sourceToken;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private BigDecimal total;

  public static final String JSON_PROPERTY_LICENSE = "license";
  private String license;

  public static final String JSON_PROPERTY_OCCURED_AT = "occuredAt";
  private String occuredAt;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_SUBJ = "subj";
  private Object subj;

  public static final String JSON_PROPERTY_OBJ = "obj";
  private Object obj;


  public EventDataAttributes subjId(String subjId) {
    
    this.subjId = subjId;
    return this;
  }

   /**
   * Get subjId
   * @return subjId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBJ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubjId() {
    return subjId;
  }


  public void setSubjId(String subjId) {
    this.subjId = subjId;
  }


  public EventDataAttributes objId(String objId) {
    
    this.objId = objId;
    return this;
  }

   /**
   * Get objId
   * @return objId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OBJ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObjId() {
    return objId;
  }


  public void setObjId(String objId) {
    this.objId = objId;
  }


  public EventDataAttributes messageAction(MessageActionEnum messageAction) {
    
    this.messageAction = messageAction;
    return this;
  }

   /**
   * Get messageAction
   * @return messageAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageActionEnum getMessageAction() {
    return messageAction;
  }


  public void setMessageAction(MessageActionEnum messageAction) {
    this.messageAction = messageAction;
  }


  public EventDataAttributes relationTypeId(String relationTypeId) {
    
    this.relationTypeId = relationTypeId;
    return this;
  }

   /**
   * Get relationTypeId
   * @return relationTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATION_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRelationTypeId() {
    return relationTypeId;
  }


  public void setRelationTypeId(String relationTypeId) {
    this.relationTypeId = relationTypeId;
  }


  public EventDataAttributes sourceToken(String sourceToken) {
    
    this.sourceToken = sourceToken;
    return this;
  }

   /**
   * Get sourceToken
   * @return sourceToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceToken() {
    return sourceToken;
  }


  public void setSourceToken(String sourceToken) {
    this.sourceToken = sourceToken;
  }


  public EventDataAttributes sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public EventDataAttributes total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public EventDataAttributes license(String license) {
    
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LICENSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLicense() {
    return license;
  }


  public void setLicense(String license) {
    this.license = license;
  }


  public EventDataAttributes occuredAt(String occuredAt) {
    
    this.occuredAt = occuredAt;
    return this;
  }

   /**
   * Get occuredAt
   * @return occuredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCCURED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOccuredAt() {
    return occuredAt;
  }


  public void setOccuredAt(String occuredAt) {
    this.occuredAt = occuredAt;
  }


  public EventDataAttributes timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public EventDataAttributes subj(Object subj) {
    
    this.subj = subj;
    return this;
  }

   /**
   * Get subj
   * @return subj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSubj() {
    return subj;
  }


  public void setSubj(Object subj) {
    this.subj = subj;
  }


  public EventDataAttributes obj(Object obj) {
    
    this.obj = obj;
    return this;
  }

   /**
   * Get obj
   * @return obj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OBJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getObj() {
    return obj;
  }


  public void setObj(Object obj) {
    this.obj = obj;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDataAttributes eventDataAttributes = (EventDataAttributes) o;
    return Objects.equals(this.subjId, eventDataAttributes.subjId) &&
        Objects.equals(this.objId, eventDataAttributes.objId) &&
        Objects.equals(this.messageAction, eventDataAttributes.messageAction) &&
        Objects.equals(this.relationTypeId, eventDataAttributes.relationTypeId) &&
        Objects.equals(this.sourceToken, eventDataAttributes.sourceToken) &&
        Objects.equals(this.sourceId, eventDataAttributes.sourceId) &&
        Objects.equals(this.total, eventDataAttributes.total) &&
        Objects.equals(this.license, eventDataAttributes.license) &&
        Objects.equals(this.occuredAt, eventDataAttributes.occuredAt) &&
        Objects.equals(this.timestamp, eventDataAttributes.timestamp) &&
        Objects.equals(this.subj, eventDataAttributes.subj) &&
        Objects.equals(this.obj, eventDataAttributes.obj);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjId, objId, messageAction, relationTypeId, sourceToken, sourceId, total, license, occuredAt, timestamp, subj, obj);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDataAttributes {\n");
    sb.append("    subjId: ").append(toIndentedString(subjId)).append("\n");
    sb.append("    objId: ").append(toIndentedString(objId)).append("\n");
    sb.append("    messageAction: ").append(toIndentedString(messageAction)).append("\n");
    sb.append("    relationTypeId: ").append(toIndentedString(relationTypeId)).append("\n");
    sb.append("    sourceToken: ").append(toIndentedString(sourceToken)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    occuredAt: ").append(toIndentedString(occuredAt)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    subj: ").append(toIndentedString(subj)).append("\n");
    sb.append("    obj: ").append(toIndentedString(obj)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
