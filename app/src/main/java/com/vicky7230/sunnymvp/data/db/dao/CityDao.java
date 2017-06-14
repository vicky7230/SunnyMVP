package com.vicky7230.sunnymvp.data.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.vicky7230.sunnymvp.data.db.entity.City;

import java.util.ArrayList;

/**
 * Created by agrim on 8/6/17.
 */

@Dao
public interface CityDao {

    @Query("SELECT * FROM city")
    ArrayList<City> getAllCities();

    @Insert
    void insertCities(City... cities);

    @Delete
    void deleteCity(City city);
}
