package com.journaldev.retrofitintro.pojo.FacilityPojo;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("AddressId")
    public String addressId;

    @SerializedName("AddressLine1")
    public String addressLine1;

    @SerializedName("AddressLine2")
    public String addressLine2;

    @SerializedName("Area")
    public String area;

    @SerializedName("City")
    public String city;

    @SerializedName("Country")
    public String country;

    @SerializedName("State")
    public String state;

    @SerializedName("ZipCode")
    public String zipCode;

}
