package com.journaldev.retrofitintro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.journaldev.retrofitintro.pojo.CreateUserResponse;
import com.journaldev.retrofitintro.pojo.FacilityPojo.Facility;
import com.journaldev.retrofitintro.pojo.FacilityPojo.FacilityList;
import com.journaldev.retrofitintro.pojo.MultipleResource;
import com.journaldev.retrofitintro.pojo.User;
import com.journaldev.retrofitintro.pojo.UserList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Header;

public class MainActivity extends AppCompatActivity{

    TextView responseText;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        responseText = (TextView) findViewById(R.id.responseText);
        apiInterface = APIClient.getClient().create(APIInterface.class);

        FetchUserData.getInstance().getAllDetails(new ResultHandler<FacilityList>() {
            @Override
            public void onSuccess(FacilityList data) {
                for (Facility facility:data.facilityList) {
                    Log.e("Facility Code : ", facility.facilityCode);
                    Log.e("Facility Type : ", facility.facilityType);
                    Log.e("Address : ", facility.addressList.address.addressLine1);
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("Error", t.getLocalizedMessage());
            }
        });
    }
}
