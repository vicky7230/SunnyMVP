package com.vicky7230.sunnymvp.data.network;

import com.vicky7230.sunnymvp.data.Config;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by agrim on 14/6/17.
 */

public class ApiServiceGenerator {

    private final Retrofit retrofit;

    @Inject
    public ApiServiceGenerator(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public <S> S createService(Class<S> service) {
        return retrofit.create(service);
    }
}
