package com.janki.final_practical_worl_janki_parth_sagar.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Users {
    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @ColumnInfo(name = "postal_code")
    private String postalCode;

    private String email;

    private String password;

    public Users(@NonNull String firstName,@NonNull String lastName,@NonNull String postalCode,@NonNull String email,@NonNull String password)
    {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPostalCode(postalCode);
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
