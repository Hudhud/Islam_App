package com.app.hudhud.islam;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fasten_Dage extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profet, container, false);

        TextView intro = view.findViewById(R.id.introtilprofeter);
        intro.setText(getString(R.string.fasten_dage_intro_text));

        return view;
    }
}
