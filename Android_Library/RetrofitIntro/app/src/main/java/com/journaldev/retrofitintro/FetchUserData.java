package com.journaldev.retrofitintro;

import android.util.Log;

import com.journaldev.retrofitintro.pojo.FacilityPojo.FacilityList;
import com.journaldev.retrofitintro.pojo.MultipleResource;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchUserData {

    APIInterface apiInterface;


    private static FetchUserData singleton = new FetchUserData( );

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private FetchUserData() { }

    /* Static 'instance' method */
    public static FetchUserData getInstance( ) {
        return singleton;
    }


    public void getAllDetails(final ResultHandler<FacilityList> handler) {

        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<FacilityList> call = apiInterface.getFacilityDetails("Bearer 48faf3b0-fc81-3de0-8be6-8c34831032d2", "member_02","application/json",true,"10002","application/json");//doGetListResources("123456","edfas");


        call.enqueue(new Callback<FacilityList>() {

            @Override
            public void onResponse(Call<FacilityList> call, Response<FacilityList> response) {
                FacilityList resource = response.body();
                handler.onSuccess(resource);

            }

            @Override
            public void onFailure(Call<FacilityList> call, Throwable t) {
                call.cancel();
                handler.onFailure(t);
            }
        });

    }

}
