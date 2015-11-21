package com.mooduplabs.taigaopensource.backend;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.mooduplabs.taigaopensource.components.DaggerRetrofitComponent;
import com.mooduplabs.taigaopensource.models.Parameter;
import com.mooduplabs.taigaopensource.modules.LoopjModule;

import javax.inject.Inject;


public class HttpClient implements HttpClientService {

    @Inject
    AsyncHttpClient retrofit;

    public HttpClient() {
        DaggerRetrofitComponent.builder().retrofitModule(new LoopjModule()).build().inject(this);
    }

    @Override
    public void post(String endPoint,AsyncHttpResponseHandler handler, Parameter... params) {

    }

    @Override
    public void get(String endPoint, AsyncHttpResponseHandler handler, Parameter... params) {

    }

    @Override
    public void put(String endPoint, AsyncHttpResponseHandler handler, Parameter... params) {

    }

    @Override
    public void delete(String endPoint, AsyncHttpResponseHandler handler, Parameter... params) {

    }
}
