package com.arjuna.apika.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.arjuna.apika.Project;
import com.arjuna.apika.ProjectDetailActivity;
import com.arjuna.apika.R;

import java.util.List;

/**
 * Created by Regawa on 6/29/2018.
 */

public class ProjectRVAdapter extends RecyclerView.Adapter<ProjectRVAdapter.ProjectViewHolder> {

    private List<Project> projects;
    private Context context;

    public ProjectRVAdapter(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_project, parent, false);
        ProjectViewHolder lokerViewHolder = new ProjectViewHolder(v);
        context = parent.getContext();
        return lokerViewHolder;
    }

    @Override
    public void onBindViewHolder(ProjectViewHolder holder, int position) {
        holder.mName.setText(projects.get(position).getProjectName());
        holder.mAuctioner.setText(projects.get(position).getProjectAuctioner());
        holder.mDescription.setText(projects.get(position).getProjectDescription());
        holder.mDayPosted.setText(String.valueOf(projects.get(position).getProjectDayPosted()));
        holder.mBudget.setText(projects.get(position).getProjectBudget());
        holder.mDetailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProjectDetailActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return projects.size();
    }

    public static class ProjectViewHolder extends RecyclerView.ViewHolder {

        protected CardView cardView;
        protected TextView mName, mAuctioner, mDescription, mDayPosted, mBudget;
        protected Button mDetailButton;

        public ProjectViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv_project);
            mName = (TextView) itemView.findViewById(R.id.projectTitle);
            mAuctioner = (TextView) itemView.findViewById(R.id.projectAuction);
            mDescription = (TextView) itemView.findViewById(R.id.projectDesc);
            mDayPosted = (TextView) itemView.findViewById(R.id.projectPosted);
            mBudget = (TextView) itemView.findViewById(R.id.projectBudget);
            mDetailButton = itemView.findViewById(R.id.btnDetail);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
