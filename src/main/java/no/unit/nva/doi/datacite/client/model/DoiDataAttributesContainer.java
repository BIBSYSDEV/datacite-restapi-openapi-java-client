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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DoiDataAttributesContainer
 */
@JsonPropertyOrder({
  DoiDataAttributesContainer.JSON_PROPERTY_TYPE,
  DoiDataAttributesContainer.JSON_PROPERTY_IDENTIFIER,
  DoiDataAttributesContainer.JSON_PROPERTY_IDENTIFIER_TYPE,
  DoiDataAttributesContainer.JSON_PROPERTY_TITLE,
  DoiDataAttributesContainer.JSON_PROPERTY_VOLUME,
  DoiDataAttributesContainer.JSON_PROPERTY_ISSUE,
  DoiDataAttributesContainer.JSON_PROPERTY_FIRST_PAGE,
  DoiDataAttributesContainer.JSON_PROPERTY_LAST_PAGE
})

public class DoiDataAttributesContainer {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_IDENTIFIER_TYPE = "identifierType";
  private String identifierType;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private String volume;

  public static final String JSON_PROPERTY_ISSUE = "issue";
  private String issue;

  public static final String JSON_PROPERTY_FIRST_PAGE = "firstPage";
  private String firstPage;

  public static final String JSON_PROPERTY_LAST_PAGE = "lastPage";
  private String lastPage;


  public DoiDataAttributesContainer type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DoiDataAttributesContainer identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public DoiDataAttributesContainer identifierType(String identifierType) {
    
    this.identifierType = identifierType;
    return this;
  }

   /**
   * Get identifierType
   * @return identifierType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentifierType() {
    return identifierType;
  }


  public void setIdentifierType(String identifierType) {
    this.identifierType = identifierType;
  }


  public DoiDataAttributesContainer title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DoiDataAttributesContainer volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public DoiDataAttributesContainer issue(String issue) {
    
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssue() {
    return issue;
  }


  public void setIssue(String issue) {
    this.issue = issue;
  }


  public DoiDataAttributesContainer firstPage(String firstPage) {
    
    this.firstPage = firstPage;
    return this;
  }

   /**
   * Get firstPage
   * @return firstPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstPage() {
    return firstPage;
  }


  public void setFirstPage(String firstPage) {
    this.firstPage = firstPage;
  }


  public DoiDataAttributesContainer lastPage(String lastPage) {
    
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastPage() {
    return lastPage;
  }


  public void setLastPage(String lastPage) {
    this.lastPage = lastPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiDataAttributesContainer doiDataAttributesContainer = (DoiDataAttributesContainer) o;
    return Objects.equals(this.type, doiDataAttributesContainer.type) &&
        Objects.equals(this.identifier, doiDataAttributesContainer.identifier) &&
        Objects.equals(this.identifierType, doiDataAttributesContainer.identifierType) &&
        Objects.equals(this.title, doiDataAttributesContainer.title) &&
        Objects.equals(this.volume, doiDataAttributesContainer.volume) &&
        Objects.equals(this.issue, doiDataAttributesContainer.issue) &&
        Objects.equals(this.firstPage, doiDataAttributesContainer.firstPage) &&
        Objects.equals(this.lastPage, doiDataAttributesContainer.lastPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, identifier, identifierType, title, volume, issue, firstPage, lastPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiDataAttributesContainer {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
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
