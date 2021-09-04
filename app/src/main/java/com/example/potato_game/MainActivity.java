package com.example.potato_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Change(View view){

            CheckBox btn=(CheckBox)view;
        Log.i("hi",btn.getTag().toString());


        if(btn.getTag().toString().equals("1")) {
            if(btn.isChecked())
            findViewById(R.id.hat).setVisibility(View.VISIBLE);
            else
                findViewById(R.id.hat).setVisibility(View.INVISIBLE);
        }


        else if(btn.getTag().toString().equals("2")) {
            if(btn.isChecked())
                findViewById(R.id.eyebrows).setVisibility(View.VISIBLE);
            else
                findViewById(R.id.eyebrows).setVisibility(View.INVISIBLE);

        }

        else if(btn.getTag().toString().equals("3")){
            if(btn.isChecked())
                findViewById(R.id.nose).setVisibility(View.VISIBLE);
            else
                findViewById(R.id.nose).setVisibility(View.INVISIBLE);

        }

        else if(btn.getTag().toString().equals("4")) {
            if(btn.isChecked())
                findViewById(R.id.moustaches).setVisibility(View.VISIBLE);
            else
                findViewById(R.id.moustaches).setVisibility(View.INVISIBLE);
        }

        else if(btn.getTag().toString().equals("5")) {
            if(btn.isChecked())
            findViewById(R.id.arms).setVisibility(View.VISIBLE);
            else
            findViewById(R.id.arms).setVisibility(View.INVISIBLE);


        }
        else if(btn.getTag().toString().equals("6")) {
            if(btn.isChecked())
            findViewById(R.id.shoes).setVisibility(View.VISIBLE);
            else
            findViewById(R.id.shoes).setVisibility(View.INVISIBLE);

        }
        else if(btn.getTag().toString().equals("7")){
            if(btn.isChecked())
            findViewById(R.id.eyes).setVisibility(View.VISIBLE);
            else
            findViewById(R.id.eyes).setVisibility(View.INVISIBLE);

        }
        else if(btn.getTag().toString().equals("8")) {
            if(btn.isChecked())
            findViewById(R.id.glasses).setVisibility(View.VISIBLE);
            else
            findViewById(R.id.glasses).setVisibility(View.INVISIBLE);


        }
        else if(btn.getTag().toString().equals("9")) {
            if(btn.isChecked())
            findViewById(R.id.mouth).setVisibility(View.VISIBLE);
            else
                findViewById(R.id.mouth).setVisibility(View.INVISIBLE);

        }
        else if(btn.getTag().toString().equals("10")) {
            if(btn.isChecked())
            findViewById(R.id.ears).setVisibility(View.VISIBLE);
            else
                findViewById(R.id.ears).setVisibility(View.INVISIBLE);
        }

    }



}