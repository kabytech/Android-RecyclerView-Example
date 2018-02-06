package com.example.kamere.myrecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kamere on 2/6/2018.
 */


public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.myViewHolder> {

    Context cntx;
    List<Country> countryList;

    public CountryAdapter(Context cntx, List<Country> countryList) {
        this.cntx = cntx;
        this.countryList = countryList;
    }

    @Override
    public CountryAdapter.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(cntx);
        View view = inflater.inflate(R.layout.country_list, null);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryAdapter.myViewHolder holder, int position) {

        Country country = countryList.get(position);
        holder.countryName.setText(country.getCountryName());
        holder.flag.setImageDrawable(cntx.getResources().getDrawable(country.getFlagImage()));

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
  ImageView flag;
  TextView countryName;
       public myViewHolder(View itemView) {
            super(itemView);
            flag = (ImageView)itemView.findViewById(R.id.simpleImageView);
            countryName = (TextView)itemView.findViewById(R.id.simpleTextView);


        }
    }
}
