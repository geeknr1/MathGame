package com.example.mathgame.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathgame.R;

public class MathMemes extends AppCompatActivity {
    private ImageView one;
    private ImageView two;
    private ImageView three;
    private ImageView four;
    private ImageView five;
    private ImageView six;
    private ImageView seven;
    private ImageView eight;
    private ImageView nine;

    private ImageView ten;
    private ImageView eleven;
    private ImageView twelve;
    private ImageView thirteen;
    private ImageView fourteen;
    private ImageView fifteen;
    private ImageView sixteen;
    private ImageView seventeen;
    private ImageView eighteen;
    private ImageView nineteen;

    private ImageView twenty;
    private ImageView twentyone;
    private ImageView twentytwo;
    private ImageView twentythree;
    private ImageView twentyfour;
    private ImageView twentyfive;
    private ImageView twentysix;
    private ImageView twentyseven;
    private ImageView twentyeight;
    private ImageView twentynine;

    private ImageView thirty;
    private ImageView thirtyone;
    private ImageView thirtytwo;
    private ImageView thirtythree;
    private ImageView thirtyfour;
    private ImageView thirtyfive;
    private ImageView thirtysix;
    private ImageView thirtyseven;
    private ImageView thirtyeight;
    private ImageView thirtynine;

    private ImageView forty;
    private ImageView fortyone;
    private ImageView fortytwo;
    private ImageView fortythree;
    private ImageView fortyfour;
    private ImageView fortyfive;
    private ImageView fortysix;
    private ImageView fortyseven;
    private ImageView fortyeight;
    private ImageView fortynine;

    private ImageView fifty;
    private ImageView fiftyone;
    private ImageView fiftytwo;
    private ImageView fiftythree;
    private ImageView fiftyfour;
    private ImageView fiftyfive;
    private ImageView fiftysix;
    private ImageView fiftyseven;
    private ImageView fiftyeight;
    private ImageView fiftynine;
    private ImageView sixty;
    private TextView memesTitle;
    private Button backToMainMenu;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.math_memes);

        memesTitle = findViewById(R.id.welcomememes);
        Typeface typeTitle = Typeface.createFromAsset(getAssets(), "fonts/JohnnyFever.otf");
        memesTitle.setTypeface(typeTitle);

        backToMainMenu = findViewById(R.id.backToMainMenu);
        backToMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MathMemes.this, MainMenu.class));
            }
        });

        one = findViewById(R.id.img1);
        two = findViewById(R.id.img2);
        three = findViewById(R.id.img3);
        four = findViewById(R.id.img4);
        five = findViewById(R.id.img5);
        six = findViewById(R.id.img6);
        seven = findViewById(R.id.img7);
        eight = findViewById(R.id.img8);
        nine = findViewById(R.id.img9);
        ten = findViewById(R.id.img10);

        eleven = findViewById(R.id.img11);
        twelve = findViewById(R.id.img12);
        thirteen = findViewById(R.id.img13);
        fourteen = findViewById(R.id.img14);
        fifteen = findViewById(R.id.img15);
        sixteen = findViewById(R.id.img16);
        seventeen = findViewById(R.id.img17);
        eighteen = findViewById(R.id.img18);
        nineteen = findViewById(R.id.img19);
        twenty = findViewById(R.id.img20);

        twentyone = findViewById(R.id.img21);
        twentytwo = findViewById(R.id.img22);
        twentythree = findViewById(R.id.img23);
        twentyfour = findViewById(R.id.img24);
        twentyfive = findViewById(R.id.img25);
        twentysix = findViewById(R.id.img26);
        twentyseven = findViewById(R.id.img27);
        twentyeight = findViewById(R.id.img28);
        twentynine = findViewById(R.id.img29);
        thirty = findViewById(R.id.img30);

        thirtyone = findViewById(R.id.img31);
        thirtytwo = findViewById(R.id.img32);
        thirtythree = findViewById(R.id.img33);
        thirtyfour = findViewById(R.id.img34);
        thirtyfive = findViewById(R.id.img35);
        thirtysix = findViewById(R.id.img36);
        thirtyseven = findViewById(R.id.img37);
        thirtyeight = findViewById(R.id.img38);
        thirtynine = findViewById(R.id.img39);
        forty = findViewById(R.id.img40);

        fortyone = findViewById(R.id.img41);
        fortytwo = findViewById(R.id.img42);
        fortythree = findViewById(R.id.img43);
        fortyfour = findViewById(R.id.img44);
        fortyfive = findViewById(R.id.img45);
        fortysix = findViewById(R.id.img46);
        fortyseven = findViewById(R.id.img47);
        fortyeight = findViewById(R.id.img48);
        fortynine = findViewById(R.id.img49);
        fifty = findViewById(R.id.img50);

        fiftyone = findViewById(R.id.img51);
        fiftytwo = findViewById(R.id.img52);
        fiftythree = findViewById(R.id.img53);
        fiftyfour = findViewById(R.id.img54);
        fiftyfive = findViewById(R.id.img55);
        fiftysix = findViewById(R.id.img56);
        fiftyseven = findViewById(R.id.img57);
        fiftyeight = findViewById(R.id.img58);
        fiftynine = findViewById(R.id.img59);
        sixty = findViewById(R.id.img60);

        one.setVisibility(View.VISIBLE);
        two.setVisibility(View.VISIBLE);
        three.setVisibility(View.VISIBLE);
        four.setVisibility(View.VISIBLE);
        five.setVisibility(View.VISIBLE);
        six.setVisibility(View.VISIBLE);
        seven.setVisibility(View.VISIBLE);
        eight.setVisibility(View.VISIBLE);
        nine.setVisibility(View.VISIBLE);
        ten.setVisibility(View.VISIBLE);

        eleven.setVisibility(View.VISIBLE);
        twelve.setVisibility(View.VISIBLE);
        thirteen.setVisibility(View.VISIBLE);
        fourteen.setVisibility(View.VISIBLE);
        fifteen.setVisibility(View.VISIBLE);
        sixteen.setVisibility(View.VISIBLE);
        seventeen.setVisibility(View.VISIBLE);
        eighteen.setVisibility(View.VISIBLE);
        nineteen.setVisibility(View.VISIBLE);

        twenty.setVisibility(View.VISIBLE);
        twentyone.setVisibility(View.VISIBLE);
        twentytwo.setVisibility(View.VISIBLE);
        twentythree.setVisibility(View.VISIBLE);
        twentyfour.setVisibility(View.VISIBLE);
        twentyfive.setVisibility(View.VISIBLE);
        twentysix.setVisibility(View.VISIBLE);
        twentyseven.setVisibility(View.VISIBLE);
        twentyeight.setVisibility(View.VISIBLE);
        twentynine.setVisibility(View.VISIBLE);

        thirty.setVisibility(View.VISIBLE);
        thirtyone.setVisibility(View.VISIBLE);
        thirtytwo.setVisibility(View.VISIBLE);
        thirtythree.setVisibility(View.VISIBLE);
        thirtyfour.setVisibility(View.VISIBLE);
        thirtyfive.setVisibility(View.VISIBLE);
        thirtysix.setVisibility(View.VISIBLE);
        thirtyseven.setVisibility(View.VISIBLE);
        thirtyeight.setVisibility(View.VISIBLE);
        thirtynine.setVisibility(View.VISIBLE);

        forty.setVisibility(View.VISIBLE);
        fortyone.setVisibility(View.VISIBLE);
        fortytwo.setVisibility(View.VISIBLE);
        fortythree.setVisibility(View.VISIBLE);
        fortyfour.setVisibility(View.VISIBLE);
        fortyfive.setVisibility(View.VISIBLE);
        fortysix.setVisibility(View.VISIBLE);
        fortyseven.setVisibility(View.VISIBLE);
        fortyeight.setVisibility(View.VISIBLE);
        fortynine.setVisibility(View.VISIBLE);

        fifty.setVisibility(View.VISIBLE);
        fiftyone.setVisibility(View.VISIBLE);
        fiftytwo.setVisibility(View.VISIBLE);
        fiftythree.setVisibility(View.VISIBLE);
        fiftyfour.setVisibility(View.VISIBLE);
        fiftyfive.setVisibility(View.VISIBLE);
        fiftysix.setVisibility(View.VISIBLE);
        fiftyseven.setVisibility(View.VISIBLE);
        fiftyeight.setVisibility(View.VISIBLE);
        fiftynine.setVisibility(View.VISIBLE);
        sixty.setVisibility(View.VISIBLE);
    }
}
