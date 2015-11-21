package com.mooduplabs.taigaopensource.fragments;

import com.mooduplabs.taigaopensource.requestdispatchers.TasksRequestDispatcher;

public class TasksListFragment extends ListFragment {

    public TasksListFragment() {
        this.requestDispatcher = new TasksRequestDispatcher();
    }

    @Override int getLayoutRes() {
        return super.getLayoutRes();
    }

    @Override
    void onFragmentCreated() {
        super.onFragmentCreated();
    }
}
