package com.demoinstaapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.demoinstaapp.Activity.ChattingActivity;
import com.demoinstaapp.R;
import com.demoinstaapp.model.ChattingListModel;

import java.util.List;

public class ChattingListAdapter extends RecyclerView.Adapter<ChattingListAdapter.ChatViewHolder>{

        private List<ChattingListModel> chatList;

        public ChattingListAdapter(List<ChattingListModel> chatList) {
            this.chatList = chatList;
        }

        @Override
        public ChatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_chatting_list, parent, false);

            return new ChatViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(ChatViewHolder holder, int position) {
            holder.item_title.setText(chatList.get(position).getTitle());
            holder.item_chat.setText(chatList.get(position).getChat());
            holder.item_icon.setImageResource(chatList.get(position).getImageUrl());

        }

        @Override
        public int getItemCount() {
            return chatList.size();
        }

        public class ChatViewHolder extends RecyclerView.ViewHolder {
            public TextView item_title,item_chat;
            public ImageView item_icon;
            public RelativeLayout parentLayout;



            public ChatViewHolder(View view) {
                super(view);
                parentLayout = view.findViewById(R.id.parentLayout);
                item_title = view.findViewById(R.id.item_title);
                item_chat = view.findViewById(R.id.item_chat);
                item_icon = view.findViewById(R.id.item_icon);
                parentLayout.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Context context = v.getContext();
                        Intent intent = new Intent(context, ChattingActivity.class);
                        context.startActivity(intent);
                    }
                });
            }
        }
    }