package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kalimat7 extends AppCompatActivity {

    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color +  ">" + text + "</font>" + "<font color=" + color +  "></font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimat7);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.text0);
        TextView textView1 = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text3);
        TextView textView3 = (TextView) findViewById(R.id.text5);
        TextView textView4 = (TextView) findViewById(R.id.text7);
        TextView textView5 = (TextView) findViewById(R.id.text9);
        textView.setTypeface(typeface,5);
        textView1.setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);
        textView5.setTypeface(typeface);

        TextView txtView1 = (TextView)findViewById(R.id.text1);
        String name1 = getColoredSpanned("لِ", "#000");
        String surName1 = getColoredSpanned("ي","#f44336");
        String plus1 = getColoredSpanned("مَنْزِلٌ، مَنْزِلِ", "#000");
        String plus11 = getColoredSpanned("ي", "#f44336");
        String oke1 = getColoredSpanned("فِي الْقَرْيَةِ، فِي مَنْزِلِ", "#000");
        String oke11 = getColoredSpanned("ي", "#f44336");
        String oke111 = getColoredSpanned("مِصْبَاحٌ كَهْرُبَائِيٌّ.", "#000");
        txtView1.setText(Html.fromHtml(name1+ surName1 +" "+plus1 + plus11 + " "+oke1 + oke11 +" "+ oke111));

        TextView txtView3 = (TextView)findViewById(R.id.text3);
        String name3 = getColoredSpanned("يَا مُحَمَّدٌ، هَلْ لَ", "#000");
        String surName3 = getColoredSpanned("كَ","#f44336");
        String plus3 = getColoredSpanned("مِصْبَاحٌ؟ أَيْنَ مِصْبَاحُ", "#000");
        String plus33 = getColoredSpanned("كَ", "#f44336");
        String oke3 = getColoredSpanned("أَ هٰذَا مِصْبَاحُ", "#000");
        String oke33 = getColoredSpanned("كَ", "#f44336");
        String oke333 = getColoredSpanned("هَلْ فِي مِصْبَاحِ", "#000");
        String fix3 = getColoredSpanned("كَ", "#f44336");
        String fix33 = getColoredSpanned("زَيْتٌ؟", "#000");
        txtView3.setText(Html.fromHtml(name3+ surName3 +" "+plus3 + plus33 + " "+oke3 + oke33 +" "+ oke333 + fix3 +" "+ fix33));

        TextView txtView5 = (TextView)findViewById(R.id.text5);
        String name5 = getColoredSpanned("يَا مَرْيَمُ! أَنْتِ تِلْمِيْذَةٌ، لَ", "#000");
        String surName5 = getColoredSpanned("كِ","#f44336");
        String plus5 = getColoredSpanned("كِتَابٌ وَكُرَّاسَةٌ عَلَى مَكْتَبِ", "#000");
        String plus55 = getColoredSpanned("كِ", "#f44336");
        String oke5 = getColoredSpanned("، أَ ذٰلِكَ قَلَمُ", "#000");
        String oke55 = getColoredSpanned("كِ", "#f44336");
        String oke555 = getColoredSpanned("؟ هَلْ فِي مَحْفَظَتِ", "#000");
        String fix5 = getColoredSpanned("كِ", "#f44336");
        String fix55 = getColoredSpanned("مِبْرَاةٌ؟", "#000");
        txtView5.setText(Html.fromHtml(name5+ surName5 +" "+plus5 + plus55 + " "+oke5 + oke55 +" "+ oke555 + fix5 +" "+ fix55));


        TextView txtView7 = (TextView)findViewById(R.id.text7);
        String name7 = getColoredSpanned("حَلِيْمَةٌ خَادِمَةٌ فِي مَنْزِلِ", "#000");
        String surName7 = getColoredSpanned("ي","#f44336");
        String plus7 = getColoredSpanned("، لَ", "#000");
        String plus77 = getColoredSpanned("هَا", "#f44336");
        String oke7 = getColoredSpanned("مِنَشَّةٌ عَلَى الْحَائِطِ، غُرْفَتُ", "#000");
        String oke77 = getColoredSpanned("هَا", "#f44336");
        String oke777 = getColoredSpanned("بِجَانِبِ الْمَطْبَخِ, لَ", "#000");
        String fix7 = getColoredSpanned("هَا", "#f44336");
        String fix77 = getColoredSpanned("سَرِيْرٌ وَصُنْدُوْقٌ فِي غُرْفَتِ", "#000");
        String fix777 = getColoredSpanned("هَا", "#f44336");
        txtView7.setText(Html.fromHtml(name7+ surName7 +" "+plus7 + plus77 + " "+oke7 + oke77 +" "+ oke777 + fix7 +" "+ fix77 + fix777));

        TextView txtView9 = (TextView)findViewById(R.id.text9);
        String name9 = getColoredSpanned("اَلْخَرِيْطَةُ عَلَى الْحَائِطِ، هَلْ عَلَى الحَائِطِ مِسْمَارٌ؟ نَعَمْ, عَلَيْ", "#000");
        String surName9 = getColoredSpanned("هِ","#f44336");
        String plus9 = getColoredSpanned("مِسْمَارٌ. هَلِ التَّقْوِيْمُ مُعَلَّقٌ عَلَى الْمِسْمَارِ؟ نَعَمْ,", "#000");
        String plus99 = getColoredSpanned("هُوَ", "#f44336");
        String oke9 = getColoredSpanned("مُعَلَّقٌ عَلَى الْمِسْمَارِ", "#000");
        txtView9.setText(Html.fromHtml(name9+ surName9 +" "+plus9 + plus99 + " "+ oke9));

        Button button1next = (Button) findViewById(R.id.button7menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan7.class);
                startActivity(i);
            }
        });
    }
}


