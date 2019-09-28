package com.demoinstaapp.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demoinstaapp.Adapter.GridViewAdapter;
import com.demoinstaapp.R;
import com.demoinstaapp.model.PhotoModel;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    private GridViewAdapter gridViewAdapter;
    private RecyclerView list;
    private ArrayList<PhotoModel> ProfilePic;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        list = view.findViewById(R.id.list);

        setDummyData();

        list.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
        list.setLayoutManager(layoutManager);
        gridViewAdapter = new GridViewAdapter(getActivity(), ProfilePic);
        list.setAdapter(gridViewAdapter);

        return view;

    }

    private void setDummyData() {
        ProfilePic = new ArrayList<>();
        ProfilePic.add(new PhotoModel(R.drawable.post1));
        ProfilePic.add(new PhotoModel(R.drawable.post2));
        ProfilePic.add(new PhotoModel(R.drawable.post1));
        ProfilePic.add(new PhotoModel(R.drawable.post2 ));
        ProfilePic.add(new PhotoModel(R.drawable.post1 ));
        ProfilePic.add(new PhotoModel(R.drawable.post1));
        ProfilePic.add(new PhotoModel(R.drawable.post2 ));
        ProfilePic.add(new PhotoModel(R.drawable.post1 ));
        ProfilePic.add(new PhotoModel(R.drawable.post1));
        ProfilePic.add(new PhotoModel(R.drawable.post1));
        ProfilePic.add(new PhotoModel(R.drawable.post1));
        ProfilePic.add(new PhotoModel(R.drawable.post1));


    }
}

