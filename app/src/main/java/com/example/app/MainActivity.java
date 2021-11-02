package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buscamos el campo que tiene id username en activity_main
        username = findViewById(R.id.username);
        //buscamos el campo que tiene id pw en activity_main
        pw = findViewById(R.id.pw);

    }

    public void btnEventoIngresar(View v) {
        if (username.getText().toString().equals("elias") && pw.getText().toString().equals("7991")) {
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
    }

}

