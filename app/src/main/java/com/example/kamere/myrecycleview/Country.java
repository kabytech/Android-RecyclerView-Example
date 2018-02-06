package com.example.kamere.myrecycleview;

/**
 * Created by Kamere on 2/6/2018.
 */

public class Country {
int flagImage;
String countryName;

    public Country(int flagImage, String countryName) {
        this.flagImage = flagImage;
        this.countryName = countryName;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public String getCountryName() {
        return countryName;
    }
}
