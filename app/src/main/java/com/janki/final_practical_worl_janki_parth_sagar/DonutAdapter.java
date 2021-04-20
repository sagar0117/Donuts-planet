package com.janki.final_practical_worl_janki_parth_sagar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DonutAdapter extends RecyclerView.Adapter<DonutViewHolder> {

    private ArrayList<Donut> donuts;

    public DonutAdapter(ArrayList<Donut> donuts){
        this.donuts=donuts;
    }

    @NonNull
    @Override
    public DonutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int customViewResourceId) {
        View customRowView = LayoutInflater.from(parent.getContext()).inflate(customViewResourceId, parent, false);
        DonutViewHolder manager = new DonutViewHolder(customRowView,donuts);
        return manager;
    }

    @Override
    public void onBindViewHolder(@NonNull DonutViewHolder manager, int position) {
        manager.bind(donuts.get(position));
    }

    @Override
    public int getItemCount() {
        return donuts.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.donut_custom_row;
    }
}
