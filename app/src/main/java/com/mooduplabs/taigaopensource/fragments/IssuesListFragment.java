package com.mooduplabs.taigaopensource.fragments;

import com.mooduplabs.taigaopensource.requestdispatchers.IssuesRequestDispatcher;

/**
 * Created by £ukasz on 2015-11-21.
 */
public class IssuesListFragment extends ListFragment {

    public IssuesListFragment() {
        this.requestDispatcher = new IssuesRequestDispatcher();
    }
}
