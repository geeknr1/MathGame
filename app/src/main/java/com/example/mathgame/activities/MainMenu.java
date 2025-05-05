package com.example.mathgame.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathgame.R;

public class MainMenu extends AppCompatActivity {
    private VideoView videoMath;
    private Button menu;
    private Button theory;
    private Button practice;
    private Button memes;
    private Button mathHistory;
    private TextView nameGame;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        videoMath = findViewById(R.id.backgroundMath);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.soundtrack);
        videoMath.setVideoURI(uri);
        videoMath.start();

        nameGame = findViewById(R.id.gameName);
        Typeface titleFont = Typeface.createFromAsset(getAssets(),"fonts/JohnnyFever.otf");
        nameGame.setTypeface(titleFont);

        menu=findViewById(R.id.test);
        memes=findViewById(R.id.memesMath);

        videoMath.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this, Menu.class));
            }
        });

        memes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainMenu.this, MathMemes.class));
            }
        });
    }

    @Override
    protected void onPostResume(){
        videoMath.resume();
        super.onPostResume();
    }

    @Override
    protected void onRestart(){
        videoMath.start();
        super.onRestart();
    }

    @Override
    protected void onPause(){
        videoMath.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        videoMath.stopPlayback();
        super.onDestroy();
    }
}
