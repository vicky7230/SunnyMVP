package com.vicky7230.sunnymvp.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by agrim on 15/6/17.
 */
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideContext() {

        return application;
    }

    @Provides
    @Singleton
    Application provideApplication() {

        return application;
    }

}

