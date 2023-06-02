package com.example.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class AboutActivity extends AppCompatActivity {

    private Button btnAboutllamar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btnAboutllamar=findViewById(R.id.btnAboutLlamar);
        btnAboutllamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:542954542407"));
                startActivity(intent);
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.itemHome:
                Intent intentH = new Intent(this, HomeActivity.class);
                startActivity(intentH);
                return true;
            case R.id.itemAcercade:
                Intent intentA = new Intent(this, AboutActivity.class);
                startActivity(intentA);
                return true;
            case R.id.itemHerramientas:
                Intent intentB = new Intent(this, AppsActivity.class);
                startActivity(intentB);
                return true;
            case R.id.itemCerrarsesion:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}