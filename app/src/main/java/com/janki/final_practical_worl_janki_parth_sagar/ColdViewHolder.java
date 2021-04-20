package com.janki.final_practical_worl_janki_parth_sagar;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ColdViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView name;
    List<Cold> colds;
    LinearLayout layout;
    public ColdViewHolder(@NonNull View customRowView,List<Cold> colds) {

        super(customRowView);
        this.colds=colds;
        image = customRowView.findViewById(R.id.custom_image);
        name = customRowView.findViewById(R.id.name);
        layout=customRowView.findViewById(R.id.popup);
        AlertDialog.Builder alertDialog2 = new AlertDialog.Builder((AppCompatActivity)customRowView.getContext());

        alertDialog2.setTitle("Cold Beverage");

        alertDialog2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        layout.setOnClickListener(v -> {
            int position=getAdapterPosition();
            alertDialog2.setMessage(colds.get(position).getDesc());
            alertDialog2.show();
        });
    }

    public void bind(Cold Cold) {
        image.setImageResource(Cold.getImgResourceId());
        name.setText(Cold.getName());
    }
}
