package com.arjuna.apika.adapter;

import android.app.usage.UsageEvents;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.arjuna.apika.Event;
import com.arjuna.apika.R;

import java.util.List;

/**
 * Created by Regawa on 6/28/2018.
 */

public class EventRVAdapter extends RecyclerView.Adapter<EventRVAdapter.EventViewHolder> {

    List<Event> events;

    public EventRVAdapter(List<Event> events){
        this.events=events;
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder{

        protected CardView cardView;
        protected TextView mJudul, mTanggal, mTempat;

        public EventViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.cv_event);
            mJudul=(TextView)itemView.findViewById(R.id.judul);
            mTanggal=(TextView)itemView.findViewById(R.id.tanggal);
            mTempat=(TextView)itemView.findViewById(R.id.tempat);
        }
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_event, parent, false);
        EventViewHolder eventViewHolder = new EventViewHolder(v);
        return eventViewHolder;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        holder.mJudul.setText(events.get(position).getJudul());
        holder.mTanggal.setText(events.get(position).getTanggal());
        holder.mTempat.setText(events.get(position).getTempat());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
