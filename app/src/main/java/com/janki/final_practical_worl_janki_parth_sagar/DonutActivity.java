package com.janki.final_practical_worl_janki_parth_sagar;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class DonutActivity extends MenuActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView rv = findViewById(R.id.main_list);
        rv.setLayoutManager(new LinearLayoutManager(this));

//data

        /// add donut id in this
        ArrayList<Donut> data = new ArrayList<>();
        data.add(new Donut(1,R.drawable.donut1,"Choco Donut", "For those who can’t resist chocolate we take our Original Glazed ring doughnut one step further by hand dipping the top in smooth chocolate icing."));
        data.add(new Donut(2,R.drawable.donut4,"Rainbow Donut", "Rainbow Donuts are made using fruity pebbles, white chocolate and shredded coconut."));
        data.add(new Donut(3,R.drawable.donut8,"Double Chocolate Donut", "For those who can’t resist chocolate we take our Original Glazed ring doughnut one step further by hand dipping the top in smooth chocolate icing."));
        data.add(new Donut(4,R.drawable.donut10,"Zebra Crossing", "This yeast-raised doughnut shell is jam packed with strawberry filling and coated with a light dusting of powdered sugar."));
        data.add(new Donut(5,R.drawable.donut16,"Strawberry", "The strawberry iced doughnut is a delicious treat and so pretty in pink."));
        data.add(new Donut(6,R.drawable.donut14,"Royal Chocolate", "For those who can’t resist chocolate we take our Original Glazed ring doughnut one step further by hand dipping the top in smooth chocolate icing."));
        data.add(new Donut(7,R.drawable.donut15,"Blue Berry", "Doughnut is dipped in blueberry icing and topped with festive rainbow sprinkles."));


//adapter
        DonutAdapter adapter = new DonutAdapter(data);

        //set adapter

        rv.setAdapter(adapter);

        Donut task1=(Donut) data.get(1);
    }
}