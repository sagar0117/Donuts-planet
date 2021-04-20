package com.janki.final_practical_worl_janki_parth_sagar.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.janki.final_practical_worl_janki_parth_sagar.db.dao.UserDAO;
import com.janki.final_practical_worl_janki_parth_sagar.entity.Users;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Add each entity here.
@Database(entities = {Users.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
    //Add each DAO we make
    public abstract UserDAO userDAO();

    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);


    //Enforce that is gonna read and write from the main thread.
    //AppDatabase is going to live inside this instance. <- Singleton design pattern
    private static volatile AppDatabase instance;

    public static AppDatabase getDatabaseInstance(final Context context) {
        if (instance == null) {
            synchronized (AppDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            "app_database") //Name of Database in SQL Database
                            .fallbackToDestructiveMigration() // Migration is database modified/changed
                            .build();
                }
            }
        }
        return instance;
    }
}
