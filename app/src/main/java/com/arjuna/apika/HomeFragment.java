package com.arjuna.apika;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private CardView cvProfile, cvMember, cvSettings;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        cvProfile = (CardView) view.findViewById(R.id.cv_profile);
        cvMember = (CardView) view.findViewById(R.id.cv_member);
        cvSettings = (CardView) view.findViewById(R.id.cv_settings);
        cvProfile.setOnClickListener(this);
        cvMember.setOnClickListener(this);
        cvSettings.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cv_profile:
                Intent intent = new Intent(getContext(), IkaProfileActivity.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Go to IKA Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cv_member:
                Toast.makeText(getContext(), "Go to IKA Member", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cv_settings:
                Toast.makeText(getContext(), "Go to Settings", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
