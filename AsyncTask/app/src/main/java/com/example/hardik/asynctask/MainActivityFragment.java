package com.example.hardik.asynctask;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.util.Log;
import android.widget.Button;

import com.example.hardik.asynctask.R;


public class MainActivityFragment extends Fragment implements View.OnClickListener {

    View rootView = null;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button myb = (Button)rootView.findViewById(R.id.button);
        myb.setOnClickListener(this);
        return rootView;
    }


    public void onClick(View v) {


        ImgDownload id = new ImgDownload(rootView);

        id.execute("http://www.gudcltd.com/image/banner6.jpg");


    }
}
