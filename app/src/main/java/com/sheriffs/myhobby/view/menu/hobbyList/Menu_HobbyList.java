package com.sheriffs.myhobby.view.menu.hobbyList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.sheriffs.myhobby.R;
import com.sheriffs.myhobby.databinding.MenuHobbylistBinding;
import com.sheriffs.myhobby.databinding.MenuHomeBinding;
import com.sheriffs.myhobby.model.HobbyList_Rv_Model;
import com.sheriffs.myhobby.model.Home_Star_Rv_Model;
import com.sheriffs.myhobby.recyclerview.HobbyList_Recyclerview_Adapter;
import com.sheriffs.myhobby.recyclerview.Home_Star_Recyclerview_Adapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Menu_HobbyList extends Fragment {

    private View view;
    private MenuHobbylistBinding binding;

    //스포츠 RV
    HobbyList_Recyclerview_Adapter sports_Rv_Adapter;
    RecyclerView sports_Rv;
    ArrayList<HobbyList_Rv_Model> sportsList;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        binding = MenuHobbylistBinding.inflate(inflater,container,false);
        view = binding.getRoot();

        //스포츠 리스트
        sportsList = new ArrayList<>();
        for(int i=0;i<12;i++){
            sportsList.add(new HobbyList_Rv_Model(R.drawable.time,"???"));
        }

        sports_Rv = binding.rvHobbyListSports;
        sports_Rv_Adapter = new HobbyList_Recyclerview_Adapter();

        sports_Rv.setAdapter(sports_Rv_Adapter);

        LinearLayoutManager rv_sport_Layout = new GridLayoutManager(getContext(),6);
        sports_Rv.setLayoutManager(rv_sport_Layout);



        sports_Rv_Adapter.setBorderList(sportsList);
        SnapHelper snap_rv_sports = new LinearSnapHelper();
        snap_rv_sports.attachToRecyclerView(sports_Rv);

        return view;
    }
}
