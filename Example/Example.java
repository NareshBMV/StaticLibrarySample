
package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("Employee")
    @Expose
    public List<Employee> employee = null;

}
