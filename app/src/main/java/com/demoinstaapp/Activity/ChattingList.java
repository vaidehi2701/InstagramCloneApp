package com.demoinstaapp.Activity;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import com.demoinstaapp.Adapter.ChattingListAdapter;
import com.demoinstaapp.R;
import com.demoinstaapp.model.ChattingListModel;

import java.util.ArrayList;
import java.util.List;

public class ChattingList extends AppCompatActivity   {

    private RecyclerView recyclerView;
    private ChattingListAdapter adapter;
    private List<ChattingListModel> chatList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting_list);
                // 1. get a reference to recyclerView
        recyclerView = findViewById(R.id.recyclerView);

        adapter = new ChattingListAdapter(chatList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);


        setChatData();
        setUpToolbar();
    }



    private void setChatData() {
        ChattingListModel chat = new ChattingListModel("Grant Gustin","how are you", R.drawable.ic_profile_pic);
        chatList.add(chat);

        chat = new ChattingListModel("Candice Patton ","hello", R.drawable.ic_pp_3);
        chatList.add(chat);

        chat = new ChattingListModel("Danielle Panabaker ","i m fine ",R.drawable.ic_pp_4);
        chatList.add(chat);

        chat = new ChattingListModel("Carlos Valdes","hows your life going on", R.drawable.ic_pp_5);
        chatList.add(chat);

        chat = new ChattingListModel("Tom Cavanagh","will miss u", R.drawable.ic_pp_2);
        chatList.add(chat);

        chat = new ChattingListModel("Grant Gustin","how are you", R.drawable.ic_profile_pic);
        chatList.add(chat);

        chat = new ChattingListModel("Candice Patton ","hello", R.drawable.ic_pp_3);
        chatList.add(chat);

        chat = new ChattingListModel("Danielle Panabaker ","i m fine ",R.drawable.ic_pp_4);
        chatList.add(chat);

        chat = new ChattingListModel("Carlos Valdes","hows your life going on", R.drawable.ic_pp_5);
        chatList.add(chat);

        chat = new ChattingListModel("Tom Cavanagh","will miss u", R.drawable.ic_pp_2);
        chatList.add(chat);

        adapter.notifyDataSetChanged();
    }
    private void setUpToolbar() {

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Message");
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


