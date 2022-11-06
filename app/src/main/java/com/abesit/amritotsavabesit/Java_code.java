package com.abesit.amritotsavabesit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.abesit.amritotsavabesit.R;


public class Java_code extends Fragment {


    public Java_code() {
        // Required empty public constructor
    }

    private Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_java_code, container, false);

        Button button = v.findViewById(R.id.registerbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String regurl= "https://forms.gle/rFhoEdQUcBw2NTaWA";
                Intent register = new Intent(Intent.ACTION_VIEW);
                register.setData(Uri.parse(regurl));
                startActivity(register);
            }
        });
        return v;


    }
}