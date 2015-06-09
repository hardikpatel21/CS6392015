package com.example.hardik.imageview;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button previous,next;
    int[] ima ={R.drawable.index,R.drawable.index1,R.drawable.images2,R.drawable.images3,R.drawable.images4};
    private ImageView image;
    int count;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.main, container, false);

        previous = (Button) view.findViewById(R.id.btn2);
        next = (Button) view.findViewById(R.id.btn1);
        image = (ImageView) view.findViewById(R.id.imageView);
        previous.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {

                image.setImageResource(ima[count]);
                if(count==0){count=4;}
                else {count--;}
                android.view.ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
                layoutParams.width=100;
                layoutParams.height=200;
                image.setLayoutParams(layoutParams);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(ima[count]);
                if(count==4){count=0;}
                else{count++;}
               android.view.ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
                layoutParams.width=100;
                layoutParams.height=200;
                image.setLayoutParams(layoutParams);
            }
        });
            return view;
    }

}
