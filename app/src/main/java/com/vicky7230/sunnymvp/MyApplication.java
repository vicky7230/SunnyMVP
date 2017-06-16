package com.vicky7230.sunnymvp;

import android.app.Application;

import com.vicky7230.sunnymvp.di.component.DaggerNetworkComponent;
import com.vicky7230.sunnymvp.di.component.NetworkComponent;
import com.vicky7230.sunnymvp.di.module.NetworkModule;
import com.vicky7230.sunnymvp.utils.AppConstants;

import timber.log.Timber;

/**
 * Created by agrim on 8/6/17.
 */

public class MyApplication extends Application {

    private NetworkComponent  networkComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        networkComponent = DaggerNetworkComponent.builder()
                .networkModule(new NetworkModule(AppConstants.BASE_URL))
                .


        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }


    }

    public NetworkComponent getNetworkComponent() {
        return networkComponent;
    }
}
