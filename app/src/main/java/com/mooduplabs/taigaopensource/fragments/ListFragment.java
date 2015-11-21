package com.mooduplabs.taigaopensource.fragments;

import android.widget.ListView;

import com.mooduplabs.taigaopensource.adapters.ListItemsAdapter;
import com.mooduplabs.taigaopensource.events.ListItemsReadyEvent;

import de.halfbit.tinybus.Subscribe;

/**
 * Created by �ukasz on 2015-11-21.
 */
public class ListFragment extends BaseFragment {

<<<<<<< HEAD
    @Override
    int getLayoutRes() {
        return 0;
    }

    @Override
    void onFragmentCreated() {

=======
    ListItemsAdapter listItemsAdapter;
    ListView listItemsListView;

    @Subscribe
    void onDataObtained(ListItemsReadyEvent event) {
        listItemsAdapter = new ListItemsAdapter(getContext(),event.listItemViewModels);
>>>>>>> 73c25a13e76ae9b1911147990102f3039cbe6e29
    }
}
