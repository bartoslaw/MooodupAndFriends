package com.mooduplabs.taigaopensource.requestdispatchers;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.TextHttpResponseHandler;
import com.mooduplabs.taigaopensource.events.IssuesReadyEvent;
import com.mooduplabs.taigaopensource.events.ListItemsReadyEvent;
import com.mooduplabs.taigaopensource.utils.BusHelper;
import com.mooduplabs.taigaopensource.viewmodels.ListItemsViewModel;

import org.json.JSONArray;
import org.json.JSONObject;


import java.io.UnsupportedEncodingException;

import cz.msebera.android.httpclient.Header;
import de.halfbit.tinybus.Subscribe;

/**
 * Created by �ukasz on 2015-11-21.
 */
public class IssuesRequestDispatcher extends BaseRequestDispatcher {

    public IssuesRequestDispatcher() {
        super();
        this.endpoint = "issues";
    }

    @Subscribe
    private void onDataObtained(IssuesReadyEvent event) {

/*        ListItemsReadyEvent itemsReadyEvent = new ListItemsReadyEvent();
        itemsReadyEvent.listItemsViewModels = prepareViewModels(event.jsonData);
        BusHelper.getInstance().post(itemsReadyEvent);
        BusHelper.getInstance().unregister(this);*/
    }

    private void httpRequest(){
       httpClientService.get(endpoint, responseHandler,parameters);
    }

    AsyncHttpResponseHandler responseHandler = new TextHttpResponseHandler() {
        @Override
        public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
        }

        @Override
        public void onSuccess(int statusCode, Header[] headers, String responseString) {
            prepareViewModels(responseString);

        }
    };


    private ListItemsViewModel prepareViewModels(String jsonData) {
        //TODO
        return null;
/*
        JSONArray jsonArray = jsonData.getJSONArray("issues");
        return new ListItemsViewModel();*/
    }

}
