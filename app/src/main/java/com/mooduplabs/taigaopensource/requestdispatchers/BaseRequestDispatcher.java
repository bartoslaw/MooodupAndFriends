package com.mooduplabs.taigaopensource.requestdispatchers;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.mooduplabs.taigaopensource.backend.HttpClient;
import com.mooduplabs.taigaopensource.backend.HttpClientService;
import com.mooduplabs.taigaopensource.components.DaggerHttpClientComponent;
import com.mooduplabs.taigaopensource.models.Parameter;
import com.mooduplabs.taigaopensource.modules.HttpClientModule;
import com.mooduplabs.taigaopensource.utils.BusHelper;

import javax.inject.Inject;

public class BaseRequestDispatcher {

    @Inject
    protected HttpClientService httpClientService;

    protected String endpoint;
    protected Parameter[] parameters;
    protected AsyncHttpResponseHandler responseHandler;

    protected BaseRequestDispatcher() {
        httpClientService = new HttpClient();
        //DaggerHttpClientComponent.builder().httpClientModule(new HttpClientModule(false)).build();
    }

    public void obtainData(Parameter... parameters) {
    }

}
