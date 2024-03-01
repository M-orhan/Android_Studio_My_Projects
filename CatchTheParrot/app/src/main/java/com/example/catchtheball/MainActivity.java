package com.example.catchtheball;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView counterTextView;
    ImageView insectImage;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView counterTextView =(TextView)findViewById(R.id.counter_text_view);
        ImageView imageView=(ImageView)findViewById(R.id.imageview);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int counter = Integer.parseInt(counterTextView.getText().toString());
                counter++;
                counterTextView.setText(String.valueOf(counter));
            }
        });

        handler.post(runnable);

    }
    Handler handler=new Handler();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            int x = new Random().nextInt(getResources().getDisplayMetrics().widthPixels);
            int y = new Random().nextInt(getResources().getDisplayMetrics().heightPixels);


            ImageView insectImage = findViewById(R.id.imageview);
            insectImage.setX(x);
            insectImage.setY(y);


            handler.postDelayed(this, 800);

        }
    };
}








