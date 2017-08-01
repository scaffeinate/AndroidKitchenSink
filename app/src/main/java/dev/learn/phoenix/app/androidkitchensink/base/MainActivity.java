package dev.learn.phoenix.app.androidkitchensink.base;

import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import dev.learn.phoenix.app.androidkitchensink.R;
import dev.learn.phoenix.app.androidkitchensink.base.NavDrawerFragment.NavDrawerCallbacks;
import dev.learn.phoenix.app.androidkitchensink.shared.ContainerFragment;
import dev.learn.phoenix.app.androidkitchensink.views.ViewsContainerFragment;

public class MainActivity extends AppCompatActivity implements NavDrawerCallbacks {

    private DrawerLayout mDrawerLayout;
    private FrameLayout mFrameMainContent;

    private NavDrawerFragment mNavDrawerFragment;
    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getSupportFragmentManager();

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_base);
        mFrameMainContent = (FrameLayout) findViewById(R.id.frame_main_content);

        mNavDrawerFragment = (NavDrawerFragment) mFragmentManager.findFragmentById(R.id.fragment_nav_drawer);
        mNavDrawerFragment.setUp(R.id.fragment_nav_drawer, mDrawerLayout);
    }

    @Override
    public void onNavDrawerListItemClicked(int position) {
        mFragmentManager.beginTransaction().replace(R.id.frame_main_content, new ContainerFragment()).commit();
    }
}
