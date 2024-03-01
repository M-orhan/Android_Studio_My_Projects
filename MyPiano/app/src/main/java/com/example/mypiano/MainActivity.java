package com.example.mypiano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;

public class MainActivity extends AppCompatActivity  {



    private HorizontalScrollView scrollView;
  SoundPool soundPool;
    private int[] soundIds = new int[24];

  private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14;
  private Button blackbutton1,blackbutton2,blackbutton3,blackbutton4,blackbutton5,blackbutton6,blackbutton7,blackbutton8,blackbutton9,blackbutton10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView=(HorizontalScrollView) findViewById(R.id.scrollView);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        blackbutton1 = findViewById(R.id.blackbutton1);
        blackbutton2 = findViewById(R.id.blackbutton2);
        blackbutton3 = findViewById(R.id.blackbutton3);
        blackbutton4 = findViewById(R.id.blackbutton4);
        blackbutton5 = findViewById(R.id.blackbutton5);
        blackbutton6 = findViewById(R.id.blackbutton6);
        blackbutton7 = findViewById(R.id.blackbutton7);
        blackbutton8 = findViewById(R.id.blackbutton8);
        blackbutton9 = findViewById(R.id.blackbutton9);
        blackbutton10 = findViewById(R.id.blackbutton10);

        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);

        soundPool = new SoundPool(24, AudioManager.STREAM_MUSIC, 0);
        soundIds[0] = soundPool.load(this, R.raw.c3, 1);
        soundIds[1] = soundPool.load(this, R.raw.db1, 1);
        soundIds[2] = soundPool.load(this, R.raw.d3, 1);
        soundIds[3] = soundPool.load(this, R.raw.eb1, 1);
        soundIds[4] = soundPool.load(this, R.raw.e3, 1);
        soundIds[5] = soundPool.load(this, R.raw.f3, 1);
        soundIds[6] = soundPool.load(this, R.raw.gb1, 1);
        soundIds[7] = soundPool.load(this, R.raw.g3, 1);
        soundIds[8] = soundPool.load(this, R.raw.ab1, 1);
        soundIds[9] = soundPool.load(this, R.raw.a3, 1);
        soundIds[10] = soundPool.load(this, R.raw.bb1, 1);
        soundIds[11] = soundPool.load(this, R.raw.b3,1);
        soundIds[12] = soundPool.load(this, R.raw.c4, 1);
        soundIds[13] = soundPool.load(this, R.raw.db2, 1);
        soundIds[14] = soundPool.load(this, R.raw.d4, 1);
        soundIds[15] = soundPool.load(this, R.raw.eb2, 1);
        soundIds[16] = soundPool.load(this, R.raw.e4, 1);
        soundIds[17] = soundPool.load(this, R.raw.f4, 1);
        soundIds[18] = soundPool.load(this, R.raw.gb2, 1);
        soundIds[19] = soundPool.load(this, R.raw.g4, 1);
        soundIds[20] = soundPool.load(this, R.raw.ab2,1);
        soundIds[21] = soundPool.load(this, R.raw.a4, 1);
        soundIds[22] = soundPool.load(this, R.raw.bb2, 1);
        soundIds[23] = soundPool.load(this, R.raw.b4, 1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[0], 1, 1, 0, 0, 1);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[2], 1, 1, 0, 0, 1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[4], 1, 1, 0, 0, 1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {soundPool.play(soundIds[5], 1, 1, 0, 0, 1);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[7], 1, 1, 0, 0, 1);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[9], 1, 1, 0, 0, 1);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[11], 1, 1, 0, 0, 1);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[12], 1, 1, 0, 0, 1);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[14], 1, 1, 0, 0, 1);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[16], 1, 1, 0, 0, 1);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[17], 1, 1, 0, 0, 1);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {soundPool.play(soundIds[19], 1, 1, 0, 0, 1);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {soundPool.play(soundIds[21], 1, 1, 0, 0, 1);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[23], 1, 1, 0, 0, 1);
            }
        });



        blackbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[1], 1, 1, 0, 0, 1);

            }

        });

        blackbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[3], 1, 1, 0, 0, 1);
            }
        });

        blackbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[6], 1, 1, 0, 0, 1);
            }
        });

        blackbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[8], 1, 1, 0, 0, 1);
            }
        });

        blackbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[10], 1, 1, 0, 0, 1);
            }
        });

        blackbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[13], 1, 1, 0, 0, 1);
            }
        });

        blackbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[15], 1, 1, 0, 0, 1);
            }
        });
        blackbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {soundPool.play(soundIds[18], 1, 1, 0, 0, 1);
            }
        });
        blackbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[20], 1, 1, 0, 0, 1);
            }
        });
        blackbutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundIds[22], 1, 1, 0, 0, 1);
            }


        });




    }}


