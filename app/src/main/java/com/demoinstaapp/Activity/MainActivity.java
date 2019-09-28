package com.demoinstaapp.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.demoinstaapp.Adapter.PostAdapter;
import com.demoinstaapp.Adapter.StoryAdapter;
import com.demoinstaapp.R;
import com.demoinstaapp.model.PhotoModel;
import com.demoinstaapp.model.PostModel;
import com.demoinstaapp.model.StoryModel;

import java.util.ArrayList;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<StoryModel> storylist = new ArrayList<>();
    private List<PostModel> postList = new ArrayList<>();
    private RecyclerView rvStory,rvPost;
    private StoryAdapter storyAdapter;
    private PostAdapter postAdapter;
    private BottomNavigationView bootomNavigationView;
    private ActionBar toolbar;
    private ImageView ivCamera,ivChat;
    private TextView tvName;
    private static final int pic_id = 123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvStory = findViewById(R.id.rvStory);
        rvPost = findViewById(R.id.rvPost);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.main_action_bar);
        View view =getSupportActionBar().getCustomView();

        ivCamera = findViewById(R.id.ivCamera);
        tvName = findViewById(R.id.tvName);
        ivChat = findViewById(R.id.ivChat);

        ivCamera.setOnClickListener(this);
        ivChat.setOnClickListener(this);



        bootomNavigationView = findViewById(R.id.bootomNavigationView);
        bootomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // rvStory.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.HORIZONTAL));
        storyAdapter = new StoryAdapter(storylist, getApplicationContext());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

        postAdapter = new PostAdapter(postList, getApplicationContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);

        rvStory.setLayoutManager(horizontalLayoutManager);
        rvStory.setAdapter(storyAdapter);

        rvPost.setLayoutManager(layoutManager);
        rvPost.setAdapter(postAdapter);

        AddStory();
        AddPost();
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {

        // Match the request 'pic id with requestCode
        if (requestCode == pic_id) {
            Bitmap photo = (Bitmap)data.getExtras()
                    .get("data");

            // Set the image in imageview for display
            //click_image_id.setImageBitmap(photo);
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
           // Fragment fragment;
            switch (menuItem.getItemId()) {
                case R.id.Home:
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.Add:
                    //toolbar.setTitle("Photo");
                    Intent intent1=new Intent(MainActivity.this,LikePage.class);
                    startActivity(intent1);
                    return true;
                case R.id.User:
                    //toolbar.setTitle("Grant Gustin");
                    Intent i=new Intent(MainActivity.this,UserProfile.class);
                    startActivity(i);
                    return true;

            }
            return false;
        }
    };
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivCamera:
                Intent camera_intent  = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent, pic_id);
                break;
            case  R.id.ivChat:
                Intent intent = new Intent(this,ChattingList.class);
                startActivity(intent);
                break;
        }
        }

    private void AddStory(){
        StoryModel Story1 = new StoryModel(R.drawable.ic_pp_4);
        StoryModel Story2 = new StoryModel( R.drawable.ic_pp_2);
        StoryModel Story3 = new StoryModel( R.drawable.ic_pp_3);
        StoryModel Story4 = new StoryModel( R.drawable.ic_pp_5);
        StoryModel Story5 = new StoryModel( R.drawable.ic_pp_2);
        StoryModel Story6 = new StoryModel( R.drawable.post1);
        StoryModel Story7 = new StoryModel( R.drawable.post2);
        StoryModel Story8 = new StoryModel( R.drawable.post3);
        StoryModel Story9 = new StoryModel( R.drawable.post1);
        storylist.add(Story1);
        storylist.add(Story2);
        storylist.add(Story3);
        storylist.add(Story4);
        storylist.add(Story5);
        storylist.add(Story6);
        storylist.add(Story7);
        storylist.add(Story8);
        storylist.add(Story9);

    }

    private void AddPost() {
        //Post = new ArrayList<>();
        postList.add(new PostModel(R.drawable.ic_profile_pic, "Grant_Gustin", "Grant_Gustin", "My name is barry allen and i am the fastest man alive on the planet.",R.drawable.p2));
        postList.add(new PostModel(R.drawable.ic_profile_pic, "Grant_Gustin", "Grant_Gustin", "When i was child my mother was killed by something impossible and my father went to prison",R.drawable.p3));
        postList.add(new PostModel(R.drawable.ic_profile_pic, "Grant_Gustin", "Grant_Gustin", "and an accident made me that impossible. ",R.drawable.p2));
        postList.add(new PostModel(R.drawable.ic_profile_pic, "Grant_Gustin", "Grant_Gustin", "cfsdhysfdjhvydhjsvhfhsfdhjsgfgyhfdhjsdjsgfdvsjh",R.drawable.p3));
        postList.add(new PostModel(R.drawable.ic_profile_pic, "Grant_Gustin", "Grant_Gustin", "cfsdhysfdjhvydhjsvhfhsfdhjsgfgyhfdhjsdjsgfdvsjh",R.drawable.p2));
        postList.add(new PostModel(R.drawable.ic_profile_pic, "Grant_Gustin", "Grant_Gustin", "cfsdhysfdjhvydhjsvhfhsfdhjsgfgyhfdhjsdjsgfdvsjh",R.drawable.p3));
    }


}
