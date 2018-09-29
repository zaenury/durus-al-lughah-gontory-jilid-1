package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Percakapan3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.percakapan3);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.kata1);
        TextView textView3 = (TextView) findViewById(R.id.kata2);
        TextView textView5 = (TextView) findViewById(R.id.kata4);
        TextView textView6 = (TextView) findViewById(R.id.kata5);
        TextView textView7 = (TextView) findViewById(R.id.kata6);
        TextView textView9 = (TextView) findViewById(R.id.kata8);
        TextView textView10 = (TextView) findViewById(R.id.kata9);
        TextView textView11 = (TextView) findViewById(R.id.kata10);
        TextView textView13 = (TextView) findViewById(R.id.kata12);
        TextView textView14 = (TextView) findViewById(R.id.kata13);
        TextView textView15 = (TextView) findViewById(R.id.kata14);
        TextView textView17 = (TextView) findViewById(R.id.kata16);
        TextView textView18 = (TextView) findViewById(R.id.kata17);
        TextView textView19 = (TextView) findViewById(R.id.kata18);
        TextView textView21 = (TextView) findViewById(R.id.kata20);
        TextView textView22 = (TextView) findViewById(R.id.kata21);
        TextView textView23 = (TextView) findViewById(R.id.kata22);
        TextView textView24 = (TextView) findViewById(R.id.kata23);
        TextView textView25 = (TextView) findViewById(R.id.kata24);
        textView.setTypeface(typeface,5);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView5.setTypeface(typeface);
        textView6.setTypeface(typeface);
        textView7.setTypeface(typeface);
        textView9.setTypeface(typeface);
        textView10.setTypeface(typeface);
        textView11.setTypeface(typeface);
        textView13.setTypeface(typeface);
        textView14.setTypeface(typeface);
        textView15.setTypeface(typeface);
        textView17.setTypeface(typeface);
        textView18.setTypeface(typeface);
        textView19.setTypeface(typeface);
        textView21.setTypeface(typeface);
        textView22.setTypeface(typeface);
        textView23.setTypeface(typeface);
        textView24.setTypeface(typeface);
        textView25.setTypeface(typeface);

        Button button1next = (Button) findViewById(R.id.button1menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
        });
    }
}

