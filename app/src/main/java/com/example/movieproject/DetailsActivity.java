package com.example.movieproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

public class DetailsActivity extends AppCompatActivity {
    private TextView titleTxt,movieRateTxt,movieTimeTxt,movieDateTxt,movieSummaryTxt,movieActorTxt;
    private Movies item;
    private ShapeableImageView pic1;
    private ImageView pic2,backImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        item = (Movies) getIntent().getSerializableExtra("object");
         String title,summary,rating,date,time,actor;
         int posterNormalImage,posterBigImage,id;
        title =(String) getIntent().getStringExtra("title");

//        Movies item = new Movies(id,title,summary,rating);
        titleTxt = (TextView) findViewById(R.id.movieNameTxt);
        pic1 = findViewById(R.id.posterNomallmg);
        pic2 = findViewById(R.id.posterBigImg);
        movieRateTxt = (TextView) findViewById(R.id.movieRateTxt);
        movieActorTxt = (TextView) findViewById(R.id.movieActorInfo);
        movieTimeTxt = (TextView) findViewById(R.id.movieTimeTxr);
        movieDateTxt = (TextView) findViewById(R.id.movieDateTxt);
        movieSummaryTxt = (TextView) findViewById(R.id.moviesSummaryInfo);
        backImage = (ImageView) findViewById(R.id.backImage);
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        titleTxt.setText(item.getTitle());
        movieSummaryTxt.setText(item.getSummary());
        movieRateTxt.setText(item.getRating());
        movieDateTxt.setText(item.getDate());
        movieTimeTxt.setText(item.getTime());
        movieActorTxt.setText(item.getActor());
        pic2.setImageResource(item.getPosterBigImage());
        pic1.setImageResource(item.getPosterNormalImage());

    }
}