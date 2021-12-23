package com.sheriffs.myhobby.view.menu.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.sheriffs.myhobby.R;
import com.sheriffs.myhobby.databinding.ActivityMainBinding;
import com.sheriffs.myhobby.databinding.MenuHomeBinding;
import com.sheriffs.myhobby.model.Home_Star_Rv_Model;
import com.sheriffs.myhobby.recyclerview.Home_Star_Recyclerview_Adapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Menu_Home extends Fragment {
    private View view;
    private MenuHomeBinding binding;

    //즐겨찾기1
    private RecyclerView rv_Star1_border;
    private Home_Star_Recyclerview_Adapter rv_Star1_Adapter;
    private ArrayList<Home_Star_Rv_Model> star1_List;

    //즐겨찾기2
    private RecyclerView rv_Star2_border;
    private Home_Star_Recyclerview_Adapter rv_Star2_Adapter;
    private ArrayList<Home_Star_Rv_Model> star2_List;

    //즐겨찾기3
    private RecyclerView rv_Star3_border;
    private Home_Star_Recyclerview_Adapter rv_Star3_Adapter;
    private ArrayList<Home_Star_Rv_Model> star3_List;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        binding = MenuHomeBinding.inflate(inflater,container,false);
        view = binding.getRoot();

        //즐겨찾기 1
        binding.tvRvStar1Sub.setText("즐겨찾기1");

        rv_Star1_border = binding.rvStar1Border;
        rv_Star1_Adapter = new Home_Star_Recyclerview_Adapter();

        rv_Star1_border.setAdapter(rv_Star1_Adapter);

        LinearLayoutManager rv_Star1_layoutManager = new LinearLayoutManager(getContext());
        rv_Star1_layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_Star1_border.setLayoutManager(rv_Star1_layoutManager);

        star1_List = new ArrayList<>();
        for(int i=0;i<3;i++){
            star1_List.add(new Home_Star_Rv_Model(R.drawable.time,"제목"+i,"내용"));
        }

        rv_Star1_Adapter.setBorderList(star1_List);
        SnapHelper snap_rv_Star1 = new LinearSnapHelper();
        snap_rv_Star1.attachToRecyclerView(rv_Star1_border);

        //즐겨찾기 2
        rv_Star2_border = binding.rvStar2Border;
        rv_Star2_Adapter = new Home_Star_Recyclerview_Adapter();

        rv_Star2_border.setAdapter(rv_Star2_Adapter);

        LinearLayoutManager rv_Star2_layoutManager = new LinearLayoutManager(getContext());
        rv_Star2_layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_Star2_border.setLayoutManager(rv_Star2_layoutManager);

        binding.tvRvStar2Sub.setText("즐겨찾기2");
        star2_List = new ArrayList<>();
        for(int i=0;i<3;i++){
            star2_List.add(new Home_Star_Rv_Model(R.drawable.baseball_border,"제목"+i,"내용"));
        }
        rv_Star2_Adapter.setBorderList(star2_List);

        SnapHelper snap_rv_Star2 = new LinearSnapHelper();
        snap_rv_Star2.attachToRecyclerView(rv_Star2_border);

        //즐겨찾기 3
        rv_Star3_border = binding.rvStar3Border;
        rv_Star3_Adapter = new Home_Star_Recyclerview_Adapter();

        rv_Star3_border.setAdapter(rv_Star3_Adapter);

        LinearLayoutManager rv_Star3_layoutManager = new LinearLayoutManager(getContext());
        rv_Star3_layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_Star3_border.setLayoutManager(rv_Star3_layoutManager);

        binding.tvRvStar3Sub.setText("즐겨찾기3");
        star3_List = new ArrayList<>();
        for(int i=0;i<2;i++){
            star3_List.add(new Home_Star_Rv_Model(R.drawable.baseball_border,"제목"+i,"내용"));
        }
        star3_List.add(new Home_Star_Rv_Model(R.drawable.time,"제목3" ,"내용"));
        rv_Star3_Adapter.setBorderList(star3_List);

        SnapHelper snap_rv_Star3 = new LinearSnapHelper();
        snap_rv_Star3.attachToRecyclerView(rv_Star3_border);

        return view;
    }



}
