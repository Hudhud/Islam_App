package com.app.hudhud.islam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hudhud on 3/9/16.
 */
public class PageFragment_Bon_Afbrydelser extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment_Bon_Afbrydelser newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Bon_Afbrydelser fragment = new PageFragment_Bon_Afbrydelser();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wudu_afbrydelser, container, false);
        TextView tvTitle = (TextView) view.findViewById(R.id.afbrydelse);

        String [] text = new String [11];
        text[0] = "At udtale to bogstaver eller blot et betydningsbærende bogstav, medmindre det bliver sagt i forglemmelse og at det er lidt.";

        text[1] = "At udføre mange bevægelser, hvilke ifølge nogle lærde er det, der rummer en rak^ah’s tid.";

        text[2] = "At udføre en voldsom bevægelse såsom at springe.";

        text[3] = "At tilføje en ekstra bevægelsessøjle.";

        text[4] = "At udføre én bevægelse med hensigt at lege såsom at række tunge ad nogen.";

        text[5] = "At spise eller at drikke, undtagen hvis man glemmer, at man er i bøn, og at det er lidt.";

        text[6] = "At have til hensigt at afbryde bønnen.";

        text[7] = "At lade hensigten om at afbryde bønnen afhænge af forekomsten af en hændelse.";

        text[8] = "At tøve med at afbryde bønnen.";

        text[9] = "At fuldføre en søjle alt imens man er i tvivl om, man har udført hensigten til at udføre bønnen eller ej under den indledende takbirah; \"Allahu akbar\", eller når tvivlen herom varer længe.";

        tvTitle.setText(text[mPage]);

        return view;
    }
}
