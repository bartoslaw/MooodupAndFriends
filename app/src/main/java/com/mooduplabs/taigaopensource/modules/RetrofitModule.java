package com.mooduplabs.taigaopensource.modules;

import com.loopj.android.http.AsyncHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RetrofitModule {

    @Provides
    @Singleton
    public AsyncHttpClient provideRetrofit(){
        return new AsyncHttpClient();
    }
}
