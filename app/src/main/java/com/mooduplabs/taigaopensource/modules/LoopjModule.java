package com.mooduplabs.taigaopensource.modules;

import com.loopj.android.http.AsyncHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LoopjModule {

    @Provides
    @Singleton
    public AsyncHttpClient provideLoopj(){
        return new AsyncHttpClient();
    }
}
