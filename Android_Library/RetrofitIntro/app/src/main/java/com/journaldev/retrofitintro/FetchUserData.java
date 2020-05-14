package com.journaldev.retrofitintro;

import android.util.Log;

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


    public void getAllDetails(final ResultHandler<MultipleResource> handler) {

        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<MultipleResource> call = apiInterface.doGetListResources("123456");


        call.enqueue(new Callback<MultipleResource>() {

            @Override
            public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {
                MultipleResource resource = response.body();
                handler.onSuccess(resource);

            }

            @Override
            public void onFailure(Call<MultipleResource> call, Throwable t) {
                call.cancel();
                handler.onFailure(t);
            }
        });

    }

}
