package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Percakapan4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.percakapan4);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        TextView textView3 = (TextView) findViewById(R.id.text5);
        TextView textView4 = (TextView) findViewById(R.id.text6);
        TextView textView5 = (TextView) findViewById(R.id.text7);
        TextView textView6 = (TextView) findViewById(R.id.text8);
        TextView textView7 = (TextView) findViewById(R.id.text9);
        TextView textView8 = (TextView) findViewById(R.id.text10);
        TextView textView9 = (TextView) findViewById(R.id.text11);
        TextView textView10 = (TextView) findViewById(R.id.text12);
        TextView textView11 = (TextView) findViewById(R.id.text13);
        TextView textView12 = (TextView) findViewById(R.id.text14);
        TextView textView13 = (TextView) findViewById(R.id.text15);
        textView2.setTypeface(typeface,5);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);
        textView5.setTypeface(typeface);
        textView6.setTypeface(typeface);
        textView7.setTypeface(typeface);
        textView8.setTypeface(typeface);
        textView9.setTypeface(typeface);
        textView10.setTypeface(typeface);
        textView11.setTypeface(typeface);
        textView12.setTypeface(typeface);
        textView13.setTypeface(typeface);

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

