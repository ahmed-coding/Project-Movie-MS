package com.example.movieproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerNew, recyclerUpComing;
    private RecyclerView.Adapter recyclerNewAdapter, recyclerUpComingAdapter;
    private ArrayList<Movies> movies;
    private ProgressBar loadingProgress1,loadingProgress2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        recyclerNew = (RecyclerView) findViewById(R.id.view1);
        recyclerUpComing = (RecyclerView) findViewById(R.id.view2);
        loadingProgress1 = (ProgressBar) findViewById(R.id.loading1);
        loadingProgress2 = (ProgressBar) findViewById(R.id.loading2);
        loadingProgress1.setVisibility(View.GONE);
        loadingProgress2.setVisibility(View.GONE);
        recyclerNew.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerUpComing.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        movies = new ArrayList<Movies>();
//        (int id,String title, String summary, String rating, String date, String time, String actor, int posterNormalImage, int posterBigImage)
        movies.add(new Movies(5,"12 Angry Men", "A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence.", "8.9", "01 Apr 1957", "96 min","Martin Balsam, John Fiedler, Lee J. Cobb, E.G. Marshall",R.drawable.tt0050083_poster,R.drawable.tt0050083_poster));
        movies.add(new Movies(11, "The Lord of the Rings: The Fellowship of the Ring",  "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle Earth from the Dark Lord Sauron.",  "8.8", "19 Dec 2001", "178 min", "Alan Howard, Noel Appleby, Sean Astin, Sala Baker",R.drawable.tt0120737_screenshot1,R.drawable.tt0120737_screenshot1));
        movies.add(new Movies(8,  "The Lord of the Rings: The Return of the King","Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.", "8.9", "17 Dec 2003", "201 min", "Noel Appleby, Ali Astin, Sean Astin, David Aston",R.drawable.tt0167260_poster,R.drawable.tt0167260_poster));
        movies.add(new Movies(4,"The Dark Knight","When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice.", "9.0", "18 Jul 2008", "152 min", "Christian Bale, Heath Ledger, Aaron Eckhart, Michael Caine",R.drawable.tt0468569_poster,R.drawable.tt0468569_poster));
        movies.add(new Movies(3,"The Godfather: Part II", "The early life and career of Vito Corleone in 1920s New York is portrayed while his son, Michael, expands and tightens his grip on his crime syndicate stretching from Lake Tahoe, Nevada to pre-revolution 1958 Cuba.", "9.0", "20 Dec 1974","202 min", "Al Pacino, Robert Duvall, Diane Keaton, Robert De Niro",R.drawable.tt0071562_poster,R.drawable.tt0071562_poster));
        movies.add(new Movies(2, "The Godfather", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.","9.2", "24 Mar 1972","175 min", "Marlon Brando, Al Pacino, James Caan, Richard S. Castellano",R.drawable.tt0068646_poster,R.drawable.tt0068646_poster));


        recyclerNewAdapter = new AdapterList(movies);
        recyclerUpComingAdapter = new AdapterList(movies);
        recyclerNew.setAdapter(recyclerNewAdapter);
        recyclerUpComing.setAdapter(recyclerUpComingAdapter);


    }
}