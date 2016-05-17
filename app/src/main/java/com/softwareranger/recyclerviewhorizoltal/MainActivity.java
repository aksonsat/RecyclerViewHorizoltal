package com.softwareranger.recyclerviewhorizoltal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.softwareranger.recyclerviewhorizoltal.adapter.DataAdapter;
import com.softwareranger.recyclerviewhorizoltal.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new DataAdapter(this, (ArrayList<Model>) initModel());
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<Model> initModel() {

        Model khaosoi = new Model("ข้าวซอยไก่ 1", R.mipmap.ic_launcher);
        Model khaosoi2 = new Model("ข้าวซอยไก่ 2", R.mipmap.ic_launcher);
        Model khaosoi3 = new Model("ข้าวซอยไก่ 3", R.mipmap.ic_launcher);
        Model khaosoi4 = new Model("ข้าวซอยไก 4่", R.mipmap.ic_launcher);
        Model khaosoi5 = new Model("ข้าวซอยไก่ 5", R.mipmap.ic_launcher);
        Model khaosoi6 = new Model("ข้าวซอยไก่ 6", R.mipmap.ic_launcher);
        Model khaosoi7 = new Model("ข้าวซอยไก่ 7", R.mipmap.ic_launcher);
        Model khaosoi8 = new Model("ข้าวซอยไก่ 8", R.mipmap.ic_launcher);
        Model khaosoi9 = new Model("ข้าวซอยไก่ 9", R.mipmap.ic_launcher);
        Model khaosoi0 = new Model("ข้าวซอยไก่ 0", R.mipmap.ic_launcher);

        List<Model> dataset = new ArrayList<Model>();

        dataset.add(khaosoi);
        dataset.add(khaosoi2);
        dataset.add(khaosoi3);
        dataset.add(khaosoi4);
        dataset.add(khaosoi5);
        dataset.add(khaosoi6);
        dataset.add(khaosoi7);
        dataset.add(khaosoi8);
        dataset.add(khaosoi9);
        dataset.add(khaosoi0);

        return dataset;
    }
}
