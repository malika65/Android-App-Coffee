package com.example.coffeeapp.ui.list;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffeeapp.R;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<ExampleItem> exampleList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_list, container, false);
        mRecyclerView = (RecyclerView) root.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(inflater.getContext());
        mRecyclerView.setLayoutManager(layoutManager);

        exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.espresso1, "Экспрессо", getString(R.string.espresso)));
        exampleList.add(new ExampleItem(R.drawable.machiato1, "Макиато", getString(R.string.machiato)));
        exampleList.add(new ExampleItem(R.drawable.capp, "Каппучино",  getString(R.string.capucino)));
        exampleList.add(new ExampleItem(R.drawable.latte, "Латте", getString(R.string.latte)));
        exampleList.add(new ExampleItem(R.drawable.mokko, "Мокко", getString(R.string.mokko)));
        exampleList.add(new ExampleItem(R.drawable.conpanna, "Кон панна", getString(R.string.conPana)));
        exampleList.add(new ExampleItem(R.drawable.affogato, "Аффогато",  getString(R.string.affogato)));
        exampleList.add(new ExampleItem(R.drawable.white, "Флэт уайт",  getString(R.string.flatWhite)));
        exampleList.add(new ExampleItem(R.drawable.americano, "Американо", getString(R.string.americano)));
        exampleList.add(new ExampleItem(R.drawable.irishcoffee, "Айриш",  getString(R.string.Irish)));
        exampleList.add(new ExampleItem(R.drawable.icedlatte, "Холодный", getString(R.string.Iced)));
        exampleList.add(new ExampleItem(R.drawable.frappe, "Фраппе",  getString(R.string.Frappe)));
        exampleList.add(new ExampleItem(R.drawable.raf, "Раф", getString(R.string.raf)));


        mAdapter = new ExampleAdapter(getActivity(), exampleList);
        mRecyclerView.setAdapter(mAdapter);



        return root;
    }


}