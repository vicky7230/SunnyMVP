package com.vicky7230.sunnymvp.di.component;

import com.vicky7230.sunnymvp.MainActivity;
import com.vicky7230.sunnymvp.di.module.ApplicationModule;
import com.vicky7230.sunnymvp.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by agrim on 16/6/17.
 */
@Singleton
@Component(modules = {NetworkModule.class})
public interface NetworkComponent {

    void injectActivity(MainActivity activity);

}
