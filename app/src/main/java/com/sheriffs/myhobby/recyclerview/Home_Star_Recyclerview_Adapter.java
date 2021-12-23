package com.sheriffs.myhobby.recyclerview;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sheriffs.myhobby.R;
import com.sheriffs.myhobby.model.Home_Star_Rv_Model;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Home_Star_Recyclerview_Adapter extends RecyclerView.Adapter<Home_Star_Recyclerview_Adapter.ViewHolder> {
    private ArrayList<Home_Star_Rv_Model> borderList;


    @NonNull
    @NotNull
    @Override
    public Home_Star_Recyclerview_Adapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_rv_star, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Home_Star_Recyclerview_Adapter.ViewHolder holder, int position) {
        holder.onBind(borderList.get(position));
    }


    public void setBorderList(ArrayList<Home_Star_Rv_Model> list){
        this.borderList = list;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return borderList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView borderImage;
        TextView title;
        TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            borderImage = (ImageView) itemView.findViewById(R.id.iv_home_rv_star);
            title = (TextView) itemView.findViewById(R.id.tv_home_rv_star_title);
            text = (TextView) itemView.findViewById(R.id.tv_home_rv_star_text);


        }

        void onBind(Home_Star_Rv_Model item){
            borderImage.setImageResource(item.getBorderImage());
            title.setText(item.getTitle());
        }
    }
}
