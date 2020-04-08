package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kalimat12 extends AppCompatActivity {

    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color +  ">" + text + "</font>" + "<font color=" + color +  "></font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimat12);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.text2);
        TextView textView1 = (TextView) findViewById(R.id.text3);
        TextView textView2 = (TextView) findViewById(R.id.text4);
        TextView textView3 = (TextView) findViewById(R.id.text6);
        TextView textView4 = (TextView) findViewById(R.id.text8);
        textView.setTypeface(typeface,5);
        textView1.setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);

        TextView txtView3 = (TextView)findViewById(R.id.text3);
        String name3 = getColoredSpanned("عَلَى مَقْعَدٍ وَاحِدٍ أَرْبَعَةُ أَوْلَادٍ. كَمْ وَلَدًا عَلَى أَرْبَعَةِ مَقَاعِدَ؟ عَلَيْهَا", "#000");
        String surName3 = getColoredSpanned("سِتَّةَ عَشَرَ","#f44336");
        String oke3 = getColoredSpanned("وَلَ", "#000");
        String oke33 = getColoredSpanned("دًا", "#f44336");
        String oke333 = getColoredSpanned(". كَمْ وَلَدًا عَلَى الْمَقْعَدَيْنِ؟ كَمْ وَلَدًا عَلَى خَمْسَةِ مَقَاعِدَ؟ عَلَيْهَا", "#000");
        String fix3 = getColoredSpanned("عِشْرُوْنَ", "#f44336");
        String fix33 = getColoredSpanned("وَلَ", "#000");
        String fix333 = getColoredSpanned("دًا", "#f44336");
        txtView3.setText(Html.fromHtml(name3 + " " + surName3 + oke3 + oke33 + oke333 + fix3 + " " + fix33 + fix333));

        TextView txtView4 = (TextView)findViewById(R.id.text4);
        String name4 = getColoredSpanned("لَكَ سَاعَةٌ, فِي السَّاعَةِ رَقْمٌ, كَمْ رَقْمًا فِيْهَا؟ فِيْهَا ", "#000");
        String surName4 = getColoredSpanned("اثْنَا عَشَرَ ","#f44336");
        String oke4 = getColoredSpanned("رَقْ", "#000");
        String oke44 = getColoredSpanned("مًا", "#f44336");
        String oke444 = getColoredSpanned(". هَلْ عَلَى الْمُثَلَّثِ رَقْمٌ؟ نَعَمْ عَلَيْهِ رَقْمٌ. هَلْ فِيْ جَيْبِكَ سَاعَةٌ؟ لَا, لَيْسَ فِيْهِ سَاعَةٌ. مَاذَا فِيْ جَيْبِكَ؟ لَيْسَ فِيْ جَيْبِيْ شَيْءٌ.", "#000");
        txtView4.setText(Html.fromHtml(name4 + " " + surName4 + oke4 + oke44 + oke444));

        TextView txtView6 = (TextView)findViewById(R.id.text6);
        String name6 = getColoredSpanned("فِي السُّوْقِ أُنَاسٌ كَثِيْرُوْنَ صَبَاحًا. وَلَيْسَ فِيْهَا إِنْسَانٌ لَيْلًا. هَلْ فِي الْمَكْتَبِ شَخْصٌ صَبَاحًا؟ وَهَلْ فِيْهِ أَحَدٌ لَيْلًا؟", "#000");
        txtView6.setText(Html.fromHtml(name6));

        TextView txtView8 = (TextView)findViewById(R.id.text8);
        String name8 = getColoredSpanned("لَيْسَ فِي ذٰلِكَ الْيَوْمِ دَرْسٌ. هَلْ لَكَ دَرْسُ الطَّبِيْعَةِ؟", "#000");
        txtView8.setText(Html.fromHtml(name8));

        Button button1next = (Button) findViewById(R.id.button12menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan12.class);
                startActivity(i);
            }
        });
    }
}


