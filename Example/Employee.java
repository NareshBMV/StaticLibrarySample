
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("CreatedTimeStamp")
    @Expose
    public String createdTimeStamp;
    @SerializedName("Flag")
    @Expose
    public String flag;
    @SerializedName("UpdatedTimeStamp")
    @Expose
    public String updatedTimeStamp;
    @SerializedName("branchName")
    @Expose
    public String branchName;
    @SerializedName("ContactList")
    @Expose
    public ContactList contactList;
    @SerializedName("EmployeeId")
    @Expose
    public String employeeId;
    @SerializedName("FirstName")
    @Expose
    public String firstName;
    @SerializedName("GeographyHierarchy")
    @Expose
    public String geographyHierarchy;
    @SerializedName("LastName")
    @Expose
    public String lastName;
    @SerializedName("Remarks")
    @Expose
    public String remarks;
    @SerializedName("Roles")
    @Expose
    public Roles roles;
    @SerializedName("SalesHierarchy")
    @Expose
    public String salesHierarchy;
    @SerializedName("Status")
    @Expose
    public String status;

}
