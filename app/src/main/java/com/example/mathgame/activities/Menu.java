package com.example.mathgame.activities;
import static android.view.View.VISIBLE;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathgame.R;

public class Menu extends AppCompatActivity {
    private TextView gameTitle;
    private ImageView square;
    private ImageView rectangle;
    private ImageView circle;
    private ImageView cube;
    private ImageView paralelipiped;
    private ImageView pyramid;

    private ImageView algebraOne;
    private ImageView algebraTwo;

    private Animation slide_left;
    private Animation slide_right;
    private Animation slide_upward;
    private Animation slide_downward;
    private Animation fade_in;

    private Button backToMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        gameTitle = findViewById(R.id.gameTitle);
        Typeface gameTitleFont = Typeface.createFromAsset(getAssets(), "fonts/JohnnyFever.otf");
        gameTitle.setTypeface(gameTitleFont);

        Button nextBtn = (Button) findViewById(R.id.startGame);
        backToMainMenu = findViewById(R.id.backToMainMenu);

        square = (ImageView) findViewById(R.id.square);
        rectangle = (ImageView) findViewById(R.id.rectangle);
        circle = (ImageView) findViewById(R.id.circle);
        cube = (ImageView) findViewById(R.id.cube);
        paralelipiped = (ImageView) findViewById(R.id.paralelipiped);
        pyramid = (ImageView) findViewById(R.id.pyramid);
        algebraOne = (ImageView) findViewById(R.id.agebra1);
        algebraTwo = (ImageView) findViewById(R.id.algebra2);

        slide_left = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        slide_right = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        slide_downward = AnimationUtils.loadAnimation(this, R.anim.slide_in_down);
        slide_upward = AnimationUtils.loadAnimation(this, R.anim.slide_in_up);
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        showImage1();
        showImage2();
        showImage3();
        showImage4();
        showImage5();
        showImage6();
        showImage7();
        showImage8();

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, Level1.class));
            }
        });

        backToMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, MainMenu.class));
            }
        });


    }

    public void showImage1(){
        square.postDelayed(()->square.setVisibility(VISIBLE), 1000);
        square.startAnimation(slide_left);
    }

    public void showImage2(){
        rectangle.postDelayed(()->rectangle.setVisibility(VISIBLE), 1000);
        rectangle.startAnimation(slide_right);
    }

    public void showImage3(){
        circle.postDelayed(()->circle.setVisibility(VISIBLE), 1000);
        circle.startAnimation(slide_upward);
    }

    public void showImage4(){
        cube.postDelayed(()->cube.setVisibility(VISIBLE), 1000);
        cube.startAnimation(slide_downward);
    }
    public void showImage5(){
        paralelipiped.postDelayed(()->paralelipiped.setVisibility(VISIBLE), 1000);
        paralelipiped.startAnimation(fade_in);
    }

    public void showImage6(){
        pyramid.postDelayed(()->pyramid.setVisibility(VISIBLE), 1000);
        pyramid.startAnimation(fade_in);
    }

    public void showImage7(){
        algebraOne.postDelayed(()->algebraOne.setVisibility(VISIBLE), 1000);
        algebraOne.startAnimation(slide_right);
    }

    public void showImage8(){
        algebraTwo.postDelayed(()->algebraTwo.setVisibility(VISIBLE), 1000);
        algebraTwo.startAnimation(slide_left);
    }
}
