package com.project.whackitapp;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity { // Where Program Starts

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void move_mole(View v){        // method event handler to disable a button once its clicked
        ObjectAnimator animation = ObjectAnimator.ofFloat(v, "translationY", 100f);
        animation.setDuration(400);
        animation.start();
        /*if(clicked){
            points ++;
        }*/
    }
    public void popmole(View v){        // method event handler to disable a button once its clicked
        ObjectAnimator animation = ObjectAnimator.ofFloat(v, "translationY", -100f);
        animation.setDuration(400);
        animation.start();

        /*if(clicked){ // adding points if mole clicked
            points ++;
        }
         */
    }

    /*
    while(time){
        int i = randnum();
        if (i =1 ) {
            showmole1();
        }



    }

    public void start_time(){

    }

    public void randshow(){
        Random random = new Random(); //
        array 1-9



    }*/

}