package com.mooduplabs.taigaopensource.components;

import com.mooduplabs.taigaopensource.backend.HttpClientService;
import com.mooduplabs.taigaopensource.modules.HttpClientModule;
import com.mooduplabs.taigaopensource.utils.RequestDispatcher;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {HttpClientModule.class})
@Singleton
public interface HttpClientComponent {

    void inject(RequestDispatcher requestDispatcher);
    HttpClientService httpClientService();
}
