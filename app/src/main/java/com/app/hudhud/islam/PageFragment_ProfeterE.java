package com.app.hudhud.islam;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hudhud on 2/7/16.
 */
public class PageFragment_ProfeterE extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment_ProfeterE newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_ProfeterE fragment = new PageFragment_ProfeterE();
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

        String [] text = new String [5];
        text[0] = "Alle profeterne var sandfærdige i alt, hvad de fortalte om og overbragte fra Allah, da folk ikke vil tage imod kaldet fra én, der ikke er sandfærdig.";

        text[1] = "Alle profeterne var troværdige, idet folk ikke vil tage imod kaldet fra én, der ikke er troværdig.";

        text[2] = "Alle profeterne var skarpsindige. Ingen af dem var svage i deres argumenter.";

        text[3] = "Alle profeterne var veltalende. De benyttede sig af få og fyldestgørende ord til at forklare et budskab.";

        text[4] = "Alle profeterne var immune, dvs. de var beskyttet mod blasfemi (kufr), store synder (kaba´ir) " +
                "og små usle synder (sagha’ir al-khissah), såvel før som efter profetien. På den anden side er det muligt for dem " +
                "at begå andre små synder, men dog bliver de øjeblikkeligt retledet til at angre, førend nogen efterligner dem i synden.";

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
