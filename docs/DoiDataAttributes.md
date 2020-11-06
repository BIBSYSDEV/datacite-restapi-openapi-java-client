

# DoiDataAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**doi** | **String** |  |  [optional]
**prefix** | **String** |  |  [optional]
**suffix** | **String** |  |  [optional]
**event** | [**EventEnum**](#EventEnum) | Can be set to trigger a DOI state change. |  [optional]
**identifiers** | [**List&lt;DoiDataAttributesIdentifiers&gt;**](DoiDataAttributesIdentifiers.md) |  |  [optional]
**creators** | [**List&lt;DoiDataAttributesCreators&gt;**](DoiDataAttributesCreators.md) |  |  [optional]
**titles** | [**List&lt;DoiDataAttributesTitles&gt;**](DoiDataAttributesTitles.md) |  |  [optional]
**publisher** | **String** |  |  [optional]
**container** | [**DoiDataAttributesContainer**](DoiDataAttributesContainer.md) |  |  [optional]
**publicationYear** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**subjects** | [**List&lt;DoiDataAttributesSubjects&gt;**](DoiDataAttributesSubjects.md) |  |  [optional]
**contributors** | [**List&lt;DoiDataAttributesContributors&gt;**](DoiDataAttributesContributors.md) |  |  [optional]
**dates** | [**List&lt;DoiDataAttributesDates&gt;**](DoiDataAttributesDates.md) |  |  [optional]
**language** | **String** |  |  [optional]
**types** | [**DoiDataAttributesTypes**](DoiDataAttributesTypes.md) |  |  [optional]
**relatedIdentifiers** | [**List&lt;DoiDataAttributesRelatedIdentifiers&gt;**](DoiDataAttributesRelatedIdentifiers.md) |  |  [optional]
**sizes** | **List&lt;String&gt;** |  |  [optional]
**formats** | **List&lt;String&gt;** |  |  [optional]
**version** | **String** |  |  [optional]
**rightsList** | [**List&lt;DoiDataAttributesRightsList&gt;**](DoiDataAttributesRightsList.md) |  |  [optional]
**descriptions** | [**List&lt;DoiDataAttributesDescriptions&gt;**](DoiDataAttributesDescriptions.md) |  |  [optional]
**geoLocations** | [**List&lt;DoiDataAttributesGeoLocations&gt;**](DoiDataAttributesGeoLocations.md) |  |  [optional]
**fundingReferences** | [**List&lt;DoiDataAttributesFundingReferences&gt;**](DoiDataAttributesFundingReferences.md) |  |  [optional]
**url** | **String** |  |  [optional]
**contentUrl** | **List&lt;String&gt;** |  |  [optional]
**metadataVersion** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**schemaVersion** | **String** |  |  [optional]
**source** | **String** |  |  [optional]
**isActive** | **Boolean** |  |  [optional]
**state** | **String** |  |  [optional] [readonly]
**reason** | **String** |  |  [optional]
**landingPage** | [**DoiDataAttributesLandingPage**](DoiDataAttributesLandingPage.md) |  |  [optional]
**created** | **String** |  |  [optional] [readonly]
**registered** | **String** |  |  [optional] [readonly]
**updated** | **String** |  |  [optional] [readonly]



## Enum: EventEnum

Name | Value
---- | -----
PUBLISH | &quot;publish&quot;
REGISTER | &quot;register&quot;
HIDE | &quot;hide&quot;



