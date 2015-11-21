package com.mooduplabs.taigaopensource.components;

import com.mooduplabs.taigaopensource.backend.HttpClientService;
import com.mooduplabs.taigaopensource.modules.HttpClientModule;
import com.mooduplabs.taigaopensource.requestdispatchers.BaseRequestDispatcher;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {HttpClientModule.class})
@Singleton
public interface HttpClientComponent {

    void inject(BaseRequestDispatcher requestDispatcher);
    HttpClientService httpClientService();
}
