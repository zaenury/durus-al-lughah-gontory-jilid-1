package com.unida.zheezhee.tamrinlughohgontory;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class Bab11 extends AppCompatActivity {
    private Button btnPlay;
    private Button btnPlay2;
    private Button btnPlay3;
    private Button btnPlay4;
    private Button btnPlay5;
    private Button btnPlay6;
    private Button btnPlay7;
    private Button btnPlay8;
    private Button btnPlay9;
    private MediaPlayer mp;
    private MediaPlayer mp2;
    private MediaPlayer mp3;
    private MediaPlayer mp4;
    private MediaPlayer mp5;
    private MediaPlayer mp6;
    private MediaPlayer mp7;
    private MediaPlayer mp8;
    private MediaPlayer mp9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bab11);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.btnPLAY);
        TextView textView3 = (TextView) findViewById(R.id.btnPLAY2);
        TextView textView4 = (TextView) findViewById(R.id.btnPLAY3);
        TextView textView5 = (TextView) findViewById(R.id.btnPLAY4);
        TextView textView6 = (TextView) findViewById(R.id.btnPLAY5);
        TextView textView7 = (TextView) findViewById(R.id.btnPLAY6);
        TextView textView8 = (TextView) findViewById(R.id.btnPLAY7);
        TextView textView9 = (TextView) findViewById(R.id.btnPLAY8);
        TextView textView10 = (TextView) findViewById(R.id.btnPLAY9);
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

        mp  = new MediaPlayer();
        mp2  = new MediaPlayer();
        mp3  = new MediaPlayer();
        mp4  = new MediaPlayer();
        mp5  = new MediaPlayer();
        mp6  = new MediaPlayer();
        mp7  = new MediaPlayer();
        mp8  = new MediaPlayer();
        mp9  = new MediaPlayer();

        btnPlay     = (Button)findViewById(R.id.btnPLAY);
        btnPlay2     = (Button)findViewById(R.id.btnPLAY2);
        btnPlay3     = (Button)findViewById(R.id.btnPLAY3);
        btnPlay4     = (Button)findViewById(R.id.btnPLAY4);
        btnPlay5     = (Button)findViewById(R.id.btnPLAY5);
        btnPlay6     = (Button)findViewById(R.id.btnPLAY6);
        btnPlay7     = (Button)findViewById(R.id.btnPLAY7);
        btnPlay8     = (Button)findViewById(R.id.btnPLAY8);
        btnPlay9     = (Button)findViewById(R.id.btnPLAY9);

        stateAwal();
        btnPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play();
                btnPlay.setEnabled(false);
            }
        });
        stateAwal2();
        btnPlay2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play2();
                btnPlay2.setEnabled(false);
            }
        });
        stateAwal3();
        btnPlay3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play3();
                btnPlay3.setEnabled(false);
            }
        });
        stateAwal4();
        btnPlay4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play4();
                btnPlay4.setEnabled(false);
            }
        });
        stateAwal5();
        btnPlay5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play5();
                btnPlay5.setEnabled(false);
            }
        });
        stateAwal6();
        btnPlay6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play6();
                btnPlay6.setEnabled(false);
            }
        });
        stateAwal7();
        btnPlay7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play7();
                btnPlay7.setEnabled(false);
            }
        });
        stateAwal8();
        btnPlay8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play8();
                btnPlay8.setEnabled(false);
            }
        });
        stateAwal9();
        btnPlay9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                play9();
                btnPlay9.setEnabled(false);
            }
        });

        Button button1next = (Button) findViewById(R.id.button11kalimat);
        button1next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Kalimat11.class);
                startActivity(i);
            }
        });
    }

    public void stateAwal(){
        btnPlay.setEnabled(true);
    }
    public void stateAwal2(){
        btnPlay2.setEnabled(true);
    }
    public void stateAwal3(){
        btnPlay3.setEnabled(true);
    }
    public void stateAwal4(){
        btnPlay4.setEnabled(true);
    }
    public void stateAwal5(){
        btnPlay5.setEnabled(true);
    }
    public void stateAwal6(){
        btnPlay6.setEnabled(true);
    }
    public void stateAwal7(){
        btnPlay7.setEnabled(true);
    }
    public void stateAwal8(){
        btnPlay8.setEnabled(true);
    }
    public void stateAwal9(){
        btnPlay9.setEnabled(true);
    }

    private void play(){
        mp=MediaPlayer.create(this, R.raw.bustaanun);
        try{
            mp.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }
    private void play2(){
        mp2=MediaPlayer.create(this, R.raw.miftaahun);
        try{
            mp2.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp2.start();
        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp2) {
                stateAwal2();
            }
        });
    }
    private void play3(){
        mp3=MediaPlayer.create(this, R.raw.kuflun);
        try{
            mp3.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp3.start();
        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp3) {
                stateAwal3();
            }
        });
    }
    private void play4(){
        mp4=MediaPlayer.create(this, R.raw.darroojatun);
        try{
            mp4.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp4.start();
        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp4) {
                stateAwal4();
            }
        });
    }
    private void play5(){
        mp5=MediaPlayer.create(this, R.raw.misbaahun);
        try{
            mp5.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp5.start();
        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp5) {
                stateAwal5();
            }
        });
    }
    private void play6(){
        mp6=MediaPlayer.create(this, R.raw.jarosun);
        try{
            mp6.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp6.start();
        mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp6) {
                stateAwal6();
            }
        });
    }
    private void play7(){
        mp7=MediaPlayer.create(this, R.raw.nahrun);
        try{
            mp7.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp7.start();
        mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp7) {
                stateAwal7();
            }
        });
    }
    private void play8(){
        mp8=MediaPlayer.create(this, R.raw.samaaun);
        try{
            mp8.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp8.start();
        mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp8) {
                stateAwal8();
            }
        });
    }
    private void play9(){
        mp9=MediaPlayer.create(this, R.raw.sajadatun);
        try{
            mp9.prepare();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        mp9.start();
        mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp9) {
                stateAwal9();
            }
        });
    }
}


