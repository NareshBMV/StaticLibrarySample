package com.journaldev.retrofitintro.pojo.FacilityPojo;
import com.google.gson.annotations.SerializedName;
import com.journaldev.retrofitintro.pojo.MultipleResource;

import java.util.ArrayList;
import java.util.List;

public class FacilityList {
    @SerializedName("Facility")
    public List<Facility> facilityList = new ArrayList<>();
}


