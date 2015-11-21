package com.mooduplabs.taigaopensource;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.mooduplabs.taigaopensource.backend.NotificationService;
import com.mooduplabs.taigaopensource.fragments.BaseFragment;
import com.mooduplabs.taigaopensource.fragments.LoginFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, NotificationService.class));
        setFragment();
    }

    private void setFragment(){
        BaseFragment fragment = new LoginFragment();
        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
        trans.add(R.id.fragment_container, fragment, BaseFragment.class.getName());
        trans.addToBackStack(null);

        trans.commitAllowingStateLoss();
    }

}
