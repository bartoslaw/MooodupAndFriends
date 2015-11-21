package com.mooduplabs.taigaopensource.backend;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.mooduplabs.taigaopensource.models.Parameter;

/**
 * Created by patryk1007 on 2015-11-21.
 */
public interface HttpClientService {
    void post(String endPoint, AsyncHttpResponseHandler handler, Parameter... params);

    void get(String endPoint, AsyncHttpResponseHandler handler, Parameter... params);

    void put(String endPoint, AsyncHttpResponseHandler handler, Parameter... params);

    void delete(String endPoint, AsyncHttpResponseHandler handler, Parameter... params);

}
