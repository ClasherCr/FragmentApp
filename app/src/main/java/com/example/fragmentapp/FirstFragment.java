package com.example.fragmentapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    @SuppressLint("ShowToast")
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(context,
                "OnAttach method is called",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"on create is ackked",Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("ShowToast")
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(),
                "OnResume",Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        Button firstBtn = view.findViewById(R.id.btn_frag1);
        TextView text = view.findViewById(R.id.text_frag1);

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "Welcome to first Fragment",
                        Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}