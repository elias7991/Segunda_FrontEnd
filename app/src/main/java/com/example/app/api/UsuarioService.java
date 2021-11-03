package com.example.app.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;


// este servicio lo utilizamos en RetrofilUtil
public interface UsuarioService {
    // aqui agregamos la url de la API
    @GET("persona")
    Call <Datos> obtenerUsuarios();
}
