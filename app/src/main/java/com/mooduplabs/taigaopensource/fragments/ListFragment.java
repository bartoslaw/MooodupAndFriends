package com.mooduplabs.taigaopensource.fragments;

import android.widget.ListView;

import com.mooduplabs.taigaopensource.adapters.ListItemsAdapter;
import com.mooduplabs.taigaopensource.events.ListItemsReadyEvent;

import de.halfbit.tinybus.Subscribe;

/**
 * Created by Lukasz on 2015-11-21.
 */
public class ListFragment extends BaseFragment {

    ListItemsAdapter listItemsAdapter;
    ListView listItemsListView;

    @Subscribe
    void onDataObtained(ListItemsReadyEvent event) {
        listItemsAdapter = new ListItemsAdapter(getContext(),event.listItemViewModels);
    }
}
