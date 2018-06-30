package com.app.hudhud.islam;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hadi on 08-05-2017.
 */

public class Fasten extends Fragment {

    TextView intro;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.fragment_profet, container, false);

        intro = (TextView) view.findViewById(R.id.introtilprofeter);

        intro.setText("Enhver ansvarlig muslim er pålagt at faste Ramadan-måneden, dog er fasten ugyldig fra kvinden under efterfødsels - eller menstruationsperiode; de skal dog begge indhente de mistede dage. \n" +
                "\nAt bryde fasten er tilladt for den syge person, der ikke kan udholde fasten, den gravide eller ammende kvinde, der frygter skade for sig selv eller barnet samt den, der er på en lang rejse (ca. 50km) selvom vedkommende ikke møder strabadser under sin rejse." +
                " Det er dem dog forpligtet at indhente de mistede dage.");
        return view;
    }
}

