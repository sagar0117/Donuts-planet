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

public class HotViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView name;
    List<Hot> hots;
    LinearLayout layout;
    public HotViewHolder(@NonNull View customRowView, List<Hot> hots) {
        super(customRowView);
        this.hots=hots;
        image = customRowView.findViewById(R.id.custom_image);
        name = customRowView.findViewById(R.id.name);
        layout=customRowView.findViewById(R.id.popup);
        AlertDialog.Builder alertDialog2 = new AlertDialog.Builder((AppCompatActivity)customRowView.getContext());

        alertDialog2.setTitle("Hot Beverage");

        alertDialog2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        layout.setOnClickListener(v -> {
            int position=getAdapterPosition();
            alertDialog2.setMessage(hots.get(position).getDesc());
            alertDialog2.show();
        });
    }

    public void bind(Hot Hot) {
        image.setImageResource(Hot.getImgResourceId());
        name.setText(Hot.getName());
    }
}
