package com.app.hudhud.islam;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment_13E extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public static PageFragment_13E newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_13E fragment = new PageFragment_13E();
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

        String[] egenskaber = getResources().getStringArray(R.array.egenskaber);
        String[] arabiskTekst = getResources().getStringArray(R.array.arabiskTekst);
        String[] arabiskOversaettelse = getResources().getStringArray(R.array.arabiskOversaettelse);

        tvTitle.setText(egenskaber[mPage]);

        String Path2font = "DroidNaskh-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), Path2font);
        tvTitle2.setTypeface(tf);
        tvTitle2.setText(arabiskTekst[mPage]);
        tvTitle3.setText(arabiskOversaettelse[mPage]);

        return view;
    }
}
