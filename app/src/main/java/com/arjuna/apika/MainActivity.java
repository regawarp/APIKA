package com.arjuna.apika;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
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
                        mMainNav.setItemBackgroundResource(R.color.colorApikaMainBlue);
                        setFragment(homeFragment);
                        return true;
                    case R.id.nav_event:
                        mMainNav.setItemBackgroundResource(R.color.colorApikaMainBlue);
                        setFragment(eventFragment);
                        return true;
                    case R.id.nav_loker:
                        mMainNav.setItemBackgroundResource(R.color.colorApikaMainBlue);
                        setFragment(lokerFragment);
                        return true;
                    case R.id.nav_profile:
                        mMainNav.setItemBackgroundResource(R.color.colorApikaBlue);
                        setFragment(profileFragment);
                        return true;
                    case R.id.nav_project:

//                        Window window = activity.getWindow();
//
//// clear FLAG_TRANSLUCENT_STATUS flag:
//                        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//
//// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
//                        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//
//// finally change the color
//                        window.setStatusBarColor(ContextCompat.getColor(activity,R.color.my_statusbar_color));
                        mMainNav.setItemBackgroundResource(R.color.colorApikaMainBlue);
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

    @Override
    public void onBackPressed() {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        finish();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Exit the application and logout?").setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();
    }
}
