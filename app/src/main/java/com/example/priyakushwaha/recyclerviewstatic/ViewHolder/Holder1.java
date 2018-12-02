package com.example.priyakushwaha.recyclerviewstatic.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.priyakushwaha.recyclerviewstatic.R;


public class Holder1 extends RecyclerView.ViewHolder {
    public TextView maintain_view_update;
    public ImageView updatet_img;
    public TextView info_view_update;
    public Holder1(View view){
        super(view);
        maintain_view_update=itemView.findViewById(R.id.maintain_update);
        info_view_update=itemView.findViewById(R.id.info_update);
        updatet_img=itemView.findViewById(R.id.img_update);
    }
}
