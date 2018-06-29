package com.arjuna.apika;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.arjuna.apika.helper.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private HomeFragment homeFragment;
    private EventFragment eventFragment;
    private LokerFragment lokerFragment;
    private ProfileFragment profileFragment;
    private ProjectFragment projectFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainNav = (BottomNavigationView)findViewById(R.id.bottom_nav); // Disable shift animaion on bottomnavigation
        BottomNavigationViewHelper.removeShiftMode(mMainNav);

        mMainFrame=findViewById(R.id.main_frame);

        homeFragment=new HomeFragment();
        eventFragment=new EventFragment();
        lokerFragment=new LokerFragment();
        profileFragment=new ProfileFragment();
        projectFragment= new ProjectFragment();

        setFragment(homeFragment);
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        setFragment(homeFragment);
                        return true;
                    case R.id.nav_event:
                        setFragment(eventFragment);
                        return true;
                    case R.id.nav_loker:
                        setFragment(lokerFragment);
                        return true;
                    case R.id.nav_profile:
                        setFragment(profileFragment);
                        return true;
                    case R.id.nav_project:
                        setFragment(projectFragment);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }
}
