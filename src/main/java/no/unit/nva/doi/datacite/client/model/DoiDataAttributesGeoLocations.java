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
 * DoiDataAttributesGeoLocations
 */
@JsonPropertyOrder({
  DoiDataAttributesGeoLocations.JSON_PROPERTY_GEO_LOCATION_POINT,
  DoiDataAttributesGeoLocations.JSON_PROPERTY_GEO_LOCATION_BOX,
  DoiDataAttributesGeoLocations.JSON_PROPERTY_GEO_LOCATION_PLACE
})

public class DoiDataAttributesGeoLocations {
  public static final String JSON_PROPERTY_GEO_LOCATION_POINT = "geoLocationPoint";
  private Object geoLocationPoint;

  public static final String JSON_PROPERTY_GEO_LOCATION_BOX = "geoLocationBox";
  private Object geoLocationBox;

  public static final String JSON_PROPERTY_GEO_LOCATION_PLACE = "geoLocationPlace";
  private String geoLocationPlace;


  public DoiDataAttributesGeoLocations geoLocationPoint(Object geoLocationPoint) {
    
    this.geoLocationPoint = geoLocationPoint;
    return this;
  }

   /**
   * Get geoLocationPoint
   * @return geoLocationPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEO_LOCATION_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getGeoLocationPoint() {
    return geoLocationPoint;
  }


  public void setGeoLocationPoint(Object geoLocationPoint) {
    this.geoLocationPoint = geoLocationPoint;
  }


  public DoiDataAttributesGeoLocations geoLocationBox(Object geoLocationBox) {
    
    this.geoLocationBox = geoLocationBox;
    return this;
  }

   /**
   * Get geoLocationBox
   * @return geoLocationBox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEO_LOCATION_BOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getGeoLocationBox() {
    return geoLocationBox;
  }


  public void setGeoLocationBox(Object geoLocationBox) {
    this.geoLocationBox = geoLocationBox;
  }


  public DoiDataAttributesGeoLocations geoLocationPlace(String geoLocationPlace) {
    
    this.geoLocationPlace = geoLocationPlace;
    return this;
  }

   /**
   * Get geoLocationPlace
   * @return geoLocationPlace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEO_LOCATION_PLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoLocationPlace() {
    return geoLocationPlace;
  }


  public void setGeoLocationPlace(String geoLocationPlace) {
    this.geoLocationPlace = geoLocationPlace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiDataAttributesGeoLocations doiDataAttributesGeoLocations = (DoiDataAttributesGeoLocations) o;
    return Objects.equals(this.geoLocationPoint, doiDataAttributesGeoLocations.geoLocationPoint) &&
        Objects.equals(this.geoLocationBox, doiDataAttributesGeoLocations.geoLocationBox) &&
        Objects.equals(this.geoLocationPlace, doiDataAttributesGeoLocations.geoLocationPlace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoLocationPoint, geoLocationBox, geoLocationPlace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiDataAttributesGeoLocations {\n");
    sb.append("    geoLocationPoint: ").append(toIndentedString(geoLocationPoint)).append("\n");
    sb.append("    geoLocationBox: ").append(toIndentedString(geoLocationBox)).append("\n");
    sb.append("    geoLocationPlace: ").append(toIndentedString(geoLocationPlace)).append("\n");
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

