package com.example.hardik.hardikpatelkimmileconvert;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    View view;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_main, container, false);
        Button b = (Button) view.findViewById(R.id.button);
        b.setOnClickListener(this);

        return view;
    }


            public void onClick(View v) {

                EditText txtValue = (EditText)view.findViewById(R.id.editText);


                 Double kilo=Double.parseDouble(txtValue.getText().toString());
                 double miles=(kilo*1.609);
                EditText newKilo= (EditText)view.findViewById(R.id.editText);
                newKilo.setText(miles + "");
            }
        }





