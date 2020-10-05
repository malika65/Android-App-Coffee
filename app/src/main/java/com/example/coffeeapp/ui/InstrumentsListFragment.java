package com.example.coffeeapp.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.coffeeapp.R;
import com.example.coffeeapp.ui.instruments.accessories.AccessorsActivity;
import com.example.coffeeapp.ui.instruments.coffeemachine.MainActivity2;
import com.example.coffeeapp.ui.instruments.coffemol.CoffeeMolActivity;
import com.example.coffeeapp.ui.instruments.parts.Parts;
import com.example.coffeeapp.ui.instruments.parts.PartsActivity;
import com.example.coffeeapp.ui.instruments.roast.RoastActivity;

public class InstrumentsListFragment extends Fragment implements View.OnClickListener {
    private RelativeLayout coffee_machine,coffee_mol,accessors,parts,roaster;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_instruments_list, container, false);


        coffee_machine = (RelativeLayout) rootView.findViewById(R.id.coffee_machine);
        coffee_machine.setOnClickListener(this);
        coffee_mol = (RelativeLayout) rootView.findViewById(R.id.coffee_mol);
        coffee_mol.setOnClickListener(this);
        accessors = (RelativeLayout) rootView.findViewById(R.id.accessors);
        accessors.setOnClickListener(this);
        parts = (RelativeLayout) rootView.findViewById(R.id.parts);
        parts.setOnClickListener(this);
        roaster = (RelativeLayout) rootView.findViewById(R.id.roster);
        roaster.setOnClickListener(this);

        return rootView;



    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.coffee_machine) {
            // button1 action
            Intent intent = new Intent(getActivity(),MainActivity2.class);
            startActivity(intent);

        } else if (view.getId() == R.id.coffee_mol) {
            //button2 action
            Intent intent = new Intent(getActivity(), CoffeeMolActivity.class);
            startActivity(intent);

        } else if (view.getId() == R.id.accessors) {
            //button3 action
            Intent intent = new Intent(getActivity(), AccessorsActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.parts) {
            //button3 action
            Intent intent = new Intent(getActivity(), PartsActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.roster) {
            //button3 action
            Intent intent = new Intent(getActivity(), RoastActivity.class);
            startActivity(intent);
        }

    }
}