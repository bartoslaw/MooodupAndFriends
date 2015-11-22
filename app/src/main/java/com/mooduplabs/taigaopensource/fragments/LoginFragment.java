package com.mooduplabs.taigaopensource.fragments;

import android.widget.Button;
import android.widget.EditText;

import com.mooduplabs.taigaopensource.GlobalConstants;
import com.mooduplabs.taigaopensource.R;
import com.mooduplabs.taigaopensource.models.Parameter;
import com.mooduplabs.taigaopensource.requestdispatchers.LoginRequestDispatcher;

import butterknife.Bind;
import butterknife.OnClick;

public class LoginFragment extends BaseFragment {

    @Bind(R.id.login_username_edit)
    EditText usernameEdit;

    @Bind(R.id.login_password_edit)
    EditText passwordEdit;

    @Bind(R.id.login_domain_edit)
    EditText domainEdit;

    public LoginFragment() {
        requestDispatcher = new LoginRequestDispatcher();
    }

    @Override
    int getLayoutRes() {
        return R.layout.fragment_login;
    }

    @Override
    void onFragmentCreated() {

    }

    @OnClick(R.id.login_submit)
    void onSubmitClick() {
        //GlobalConstants.BACKEND_HOST = domainEdit.getText().toString();
        requestDispatcher.obtainData(new Parameter("username",usernameEdit.getText().toString()),
                new Parameter("password",passwordEdit.getText().toString()),new Parameter("type","normal"));
    }

}
