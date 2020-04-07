package com.unida.zheezhee.tamrinlughohgontory;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main);

        String customFont = "usmani.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.judul);
        textView.setTypeface(typeface);

        Button pelajaran1 = (Button) findViewById(R.id.pelajaran1);
        pelajaran1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 1", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), Keterangan1.class);
                startActivity(i);
            }
        });
        Button pelajaran2 = (Button) findViewById(R.id.pelajaran2);
        pelajaran2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 2", Toast.LENGTH_LONG).show();
                Intent j = new Intent(getApplicationContext(), Keterangan2.class);
                startActivity(j);
            }
        });
        Button pelajaran3 = (Button) findViewById(R.id.pelajaran3);
        pelajaran3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 3", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan3.class);
                startActivity(k);
            }
        });
        Button pelajaran4 = (Button) findViewById(R.id.pelajaran4);
        pelajaran4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 4", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan4.class);
                startActivity(k);
            }
        });
        Button pelajaran5 = (Button) findViewById(R.id.pelajaran5);
        pelajaran5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 5", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan5.class);
                startActivity(k);
            }
        });
        Button pelajaran6 = (Button) findViewById(R.id.pelajaran6);
        pelajaran6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 6", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan6.class);
                startActivity(k);
            }
        });
        Button pelajaran7 = (Button) findViewById(R.id.pelajaran7);
        pelajaran7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 7", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan7.class);
                startActivity(k);
            }
        });
        Button pelajaran8 = (Button) findViewById(R.id.pelajaran8);
        pelajaran8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 8", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan8.class);
                startActivity(k);
            }
        });
        Button pelajaran9 = (Button) findViewById(R.id.pelajaran9);
        pelajaran9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 9", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan9.class);
                startActivity(k);
            }
        });
        Button pelajaran10 = (Button) findViewById(R.id.pelajaran10);
        pelajaran10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 10", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan10.class);
                startActivity(k);
            }
        });
        Button pelajaran11 = (Button) findViewById(R.id.pelajaran11);
        pelajaran11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 11", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan11.class);
                startActivity(k);
            }
        });
        Button pelajaran12 = (Button) findViewById(R.id.pelajaran12);
        pelajaran12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Pelajaran ke 12", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Keterangan12.class);
                startActivity(k);
            }
        });
        Button latihan = (Button) findViewById(R.id.latihan);
        latihan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "LATIHAN", Toast.LENGTH_LONG).show();
                Intent k = new Intent(getApplicationContext(), Latihan.class);
                startActivity(k);
            }
        });
    }
    public void clickExit(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do yout want to exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
                //MainActivity.this.finish();
                //System.exit(0);
                //exit(0);
                //close();
                //moveTaskToBack(true);
                //Intent intent = new Intent(getApplicationContext(), Welcomescreen.class);
                //startActivity(intent);
                //onDestroy();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onBackPressed() {
        //exit dari aplikasi dengan konfirmasi AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Apakah anda ingin keluar?");
        builder.setCancelable(true);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
                //System.exit(0);
                //moveTaskToBack(true);
                //onDestroy();
                //Intent intent = new Intent(getApplicationContext(), Welcomescreen.class);
                //startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(getApplicationContext(), "Menu Rating dipilih", Toast.LENGTH_LONG).show();
                try {
                    Intent menu1 = rateIntentForUrl("market://details");
                    startActivity(menu1);
                } catch (ActivityNotFoundException e) {
                    Intent menu1 = rateIntentForUrl("https://play.google.com/store/apps/details");
                    startActivity(menu1);
                }
                break;
            case R.id.menu2:
                Toast.makeText(getApplicationContext(), "Menu Tentang dipilih", Toast.LENGTH_LONG).show();
                Intent menu2 = new Intent(getApplicationContext(), Tentang.class);
                startActivity(menu2);
                return true;
            case R.id.menu3:
                Toast.makeText(getApplicationContext(), "Menu Saran dipilih", Toast.LENGTH_LONG).show();
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"adhiimzaenury@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "TAMRIN LUGHOH Pengaduan Keluhan/Saran");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Keluhan / Saran saya adalah:");
                startActivity(emailIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
    private Intent rateIntentForUrl(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getPackageName())));
        int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
        if (Build.VERSION.SDK_INT >= 21)
        {
            flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        }
        else
        {
            //noinspection deprecation
            flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
        }
        intent.addFlags(flags);
        return intent;
    }
}