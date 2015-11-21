package com.mooduplabs.taigaopensource.backend;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.mooduplabs.taigaopensource.components.DaggerRetrofitComponent;
import com.mooduplabs.taigaopensource.models.Parameter;
import com.mooduplabs.taigaopensource.modules.LoopjModule;

import javax.inject.Inject;

public class HttpClient implements HttpClientService {

    @Inject
    AsyncHttpClient loopj;

    public HttpClient() {
        DaggerRetrofitComponent.builder().loopjModule(new LoopjModule()).build().inject(this);
    }

    private RequestParams getParams( Parameter... params){
        RequestParams requestParams = new RequestParams();
        for(Parameter parameter : params){
            requestParams.put(parameter.getKey(),parameter.getValue());
        }
        return requestParams;
    }

    @Override
    public void post(String endPoint, AsyncHttpResponseHandler handler, Parameter[] params) {
        loopj.post(endPoint, getParams(params), handler);
    }

    @Override
    public void get(String endPoint, AsyncHttpResponseHandler handler, Parameter[] params) {
        loopj.get(endPoint, getParams(params), handler);
    }

    @Override
    public void put(String endPoint, AsyncHttpResponseHandler handler, Parameter[] params) {
        loopj.put(endPoint, getParams(params), handler);
    }

    @Override
    public void delete(String endPoint, AsyncHttpResponseHandler handler, Parameter[] params) {
        loopj.delete(endPoint, getParams(params), handler);
    }
}
