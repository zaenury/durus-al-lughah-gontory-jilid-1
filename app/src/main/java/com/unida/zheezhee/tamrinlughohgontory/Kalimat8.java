package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Kalimat8 extends AppCompatActivity {

    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color +  ">" + text + "</font>" + "<font color=" + color +  "></font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimat8);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.text2);
        TextView textView1 = (TextView) findViewById(R.id.text3);
        TextView textView2 = (TextView) findViewById(R.id.text4);
        TextView textView3 = (TextView) findViewById(R.id.text5);
        TextView textView4 = (TextView) findViewById(R.id.text5bawah);
        TextView textView5 = (TextView) findViewById(R.id.text6);
        TextView textView6 = (TextView) findViewById(R.id.text7);
        TextView textView7 = (TextView) findViewById(R.id.text8);
        TextView textView8 = (TextView) findViewById(R.id.text9);
        TextView textView9 = (TextView) findViewById(R.id.text10);
        TextView textView10 = (TextView) findViewById(R.id.text11);
        TextView textView11 = (TextView) findViewById(R.id.text13);
        TextView textView12 = (TextView) findViewById(R.id.text14);
        TextView textView13 = (TextView) findViewById(R.id.text15);
        TextView textView14 = (TextView) findViewById(R.id.text16);
        TextView textView15 = (TextView) findViewById(R.id.text17);
        textView.setTypeface(typeface,5);
        textView1.setTypeface(typeface);
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

        TextView txtView3 = (TextView)findViewById(R.id.text3);
        String name3 = getColoredSpanned("قَلَمٌ", "#000");
        String surName3 = getColoredSpanned("وَاحِدٌ","#f44336");
        txtView3.setText(Html.fromHtml(name3 + " " + surName3));

        TextView txtView4 = (TextView)findViewById(R.id.text4);
        String name4 = getColoredSpanned("قَلَمَانِ", "#000");
        String surName4 = getColoredSpanned("اثْنَانِ","#f44336");
        txtView4.setText(Html.fromHtml(name4 + " " + surName4));

        TextView txtView5 = (TextView)findViewById(R.id.text5);
        String name5 = getColoredSpanned("ثَلَاثَةُ", "#f44336");
        String surName5 = getColoredSpanned("أَقْلَامٍ","#000");
        txtView5.setText(Html.fromHtml(name5 + " " + surName5));

        TextView txtView5bawah = (TextView)findViewById(R.id.text5bawah);
        String name5bawah = getColoredSpanned("أَرْبَعَةُ", "#f44336");
        String surName5bawah = getColoredSpanned("أَقْلَامٍ","#000");
        txtView5bawah.setText(Html.fromHtml(name5bawah + " " + surName5bawah));

        TextView txtView6 = (TextView)findViewById(R.id.text6);
        String name6 = getColoredSpanned("خَمْسَةُ", "#f44336");
        String surName6 = getColoredSpanned("أَقْلَامٍ","#000");
        txtView6.setText(Html.fromHtml(name6 + " " + surName6));

        TextView txtView7 = (TextView)findViewById(R.id.text7);
        String name7 = getColoredSpanned("سِتَّةُ", "#f44336");
        String surName7 = getColoredSpanned("أَقْلَامٍ","#000");
        txtView7.setText(Html.fromHtml(name7 + " " + surName7));

        TextView txtView8 = (TextView)findViewById(R.id.text8);
        String name8 = getColoredSpanned("سَبْعَةُ", "#f44336");
        String surName8 = getColoredSpanned("أَقْلَامٍ","#000");
        txtView8.setText(Html.fromHtml(name8 + " " + surName8));

        TextView txtView9 = (TextView)findViewById(R.id.text9);
        String name9 = getColoredSpanned("ثَمَانِيَةُ", "#f44336");
        String surName9 = getColoredSpanned("أَقْلَامٍ","#000");
        txtView9.setText(Html.fromHtml(name9 + " " + surName9));

        TextView txtView10 = (TextView)findViewById(R.id.text10);
        String name10 = getColoredSpanned("تِسْعَةُ", "#f44336");
        String surName10 = getColoredSpanned("أَقْلَامٍ","#000");
        txtView10.setText(Html.fromHtml(name10 + " " + surName10));

        TextView txtView11 = (TextView)findViewById(R.id.text11);
        String name11 = getColoredSpanned("عَشَرَةُ", "#f44336");
        String surName11 = getColoredSpanned("أَقْلَامٍ","#000");
        txtView11.setText(Html.fromHtml(name11 + " " + surName11));

        TextView txtView13 = (TextView)findViewById(R.id.text13);
        String name13 = getColoredSpanned("الْحَنَفِيَّةُ أَمَامَ الْبِئْرِ", "#000");
        txtView13.setText(Html.fromHtml(name13));

        TextView txtView14 = (TextView)findViewById(R.id.text14);
        String name14 = getColoredSpanned("وَرَاءَ الْمَنْزِلِ حَوْضٌ لِلْأَسْمَاكِ", "#000");
        txtView14.setText(Html.fromHtml(name14));

        TextView txtView15 = (TextView)findViewById(R.id.text15);
        String name15 = getColoredSpanned("الْبَقَرَةُ فِي الزَّرِيْبَةِ", "#000");
        txtView15.setText(Html.fromHtml(name15));

        TextView txtView16 = (TextView)findViewById(R.id.text16);
        String name16 = getColoredSpanned("لِيْ فِرْجَوْنَ", "#000");
        String surName16 = getColoredSpanned("انِ اثْنَانِ","#f44336");
        txtView16.setText(Html.fromHtml(name16 +surName16));

        TextView txtView17 = (TextView)findViewById(R.id.text17);
        String name17 = getColoredSpanned("هُنَاكَ بَيْتٌ, لِلْبَيْتِ", "#000");
        String surName17 = getColoredSpanned("ثَلَاثَةُ","#f44336");
        String plus17 = getColoredSpanned("أَبْوَابٍ, وَرَاءَ الْبَيْتِ بُسْتَانٌ فِيْهِ كُوْخٌ", "#000");
        String plus1717 = getColoredSpanned("وَاحِدٌ", "#f44336");
        String plus171717 = getColoredSpanned(", لَهُ سَقْفَ", "#000");
        String oke17 = getColoredSpanned("انِ", "#f44336");
        String oke1717 = getColoredSpanned("عَلَى", "#000");
        String oke171717 = getColoredSpanned("أَرْبَعَةِ", "#f44336");
        String fix17 = getColoredSpanned("أَعْمِدَةٍ, فِيْ ذٰلِكَ الْكُوْخِ ثَوْرٌ وَبَقَرَتَ", "#000");
        String fix1717 = getColoredSpanned("انِ", "#f44336");
        String fix171717 = getColoredSpanned("عِجْلَا", "#000");
        String fine17 = getColoredSpanned("نِ", "#f44336");
        txtView17.setText(Html.fromHtml(name17 + " " + surName17 + " " + plus17 + " " + plus1717 + plus171717 + oke17 + " " + oke1717 + " " + oke171717 + " " + fix17 + fix1717 + " " + fix171717 + fine17));

        Button button1next = (Button) findViewById(R.id.button8menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan8.class);
                startActivity(i);
            }
        });
    }
}


