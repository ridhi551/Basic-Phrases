package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
//import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {


    public void playPhrase(View v){
        Button choosePhrase = (Button) v ;

        Log.i("BUTTON TAG::" , choosePhrase.getTag().toString());


         MediaPlayer mediaPlayer ;
         mediaPlayer = MediaPlayer.create(this , getResources().getIdentifier(choosePhrase.getTag().toString(), "raw", getPackageName()));
         mediaPlayer.start();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}