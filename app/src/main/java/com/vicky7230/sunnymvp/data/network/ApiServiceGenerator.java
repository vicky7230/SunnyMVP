package com.vicky7230.sunnymvp.data.network;

import com.vicky7230.sunnymvp.data.Config;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by agrim on 14/6/17.
 */

public class ApiServiceGenerator {

    private Retrofit retrofit;

    private HttpLoggingInterceptor httpLoggingInterceptor =
            new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC);

    private OkHttpClient httpClient =
            new OkHttpClient.Builder().addInterceptor(new HeaderInterceptor())
                    .addInterceptor(httpLoggingInterceptor)
                    .build();

    private static ApiServiceGenerator INSTANCE;

    private ApiServiceGenerator() {
        retrofit = new Retrofit.Builder().baseUrl(Config.API_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient)
                .build();
    }

    public static ApiServiceGenerator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApiServiceGenerator();
        }
        return INSTANCE;
    }

    public <S> S createService(Class<S> service) {
        return retrofit.create(service);
    }
}
