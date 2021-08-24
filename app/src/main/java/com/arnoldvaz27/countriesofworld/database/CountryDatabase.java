package com.arnoldvaz27.countriesofworld.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.arnoldvaz27.countriesofworld.dao.CountryDao;
import com.arnoldvaz27.countriesofworld.entites.Country;

//defining the country database is done below
@Database(entities = Country.class, version = 1,exportSchema = false)
public abstract class CountryDatabase extends RoomDatabase {
    private static CountryDatabase countryDatabase;

    public static synchronized CountryDatabase getCountryDatabase(Context context)
    {
        if (countryDatabase == null)
        {
            countryDatabase = Room.databaseBuilder(
                    context,CountryDatabase.class,"country_db"
            ).build();
        }
        return countryDatabase;
    }

    public abstract CountryDao countryDao();
}
