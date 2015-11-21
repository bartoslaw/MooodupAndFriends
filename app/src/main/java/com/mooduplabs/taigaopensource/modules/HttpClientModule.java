package com.mooduplabs.taigaopensource.modules;

import com.mooduplabs.taigaopensource.backend.HttpClient;
import com.mooduplabs.taigaopensource.backend.HttpClientService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class HttpClientModule {

    private boolean isMock;

    public HttpClientModule(boolean isMock) {
        this.isMock = isMock;
    }

    @Provides
    @Singleton
    public HttpClientService provideHttpService() {
        return isMock ? null : new HttpClient();
    }
}
