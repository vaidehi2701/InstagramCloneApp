package com.demoinstaapp.Activity;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.demoinstaapp.Adapter.LikeAdapter;
import com.demoinstaapp.Adapter.PostAdapter;
import com.demoinstaapp.Fragment.GamingFragment;
import com.demoinstaapp.R;
import com.demoinstaapp.model.LikeModel;
import com.demoinstaapp.model.StoryModel;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

import java.util.ArrayList;
import java.util.List;

public class LikePage extends AppCompatActivity implements View.OnClickListener {

    private FragmentTransaction transaction;
    private LinearLayout llGaming,llScience,llFood;
    private TextView tvFood,tvScience,tvGaming;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like_page);



        tvFood=findViewById(R.id.tvFood);
        tvScience=findViewById(R.id.tvScience);
        tvGaming=findViewById(R.id.tvGaming);

        llGaming=findViewById(R.id.llGaming);
        llScience=findViewById(R.id.llScience);
        llFood=findViewById(R.id.llFood);

        llGaming.setOnClickListener(this);
        llScience.setOnClickListener(this);
        llFood.setOnClickListener(this);



        setUpToolbar();
        loadFragment(new GamingFragment());

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.llGaming:
                tvGaming.setTextColor(Color.parseColor("#311b92"));
                tvScience.setTextColor(Color.parseColor("#9575cd"));
                tvFood.setTextColor(Color.parseColor("#9575cd"));
                tvGaming.setTextSize(18);
                tvScience.setTextSize(16);
                tvFood.setTextSize(16);
                loadFragment(new GamingFragment());
                break;

            case R.id.llScience:
                tvScience.setTextColor(Color.parseColor("#311b92"));
                tvGaming.setTextColor(Color.parseColor("#9575cd"));
                tvFood.setTextColor(Color.parseColor("#9575cd"));
                tvGaming.setTextSize(16);
                tvScience.setTextSize(18);
                tvFood.setTextSize(16);
                loadFragment(new GamingFragment());
                break;

            case R.id.llFood:
                tvFood.setTextColor(Color.parseColor("#311b92"));
                tvGaming.setTextColor(Color.parseColor("#9575cd"));
                tvScience.setTextColor(Color.parseColor("#9575cd"));
                tvGaming.setTextSize(16);
                tvScience.setTextSize(16);
                tvFood.setTextSize(18);
                loadFragment(new GamingFragment());
                break;
        }

    }
    private void loadFragment(Fragment fragment) {
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flContainer, fragment);
//        transaction.addToBackStack(false);
        transaction.commit();
    }
    private void setUpToolbar() {

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Interest");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }


        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }
}
