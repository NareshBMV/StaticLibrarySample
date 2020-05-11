package com.ev.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ev.sampleandroidlib.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoggerStaticLibrary.logInLibrary();
        Log.d("Sum of numbers " , String.valueOf(LoggerStaticLibrary.addTwoNumbers(2,5)));
        Log.d("Greeting Message ", LoggerStaticLibrary.greetUser("Naresh"));

    }
}
