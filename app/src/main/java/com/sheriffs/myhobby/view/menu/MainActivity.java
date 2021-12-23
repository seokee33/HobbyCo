package com.sheriffs.myhobby.view.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sheriffs.myhobby.R;
import com.sheriffs.myhobby.databinding.ActivityMainBinding;
import com.sheriffs.myhobby.view.menu.hobbyList.Menu_HobbyList;
import com.sheriffs.myhobby.view.menu.home.Menu_Home;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {
    //BottomNavi
    private BottomNavigationView bottomNavi;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Menu_Home menu_home;
    private Menu_HobbyList menu_hobbyList;

    private ActivityMainBinding binding;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        view = binding.getRoot();
        setContentView(view);

        init();
        binding.bottomNavi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navi_home:
                        setFrag(0);
                        break;
                    case R.id.navi_hobbyList:
                        setFrag(1);
                        break;
                }
                return true;
            }
        });
        setFrag(0);
    }

    private void setFrag(int i){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (i){
            case 0:
                binding.tvNowPage.setText("내 취미");
                ft.replace(binding.mainFrameNavi.getId(),menu_home).commit();
                break;
            case 1:
                binding.tvNowPage.setText("취미 리스트");
                ft.replace(binding.mainFrameNavi.getId(),menu_hobbyList).commit();
                break;
        }
    }


    private void init(){
        menu_home = new Menu_Home();
        menu_hobbyList = new Menu_HobbyList();
    }
}