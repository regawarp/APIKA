package com.arjuna.apika;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arjuna.apika.adapter.ProjectRVAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Project> projectList;

    public ProjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv_project);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        initializeData();
        ProjectRVAdapter projectRVAdapter = new ProjectRVAdapter(projectList);
        recyclerView.setAdapter(projectRVAdapter);

        return view;
    }

    private void initializeData() {
        projectList = new ArrayList<>();
        projectList.add(new Project("Project Satu", "2 months", "This is Project Satu", "3 days ago",
                "Auctioner 1", "Budget: IDR 100.000.000 - 120.000.000"));
        projectList.add(new Project("Project Dua", "4 months", "This is Project Dua", "15 days ago",
                "Auctioner 2", "Bugdget: IDR 30.000.000 - 40.000.000"));
        projectList.add(new Project("Project Tiga", "5 months", "This is Project Tiga", "7 days ago",
                "Auctioner 3", "Budget: IDR 20.500.0000 - 30.000.000"));
    }
}
