package com.example.mathgame.activities;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import com.example.mathgame.R;

import utilities.ImageResize;

public class Level2 extends AppCompatActivity{

    private TextView levelTitle;
    private TextView requirements;
    private TextView wrongAnswer;
    private ImageButton nextBtn;
    private ImageButton nextBtn2;
    private ImageButton nextBtn3;
    private ImageView rightIsoscelesTriangle;

    private Animation slide_upward;
    private Animation slide_downard;

    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_2);

        levelTitle = findViewById(R.id.lvlTitle);
        Typeface titleFont = Typeface.createFromAsset(getAssets(), "fonts/JohnnyFever.otf");
        levelTitle.setTypeface(titleFont);

        requirements = findViewById(R.id.requirement);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/goodtimingbd.otf");
        requirements.setTypeface(customFont);

        rightIsoscelesTriangle = (ImageView) findViewById(R.id.requirement2);

        nextBtn = (ImageButton) findViewById(R.id.nextLevel);
        nextBtn2 = (ImageButton) findViewById(R.id.wrong1);
        nextBtn3 = (ImageButton) findViewById(R.id.wrong2);

        wrongAnswer = (TextView) findViewById(R.id.wrongAnswer);
        videoView = (VideoView) findViewById(R.id.videoLesson2);

        videoView.setVisibility(View.INVISIBLE);
        slide_upward = AnimationUtils.loadAnimation(this, R.anim.slide_in_up);
        slide_downard = AnimationUtils.loadAnimation(this, R.anim.slide_in_down);

        resizeImage2(rightIsoscelesTriangle);

        resizeImage(nextBtn);
        resizeImage(nextBtn2);
        resizeImage(nextBtn3);

        nextBtn.setOnClickListener(view->{startActivity();spinImage(view);});
        nextBtn2.setOnClickListener(view -> {showWrongAnswer();spinImage(view);showVideo();});
        nextBtn3.setOnClickListener(view -> {showWrongAnswer();spinImage(view);showVideo();});
    }

    public void resizeImage(ImageButton buttonImg){
        Drawable drawable = buttonImg.getDrawable();
        Drawable resizeDrawable = ImageResize.resize(this, drawable, 80, 150);
        buttonImg.setImageDrawable(resizeDrawable);
    }

    public void resizeImage2(ImageView img){
        Drawable drawable = img.getDrawable();
        Drawable resizeDrawable = ImageResize.resize(this, drawable, 200, 250);
        img.setImageDrawable(resizeDrawable);
    }

    public void showVideo(){
        videoView.setVisibility(View.VISIBLE);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.trigonometry);
        videoView.startAnimation(slide_upward); // videoView -> startAnimation -> slide_upward
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void startActivity(){
        startActivity(new Intent(Level2.this, Level3.class));
    }

    public void showWrongAnswer(){
        wrongAnswer.setVisibility(View.VISIBLE);
        wrongAnswer.startAnimation(slide_downard);
//        wrongAnswer.startAnimation(fade_in);// echivalentu
    }

    public void spinImage(View view){
        view.animate().rotationBy(360f).setDuration(500).start();
    }
}
