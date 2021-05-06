package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView dice1;
    MediaPlayer sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        dice1 = findViewById(R.id.dice1);
        sound = MediaPlayer.create(this,R.raw.dice_sound);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNumber = random.nextInt(6);
                switch (randomNumber){
                    case 0:
                        dice1.setImageResource(R.drawable.dice1);
                        sound.start();
                        break;

                    case 1:
                        dice1.setImageResource(R.drawable.dice2);
                        sound.start();
                        break;

                    case 2:
                        dice1.setImageResource(R.drawable.dice3);
                        sound.start();
                        break;


                    case 3:
                        dice1.setImageResource(R.drawable.dice4);
                        sound.start();
                        break;


                    case 4:
                        dice1.setImageResource(R.drawable.dice5);
                        sound.start();
                        break;


                    case 5:
                        dice1.setImageResource(R.drawable.dice6);
                        sound.start();
                        break;



                }


            }
        });
    }
}