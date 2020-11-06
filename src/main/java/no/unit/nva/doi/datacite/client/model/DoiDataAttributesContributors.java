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
import java.util.ArrayList;
import java.util.List;
import no.unit.nva.doi.datacite.client.model.DoiDataAttributesAffiliation1;
import no.unit.nva.doi.datacite.client.model.DoiDataAttributesNameIdentifiers;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DoiDataAttributesContributors
 */
@JsonPropertyOrder({
  DoiDataAttributesContributors.JSON_PROPERTY_NAME_TYPE,
  DoiDataAttributesContributors.JSON_PROPERTY_NAME_IDENTIFIERS,
  DoiDataAttributesContributors.JSON_PROPERTY_NAME,
  DoiDataAttributesContributors.JSON_PROPERTY_GIVEN_NAME,
  DoiDataAttributesContributors.JSON_PROPERTY_FAMILY_NAME,
  DoiDataAttributesContributors.JSON_PROPERTY_AFFILIATION,
  DoiDataAttributesContributors.JSON_PROPERTY_CONTRIBUTOR_TYPE
})

public class DoiDataAttributesContributors {
  public static final String JSON_PROPERTY_NAME_TYPE = "nameType";
  private String nameType;

  public static final String JSON_PROPERTY_NAME_IDENTIFIERS = "nameIdentifiers";
  private List<DoiDataAttributesNameIdentifiers> nameIdentifiers = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public static final String JSON_PROPERTY_AFFILIATION = "affiliation";
  private List<DoiDataAttributesAffiliation1> affiliation = null;

  public static final String JSON_PROPERTY_CONTRIBUTOR_TYPE = "contributorType";
  private String contributorType;


  public DoiDataAttributesContributors nameType(String nameType) {
    
    this.nameType = nameType;
    return this;
  }

   /**
   * Get nameType
   * @return nameType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameType() {
    return nameType;
  }


  public void setNameType(String nameType) {
    this.nameType = nameType;
  }


  public DoiDataAttributesContributors nameIdentifiers(List<DoiDataAttributesNameIdentifiers> nameIdentifiers) {
    
    this.nameIdentifiers = nameIdentifiers;
    return this;
  }

  public DoiDataAttributesContributors addNameIdentifiersItem(DoiDataAttributesNameIdentifiers nameIdentifiersItem) {
    if (this.nameIdentifiers == null) {
      this.nameIdentifiers = new ArrayList<>();
    }
    this.nameIdentifiers.add(nameIdentifiersItem);
    return this;
  }

   /**
   * Get nameIdentifiers
   * @return nameIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DoiDataAttributesNameIdentifiers> getNameIdentifiers() {
    return nameIdentifiers;
  }


  public void setNameIdentifiers(List<DoiDataAttributesNameIdentifiers> nameIdentifiers) {
    this.nameIdentifiers = nameIdentifiers;
  }


  public DoiDataAttributesContributors name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DoiDataAttributesContributors givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public DoiDataAttributesContributors familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public DoiDataAttributesContributors affiliation(List<DoiDataAttributesAffiliation1> affiliation) {
    
    this.affiliation = affiliation;
    return this;
  }

  public DoiDataAttributesContributors addAffiliationItem(DoiDataAttributesAffiliation1 affiliationItem) {
    if (this.affiliation == null) {
      this.affiliation = new ArrayList<>();
    }
    this.affiliation.add(affiliationItem);
    return this;
  }

   /**
   * Get affiliation
   * @return affiliation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AFFILIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DoiDataAttributesAffiliation1> getAffiliation() {
    return affiliation;
  }


  public void setAffiliation(List<DoiDataAttributesAffiliation1> affiliation) {
    this.affiliation = affiliation;
  }


  public DoiDataAttributesContributors contributorType(String contributorType) {
    
    this.contributorType = contributorType;
    return this;
  }

   /**
   * Get contributorType
   * @return contributorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTRIBUTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContributorType() {
    return contributorType;
  }


  public void setContributorType(String contributorType) {
    this.contributorType = contributorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiDataAttributesContributors doiDataAttributesContributors = (DoiDataAttributesContributors) o;
    return Objects.equals(this.nameType, doiDataAttributesContributors.nameType) &&
        Objects.equals(this.nameIdentifiers, doiDataAttributesContributors.nameIdentifiers) &&
        Objects.equals(this.name, doiDataAttributesContributors.name) &&
        Objects.equals(this.givenName, doiDataAttributesContributors.givenName) &&
        Objects.equals(this.familyName, doiDataAttributesContributors.familyName) &&
        Objects.equals(this.affiliation, doiDataAttributesContributors.affiliation) &&
        Objects.equals(this.contributorType, doiDataAttributesContributors.contributorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameType, nameIdentifiers, name, givenName, familyName, affiliation, contributorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiDataAttributesContributors {\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    nameIdentifiers: ").append(toIndentedString(nameIdentifiers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    affiliation: ").append(toIndentedString(affiliation)).append("\n");
    sb.append("    contributorType: ").append(toIndentedString(contributorType)).append("\n");
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

