package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView charPlace;
    RatingBar rateStars;
    String answerValue;
    TextView resultrate;

    Animation charanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultrate= findViewById(R.id.titleresult);
        charPlace = findViewById(R.id.imageView);
        rateStars = findViewById(R.id.ratingstar);
        charanim = AnimationUtils.loadAnimation(this, R.anim.charanim);

        charPlace.startAnimation(charanim);



        rateStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                answerValue = String.valueOf((int) (rateStars.getRating()));
                if(answerValue.equals("1")){
                    charPlace.setImageResource(R.drawable.star1);
                    charPlace.startAnimation(charanim);
                    resultrate.setText("Poor!");
                }
                else if (answerValue.equals("2")){
                    charPlace.setImageResource(R.drawable.star2);
                    charPlace.startAnimation(charanim);
                    resultrate.setText("Just So So!");
                }
                else if (answerValue.equals("3")){
                    charPlace.setImageResource(R.drawable.star3);
                    charPlace.startAnimation(charanim);
                    resultrate.setText("Not Bad!");
                }
                else if (answerValue.equals("4")){
                    charPlace.setImageResource(R.drawable.star4);
                    charPlace.startAnimation(charanim);
                    resultrate.setText("Good Job!");
                }
                else if (answerValue.equals("5")){
                    charPlace.setImageResource(R.drawable.star5);
                    charPlace.startAnimation(charanim);
                    resultrate.setText("Amazing!");
                }
                else{
                    Toast.makeText(getApplicationContext(), "No Point" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
