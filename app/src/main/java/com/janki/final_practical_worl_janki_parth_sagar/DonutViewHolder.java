package com.janki.final_practical_worl_janki_parth_sagar;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.janki.final_practical_worl_janki_parth_sagar.Donut;
import com.janki.final_practical_worl_janki_parth_sagar.R;

import java.util.List;

public class DonutViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView name;
    LinearLayout layout;
    List<Donut> donuts;
    public DonutViewHolder(@NonNull View customRowView,List<Donut> donuts) {

        super(customRowView);
        this.donuts=donuts;
        image = customRowView.findViewById(R.id.custom_image);
        name = customRowView.findViewById(R.id.name);
        layout=customRowView.findViewById(R.id.popup);
        AlertDialog.Builder alertDialog2 = new AlertDialog.Builder((AppCompatActivity)customRowView.getContext());

        alertDialog2.setTitle("Donut");

        alertDialog2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        layout.setOnClickListener(v -> {
            int position=getAdapterPosition();
            alertDialog2.setMessage(donuts.get(position).getDesc());
            alertDialog2.show();
        });

    }

    public void bind(Donut Donut) {
        image.setImageResource(Donut.getImgResourceId());
        name.setText(Donut.getName());
    }
}
