package com.unida.zheezhee.tamrinlughohgontory;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Tentang extends AppCompatActivity {

    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.tentang);
    }
}
