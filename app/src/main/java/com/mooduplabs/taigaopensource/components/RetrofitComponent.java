package com.mooduplabs.taigaopensource.components;

import com.loopj.android.http.AsyncHttpClient;
import com.mooduplabs.taigaopensource.backend.HttpClient;
import com.mooduplabs.taigaopensource.modules.LoopjModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {LoopjModule.class})
@Singleton
public interface RetrofitComponent {

    void inject(HttpClient client);
    AsyncHttpClient retrofit();

}
