package com.mooduplabs.taigaopensource.requestdispatchers;

import android.util.Log;

import com.loopj.android.http.TextHttpResponseHandler;
import com.mooduplabs.taigaopensource.GlobalConstants;
import com.mooduplabs.taigaopensource.models.Parameter;
import com.mooduplabs.taigaopensource.utils.BusHelper;

import cz.msebera.android.httpclient.Header;

public class LoginRequestDispatcher extends BaseRequestDispatcher {

    public LoginRequestDispatcher() {
        super();
        this.endpoint = GlobalConstants.BACKEND_HOST+"/api/v1/auth";
        this.responseHandler = new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.d("Login","Fail:"+responseString);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.d("Login","Success:"+responseString);

            }
        };
    }

    public void obtainData(Parameter... parameters) {
        this.parameters = parameters;
        BusHelper.getInstance().register(this);
        httpRequest();
    }

    private void httpRequest(){
        httpClientService.post(endpoint, responseHandler, parameters);
    }

}
