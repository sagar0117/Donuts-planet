package com.janki.final_practical_worl_janki_parth_sagar.db.dao;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.janki.final_practical_worl_janki_parth_sagar.entity.Users;

import java.util.List;
@Dao
public interface UserDAO {
    @Query("SELECT * FROM Users")
    LiveData<List<Users>> getUsers();

    //":" is used for accessing the parameter
    @Query("SELECT COUNT(*) from Users where email = :email")
    LiveData<Integer> getEmail(String email);

    @Query("SELECT COUNT(*) from Users where email = :email and password = :password")
    LiveData<Integer> getUser(String email, String password);

    @Insert
    void insert(Users... users);  //insert(user1, user2, user3);

    @Delete
    void delete(Users... users);
}
