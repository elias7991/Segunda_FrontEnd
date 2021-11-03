package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app.api.Datos;
import com.example.app.api.RetrofitUtil;
import com.example.app.api.Usuario;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buscamos el campo que tiene id username en activity_main
        username = (EditText) findViewById(R.id.username);
        //buscamos el campo que tiene id pw en activity_main
        pw = (EditText) findViewById(R.id.pw);
    }

    public void btnEventoIngresar(View v) {
        Call<Datos> callApi = RetrofitUtil.getUsuarioService().obtenerUsuarios();
        callApi.enqueue(new Callback<Datos>() {
            @Override
            public void onResponse(Call<Datos> call, Response<Datos> response) {

                // aqui se obtiene la data de la API
                Usuario[] arrayUsers = response.body().getData();
                // creamos una lista que contendra los nombres de los usuarios
                List usuarios = new ArrayList();
                for (int i=0;i<arrayUsers.length;i++){
                    usuarios.add(arrayUsers[i].getName());
                    System.out.println(arrayUsers[i].getName());
                }
                // si existe un usuario con el username especificado por teclado
                if (usuarios.contains(username.getText().toString())) {
                    //credenciales válidas
                    //de la actividad actual nos dirigimos a PrincipalActivity
                    Intent principalIntent = new Intent(v.getContext(), PrincipalActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("Usuario", username.getText().toString());
                    principalIntent.putExtras(bundle);
                    startActivity(principalIntent);
                    Toast.makeText(MainActivity.this, "Se ha logueado correctamente", Toast.LENGTH_SHORT).show();
                } else {
                    //credenciales inválidas
                    Toast.makeText(MainActivity.this, "Credenciales inválidas", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Datos> call, Throwable t) {
                Log.e("s", t.toString());
            }
        });
/*
        if (username.getText().toString().equals("elias")) {
            //credenciales válidas
            //de la actividad actual nos dirigimos a PrincipalActivity
            Intent principalIntent = new Intent(this, PrincipalActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("Usuario", username.getText().toString());
            principalIntent.putExtras(bundle);
            startActivity(principalIntent);
            Toast.makeText(MainActivity.this, "Se ha logueado correctamente", Toast.LENGTH_SHORT).show();
        } else {
            //credenciales inválidas
            Toast.makeText(MainActivity.this, "Credenciales inválidas", Toast.LENGTH_SHORT).show();
        }
*/
    }

}

