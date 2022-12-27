package com.example.mpgestor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.txtNombre);
        etPassword = (EditText) findViewById(R.id.txtPassword);
    }

    //Metodo para el boton de ingresar
    public void ingresar(View view){
        if(etNombre.getText().toString().equals("Jonathan") && etPassword.getText().toString().equals("abc123")){
            Intent principal = new Intent(this, SegundaActivity.class);
            startActivity(principal);
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}