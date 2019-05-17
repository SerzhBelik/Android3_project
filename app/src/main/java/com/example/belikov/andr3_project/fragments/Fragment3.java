package com.example.belikov.andr3_project.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.belikov.andr3_project.R;


public class Fragment3 extends Fragment {
    public static Fragment3 newInstance(Bundle bundle){
        Fragment3 currentFragment = new Fragment3();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getContext(), "Frag3", Toast.LENGTH_SHORT);
        toast.show();
        return inflater.inflate(R.layout.fragment3, container, false);
    }
}