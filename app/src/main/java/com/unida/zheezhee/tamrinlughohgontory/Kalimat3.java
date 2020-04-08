package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kalimat3 extends AppCompatActivity {
    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color +  ">" + text + "</font>" + "<font color=" + color +  "></font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.kalimat3);

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

        TextView txtView = (TextView)findViewById(R.id.kata1);
        String name = getColoredSpanned("هٰذَا", "#f44336");
        String surName = getColoredSpanned("حَائِطٌ","#000");
        txtView.setText(Html.fromHtml(name+" "+surName));

        TextView txtView2 = (TextView)findViewById(R.id.kata2);
        String name2 = getColoredSpanned("ذٰلِكَ","#f44336");
        String surName2 = getColoredSpanned("حَائِطٌ","#000");
        txtView2.setText(Html.fromHtml(name2+" "+surName2));

        TextView txtView3 = (TextView)findViewById(R.id.kata3);
        String name3 = getColoredSpanned("هٰذِهِ", "#f44336");
        String surName3 = getColoredSpanned("خَرِيْطَ","#000");
        String plus3 = getColoredSpanned("ةٌ", "#f44336");
        txtView3.setText(Html.fromHtml(name3+" "+surName3 + plus3));

        TextView txtView4 = (TextView)findViewById(R.id.kata4);
        String name4 = getColoredSpanned("تِلْكَ","#f44336");
        String surName4 = getColoredSpanned("خَرِيْطَ","#000");
        String plus4 = getColoredSpanned("ةٌ", "#f44336");
        txtView4.setText(Html.fromHtml(name4+" "+surName4 + plus4));

        TextView txtView5 = (TextView)findViewById(R.id.kata5);
        String name5 = getColoredSpanned("هٰذِهِ","#f44336");
        String surName5 = getColoredSpanned("مِبْرَا","#000");
        String plus5 = getColoredSpanned("ةٌ", "#f44336");
        txtView5.setText(Html.fromHtml(name5+" "+surName5 + plus5));

        TextView txtView6 = (TextView)findViewById(R.id.kata6);
        String name6 = getColoredSpanned("تِلْكَ","#f44336");
        String surName6 = getColoredSpanned("مِبْرَا","#000");
        String plus6 = getColoredSpanned("ةٌ", "#f44336");
        txtView6.setText(Html.fromHtml(name6+" "+surName6 + plus6));

        TextView txtView7 = (TextView)findViewById(R.id.kata7);
        String name7 = getColoredSpanned("هٰذَا","#f44336");
        String surName7 = getColoredSpanned("مُثَلَّثٌ","#000");
        txtView7.setText(Html.fromHtml(name7+" "+surName7));

        TextView txtView8 = (TextView)findViewById(R.id.kata8);
        String name8 = getColoredSpanned("ذٰلِكَ","#f44336");
        String surName8 = getColoredSpanned("مُثَلَّثٌ","#000");
        txtView8.setText(Html.fromHtml(name8+" "+surName8));

        TextView txtView9 = (TextView)findViewById(R.id.kata9);
        String name9 = getColoredSpanned("هٰذَا","#f44336");
        String surName9 = getColoredSpanned("فِرْجَارٌ","#000");
        txtView9.setText(Html.fromHtml(name9+" "+surName9));

        TextView txtView10 = (TextView)findViewById(R.id.kata10);
        String name10 = getColoredSpanned("ذٰلِكَ","#f44336");
        String surName10 = getColoredSpanned("فِرْجَارٌ","#000");
        txtView10.setText(Html.fromHtml(name10+" "+surName10));

        TextView txtView11 = (TextView)findViewById(R.id.kata11);
        String name11 = getColoredSpanned("هٰذِهِ","#f44336");
        String surName11 = getColoredSpanned("مِنْقَلَ","#000");
        String plus11 = getColoredSpanned("ةٌ", "#f44336");
        txtView11.setText(Html.fromHtml(name11+" "+surName11 + plus11));

        TextView txtView12 = (TextView)findViewById(R.id.kata12);
        String name12 = getColoredSpanned("تِلْكَ","#f44336");
        String surName12 = getColoredSpanned("مِنْقَلَ","#000");
        String plus12 = getColoredSpanned("ةٌ", "#f44336");
        txtView12.setText(Html.fromHtml(name12+" "+surName12 + plus12));

        TextView txtView13 = (TextView)findViewById(R.id.kata13);
        String name13 = getColoredSpanned("هٰذَا","#f44336");
        String surName13 = getColoredSpanned("قَلَمُ حِبْرٍ","#000");
        txtView13.setText(Html.fromHtml(name13+" "+surName13));

        TextView txtView14 = (TextView)findViewById(R.id.kata14);
        String name14 = getColoredSpanned("ذٰلِكَ","#f44336");
        String surName14 = getColoredSpanned("قَلَمُ حِبْرٍ","#000");
        txtView14.setText(Html.fromHtml(name14+" "+surName14));

        TextView txtView15 = (TextView)findViewById(R.id.kata15);
        String name15 = getColoredSpanned("هٰذَا","#f44336");
        String surName15 = getColoredSpanned("مُؤَشِّرٌ","#000");
        txtView15.setText(Html.fromHtml(name15+" "+surName15));

        TextView txtView16 = (TextView)findViewById(R.id.kata16);
        String name16 = getColoredSpanned("ذٰلِكَ","#f44336");
        String surName16 = getColoredSpanned("مُؤَشِّرٌ","#000");
        txtView16.setText(Html.fromHtml(name16+" "+surName16));

        Button button1next = (Button) findViewById(R.id.button3menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan3.class);
                startActivity(i);
            }
        });
    }
}

