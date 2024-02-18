package com.app.hudhud.islam;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PageFragment_Fasten_Sojler extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment_Fasten_Sojler newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Fasten_Sojler fragment = new PageFragment_Fasten_Sojler();
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
        View view = inflater.inflate(R.layout.fragment, container, false);
        TextView tvTitle = view.findViewById(R.id.text);
        TextView tvTitle2 = view.findViewById(R.id.textView);
        TextView tvTitle3 = view.findViewById(R.id.textView2);

        String [] text = new String [2];
        text[0] = "For den obligatoriske faste, altså fasten i Ramadan-måneden, " +
                "skal hensigten laves natten (mellem solnedgang og daggry) før fastens dag.";

        text[1] = "At afholde sig fra samleje, onani, fremprovokeret opkast, frafald samt at indføre noget, " +
                "der har en størrelse i hovedets eller kroppens hulrum gennem en åben indgang (munden, næsen, de eliminatoriske udgange samt ørene ifølge nogle af de lærde) undtagen ens eget ublandede og rene spyt, " +
                "så længe det er inde i munden.";


        tvTitle.setText(text[mPage]);

        String Path2font = "DroidNaskh-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), Path2font);
        tvTitle2.setTypeface(tf);

        String[] text2 = new String [14];


        tvTitle2.setText(text2[mPage]);

        String[] text3 = new String [14];


        tvTitle3.setText(text3[mPage]);

        return view;
    }
}