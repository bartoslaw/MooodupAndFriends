package com.mooduplabs.taigaopensource.fragments;

import com.mooduplabs.taigaopensource.requestdispatchers.IssuesRequestDispatcher;


public class IssuesListFragment extends ListFragment {

    public IssuesListFragment() {
        this.requestDispatcher = new IssuesRequestDispatcher();
    }

    @Override
    int getLayoutRes() {
        return super.getLayoutRes();
    }

    @Override
    void onFragmentCreated() {
        super.onFragmentCreated();
    }
}
