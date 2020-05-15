
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("AreaCode")
    @Expose
    public String areaCode;
    @SerializedName("ContactId")
    @Expose
    public String contactId;
    @SerializedName("ContactNumber")
    @Expose
    public String contactNumber;
    @SerializedName("ContactType")
    @Expose
    public String contactType;
    @SerializedName("CountryCode")
    @Expose
    public String countryCode;

}
