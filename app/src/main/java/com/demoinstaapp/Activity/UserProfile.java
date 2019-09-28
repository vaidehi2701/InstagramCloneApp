package com.demoinstaapp.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

import com.demoinstaapp.Adapter.Pager;
import com.demoinstaapp.Fragment.Fragment1;
import com.demoinstaapp.Fragment.Fragment2;
import com.demoinstaapp.Fragment.Fragment3;
import com.demoinstaapp.R;

public class UserProfile extends AppCompatActivity  implements View.OnClickListener {

    ActionBar actionbar;
    private TextView textview;
    LayoutParams layoutparams;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Button btnEdit,btnFollow;
    private BottomNavigationView bootomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        setUpToolbar();

        viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);
        btnEdit=findViewById(R.id.btnEdit);
        btnFollow=findViewById(R.id.btnFollow);

        btnEdit.setOnClickListener(this);

        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        bootomNavigationView = findViewById(R.id.bootomNavigationView);
        bootomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        setupTabIcons();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            // Fragment fragment;
            switch (menuItem.getItemId()) {
                case R.id.Home:
                    Intent intent=new Intent(UserProfile.this,MainActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.Add:
                    //toolbar.setTitle("Photo");
                    Intent intent1=new Intent(UserProfile.this,LikePage.class);
                    startActivity(intent1);
                    return true;
                case R.id.User:
                    //toolbar.setTitle("Grant Gustin");
                    Intent i=new Intent(UserProfile.this,UserProfile.class);
                    startActivity(i);
                    return true;

            }
            return false;
        }
    };
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,EditProfile.class);
        startActivity(intent);

    }


    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_menu);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_menu_vertical);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_location);
    }
//
    private void setupViewPager(ViewPager viewPager) {
        Pager adapter = new Pager(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "ONE");
        adapter.addFragment(new Fragment2(), "TWO");
        adapter.addFragment(new Fragment3(), "THREE");
        viewPager.setAdapter(adapter);
    }

    private void setUpToolbar() {

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        else if (item.getItemId() == R.id.menu_settings) {
            Intent intent = new Intent(UserProfile.this, prefsActivity.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.setting, menu);
        return true;
    }


}
