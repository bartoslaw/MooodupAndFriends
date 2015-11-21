package com.mooduplabs.taigaopensource.fragments;

import android.widget.ListView;

import com.mooduplabs.taigaopensource.adapters.ListItemsAdapter;
import com.mooduplabs.taigaopensource.events.ListItemsReadyEvent;

import de.halfbit.tinybus.Subscribe;

public class ListFragment extends BaseFragment {

    ListItemsAdapter listItemsAdapter;
    ListView listItemsListView;

    @Override
    int getLayoutRes() {
        return 0;
    }

    @Override
    void onFragmentCreated() {
    }

    @Subscribe
    void onDataObtained(ListItemsReadyEvent event) {
        listItemsAdapter = new ListItemsAdapter(getContext(), event.listItemViewModels);
    }
}
