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

import com.janki.final_practical_worl_janki_parth_sagar.db.AppDatabase;
import com.janki.final_practical_worl_janki_parth_sagar.db.dao.UserDAO;

import java.util.concurrent.atomic.AtomicInteger;

public class LoginActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            Button login = (Button) findViewById(R.id.login_button);
            TextView createAccount = (TextView) findViewById(R.id.login_createTextView);
            createAccount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(i);
                }
            });
            EditText email = (EditText) findViewById(R.id.login_usernameEditText);
            EditText password = (EditText) findViewById(R.id.login_passwordEditText);
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
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final String em=email.getText().toString();
                    final String pwd=password.getText().toString();
                    if(em.matches("") || pwd.matches("")){
                        alertDialog1.setMessage("Fields can not be empty!!");
                        alertDialog1.show();
                    }
                    else
                    {
                        userDao.getUser(em,pwd).observe(LoginActivity.this, LoginActivity.this::setCount);

                        email.setText("");
                        password.setText("");
                    }
                }


            });

        }
        private void setCount(Integer count){
            if(count>0){
                Intent i=new Intent(LoginActivity.this, DonutActivity.class);
                startActivity(i);
            }
            else
            {
                AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(this);

                alertDialog2.setTitle("Alert!!");

                alertDialog2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog2.setMessage("Wrong Email or Password!!");
                alertDialog2.show();
            }
        }
    }
