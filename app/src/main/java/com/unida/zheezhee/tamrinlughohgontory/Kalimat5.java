package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kalimat5 extends AppCompatActivity {
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
        setContentView(R.layout.kalimat5);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text4);
        TextView textView3 = (TextView) findViewById(R.id.text5);
        TextView textView4 = (TextView) findViewById(R.id.text6);
        TextView textView5 = (TextView) findViewById(R.id.text8);
        TextView textView6 = (TextView) findViewById(R.id.text9);
        TextView textView7 = (TextView) findViewById(R.id.text10);
        TextView textView8 = (TextView) findViewById(R.id.text11);
        TextView textView9 = (TextView) findViewById(R.id.text13);
        TextView textView10 = (TextView) findViewById(R.id.text14);
        TextView textView11 = (TextView) findViewById(R.id.text15);
        TextView textView12 = (TextView) findViewById(R.id.text16);
        TextView textView13 = (TextView) findViewById(R.id.text19);
        TextView textView14 = (TextView) findViewById(R.id.text20);
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

        TextView txtView4 = (TextView)findViewById(R.id.text4);
        String name4 = getColoredSpanned("السَّبُّوْرَةُ وَالْكُرْسِيُّ", "#000");
        String surName4 = getColoredSpanned("فِي","#f44336");
        String plus4 = getColoredSpanned("الْفَصْ", "#000");
        String plus44 = getColoredSpanned("لِ", "#f44336");
        txtView4.setText(Html.fromHtml(name4+" "+ surName4 +" "+plus4 + plus44));

        TextView txtView5 = (TextView)findViewById(R.id.text5);
        String name5 = getColoredSpanned("الْكُرَّاسَةُ","#000");
        String surName5 = getColoredSpanned("عَلَى","#f44336");
        String plus5 = getColoredSpanned("الْمَكْتَ", "#000");
        String plus55 = getColoredSpanned("بِ", "#f44336");
        txtView5.setText(Html.fromHtml(name5+" "+surName5 +" "+plus5 + plus55));

        TextView txtView6 = (TextView)findViewById(R.id.text6);
        String name6 = getColoredSpanned("الْمَكْتَبُ","#000");
        String surName6 = getColoredSpanned("عَلَى","#f44336");
        String plus6 = getColoredSpanned("الْأَرْ", "#000");
        String plus66 = getColoredSpanned("ضِ", "#f44336");
        txtView6.setText(Html.fromHtml(name6+" "+surName6 +" "+plus6 + plus66));

        TextView txtView8 = (TextView)findViewById(R.id.text8);
        String name8 = getColoredSpanned("السَّقْفُ","#000");
        String surName8 = getColoredSpanned("فَوْقَ","#f44336");
        String plus8 = getColoredSpanned("الْمَكْتَ", "#000");
        String plus88 = getColoredSpanned("بِ", "#f44336");
        txtView8.setText(Html.fromHtml(name8+" "+surName8 +" "+plus8 + plus88));

        TextView txtView9 = (TextView)findViewById(R.id.text9);
        String name9 = getColoredSpanned("الْمَكْتَبُ","#000");
        String surName9 = getColoredSpanned("تَحْتَ","#f44336");
        String plus9 = getColoredSpanned("السَّقْ", "#000");
        String plus99 = getColoredSpanned("فِ", "#f44336");
        txtView9.setText(Html.fromHtml(name9+" "+surName9 +" "+plus9 + plus99));

        TextView txtView10 = (TextView)findViewById(R.id.text10);
        String name10 = getColoredSpanned("الْأَرْضُ","#000");
        String surName10 = getColoredSpanned("تَحْتَ","#f44336");
        String plus10 = getColoredSpanned("السَّقْ", "#000");
        String plus1010 = getColoredSpanned("فِ", "#f44336");
        txtView10.setText(Html.fromHtml(name10+" "+surName10 +" "+plus10 + plus1010));

        TextView txtView11 = (TextView)findViewById(R.id.text11);
        String name11 = getColoredSpanned("الْأَرْضُ وَالْمَكْتَبُ","#000");
        String surName11 = getColoredSpanned("تَحْتَ","#f44336");
        String plus11 = getColoredSpanned("السَّقْ", "#000");
        String plus1111 = getColoredSpanned("فِ", "#f44336");
        txtView11.setText(Html.fromHtml(name11+" "+surName11 +" "+plus11 + plus1111));

        TextView txtView13 = (TextView)findViewById(R.id.text13);
        String name13 = getColoredSpanned("الْأُسْتَاذُ","#000");
        String surName13 = getColoredSpanned("فِي","#f44336");
        String plus13 = getColoredSpanned("الْفَصْ", "#000");
        String plus1313 = getColoredSpanned("لِ", "#f44336");
        txtView13.setText(Html.fromHtml(name13+" "+surName13 +" "+plus13 + plus1313));

        TextView txtView14 = (TextView)findViewById(R.id.text14);
        String name14 = getColoredSpanned("وَالتِّلْمِيْذُ","#000");
        String surName14 = getColoredSpanned("فِي","#f44336");
        String plus14 = getColoredSpanned("الْفَصْ", "#000");
        String plus1414 = getColoredSpanned("لِ", "#f44336");
        txtView14.setText(Html.fromHtml(name14+" "+surName14 +" "+plus14 + plus1414));

        TextView txtView15 = (TextView)findViewById(R.id.text15);
        String name15 = getColoredSpanned("الْأُسْتَاذُ","#000");
        String surName15 = getColoredSpanned("أَمَامَ","#f44336");
        String plus15 = getColoredSpanned("التِّلْمِيْ", "#000");
        String plus1515 = getColoredSpanned("ذِ", "#f44336");
        txtView15.setText(Html.fromHtml(name15+" "+surName15 +" "+plus15 + plus1515));


        TextView txtView16 = (TextView)findViewById(R.id.text16);
        String name16 = getColoredSpanned("وَالتِّلْمِيْذُ","#000");
        String surName16 = getColoredSpanned("أَمَامَ","#f44336");
        String plus16 = getColoredSpanned("الْأُسْتَا", "#000");
        String plus1616 = getColoredSpanned("ذِ", "#f44336");
        txtView16.setText(Html.fromHtml(name16+" "+surName16 +" "+plus16 + plus1616));


        TextView txtView19 = (TextView)findViewById(R.id.text19);
        String name19 = getColoredSpanned("الأُسْتَاذُ","#000");
        String surName19 = getColoredSpanned("بَيْنَ","#f44336");
        String plus19 = getColoredSpanned("السَّبُّوْرَ", "#000");
        String plus1919 = getColoredSpanned("ةِ", "#f44336");
        String plus19plus = getColoredSpanned("وَالْمَكْتَ", "#000");
        String plus1919plus = getColoredSpanned("بِ", "#f44336");
        txtView19.setText(Html.fromHtml(name19+" "+surName19 +" "+plus19 + plus1919+" "+plus19plus + plus1919plus));

        TextView txtView20 = (TextView)findViewById(R.id.text20);
        String name20 = getColoredSpanned("السَّبُّوْرَةُ","#000");
        String surName20 = getColoredSpanned("بَيْنَ","#f44336");
        String plus20 = getColoredSpanned("الأُسْتَا", "#000");
        String plus2020 = getColoredSpanned("ذِ", "#f44336");
        String plus20plus = getColoredSpanned("وَالْحَائِ", "#000");
        String plus2020plus = getColoredSpanned("طِ", "#f44336");
        txtView20.setText(Html.fromHtml(name20+" "+surName20 +" "+plus20 + plus2020+" "+plus20plus + plus2020plus));

        Button button1next = (Button) findViewById(R.id.button5menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan5.class);
                startActivity(i);
            }
        });
    }
}


