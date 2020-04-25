package com.example.covidmonitoring.date

import com.google.gson.annotations.SerializedName

data class Summary(
    @SerializedName("Global") val global: Global,
    @SerializedName("Countries") val countries: List<CountryGlobalData>
)

data class Global(
    @SerializedName("NewConfirmed") val newConfirmed: Int,
    @SerializedName("TotalConfirmed") val totalConfirmed: Int,
    @SerializedName("NewDeaths") val newDeaths: Int,
    @SerializedName("TotalDeaths") val totalDeaths: Int,
    @SerializedName("NewRecovered") val newRecovered: Int,
    @SerializedName("TotalRecovered") val totalRecovered: Int
)

data class CountryGlobalData(
@SerializedName("Country") val country: String,
@SerializedName("CountryCode")val countryCode: String,
@SerializedName("NewConfirmed") val newConfirmed: Int,
@SerializedName("TotalConfirmed") val totalConfirmed: Int,
@SerializedName("NewDeaths") val newDeaths: Int,
@SerializedName("TotalDeaths") val totalDeaths: Int,
@SerializedName("NewRecovered") val newRecovered: Int,
@SerializedName("TotalRecovered") val totalRecovered: Int
)

data class CountryCases(
    @SerializedName("Country") val country: String,
    @SerializedName("Cases") val cases: Int
)