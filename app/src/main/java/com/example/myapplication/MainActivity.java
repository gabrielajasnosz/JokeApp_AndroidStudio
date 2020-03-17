package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
        //public List jokes=new ArrayList();
        public String[] jokes=new String[6];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jokes[0] =getResources().getString(R.string.joke1);
        jokes[1] =getResources().getString(R.string.joke2);
        jokes[2] =getResources().getString(R.string.joke3);
        jokes[3] =getResources().getString(R.string.joke4);
        jokes[4] =getResources().getString(R.string.joke5);
        jokes[5] =getResources().getString(R.string.joke6);


    }

    public void generateRandomJoke(View view) {

        TextView text=findViewById(R.id.fJoke);
        Random generator = new Random();
        int a=generator.nextInt(6);
        text.setText(jokes[a]);

    }
}
