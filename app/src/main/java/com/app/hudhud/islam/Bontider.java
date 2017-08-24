package com.app.hudhud.islam;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Hadi on 25-08-2017.
 */

public class Bontider extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_bontider, container, false);

        ((Frontpage) getActivity()).setActionBarTitle("Bøntider");

        return view;
    }

    }
