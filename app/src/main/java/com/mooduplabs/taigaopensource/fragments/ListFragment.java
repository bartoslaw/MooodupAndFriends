package com.mooduplabs.taigaopensource.fragments;

import android.widget.ListView;

import com.mooduplabs.taigaopensource.R;
import com.mooduplabs.taigaopensource.adapters.ListItemsAdapter;
import com.mooduplabs.taigaopensource.events.ListItemsReadyEvent;
import com.mooduplabs.taigaopensource.utils.BusHelper;

import butterknife.Bind;
import de.halfbit.tinybus.Subscribe;

public class ListFragment extends BaseFragment {

    ListItemsAdapter listItemsAdapter;

    @Bind(R.id.items_list)
    ListView listItemsListView;

    @Override
    int getLayoutRes() {
        return R.layout.fragment_list;
    }

    @Override
    void onFragmentCreated() {
        BusHelper.getInstance().register(this);
        requestDispatcher.obtainData();
    }

    @Subscribe
    void onDataObtained(ListItemsReadyEvent event) {
        BusHelper.getInstance().unregister(this);
        listItemsAdapter = new ListItemsAdapter(getContext(), event.listItemsViewModels);
        listItemsListView.setAdapter(listItemsAdapter);
    }
}
