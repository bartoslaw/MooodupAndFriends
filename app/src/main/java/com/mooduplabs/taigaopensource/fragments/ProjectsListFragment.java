package com.mooduplabs.taigaopensource.fragments;

import com.mooduplabs.taigaopensource.requestdispatchers.ProjectsRequestDispatcher;

public class ProjectsListFragment extends ListFragment {

    public ProjectsListFragment() {
        this.requestDispatcher = new ProjectsRequestDispatcher();
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
