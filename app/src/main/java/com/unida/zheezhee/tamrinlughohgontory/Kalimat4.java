package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Kalimat4 extends AppCompatActivity {
    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.kalimat4);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.kata1);
        TextView textView3 = (TextView) findViewById(R.id.kata2);
        TextView textView4 = (TextView) findViewById(R.id.kata3);
        TextView textView5 = (TextView) findViewById(R.id.kata4);
        TextView textView6 = (TextView) findViewById(R.id.kata5);
        TextView textView7 = (TextView) findViewById(R.id.kata6);
        TextView textView8 = (TextView) findViewById(R.id.kata7);
        TextView textView9 = (TextView) findViewById(R.id.kata8);
        TextView textView10 = (TextView) findViewById(R.id.kata9);
        TextView textView11 = (TextView) findViewById(R.id.kata10);
        TextView textView12 = (TextView) findViewById(R.id.kata11);
        TextView textView13 = (TextView) findViewById(R.id.kata12);
        TextView textView14 = (TextView) findViewById(R.id.kata13);
        TextView textView15 = (TextView) findViewById(R.id.kata14);
        TextView textView16 = (TextView) findViewById(R.id.kata15);
        TextView textView17 = (TextView) findViewById(R.id.kata16);
        TextView textView18 = (TextView) findViewById(R.id.kata17);
        TextView textView19 = (TextView) findViewById(R.id.kata18);
        TextView textView20 = (TextView) findViewById(R.id.kata19);
        TextView textView21 = (TextView) findViewById(R.id.kata20);
        TextView textView22 = (TextView) findViewById(R.id.kata21);
        TextView textView23 = (TextView) findViewById(R.id.kata22);
        TextView textView24 = (TextView) findViewById(R.id.kata23);
        TextView textView25 = (TextView) findViewById(R.id.kata24);
        textView.setTypeface(typeface,5);
        textView2.setTypeface(typeface);
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
        textView14.setTypeface(typeface);
        textView15.setTypeface(typeface);
        textView16.setTypeface(typeface);
        textView17.setTypeface(typeface);
        textView18.setTypeface(typeface);
        textView19.setTypeface(typeface);
        textView20.setTypeface(typeface);
        textView21.setTypeface(typeface);
        textView22.setTypeface(typeface);
        textView23.setTypeface(typeface);
        textView24.setTypeface(typeface);
        textView25.setTypeface(typeface);

        TextView txtView = (TextView)findViewById(R.id.kata1);
        String name = getColoredSpanned("هُنَا", "#f44336");
        String surName = getColoredSpanned("مَدْرَسَةٌ","#000");
        txtView.setText(Html.fromHtml(name+" "+surName));

        TextView txtView2 = (TextView)findViewById(R.id.kata2);
        String name2 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName2 = getColoredSpanned("مَدْرَسَةٌ","#000");
        txtView2.setText(Html.fromHtml(name2+" "+surName2));

        TextView txtView3 = (TextView)findViewById(R.id.kata3);
        String name3 = getColoredSpanned("هُنَا", "#f44336");
        String surName3 = getColoredSpanned("فَصْلٌ","#000");
        txtView3.setText(Html.fromHtml(name3+" "+surName3));

        TextView txtView4 = (TextView)findViewById(R.id.kata4);
        String name4 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName4 = getColoredSpanned("فَصْلٌ","#000");
        txtView4.setText(Html.fromHtml(name4+" "+surName4));

        TextView txtView5 = (TextView)findViewById(R.id.kata5);
        String name5 = getColoredSpanned("هُنَا","#f44336");
        String surName5 = getColoredSpanned("سَلَّةٌ","#000");
        txtView5.setText(Html.fromHtml(name5+" "+surName5));

        TextView txtView6 = (TextView)findViewById(R.id.kata6);
        String name6 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName6 = getColoredSpanned("سَلَّةٌ","#000");
        txtView6.setText(Html.fromHtml(name6+" "+surName6));

        TextView txtView7 = (TextView)findViewById(R.id.kata7);
        String name7 = getColoredSpanned("هُنَا","#f44336");
        String surName7 = getColoredSpanned("جِدَارٌ","#000");
        txtView7.setText(Html.fromHtml(name7+" "+surName7));

        TextView txtView8 = (TextView)findViewById(R.id.kata8);
        String name8 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName8 = getColoredSpanned("جِدَارٌ","#000");
        txtView8.setText(Html.fromHtml(name8+" "+surName8));

        TextView txtView9 = (TextView)findViewById(R.id.kata9);
        String name9 = getColoredSpanned("هُنَا","#f44336");
        String surName9 = getColoredSpanned("سَقْفٌ","#000");
        txtView9.setText(Html.fromHtml(name9+" "+surName9));

        TextView txtView10 = (TextView)findViewById(R.id.kata10);
        String name10 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName10 = getColoredSpanned("سَقْفٌ","#000");
        txtView10.setText(Html.fromHtml(name10+" "+surName10));

        TextView txtView11 = (TextView)findViewById(R.id.kata11);
        String name11 = getColoredSpanned("هُنَا","#f44336");
        String surName11 = getColoredSpanned("أَرْضٌ","#000");
        txtView11.setText(Html.fromHtml(name11+" "+surName11));

        TextView txtView12 = (TextView)findViewById(R.id.kata12);
        String name12 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName12 = getColoredSpanned("أَرْضٌ","#000");
        txtView12.setText(Html.fromHtml(name12+" "+surName12));

        TextView txtView13 = (TextView)findViewById(R.id.kata13);
        String name13 = getColoredSpanned("هُنَا","#f44336");
        String surName13 = getColoredSpanned("مَجَلَّةٌ","#000");
        txtView13.setText(Html.fromHtml(name13+" "+surName13));

        TextView txtView14 = (TextView)findViewById(R.id.kata14);
        String name14 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName14 = getColoredSpanned("مَجَلَّةٌ","#000");
        txtView14.setText(Html.fromHtml(name14+" "+surName14));

        TextView txtView15 = (TextView)findViewById(R.id.kata15);
        String name15 = getColoredSpanned("هُنَا","#f44336");
        String surName15 = getColoredSpanned("مَسْجِدٌ","#000");
        txtView15.setText(Html.fromHtml(name15+" "+surName15));

        TextView txtView16 = (TextView)findViewById(R.id.kata16);
        String name16 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName16 = getColoredSpanned("مَسْجِدٌ","#000");
        txtView16.setText(Html.fromHtml(name16+" "+surName16));

        TextView txtView17 = (TextView)findViewById(R.id.kata17);
        String name17 = getColoredSpanned("هُنَا","#f44336");
        String surName17 = getColoredSpanned("فِنَاءٌ","#000");
        txtView17.setText(Html.fromHtml(name17+" "+surName17));

        TextView txtView18 = (TextView)findViewById(R.id.kata18);
        String name18 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName18 = getColoredSpanned("فِنَاءٌ","#000");
        txtView18.setText(Html.fromHtml(name18+" "+surName18));

        TextView txtView19 = (TextView)findViewById(R.id.kata19);
        String name19 = getColoredSpanned("هُنَا","#f44336");
        String surName19 = getColoredSpanned("مِمْسَحَةٌ","#000");
        txtView19.setText(Html.fromHtml(name19+" "+surName19));

        TextView txtView20 = (TextView)findViewById(R.id.kata20);
        String name20 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName20 = getColoredSpanned("مِمْسَحَةٌ","#000");
        txtView20.setText(Html.fromHtml(name20+" "+surName20));

        TextView txtView21 = (TextView)findViewById(R.id.kata21);
        String name21 = getColoredSpanned("هُنَا","#f44336");
        String surName21 = getColoredSpanned("تَقْوِيْمٌ","#000");
        txtView21.setText(Html.fromHtml(name21+" "+surName21));

        TextView txtView22 = (TextView)findViewById(R.id.kata22);
        String name22 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName22 = getColoredSpanned("تَقْوِيْمٌ","#000");
        txtView22.setText(Html.fromHtml(name22+" "+surName22));

        TextView txtView23 = (TextView)findViewById(R.id.kata23);
        String name23 = getColoredSpanned("هُنَا","#f44336");
        String surName23 = getColoredSpanned("سَاحَةٌ","#000");
        txtView23.setText(Html.fromHtml(name23+" "+surName23));

        TextView txtView24 = (TextView)findViewById(R.id.kata24);
        String name24 = getColoredSpanned("هُنَاكَ","#f44336");
        String surName24 = getColoredSpanned("سَاحَةٌ","#000");
        txtView24.setText(Html.fromHtml(name24+" "+surName24));

        Button button1next = (Button) findViewById(R.id.button4menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan4.class);
                startActivity(i);
            }
        });
    }

}

