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
public class PageFragment_Bon_Betingelser extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment_Bon_Betingelser newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Bon_Betingelser fragment = new PageFragment_Bon_Betingelser();
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

        String [] text = new String [7];
        text[0] = "At være Muslim.";

        text[1] = "At være rettet med brystet mod Qiblah.";

        text[2] = "At tiden for den pågældende bøn er indtrådt.";

        text[3] = "At have nået At-Tamjjiz-alderen, dvs. den alder, hvor barnet forstår det stillede spørgsmål og kan svare tilbage på det.";

        text[4] = "At kende til forpligtelsen af de fem forpligtede bønner.";

        text[5] = "Ikke at anse nogle af bønnens søjler som værende sunnah.";

        text[6] = "For den frie kvinde at tildække hele kroppen undtagen ansigtet og hænderne, dvs., at skjule huden og håret samt deres farver; for manden at tildække området mellem navlen og knæene.";

        tvTitle.setText(text[mPage]);

        return view;
    }
}
