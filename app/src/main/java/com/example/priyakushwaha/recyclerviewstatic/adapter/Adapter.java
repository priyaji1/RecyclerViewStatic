package com.example.priyakushwaha.recyclerviewstatic.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyakushwaha.recyclerviewstatic.Model.UpdateModel;
import com.example.priyakushwaha.recyclerviewstatic.R;
import com.example.priyakushwaha.recyclerviewstatic.ViewHolder.Holder1;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Holder1> {
    Context c;
    ArrayList<UpdateModel> updateModels;

    public Adapter(Context c, ArrayList<UpdateModel> updateModels) {
        this.c = c;
        this.updateModels = updateModels;
    }

    @NonNull
    @Override
    public Holder1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(c).inflate(R.layout.gridlist, viewGroup, false);
        return new Holder1(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder1 myViewHolderUpdate, int i) {
        UpdateModel m1=updateModels.get(i);
        myViewHolderUpdate.maintain_view_update.setText(m1.getMaintain());
        myViewHolderUpdate.info_view_update.setText(m1.getInfoview());
        myViewHolderUpdate.updatet_img.setImageResource(m1.getInfo_img());

//      //  myViewHolder5.consult_img.setImageResource(m1.getSevice_img());
//        Glide.with(c)
//                .asBitmap()
//                .load("https://www.gettyimages.com/gi-resources/images/CreativeLandingPage/HP_Sept_24_2018/CR3_GettyImages-159018836.jpg")
//                .into(myViewHolder5.consult_img);
    }






    @Override
    public int getItemCount() {
        return updateModels.size();
    }
}

