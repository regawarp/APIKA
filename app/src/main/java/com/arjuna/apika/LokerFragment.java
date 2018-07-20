package com.arjuna.apika;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arjuna.apika.adapter.LokerRVAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class LokerFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Loker> lokerList;

    public LokerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_loker, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.rv_loker);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        initializeData();
        LokerRVAdapter lokerRVAdapter= new LokerRVAdapter(lokerList);
        recyclerView.setAdapter(lokerRVAdapter);

        return view;
    }

    private void initializeData() {
        lokerList=new ArrayList<>();
        lokerList.add(new Loker("Android Programmer","IDR 50.000.000","Bandung","1 day ago"));
        lokerList.add(new Loker("Web Programmer","IDR 50.000.000","Cmahi","8 days ago"));
        lokerList.add(new Loker("Java Programmer","IDR 50.000.000","Jakarta","12 days ago"));
    }

}
