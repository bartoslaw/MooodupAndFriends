package com.mooduplabs.taigaopensource.requestdispatchers;

import com.mooduplabs.taigaopensource.backend.HttpClient;
import com.mooduplabs.taigaopensource.backend.HttpClientService;
import com.mooduplabs.taigaopensource.events.IssuesReadyEvent;
import com.mooduplabs.taigaopensource.events.ListItemsReadyEvent;
import com.mooduplabs.taigaopensource.utils.BusHelper;
import com.mooduplabs.taigaopensource.viewmodels.ListItemViewModel;
import com.mooduplabs.taigaopensource.viewmodels.ListItemsViewModel;

import org.json.JSONObject;

import java.util.ArrayList;

import de.halfbit.tinybus.Subscribe;

/**
 * Created by �ukasz on 2015-11-21.
 */
public class IssuesRequestDispatcher extends BaseRequestDispatcher {

    public IssuesRequestDispatcher() {
        super();
        this.endpoint = "issuesendpoint";
    }

    @Subscribe
    private void onDataObtained(IssuesReadyEvent event) {

        ListItemsReadyEvent itemsReadyEvent = new ListItemsReadyEvent();
        itemsReadyEvent.listItemsViewModels = prepareViewModels(event.jsonData);
        BusHelper.getInstance().post(itemsReadyEvent);
        BusHelper.getInstance().unregister(this);
    }

    private void httpRequest(){
       // httpClientService.get();
    }


    private ListItemsViewModel prepareViewModels(JSONObject jsonData) {
        //jsonData.getJSONArray("issues")
        return new ListItemsViewModel();
    }

}
