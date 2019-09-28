package com.demoinstaapp.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.demoinstaapp.R;

import com.demoinstaapp.model.PhotoModel;

import java.util.List;



    public class GridViewAdapter extends RecyclerView.Adapter<GridViewAdapter.ViewHolder> {
        private List<PhotoModel> items;
        private Activity activity;

        public GridViewAdapter(Activity activity, List<PhotoModel> items) {
            this.activity = activity;
            this.items = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            LayoutInflater inflater = activity.getLayoutInflater();
            View view = inflater.inflate(R.layout.item_grid, viewGroup, false);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(GridViewAdapter.ViewHolder viewHolder, int position) {
            viewHolder.imageView.setImageResource(items.get(position).getDrawableId());

        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        /**
         * View holder to display each RecylerView item
         */
        protected class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView imageView;


            public ViewHolder(View view) {
                super(view);

                imageView = (ImageView) view.findViewById(R.id.image);
            }
        }
    }


