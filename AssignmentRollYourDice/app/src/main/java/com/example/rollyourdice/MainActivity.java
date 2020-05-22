package com.example.rollyourdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDicy1;
    private ImageView imageViewDicy2;
    private Button button;
    private Random myRandomNumber = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDicy1 = findViewById(R.id.imageView1);
        imageViewDicy2 = findViewById(R.id.imageView2);
        button = findViewById(R.id.mybtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollOurDice1();
                rollOurDice2();
            }
        });

    }
    private void rollOurDice1(){

        int myRanNumber = myRandomNumber.nextInt(6) + 1;
        switch (myRanNumber){
            case 1:
                imageViewDicy1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicy1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicy1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicy1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy1.setImageResource(R.drawable.dice6);
                break;

        }


    }
    private void rollOurDice2(){

        int myRanNumber = myRandomNumber.nextInt(6) + 1;
        switch (myRanNumber){
            case 1:
                imageViewDicy2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicy2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicy2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicy2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy2.setImageResource(R.drawable.dice6);
                break;

        }


    }
}
