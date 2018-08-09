package com.arjuna.apika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class EventDetailActivity extends AppCompatActivity {

    private TextView mEventJudul, mEventTanggal, mEventTempat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String judulEvent = bundle.getString("event_judul");
        String tanggalEvent = bundle.getString("event_tanggal");
        String tempatEvent = bundle.getString("event_tempat");
        mEventJudul = findViewById(R.id.event_judul);
        mEventJudul.setText(judulEvent);
        mEventTanggal = findViewById(R.id.event_tanggal);
        mEventTanggal.setText(tanggalEvent);
        mEventTempat = findViewById(R.id.event_tempat);
        mEventTempat.setText(tempatEvent);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
