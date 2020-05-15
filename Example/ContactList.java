
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactList {

    @SerializedName("Contact")
    @Expose
    public Contact contact;

}
