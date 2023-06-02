package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    TextView txtIncorrecto;
    EditText edtEmail, edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenciarViews();

    }

    private void validarDatos(String email, String password){
        if (email.equals("alumno")&& password.equals("1234"))
        {
            Toast.makeText(this, "Ingreso correcto", Toast.LENGTH_SHORT).show();
            txtIncorrecto.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(this, HomeActivity.class);

            // intent.putExtra("EXTRA_EMAIL", "");

            startActivity(intent);
        }
        else {
            txtIncorrecto.setVisibility(View.VISIBLE);
        }
    }
    private void referenciarViews(){
        btnLogin = findViewById(R.id.btnLogin);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword  = findViewById(R.id.edtPassword);
        txtIncorrecto = findViewById(R.id.txtIncorrecto);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarDatos(edtEmail.getText().toString(), edtPassword.getText().toString());
            }
        });
    }
}