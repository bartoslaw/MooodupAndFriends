package com.mooduplabs.taigaopensource.backend;

import com.loopj.android.http.AsyncHttpClient;
import com.mooduplabs.taigaopensource.components.DaggerRetrofitComponent;
import com.mooduplabs.taigaopensource.modules.RetrofitModule;

import javax.inject.Inject;


public class HttpClient implements HttpClientService {

    @Inject
    AsyncHttpClient retrofit;

    public HttpClient() {
        DaggerRetrofitComponent.builder().retrofitModule(new RetrofitModule()).build().inject(this);
    }

    @Override
    public void post(){

    }

    @Override
    public void get() {

    }

    @Override
    public void put() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void getData(String endpoint) {

    }
}
