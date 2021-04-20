package com.janki.final_practical_worl_janki_parth_sagar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.janki.final_practical_worl_janki_parth_sagar.db.AppDatabase;
import com.janki.final_practical_worl_janki_parth_sagar.db.dao.UserDAO;
import com.janki.final_practical_worl_janki_parth_sagar.entity.Users;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button register= (Button) findViewById(R.id.register_button);
        TextView loginPage = (TextView) findViewById(R.id.register_createTextView);
        loginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
        EditText firstName=(EditText) findViewById(R.id.register_firstnameEditText);
        EditText lastName=(EditText) findViewById(R.id.register_lastnameEditText);
        EditText postalCode=(EditText) findViewById(R.id.register_postalCodeEditText);
        EditText email=(EditText) findViewById(R.id.register_emailEditText);
        EditText password=(EditText) findViewById(R.id.register_passwordEditText);
        AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(this);

        alertDialog1.setTitle("Alert!!");

        alertDialog1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        //Database
        AppDatabase database = AppDatabase.getDatabaseInstance(this);
        UserDAO userDao = database.userDAO();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String fn=firstName.getText().toString();
                final String ln=lastName.getText().toString();
                final String pc=postalCode.getText().toString();
                final String em=email.getText().toString();
                final String pwd=password.getText().toString();

                if(fn.matches("") || ln.matches("") || pc.matches("") || em.matches("") || pwd.matches("")){
                    alertDialog1.setMessage("Fields can not be empty!!");
                    alertDialog1.show();
                }
                else
                {
                    firstName.setText("");
                    lastName.setText("");
                    postalCode.setText("");
                    email.setText("");
                    password.setText("");

                    AppDatabase.databaseWriteExecutor.execute(()->{
                        Users user=new Users(fn,ln,pc,em,pwd);
                        userDao.insert(user);
                    });
                    Intent i=new Intent(RegisterActivity.this, DonutActivity.class);
                    startActivity(i);
                }

            }
        });
    }
}