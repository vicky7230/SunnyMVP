package com.vicky7230.sunnymvp.di.module;


import com.vicky7230.sunnymvp.data.network.HeaderInterceptor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by agrim on 14/6/17.
 */

@Module
public class ApiServiceGeneratorModule {

    @Provides
    @Singleton
    HttpLoggingInterceptor provideHttpLoggingInterceptor() {

        return new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC);

    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor) {

        return new OkHttpClient.Builder().addInterceptor(new HeaderInterceptor())
                .addInterceptor(httpLoggingInterceptor)
                .build();
    }

}
