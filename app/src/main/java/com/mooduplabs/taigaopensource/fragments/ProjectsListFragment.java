package com.mooduplabs.taigaopensource.fragments;

import com.mooduplabs.taigaopensource.requestdispatchers.ProjectsRequestDispatcher;

/**
 * Created by Lukasz on 2015-11-21.
 */
public class ProjectsListFragment extends ListFragment {

    public ProjectsListFragment() {
        this.requestDispatcher = new ProjectsRequestDispatcher();
    }
}
