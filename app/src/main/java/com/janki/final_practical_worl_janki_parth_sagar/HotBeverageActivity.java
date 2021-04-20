package com.janki.final_practical_worl_janki_parth_sagar;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HotBeverageActivity extends MenuActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView rv = findViewById(R.id.main_list);
        rv.setLayoutManager(new LinearLayoutManager(this));

//data
        ArrayList<Hot> data = new ArrayList<>();
        data.add(new Hot(1,R.drawable.h1,"Cappuccino", "Cappuccino is a traditional coffee preparation of Italian cuisine, emblem of Italian culture around the world."));
        data.add(new Hot(2,R.drawable.h2,"Latte Macchiato", "Latte macchiato is a hot drink made from espresso, hot milk and milk froth."));
        data.add(new Hot(3,R.drawable.h3,"Espresso", "Espresso is a very full-bodied coffee with a strong aroma."));
        data.add(new Hot(4,R.drawable.h4,"Latte", "Latte is a hot drink made with espresso coffee and steamed milk."));
        data.add(new Hot(5,R.drawable.hotchoc,"Hot Chocolate", "Hot chocolate or Cocoa is a hot drink consisting of chocolate or cocoa powder and sugar with the addition of water or milk."));
        data.add(new Hot(6,R.drawable.h5, "Pumpkin Spice Latte", "Espresso and steamed milk are combined with a blend of pumpkin and traditional fall spice flavors."));

//adapter
        HotAdapter adapter = new HotAdapter(data);

        //set adapter

        rv.setAdapter(adapter);
    }
}