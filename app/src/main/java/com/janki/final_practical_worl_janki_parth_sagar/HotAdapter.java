package com.janki.final_practical_worl_janki_parth_sagar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HotAdapter extends RecyclerView.Adapter<HotViewHolder> {

    private ArrayList<Hot> hots;

    public HotAdapter(ArrayList<Hot> hots){
        this.hots=hots;
    }

    @NonNull
    @Override
    public HotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int customViewResourceId) {
        View customRowView = LayoutInflater.from(parent.getContext()).inflate(customViewResourceId, parent, false);
        HotViewHolder manager = new HotViewHolder(customRowView,hots);
        return manager;
    }

    @Override
    public void onBindViewHolder(@NonNull HotViewHolder manager, int position) {
    manager.bind(hots.get(position));

    }

    @Override
    public int getItemCount() {
        return hots.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.hot_custom_row;
    }
}
