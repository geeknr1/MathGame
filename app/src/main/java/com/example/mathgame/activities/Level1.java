package com.example.mathgame.activities;
import utilities.ImageResize;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathgame.R;

import java.net.URI;

public class Level1 extends AppCompatActivity {

    private TextView levelTitle;
    private TextView requirements;
    private TextView wrongAnswer;
    private ImageButton nextBtn;
    private ImageButton nextBtn2;
    private ImageButton nextBtn3;
    private ImageView rightTriangle;
    private VideoView videoView;
    private Animation slide_in_right;
    private Animation slide_in_left;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1);

        levelTitle = findViewById(R.id.lvlTitle);
        Typeface titleFont = Typeface.createFromAsset(getAssets(), "fonts/JohnnyFever.otf");
        levelTitle.setTypeface(titleFont);

        requirements = findViewById(R.id.requirement);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/goodtimingbd.otf");
        requirements.setTypeface(customFont);

        rightTriangle = (ImageView) findViewById(R.id.requirement2);

        nextBtn = (ImageButton) findViewById(R.id.nextLevel);
        nextBtn2 = (ImageButton) findViewById(R.id.wrong1);
        nextBtn3 = (ImageButton) findViewById(R.id.wrong2);

        wrongAnswer = (TextView) findViewById(R.id.wrongAnswer);
        videoView = (VideoView) findViewById(R.id.videoLesson);

        videoView.setVisibility(View.INVISIBLE);
        slide_in_right = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        slide_in_left = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);

        resizeImage2(rightTriangle);

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
    public void startActivity(){
        startActivity(new Intent(Level1.this, Level2.class));
    }

    public void showWrongAnswer(){
        wrongAnswer.setVisibility(View.VISIBLE);
        wrongAnswer.startAnimation(slide_in_left);
    }

    public void showVideo(){
        videoView.setVisibility(View.VISIBLE);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pytagora);
        videoView.setVideoURI(uri);
        videoView.startAnimation(slide_in_right); // to start animation when needed
        videoView.start();
    }

    public void spinImage(View view){
        view.animate().rotationBy(360f).setDuration(500).start();
    }
}
