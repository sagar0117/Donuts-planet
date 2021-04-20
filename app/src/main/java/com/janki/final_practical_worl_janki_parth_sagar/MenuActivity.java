package com.janki.final_practical_worl_janki_parth_sagar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_header);
        }


    @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.app_menu, menu);
           /* menu.findItem(R.id.menu_donuts).setOnMenuItemClickListener(item -> {
              //  Toast.makeText(this, "Donut clicked", Toast.LENGTH_SHORT).show();
                return false;
            });  */
            return true;
        }

    @Override
    public boolean onOptionsItemSelected(@NonNull  MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_donuts:
                Toast.makeText(this, "Donut clicked", Toast.LENGTH_SHORT).show();
                Intent intentDonut = new Intent(this, DonutActivity.class);
                this.startActivity(intentDonut);
                break;
            case R.id.menu_cold:
                Toast.makeText(this, "Cold clicked", Toast.LENGTH_SHORT).show();
                Intent intentCold = new Intent(this, ColdBeverageActivity.class);
                this.startActivity(intentCold);
                break;

            case R.id.menu_hot:
                Toast.makeText(this, "Hot clicked", Toast.LENGTH_SHORT).show();
                Intent intentHot = new Intent(this, HotBeverageActivity.class);
                this.startActivity(intentHot);
                break;
            default:
              return super.onOptionsItemSelected(item);
        }
        return true;

    }
}

