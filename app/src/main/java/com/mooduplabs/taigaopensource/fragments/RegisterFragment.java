package com.mooduplabs.taigaopensource.fragments;

import android.widget.EditText;

import com.mooduplabs.taigaopensource.GlobalConstants;
import com.mooduplabs.taigaopensource.R;
import com.mooduplabs.taigaopensource.models.Parameter;
import com.mooduplabs.taigaopensource.requestdispatchers.RegisterRequestDispatcher;

import butterknife.Bind;
import butterknife.OnClick;

public class RegisterFragment extends BaseFragment {


    @Bind(R.id.register_username_edit)
    EditText usernameEdit;

    @Bind(R.id.register_password_edit)
    EditText passwordEdit;

    @Bind(R.id.register_email_edit)
    EditText emailEdit;

    @Bind(R.id.register_fullname_edit)
    EditText fullnameEdit;

    @Bind(R.id.register_domain_edit)
    EditText domainEdit;


    @Override
    int getLayoutRes() {
        return R.layout.fragment_register;
    }

    @Override
    void onFragmentCreated() {

    }

    @OnClick(R.id.login_submit)
    void onSubmitClick() {
        GlobalConstants.BACKEND_HOST = domainEdit.getText().toString();
        requestDispatcher.obtainData(new Parameter("username",usernameEdit.getText().toString()),
                new Parameter("password",passwordEdit.getText().toString()),
                new Parameter("fullname",fullnameEdit.getText().toString()),
                new Parameter("email",emailEdit.getText().toString()));
    }

}
