package com.example.kamere.myrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //a list to store all the products
    List<Country> countryList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.simpleRecyclerView);
        recyclerView.setHasFixedSize(true);
   //     GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        //initializing the productlist
       countryList = new ArrayList<>();

        //creating recyclerview adapter
        CountryAdapter adapter = new CountryAdapter(this, countryList);



        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
        //adding some items to our list
        countryList.add(
                new Country(R.drawable.afghanistan,"Afghanistan"));
        countryList.add(new Country(R.drawable.kenya,"Kenya"));
        countryList.add(new Country(R.drawable.portugal,"Portugal"));
        countryList.add(new Country(R.drawable.states,"States"));
        countryList.add(new Country(R.drawable.ukraine,"Ukraine"));
        countryList.add(new Country(R.drawable.egypt,"Egypt"));
        countryList.add(new Country(R.drawable.ghana,"Ghana"));
        countryList.add(new Country(R.drawable.india,"India"));
        countryList.add(new Country(R.drawable.israel,"Israel"));
        countryList.add(new Country(R.drawable.japan,"Japan"));
        countryList.add(new Country(R.drawable.algeria,"Algeria"));
        countryList.add(new Country(R.drawable.australia,"Australia"));
        countryList.add(new Country(R.drawable.belgium,"Belgium"));




    }



}