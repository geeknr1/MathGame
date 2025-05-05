package com.example.mathgame.activities;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import com.example.mathgame.R;

import utilities.ImageResize;

public class Level5 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_5);

        ImageButton nextBtn = (ImageButton) findViewById(R.id.nextLevel);
        Drawable drawable = nextBtn.getDrawable();
        Drawable resizeDrawable = ImageResize.resize(this, drawable, 80, 150);
        nextBtn.setImageDrawable(resizeDrawable);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinImage(view); startActivity(new Intent(Level5.this, Level6.class));
            }
        });
    }

    public void spinImage(View view){
        view.animate().rotationBy(360f).setDuration(500).start();
    }
}