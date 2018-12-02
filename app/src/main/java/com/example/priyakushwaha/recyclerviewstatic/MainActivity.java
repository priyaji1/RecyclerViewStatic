package com.example.priyakushwaha.recyclerviewstatic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.priyakushwaha.recyclerviewstatic.Model.UpdateModel;
import com.example.priyakushwaha.recyclerviewstatic.adapter.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager = new  LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new Adapter(this, getData()) {
        });
    }
    private ArrayList getData() {
        ArrayList<UpdateModel> mymodel1 = new ArrayList<>();
        UpdateModel m1 = new UpdateModel();
        m1.setMaintain("Well Maintioned");
        m1.setInfoview("this ancestral property\nbelonging to the fig");
        m1.setInfo_img(R.drawable.sevicess);
        mymodel1.add(m1);
        m1 = new UpdateModel();
        m1.setMaintain("Well Maintioned");
        m1.setInfoview("this ancestral property\nbelonging to the fig");
        m1.setInfo_img(R.drawable.sevicess);
        mymodel1.add(m1);
        m1 = new UpdateModel();
        m1.setMaintain("Well Maintioned");
        m1.setInfoview("this ancestral property\nbelonging to the fig");
        m1.setInfo_img(R.drawable.sevicess);
        mymodel1.add(m1);
        m1 = new UpdateModel();
        m1.setMaintain("Well Maintioned");
        m1.setInfoview("this ancestral property\nbelonging to the fig");
        m1.setInfo_img(R.drawable.sevicess);
        mymodel1.add(m1);
        return mymodel1;

    }
}
