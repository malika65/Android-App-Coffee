package com.example.coffeeapp.ui.cosiness;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffeeapp.R;

import java.util.ArrayList;
import java.util.List;


public class NewFragment extends Fragment {


    public NewFragment() {
    }


    RecyclerView recyclerView;
    List<Model> itemList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_new, container, false);

        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new ItemAdapter(initData(),getContext()));



        return view;
    }

    private List<Model> initData() {

        itemList=new ArrayList<>();
        itemList.add(new Model(R.drawable.hugge));
        itemList.add(new Model(R.drawable.hugge1));
        itemList.add(new Model(R.drawable.hugge2));
        itemList.add(new Model(R.drawable.hugge3));
        itemList.add(new Model(R.drawable.hugge4));
        itemList.add(new Model(R.drawable.hugge5));
        itemList.add(new Model(R.drawable.hugge6));
        itemList.add(new Model(R.drawable.hugge7));
        itemList.add(new Model(R.drawable.hugge8));
        itemList.add(new Model(R.drawable.hugge9));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        return itemList;
    }
}