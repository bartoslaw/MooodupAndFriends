package com.mooduplabs.taigaopensource.utils;

import com.mooduplabs.taigaopensource.backend.HttpClientService;
import com.mooduplabs.taigaopensource.components.DaggerHttpClientComponent;
import com.mooduplabs.taigaopensource.modules.HttpClientModule;

import javax.inject.Inject;

public class RequestDispatcher {

    @Inject
    protected HttpClientService httpClientService;

    public RequestDispatcher() {
        DaggerHttpClientComponent.builder().httpClientModule(new HttpClientModule(false)).build();
    }
}
