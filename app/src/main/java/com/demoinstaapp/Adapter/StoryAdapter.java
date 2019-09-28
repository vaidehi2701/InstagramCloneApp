package com.demoinstaapp.Adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.demoinstaapp.R;
import com.demoinstaapp.model.StoryModel;

import java.util.List;

    public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder>{
        private List<StoryModel> StoryList;
        Context context;

        public StoryAdapter(List<StoryModel> horizontalGrocderyList, Context context){
            this.StoryList= horizontalGrocderyList;
            this.context = context;
        }

        @Override
        public StoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //inflate the layout file
            View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story, parent, false);
            StoryViewHolder gvh = new StoryViewHolder(groceryProductView);
            return gvh;
        }

        @Override
        public void onBindViewHolder(StoryViewHolder holder, final int position) {
            holder.imageView.setImageResource(StoryList.get(position).getProductImage());
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //String productName = StoryList.get(position).getProductImage().toString();
                   // Toast.makeText(context, productName + " is selected", Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return StoryList.size();
        }

        public class StoryViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            public StoryViewHolder(View view) {
                super(view);
                imageView=view.findViewById(R.id.idProductImage);
            }
        }
    }

