package com.mooduplabs.taigaopensource.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mooduplabs.taigaopensource.requestdispatchers.BaseRequestDispatcher;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    abstract int getLayoutRes();
    abstract void onFragmentCreated();

    BaseRequestDispatcher requestDispatcher;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getLayoutRes(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        onFragmentCreated();
    }

}
