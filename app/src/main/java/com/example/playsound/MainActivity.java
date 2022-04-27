package com.example.playsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void buttonTapped(View view){
        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resouceId = getResources().getIdentifier(ourId, "raw", "com.example.playsound");

        MediaPlayer mplayer = MediaPlayer.create(this, resouceId);
        mplayer. start();

        Log.i("button tapped", ourId);

    }
}