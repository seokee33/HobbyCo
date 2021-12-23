package com.sheriffs.myhobby.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sheriffs.myhobby.R;
import com.sheriffs.myhobby.model.HobbyList_Rv_Model;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HobbyList_Recyclerview_Adapter extends RecyclerView.Adapter<HobbyList_Recyclerview_Adapter.ViewHolder> {
    private ArrayList<HobbyList_Rv_Model> hobbyList;


    @NonNull
    @NotNull
    @Override
    public HobbyList_Recyclerview_Adapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hobbylist_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull HobbyList_Recyclerview_Adapter.ViewHolder holder, int position) {
        holder.onBind(hobbyList.get(position));
    }


    public void setBorderList(ArrayList<HobbyList_Rv_Model> list){
        this.hobbyList = list;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return hobbyList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView hobbyName;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            hobbyName = (ImageView) itemView.findViewById(R.id.iv_hobbyList_rv_Image);
            name = (TextView) itemView.findViewById(R.id.tv_hobbyList_rv_name);

        }

        void onBind(HobbyList_Rv_Model item){
            hobbyName.setImageResource(item.getHobbyImage());
            name.setText(item.getName());
        }
    }
}
