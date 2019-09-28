package com.demoinstaapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.demoinstaapp.R;
import com.demoinstaapp.model.LikeModel;

import java.util.ArrayList;
import java.util.List;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.LikeViewHolder>{
    private List<LikeModel> LikeList;
    Context context;


    public LikeAdapter(List<LikeModel> likeList, Context context){
        this.LikeList= likeList;
        this.context = context;
    }

    @Override
        public LikeAdapter.LikeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View LikeList2= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_like, parent, false);
            LikeAdapter.LikeViewHolder viewHolder = new LikeAdapter.LikeViewHolder(LikeList2);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(LikeViewHolder holder, int position) {
            final LikeModel myListData = LikeList.get(position);
            holder.name.setText(LikeList.get(position).getName());
            holder.ivProfile.setImageResource(LikeList.get(position).getImgId());
            holder.rvLike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),"click on item: "+myListData.getName(),Toast.LENGTH_LONG).show();
                }
            });
        }


        @Override
        public int getItemCount() {
            return LikeList.size();
        }

        public static class LikeViewHolder extends RecyclerView.ViewHolder {
            public ImageView ivProfile;
            public TextView name;
            public RelativeLayout rvLike;

            public LikeViewHolder(View itemView) {
                super(itemView);
                this.ivProfile = itemView.findViewById(R.id.ivProfile);
                this.name = itemView.findViewById(R.id.name);
                this.name = itemView.findViewById(R.id.rvLike);
            }

        }
    }

