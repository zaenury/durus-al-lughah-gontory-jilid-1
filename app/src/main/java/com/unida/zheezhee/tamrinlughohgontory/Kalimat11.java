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

public class Kalimat11 extends AppCompatActivity {

    private String getColoredSpanned(String text, String color){
        String input = "<font color=" + color +  ">" + text + "</font>" + "<font color=" + color +  "></font>";
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimat11);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.text2);
        TextView textView1 = (TextView) findViewById(R.id.text3);
        TextView textView2 = (TextView) findViewById(R.id.text4);
        TextView textView3 = (TextView) findViewById(R.id.text6);
        TextView textView4 = (TextView) findViewById(R.id.text8);
        TextView textView5 = (TextView) findViewById(R.id.text10);
        TextView textView6 = (TextView) findViewById(R.id.text12);
        TextView textView7 = (TextView) findViewById(R.id.text14);
        textView.setTypeface(typeface,5);
        textView1.setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);
        textView5.setTypeface(typeface);
        textView6.setTypeface(typeface);
        textView7.setTypeface(typeface);

        TextView txtView3 = (TextView)findViewById(R.id.text3);
        String name3 = getColoredSpanned("لَيْسَ", "#f44336");
        String surName3 = getColoredSpanned("الْأُسْتَاذُ وَرَاءَ التِّلْمِيْذِ بَلْ أَمَامَهُ","#000");
        txtView3.setText(Html.fromHtml(name3 + " " + surName3));

        TextView txtView4 = (TextView)findViewById(R.id.text4);
        String name4 = getColoredSpanned("لَيْسَتِ", "#f44336");
        String surName4 = getColoredSpanned("السَّجَدَ","#000");
        String oke4 = getColoredSpanned("ةُ","#f44336");
        String fix4 = getColoredSpanned("تَحْتَ الْمَكْتَبِ بَلْ عَلَيْهِ","#000");
        txtView4.setText(Html.fromHtml(name4 + " " + surName4 + oke4 +" " + fix4));

        TextView txtView6 = (TextView)findViewById(R.id.text6);
        String name6 = getColoredSpanned("أَنْتَ عَالِمٌ", "#000");
        String surName6 = getColoredSpanned("لَسْتَ","#f44336");
        String oke6 = getColoredSpanned("جَاهِ","#000");
        String fix6 = getColoredSpanned("لاً","#f44336");
        txtView6.setText(Html.fromHtml(name6 + " " + surName6 + " " +oke6 + fix6));

        TextView txtView8 = (TextView)findViewById(R.id.text8);
        String name8 = getColoredSpanned("أَنْتِ تِلْمِيْذَ", "#000");
        String surName8 = getColoredSpanned("ةٌ لَسْتِ","#f44336");
        String oke8 = getColoredSpanned("أُسْتَاذَ","#000");
        String fix8 = getColoredSpanned("ةً","#f44336");
        txtView8.setText(Html.fromHtml(name8 + surName8 + " " + oke8 + fix8));

        TextView txtView10 = (TextView)findViewById(R.id.text10);
        String name10 = getColoredSpanned("ذٰلِكَ الْبَابُ", "#000");
        String surName10 = getColoredSpanned("لَيْسَ","#f44336");
        String oke10 = getColoredSpanned("لَهُ مِفْتَاحٌ, هٰذَا الْمِفْتَاحُ لِلصُّنْدُوْقِ. هَلْ هُوَ لِهٰذَا الْقُفْلِ؟ لَا,","#000");
        String fix10 = getColoredSpanned("لَيْسَ","#f44336");
        String fine10 = getColoredSpanned("لِهٰذَا الْقُفْلِ","#000");
        txtView10.setText(Html.fromHtml(name10 + " " + surName10 + " " + oke10 + " " + fix10 + " " + fine10));

        TextView txtView12 = (TextView)findViewById(R.id.text12);
        String name12 = getColoredSpanned("هٰذَا نَهْرٌ", "#000");
        String surName12 = getColoredSpanned("لَيْسَ","#f44336");
        String oke12 = getColoredSpanned("سَمَاءٌ","#000");
        txtView12.setText(Html.fromHtml(name12 + " " + surName12 +" " + oke12));

        TextView txtView14 = (TextView)findViewById(R.id.text14);
        String name14 = getColoredSpanned("دَرَّاجَةُ أَخِي", "#000");
        String surName14 = getColoredSpanned("لَيْسَ","#f44336");
        String oke14 = getColoredSpanned("لَهَا مِصْبَاحٌ. لَهَا جَرَسٌ وَاحِدٌ","#000");
        txtView14.setText(Html.fromHtml(name14 + " " + surName14 + " " + oke14));

        Button button1next = (Button) findViewById(R.id.button11menuawal);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Percakapan11.class);
                startActivity(i);
            }
        });
    }
}


