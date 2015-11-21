package com.mooduplabs.taigaopensource.requestdispatchers;

import com.mooduplabs.taigaopensource.events.IssuesReadyEvent;
import com.mooduplabs.taigaopensource.events.ListItemsReadyEvent;
import com.mooduplabs.taigaopensource.utils.BusHelper;
import com.mooduplabs.taigaopensource.viewmodels.ListItemsViewModel;

import org.json.JSONObject;

import de.halfbit.tinybus.Subscribe;

/**
 * Created by �ukasz on 2015-11-21.
 */
public class ProjectsRequestDispatcher extends BaseRequestDispatcher {

    public ProjectsRequestDispatcher() {
        super();
        this.endpoint = "projectsendpoint";
    }

    @Subscribe
    private void onDataObtained(IssuesReadyEvent event) {
        ListItemsReadyEvent itemsReadyEvent = new ListItemsReadyEvent();
        itemsReadyEvent.listItemsViewModels = prepareViewModels(event.jsonData);
        BusHelper.getInstance().post(itemsReadyEvent);
        BusHelper.getInstance().unregister(this);
    }

    private ListItemsViewModel prepareViewModels(JSONObject jsonData) {
        //jsonData.getJSONArray("projects")
        return new ListItemsViewModel();
    }


}
