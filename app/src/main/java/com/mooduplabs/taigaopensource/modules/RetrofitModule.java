package com.mooduplabs.taigaopensource.modules;

import com.mooduplabs.taigaopensource.GlobalConstants;

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
                .baseUrl(GlobalConstants.BACKEND_HOST)
                .build();
    }
}
