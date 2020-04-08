package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kalimat10 extends AppCompatActivity {

    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color +  ">" + text + "</font>" + "<font color=" + color +  "></font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimat10);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.text2);
        TextView textView1 = (TextView) findViewById(R.id.text3);
        TextView textView2 = (TextView) findViewById(R.id.text4);
        textView.setTypeface(typeface,5);
        textView1.setTypeface(typeface);
        textView2.setTypeface(typeface);

        TextView txtView3 = (TextView)findViewById(R.id.text3);
        String name3 = getColoredSpanned("مَدْرَسَتِيْ فِي الْمَدِيْنَةِ (فِي الْقَرْيَةِ). فِي الْمَدِيْنَةِ", "#000");
        String surName3 = getColoredSpanned("مَدَارِسُ","#f44336");
        String oke3 = getColoredSpanned("كَبِيْرَ","#000");
        String oke33 = getColoredSpanned("ةٌ","#f44336");
        String oke333 = getColoredSpanned(".  وَفِي الْقَرْيَةِ","#000");
        String fix3 = getColoredSpanned("مَدَارِسُ","#f44336");
        String fix33 = getColoredSpanned("صَغِيْرَ","#000");
        String fix333 = getColoredSpanned("ةٌ","#f44336");
        String fine3 = getColoredSpanned(". أَيْنَ مَدْرَسَتُكَ؟ مَدْرَسَتِيْ فِي الْمَدِيْنَةِ. هَلْ مَدْرَسَتُكَ كَبِيْرَةٌ؟","#000");
        txtView3.setText(Html.fromHtml(name3 + " " + surName3 + " " + oke3 + oke33 + oke333 + " " +fix3 + " " + fix33 + fix333 + fine3));

        TextView txtView4 = (TextView)findViewById(R.id.text4);
        String name4 = getColoredSpanned("لَكَ دَرْسُ الْإِنْشَاءِ, إِنْشَاؤُكَ صَحِيْحٌ. أَنْتَ عَالِمٌ, لَكَ ", "#000");
        String surName4 = getColoredSpanned("عُلُوْمٌ","#f44336");
        String oke4 = getColoredSpanned("كَثِيْرَ","#000");
        String oke44 = getColoredSpanned("ةٌ","#f44336");
        String oke444 = getColoredSpanned(". فِيْ إِنْشَائِي خَطَأٌ. أَنَا جَاهِلٌ, لِي","#000");
        String fix4 = getColoredSpanned("عُلُوْمٌ","#f44336");
        String fix44 = getColoredSpanned("قَلِيْلَ","#000");
        String fix444 = getColoredSpanned("ةٌ","#f44336");
        String fine4 = getColoredSpanned(". كَمْ خَطَأً لَكَ فِي الْإِمْلَاءِ؟ لِيْ","#000");
        String fine44 = getColoredSpanned("سِتَّةُ أَخْطَاءٍ","#f44336");
        String fine444 = getColoredSpanned("فِي الْإِمْلَاءِ","#000");
        txtView4.setText(Html.fromHtml(name4 + " " + surName4 + " " + oke4 + oke44 + oke444 + " " +fix4 + " " + fix44 + fix444 + fine4 + " " + fine44 +" "+ fine444));


        Button button1next = (Button) findViewById(R.id.button10menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan10.class);
                startActivity(i);
            }
        });
    }
}


