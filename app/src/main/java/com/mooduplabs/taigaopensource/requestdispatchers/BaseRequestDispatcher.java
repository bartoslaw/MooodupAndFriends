package com.mooduplabs.taigaopensource.requestdispatchers;

import com.mooduplabs.taigaopensource.backend.HttpClientService;
import com.mooduplabs.taigaopensource.components.DaggerHttpClientComponent;
import com.mooduplabs.taigaopensource.modules.HttpClientModule;

import javax.inject.Inject;

public class BaseRequestDispatcher {

    @Inject
    protected HttpClientService httpClientService;

    protected String endpoint;

    protected BaseRequestDispatcher() {
        DaggerHttpClientComponent.builder().httpClientModule(new HttpClientModule(false)).build();
    }

    public void obtainData() {
        httpClientService.getData(endpoint);
    }

}
