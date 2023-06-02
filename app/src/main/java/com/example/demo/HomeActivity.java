package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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