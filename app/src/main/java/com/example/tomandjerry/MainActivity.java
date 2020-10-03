package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Correcting size of Tom.
        ImageView tomImageView = findViewById(R.id.tomImageView);
        tomImageView.animate().scaleX(1.5f).scaleY(1.5f);

//        tomImageView.animate().rotation(3600).setDuration(3000);
//        tomImageView.animate().scaleY(0.5f).scaleX(0.5f).setDuration(3000).rotation(3600);

        //translationX - it's moving on coordinats
        //translationXBy - it's moving on dp , + - right, - left
//        tomImageView.animate().translationXBy(-100).translationYBy(-100).setDuration(3000);


    }

    public void changePicture(View view) {

        ImageView tomImageView = findViewById(R.id.tomImageView);
        ImageView jerryImageView = findViewById(R.id.jerryImageView);


        if (isTomVisible) {
            tomImageView.animate().alpha(0).rotation(tomImageView.getRotation() + 3600).scaleX(0).scaleY(0).setDuration(3000);
            jerryImageView.animate().alpha(1).rotation(jerryImageView.getRotation() + 3600).scaleX(1f).scaleY(1).setDuration(3000);

            isTomVisible = false;
        }
        else{
            tomImageView.animate().alpha(1).rotation(tomImageView.getRotation() + 3600).scaleX(1.5f).scaleY(1.5f).setDuration(3000);
            jerryImageView.animate().alpha(0).rotation(jerryImageView.getRotation() + 3600).scaleX(0).scaleY(0).setDuration(3000);
            isTomVisible = true;
        }

    }
}