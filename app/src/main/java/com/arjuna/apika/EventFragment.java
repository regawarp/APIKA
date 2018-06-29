package com.arjuna.apika;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arjuna.apika.adapter.EventRVAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {

    List<Event> events;

    private RecyclerView recyclerView;

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_event, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.rv_event);
//        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager= new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        initializeData();
        EventRVAdapter eventRVAdapter= new EventRVAdapter(events);
        recyclerView.setAdapter(eventRVAdapter);

        return view;
    }
    // This method creates an ArrayList that has three Person objects
    // Checkout the project associated with this tutorial on Github if
    // you want to use the same images.
    private void initializeData(){
        events = new ArrayList<>();
        events.add(new Event("Meet n Greet", "28 Mei 2018 / 05:00 PM", "Polban"));
        events.add(new Event("Makrab", "28 Mei 2018 / 05:00 PM", "Ngopi Doeloe"));
        events.add(new Event("Gowes", "28 Mei 2018 / 05:00 PM", "Dago"));
        events.add(new Event("Seminar APIKA", "28 Mei 2018 / 05:00 PM", "Pendopo Tony Soewandito"));
    }
}
