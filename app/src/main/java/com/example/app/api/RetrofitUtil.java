package com.example.app.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// se crearan los servicios para llamar a la API
public class RetrofitUtil {

    // hacemos referencia al objeto retrofit VERSION 2
    private static Retrofit retrofit=null;
    // es la url de la API
    private static String URL_BASE="https://equipoyosh.com/stock-nutrinatalia/";


    // ahora creamos un metodo que se encargara de traer la informacion de la API
    // el parametro url es la url base de la API
    public static Retrofit getClientes(String url) {
        //si todavia no se ha instanciado el objeto retrofit
        if (retrofit==null) {
            retrofit=new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

    // aqui creamos una instancia para retornar un cliente de ese servicio
    // por ello es que le especificamos que el retorno es del tipo UsuarioService
    public static UsuarioService getUsuarioService() {
        return RetrofitUtil.getClientes(URL_BASE).create(UsuarioService.class);
    }

}
