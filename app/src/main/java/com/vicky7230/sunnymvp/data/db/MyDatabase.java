package com.vicky7230.sunnymvp.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.vicky7230.sunnymvp.data.db.dao.CityDao;
import com.vicky7230.sunnymvp.data.db.entity.City;

/**
 * Created by agrim on 8/6/17.
 */

@Database(entities = {City.class}, version = 1)
abstract class MyDatabase extends RoomDatabase {

    abstract CityDao cityDao();

}
