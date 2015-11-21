package com.mooduplabs.taigaopensource.fragments;

import com.mooduplabs.taigaopensource.R;
import com.mooduplabs.taigaopensource.requestdispatchers.RegisterRequestDispatcher;

public class RegisterFragment extends BaseFragment {

    RegisterRequestDispatcher registerRequestDispatcher;

    @Override
    int getLayoutRes() {
        return R.layout.fragment_register;
    }

    @Override
    void onFragmentCreated() {

    }
}
