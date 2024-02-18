package com.app.hudhud.islam;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        TextView tvTitle = view.findViewById(R.id.afbrydelse);

        String text = "";
        switch (mPage) {
            case 0:
                text = getString(R.string.afbrydelse_0);
                break;
            case 1:
                text = getString(R.string.afbrydelse_1);
                break;
            case 2:
                text = getString(R.string.afbrydelse_2);
                break;
            case 3:
                text = getString(R.string.afbrydelse_3);
                break;
            case 4:
                text = getString(R.string.afbrydelse_4);
                break;
            case 5:
                text = getString(R.string.afbrydelse_5);
                break;
            case 6:
                text = getString(R.string.afbrydelse_6);
                break;
            case 7:
                text = getString(R.string.afbrydelse_7);
                break;
            case 8:
                text = getString(R.string.afbrydelse_8);
                break;
            case 9:
                text = getString(R.string.afbrydelse_9);
                break;
        }

        tvTitle.setText(text);

        return view;
    }
}
