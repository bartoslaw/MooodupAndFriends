package com.mooduplabs.taigaopensource.backend;

import com.mooduplabs.taigaopensource.components.DaggerRetrofitComponent;
import com.mooduplabs.taigaopensource.modules.RetrofitModule;

import javax.inject.Inject;

import retrofit.Retrofit;

public class HttpClient {

    @Inject
    Retrofit retrofit;

    public HttpClient() {
        DaggerRetrofitComponent.builder().retrofitModule(new RetrofitModule()).build().inject(this);
    }
}
