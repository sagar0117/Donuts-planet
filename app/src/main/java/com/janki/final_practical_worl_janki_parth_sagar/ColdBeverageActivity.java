package com.janki.final_practical_worl_janki_parth_sagar;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ColdBeverageActivity extends MenuActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView rv = findViewById(R.id.main_list);
        rv.setLayoutManager(new LinearLayoutManager(this));

//data
        ArrayList<Cold> data = new ArrayList<>();
        data.add(new Cold(1,R.drawable.coldcaramel,"Caramel Magic", "Iced coffee is a cosmopolitan coffee drink recipe, based on cold or hot coffee served iced, a variant of coffee, affogato."));
        data.add(new Cold(2,R.drawable.coldcaramel1,"Caramel Bust", "Iced coffee is a cosmopolitan coffee drink recipe, based on cold or hot coffee served iced, a variant of coffee, affogato."));
        data.add(new Cold(3,R.drawable.vanillacold,"Vanilla Magic", "Iced coffee is a cosmopolitan coffee drink recipe, based on cold or hot coffee served iced, a variant of coffee, affogato,."));
        data.add(new Cold(4,R.drawable.coldoreo,"Orea Bust", "Iced coffee is a cosmopolitan coffee drink recipe, based on cold or hot coffee served iced, a variant of coffee, affogato."));
        data.add(new Cold(5,R.drawable.coldvss,"Vanilla Sugar Free", "Iced coffee is a cosmopolitan coffee drink recipe, based on cold or hot coffee served iced, a variant of coffee, affogato."));


//adapter
        ColdAdapter adapter = new ColdAdapter(data);

        //set adapter

        rv.setAdapter(adapter);
    }
}