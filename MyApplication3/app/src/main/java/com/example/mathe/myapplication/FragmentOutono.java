package com.example.mathe.myapplication;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOutono extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_eoutono, container, false);
        Button button = (Button) view.findViewById(R.id.bOutono);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent Outono = new Intent(getActivity(),Houtono.class);
                startActivity(Outono);
                onDestroy();
            }
        });
        return view;
    }
}
