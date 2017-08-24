package com.app.hudhud.islam;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hadi on 19-09-2016.
 */

public class Profet extends Fragment {

    TextView intro;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_profet, container, false);
        ((Frontpage) getActivity()).setActionBarTitle("Hvad er en profet?");

        intro = (TextView) view.findViewById(R.id.introtilprofeter);

        intro.setText("En profet er et menneske, udvalgt af Allah, til at videregive budskabet om islam.\n" +
                "I alt har der eksisteret ca. 124.000 profeter. Iblandt det, profeterne har tilfælles, er, at de alle kom med religionen islam." +
                " Nogle af profeterne var sendebud, hvilket er en profet, som har fået åbenbaret en ny lovgivning.\n" +
                "Profeten Adam var det første sendebud og den første profet, mens profeten Muhammad var det sidste sendebud og den sidste profet.");

        return view;
    }
}

