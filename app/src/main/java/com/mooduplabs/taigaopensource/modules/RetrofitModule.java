package com.mooduplabs.taigaopensource.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;

@Module
public class RetrofitModule {

    @Provides
    @Singleton
    public Retrofit provideRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .build();
    }
}
