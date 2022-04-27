package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingActivity extends AppCompatActivity {

   private RatingBar rBar;
   private Button btn;
private TextView tView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
    rBar=(RatingBar) findViewById(R.id.ratingBar);
    btn=(Button)findViewById(R.id.ratingbutton);
    tView=(TextView) findViewById(R.id.textViewrate) ;


    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int noofstars=rBar.getNumStars();
            float rating=rBar.getRating();
            tView.setText(("Rating:"+rating+"/"+noofstars));
        }
    });



    }
}