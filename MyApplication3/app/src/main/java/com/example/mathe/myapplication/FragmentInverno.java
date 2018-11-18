package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentInverno extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_einverno, container, false);
        Button button = (Button) view.findViewById(R.id.bInverno);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent Inverno = new Intent(getActivity(),Hinverno.class);
                startActivity(Inverno);
                onDestroy();
            }
        });
        return view;
    }
}
