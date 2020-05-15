package com.journaldev.retrofitintro.pojo.FacilityPojo;
import com.google.gson.annotations.SerializedName;

public class Facility {

    @SerializedName("CreatedTimeStamp")
    public String createdTimeStamp;

    @SerializedName("Flag")
    public String flag;

    @SerializedName("UpdatedTimeStamp")
    public String updatedTimeStamp;

    @SerializedName("AddressList")
    public AddressList addressList;

    @SerializedName("EmployeeId")
    public String employeeId;

    @SerializedName("ExternalId")
    public String externalId;

    @SerializedName("FacilityCode")
    public String facilityCode;

    @SerializedName("FacilityId")
    public String facilityId;

    @SerializedName("FacilityType")
    public String facilityType;

    @SerializedName("Name")
    public String name;

    @SerializedName("OwnerId")
    public String ownerId;

    @SerializedName("ParentFacilityId")
    public String parentFacilityId;

    @SerializedName("Status")
    public String status;

    @SerializedName("TaxLocationHierarchy")
    public String taxLocationHierarchy;

    @SerializedName("TaxLocationHierarchyId")
    public String taxLocationHierarchyId;

}