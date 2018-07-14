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
public class PageFragment_Wudu_Afbrydelser extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment_Wudu_Afbrydelser newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Wudu_Afbrydelser fragment = new PageFragment_Wudu_Afbrydelser();
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

        String[] text = new String[4];
        text[0] = "Alt, der kommer ud af endetarmen eller kønsdelen, undtagen udløsning.";
        text[1] = "Berøring af penis, skedeåbning eller ringmuskelen på et menneske med håndfladen uden afskærmning.";
        text[2] = "Berøring af huden af en kvinde, man kan gifte sig med, og som har nået en alder, hvor hun er fysisk tiltrækkende; (Hvis man rører håret af en fremmed kvinde, afbrydes wudu' ikke, men det er haram).\n\n" +
                "Ligeledes for en kvinde at røre huden af en fremmed mand.";
        text[3] = "At miste bevidstheden eller forstanden, dog ikke søvn, hvis man sover siddende med enden fast anbragt på underlaget.";

        tvTitle.setText(text[mPage]);

        return view;
    }

}
