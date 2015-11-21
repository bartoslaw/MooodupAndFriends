package com.mooduplabs.taigaopensource.components;

import com.mooduplabs.taigaopensource.backend.HttpClient;
import com.mooduplabs.taigaopensource.modules.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit.Retrofit;

@Component(modules = {RetrofitModule.class})
@Singleton
public interface RetrofitComponent {

    void inject(HttpClient client);
    Retrofit retrofit();

}
