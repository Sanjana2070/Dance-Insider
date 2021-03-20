package com.example.danceinsider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();
    }

    //For adding images to the cards
    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.pinimg.com/474x/9d/96/da/9d96da96217510e0fba3ddb098ad3fc6.jpg");
        mNames.add("Performances");

        mImageUrls.add("https://i.pinimg.com/originals/4a/11/9b/4a119b2a0be18aac3a231563c12d83ec.jpg");
        mNames.add("Dance Battles");

        mImageUrls.add("https://i.pinimg.com/originals/3e/34/3c/3e343ca9426770bd5ef96328c2400ba3.jpg");
        mNames.add("Competitions");

        mImageUrls.add("https://i.pinimg.com/originals/a1/36/17/a13617d3c7473d8b002d472ae2d910c0.jpg");
        mNames.add("Workshops");

        mImageUrls.add("https://i.pinimg.com/564x/35/ce/66/35ce664b523022575302323035e328e1.jpg");
        mNames.add("Dance Classes");





        initRecyclerView();

    }

    //Initializing Linear layout manager for Recycler view
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }

}