package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AppsActivity extends AppCompatActivity {
    private Button btnAbrirOutlook, btnAbrirSykpe, btnAbrirBing;
    private String urlOutlook = "https://outlook.live.com/owa/";
    private String urlSkype = "https://www.skype.com/es/";
    private String urlBing = "https://www.bing.com/?setlang=es";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
        btnAbrirOutlook = findViewById(R.id.btnAbrirOutlook);
        btnAbrirSykpe=findViewById(R.id.btnAbrirSkype);
        btnAbrirBing = findViewById(R.id.btnAbrirBing);

        btnAbrirOutlook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri linkO = Uri.parse(urlOutlook);
                Intent intentO = new Intent(Intent.ACTION_VIEW, linkO);
                startActivity(intentO);
            }
        });

        btnAbrirSykpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri linkS = Uri.parse(urlSkype);
                Intent intentS = new Intent(Intent.ACTION_VIEW, linkS);
                startActivity(intentS);
            }
        });

        btnAbrirBing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri linkB = Uri.parse(urlBing);
                Intent intentB = new Intent(Intent.ACTION_VIEW,linkB);
                startActivity(intentB);
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