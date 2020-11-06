

# ReportData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**reportName** | **String** | The long name of the report. |  [optional]
**reportId** | **String** | The report ID or code or shortname. Typically this will be the same code provided in the Report parameter of the request. |  [optional]
**release** | **String** | The release or version of the report. |  [optional]
**created** | **String** | Time the report was prepared. Format as defined by date-time - RFC3339 |  [optional]
**createdBy** | **String** | Name of the organization producing the report. |  [optional]
**reportFilters** | **String** | Zero or more report filters used for this report. Typically reflect filters provided on the Request. Filters limit the data to be reported on. |  [optional]
**reportAttributes** | **String** | Zero or more additional attributes applied to the report. Attributes inform the level of detail in the report. |  [optional]
**reportingPeriod** | **String** | Time the report was prepared. |  [optional]
**reportDatasets** | **String** | Defines the output for the Report_Datasets being returned in a Dataset Report. Collection of datasets from the report. |  [optional]



