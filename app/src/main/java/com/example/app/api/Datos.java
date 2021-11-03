package com.example.app.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datos {

    @SerializedName("lista")
    @Expose
    private Usuario[] data;


    public Datos() {
    }

    public Usuario[] getData() {
        return data;
    }

    public void setData(Usuario[] data) {
        this.data = data;
    }

}
