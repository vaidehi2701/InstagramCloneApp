package com.demoinstaapp.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demoinstaapp.Adapter.GamingAdapter;
import com.demoinstaapp.R;
import com.demoinstaapp.model.GameModel;

import java.util.ArrayList;
import java.util.List;

public class GamingFragment extends Fragment {

    private RecyclerView rvSearch;
    private GamingAdapter gamingAdapter;
    private List<GameModel> gameModelList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gaming_fragment, container, false);



        gamingAdapter = new GamingAdapter(gameModelList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvSearch.setLayoutManager(layoutManager);
        rvSearch.setItemAnimator(new DefaultItemAnimator());
        rvSearch.setAdapter(gamingAdapter);

        setGamingData();
        return view;

    }

    private void setGamingData() {
        GameModel game = new GameModel("Grant Gustin", R.drawable.ic_profile_pic);
        gameModelList.add(game);

        game = new GameModel("Candice Patton ", R.drawable.ic_pp_3);
        gameModelList.add(game);

        game = new GameModel("Danielle Panabaker ",R.drawable.ic_pp_4);
        gameModelList.add(game);

        game = new GameModel("Carlos Valdes",R.drawable.ic_pp_5);
        gameModelList.add(game);

        game = new GameModel("Tom Cavanagh", R.drawable.ic_pp_2);
        gameModelList.add(game);

        game = new GameModel("Grant Gustin", R.drawable.ic_profile_pic);
        gameModelList.add(game);

        game = new GameModel("Candice Patton ", R.drawable.ic_pp_3);
        gameModelList.add(game);

        game = new GameModel("Danielle Panabaker ",R.drawable.ic_pp_4);
        gameModelList.add(game);

        game = new GameModel("Carlos Valdes", R.drawable.ic_pp_5);
        gameModelList.add(game);

        game = new GameModel("Tom Cavanagh", R.drawable.ic_pp_2);
        gameModelList.add(game);

        gamingAdapter.notifyDataSetChanged();
    }

    }



