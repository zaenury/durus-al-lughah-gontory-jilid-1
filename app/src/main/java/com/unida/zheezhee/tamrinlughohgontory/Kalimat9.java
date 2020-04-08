package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kalimat9 extends AppCompatActivity {

    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color +  ">" + text + "</font>" + "<font color=" + color +  "></font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimat9);

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

        TextView txtView3 = (TextView)findViewById(R.id.text3);
        String name3 = getColoredSpanned("مَجَلَّةٌ", "#000");
        String surName3 = getColoredSpanned("وَاحِدَةٌ","#f44336");
        txtView3.setText(Html.fromHtml(name3 + " " + surName3));

        TextView txtView4 = (TextView)findViewById(R.id.text4);
        String name4 = getColoredSpanned("مَجَلَّتَانِ", "#000");
        String surName4 = getColoredSpanned("اثْنَتَانِ","#f44336");
        txtView4.setText(Html.fromHtml(name4 + " " + surName4));

        TextView txtView5 = (TextView)findViewById(R.id.text5);
        String name5 = getColoredSpanned("ثَلَاثُ", "#f44336");
        String surName5 = getColoredSpanned("مَجَلَّاتٍ","#000");
        txtView5.setText(Html.fromHtml(name5 + " " + surName5));

        TextView txtView5bawah = (TextView)findViewById(R.id.text5bawah);
        String name5bawah = getColoredSpanned("أَرْبَعُ", "#f44336");
        String surName5bawah = getColoredSpanned("مَجَلَّاتٍ","#000");
        txtView5bawah.setText(Html.fromHtml(name5bawah + " " + surName5bawah));

        TextView txtView6 = (TextView)findViewById(R.id.text6);
        String name6 = getColoredSpanned("خَمْسُ", "#f44336");
        String surName6 = getColoredSpanned("مَجَلَّاتٍ","#000");
        txtView6.setText(Html.fromHtml(name6 + " " + surName6));

        TextView txtView7 = (TextView)findViewById(R.id.text7);
        String name7 = getColoredSpanned("سِتُّ", "#f44336");
        String surName7 = getColoredSpanned("مَجَلَّاتٍ","#000");
        txtView7.setText(Html.fromHtml(name7 + " " + surName7));

        TextView txtView8 = (TextView)findViewById(R.id.text8);
        String name8 = getColoredSpanned("سَبْعُ", "#f44336");
        String surName8 = getColoredSpanned("مَجَلَّاتٍ","#000");
        txtView8.setText(Html.fromHtml(name8 + " " + surName8));

        TextView txtView9 = (TextView)findViewById(R.id.text9);
        String name9 = getColoredSpanned("ثَمَانِيْ", "#f44336");
        String surName9 = getColoredSpanned("مَجَلَّاتٍ","#000");
        txtView9.setText(Html.fromHtml(name9 + " " + surName9));

        TextView txtView10 = (TextView)findViewById(R.id.text10);
        String name10 = getColoredSpanned("تِسْعُ", "#f44336");
        String surName10 = getColoredSpanned("مَجَلَّاتٍ","#000");
        txtView10.setText(Html.fromHtml(name10 + " " + surName10));

        TextView txtView11 = (TextView)findViewById(R.id.text11);
        String name11 = getColoredSpanned("عَشْرُ", "#f44336");
        String surName11 = getColoredSpanned("مَجَلَّاتٍ","#000");
        txtView11.setText(Html.fromHtml(name11 + " " + surName11));

        TextView txtView13 = (TextView)findViewById(R.id.text13);
        String name13 = getColoredSpanned("أَنَا مُسْلِمٌ, أَنْتَ مُسْلِمٌ, نَحْنُ مُسْلِمَانِ, أَنْتَ مُؤْمِنٌ, وَصَاحِبُكَ مُؤْمِنٌ, وَأَنَا مُؤْمِنٌ, نَحْنُ مُؤْمِنُوْنَ. نَحْنُ مُسْلِمُوْنَ وَمُؤْمِنُوْنَ. أَبُوْكَ مُؤْمِنٌ وَمُسْلِمٌ, أُمُّكَ مُؤْمِنَ", "#000");
        String surName13 = getColoredSpanned("ةٌ", "#f44336");
        String fix13 = getColoredSpanned("وَمُسْلِمَ", "#000");
        String oke13 = getColoredSpanned("ةٌ", "#f44336");
        String fine13 = getColoredSpanned(". أَبُوْكَ وَأُمُّكَ مُؤْمِنَانِ وَمُسْلِمَانِ", "#000");
        txtView13.setText(Html.fromHtml(name13 + surName13 + " " + fix13 + oke13 + fine13));

        Button button1next = (Button) findViewById(R.id.button9menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan9.class);
                startActivity(i);
            }
        });
    }
}


