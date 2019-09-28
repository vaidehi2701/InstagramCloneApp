package com.demoinstaapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.demoinstaapp.R;
import com.demoinstaapp.model.GameModel;

import java.util.List;

    public class GamingAdapter extends RecyclerView.Adapter<GamingAdapter.GameViewHolder>{

        private List<GameModel> GameList;

        public GamingAdapter(List<GameModel> gameList) {
            this.GameList = gameList;
        }

        @Override
        public GamingAdapter.GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_game, parent, false);

            return new GamingAdapter.GameViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(GamingAdapter.GameViewHolder holder, int position) {
            holder.tvName.setText(GameList.get(position).getName());
            holder.ivProfile.setImageResource(GameList.get(position).getImageUrl());
        }

        @Override
        public int getItemCount() {
            return GameList.size();
        }

        public class GameViewHolder extends RecyclerView.ViewHolder {
            public TextView tvName;
            public ImageView ivProfile;

            public GameViewHolder(View view) {
                super(view);
                ivProfile = view.findViewById(R.id.ivProfile);
                tvName = view.findViewById(R.id.tvName);
            }
        }

    }
