package com.arjuna.apika.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjuna.apika.Loker;
import com.arjuna.apika.R;

import java.util.List;

/**
 * Created by Regawa on 6/29/2018.
 */

public class LokerRVAdapter extends RecyclerView.Adapter<LokerRVAdapter.LokerViewHolder> {

    private List<Loker> lokers;

    public LokerRVAdapter(List<Loker> lokers){
        this.lokers=lokers;
    }

    @Override
    public LokerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_loker, parent, false);
        LokerViewHolder lokerViewHolder = new LokerViewHolder(v);
        return lokerViewHolder;
    }

    @Override
    public void onBindViewHolder(LokerViewHolder holder, int position) {
        holder.mJudul.setText(lokers.get(position).getJudul());
        holder.mFee.setText(lokers.get(position).getFee());
        holder.mLocation.setText(lokers.get(position).getLocation());
        holder.mDayPosted.setText(String.valueOf(lokers.get(position).getDayPosted()));
    }

    @Override
    public int getItemCount() {
        return lokers.size();
    }

    public static class LokerViewHolder extends RecyclerView.ViewHolder{

        protected CardView cardView;
        protected TextView mJudul,mFee,mLocation,mDayPosted;

        public LokerViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.cv_loker);
            mJudul=(TextView)itemView.findViewById(R.id.jobTitle);
            mFee=(TextView)itemView.findViewById(R.id.jobFee);
            mLocation=(TextView)itemView.findViewById(R.id.jobLocation);
            mDayPosted=(TextView)itemView.findViewById(R.id.jobPosted);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
