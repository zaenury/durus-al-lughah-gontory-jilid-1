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

public class Kalimat6 extends AppCompatActivity {
    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color +  ">" + text + "</font>" + "<font color=" + color +  "></font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimat6);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.text2);
        TextView textView2 = (TextView) findViewById(R.id.text3);
        TextView textView3 = (TextView) findViewById(R.id.text4);
        TextView textView4 = (TextView) findViewById(R.id.text5);
        TextView textView5 = (TextView) findViewById(R.id.text6);
        TextView textView6 = (TextView) findViewById(R.id.text7);
        textView.setTypeface(typeface,5);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);
        textView5.setTypeface(typeface);
        textView6.setTypeface(typeface);

        TextView txtView3 = (TextView)findViewById(R.id.text3);
        String name3 = getColoredSpanned("أَنَا", "#f44336");
        String surName3 = getColoredSpanned("أُسْتَاذٌ,","#000");
        String plus3 = getColoredSpanned("لِيْ", "#f44336");
        String plus33 = getColoredSpanned("كِتَابٌ, هٰذَا الْكِتَابُ", "#000");
        String oke3 = getColoredSpanned("لِيْ", "#f44336");
        txtView3.setText(Html.fromHtml(name3+" "+ surName3 +" "+plus3 +" "+ plus33 + " "+oke3));

        TextView txtView4 = (TextView)findViewById(R.id.text4);
        String name4 = getColoredSpanned("أَنْتَ","#f44336");
        String surName4 = getColoredSpanned("تِلْمِيْذٌ,","#000");
        String plus4 = getColoredSpanned("لَكَ", "#f44336");
        String plus44 = getColoredSpanned("كُرَّاسَةٌ, هَلْ هٰذِهِ الْمِسْطَرَةُ", "#000");
        String oke4 = getColoredSpanned("لَكَ", "#f44336");
        String oke44 = getColoredSpanned("؟", "#000");
        txtView4.setText(Html.fromHtml(name4+" "+surName4 +" "+plus4 +" "+ plus44 + " " + oke4 + oke44));

        TextView txtView5 = (TextView)findViewById(R.id.text5);
        String name5 = getColoredSpanned("أَنْتِ","#f44336");
        String surName5 = getColoredSpanned("فَاطِمَةٌ,","#000");
        String plus5 = getColoredSpanned("لَكِ", "#f44336");
        String plus55 = getColoredSpanned("مَنْدِيْلٌ, هٰذَا الْقَلَمُ", "#000");
        String oke5 = getColoredSpanned("لَكِ", "#f44336");
        txtView5.setText(Html.fromHtml(name5+" "+surName5 +" "+plus5 + " " + plus55 + " " + oke5));

        TextView txtView6 = (TextView)findViewById(R.id.text6);
        String name6 = getColoredSpanned("مُحَمَّدٌ وَلَدٌ.","#000");
        String surName6 = getColoredSpanned("هُوَ","#f44336");
        String plus6 = getColoredSpanned("تِلْمِيْذٌ فِي هٰذِهِ الْمَدْرَسَةِ.", "#000");
        String fix6 = getColoredSpanned("لَهُ","#f44336");
        String fix66 = getColoredSpanned("كُرَّاسَةٌ وَمِمْحَاةٌ.","#000");
        txtView6.setText(Html.fromHtml(name6+" "+surName6 +" "+plus6 + " " + fix6 + " " + fix66));

        TextView txtView7 = (TextView)findViewById(R.id.text7);
        String name7 = getColoredSpanned("عَائِشَةُ بِنْتٌ.","#000");
        String surName7 = getColoredSpanned("هِيَ","#f44336");
        String plus7 = getColoredSpanned("تِلْمِيْذَةٌ فِي الْمَدْرَسَةِ الْإِبْتِدَائِيَّةِ.","#000");
        String plus77 = getColoredSpanned("لَهَا","#f44336");
        String fine7 = getColoredSpanned("مَحْفَظَةٌ. هَلْ","#000");
        String fine77 = getColoredSpanned("لَهَا", "#f44336");
        String fix7 = getColoredSpanned("خِزَانَةٌ فِي الْبَيْتِ؟", "#000");
        txtView7.setText(Html.fromHtml(name7+" "+surName7 + " " + plus7 + " " + plus77 + " " + fine7 + " " + fine77 + " " + fix7));

        Button button1next = (Button) findViewById(R.id.button6menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan6.class);
                startActivity(i);
            }
        });
    }
}


