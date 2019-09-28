package com.demoinstaapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.demoinstaapp.R;
import com.demoinstaapp.model.PostModel;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{
    private List<PostModel> PostList;
    Context context;

    public PostAdapter(List<PostModel> PostList, Context context){
        this.PostList= PostList;
        this.context = context;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        PostViewHolder pvh = new PostViewHolder(view);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, final int position) {
        holder.ivProfile.setImageResource(PostList.get(position).getUserProfile());
        holder.tvName.setText(PostList.get(position).getUserName());
        holder.tvNameSecond.setText(PostList.get(position).getUserName2());
        holder.tvCaption.setText(PostList.get(position).getUserCaption());
        holder.ivPost.setImageResource(PostList.get(position).getPostImage());
        holder.ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String productName = StoryList.get(position).getProductImage().toString();
                // Toast.makeText(context, productName + " is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return PostList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView ivProfile;
        private ImageView ivPost;
        private TextView tvName,tvNameSecond,tvCaption;
        public PostViewHolder(View view) {
            super(view);
            ivPost=view.findViewById(R.id.ivPost);
            ivProfile=view.findViewById(R.id.ivProfile);
            tvName=view.findViewById(R.id.tvName);
            tvNameSecond=view.findViewById(R.id.tvNameSecond);
            tvCaption=view.findViewById(R.id.tvCaption);

        }
    }
}