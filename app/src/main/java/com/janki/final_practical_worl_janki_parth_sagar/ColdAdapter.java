package com.janki.final_practical_worl_janki_parth_sagar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColdAdapter extends RecyclerView.Adapter<ColdViewHolder> {

    private ArrayList<Cold> colds;

    public ColdAdapter(ArrayList<Cold> colds){
        this.colds=colds;
    }

    @NonNull
    @Override
    public ColdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int customViewResourceId) {
        View customRowView = LayoutInflater.from(parent.getContext()).inflate(customViewResourceId, parent, false);
        ColdViewHolder manager = new ColdViewHolder(customRowView,colds);
        return manager;
    }

    @Override
    public void onBindViewHolder(@NonNull ColdViewHolder manager, int position) {
    manager.bind(colds.get(position));

    }

    @Override
    public int getItemCount() {
        return colds.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.cold_custom_row;
    }
}
