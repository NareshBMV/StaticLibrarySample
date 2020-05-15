package com.journaldev.retrofitintro;

import com.journaldev.retrofitintro.pojo.FacilityPojo.FacilityList;
import com.journaldev.retrofitintro.pojo.MultipleResource;
import com.journaldev.retrofitintro.pojo.User;
import com.journaldev.retrofitintro.pojo.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by anupamchugh on 09/01/17.
 */

interface APIInterface {

    @GET("facility/list/10002/member_02/null")
    Call<FacilityList> getFacilityDetails(@Header("Authorization") String authorization, @Header("userid") String userID,  @Header("Accept") String acceptType,  @Header("is_api") Boolean isAPI,  @Header("tenantId") String tenantID, @Header("Content-Type") String contentType);

}
