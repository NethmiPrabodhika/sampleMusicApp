package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        start = findViewById(R.id.buttonStart);
        stop = findViewById(R.id.buttonStop);

        start.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startService(new Intent(MainActivity.this, MyMusic.class));
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, MyMusic.class));
            }
        });

    }
}

