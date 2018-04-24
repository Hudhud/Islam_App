package com.app.hudhud.islam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PageFragment_Bontider extends Fragment{

public static final String ARG_PAGE = "ARG_PAGE";

private int mPage;

public static PageFragment_Bontider newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Bontider  fragment = new PageFragment_Bontider ();
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
        View view = inflater.inflate(R.layout.fragment_bontider, container, false);
        TextView tvTitle = (TextView) view.findViewById(R.id.bonner);
        ImageView bontider = (ImageView) view.findViewById(R.id.imageView);

        String[] text = new String[2];

        text[1] = "Iblandt forpligtelserne for enhver ansvarlig (mukallaf) er udførelse af de fem " +
                "bønner i løbet af dagen og natten. Eftersom kendskabet til disse bøntider er en " +
                "pligt for enhver ansvarlig, gøres der rede for dem i det følgende:\n\n" +
                "Den første bøn er middagsbønnen (Adh-Dhuhr), hvis tid indtræder, når solen aftager " +
                "fra sit højeste punkt på himlen (midten af himlen) mod vest, og udtræder når skyggen" +
                " af en tilfældig genstand bliver lige så lang som en genstands egen længde adderet " +
                "med længden af kulminationsskyggen. Kulminationsskyggen er den målte skygge, når " +
                "solen er ved sit højeste punkt i løbet af en dag.\n\n" +
                "Den anden bøn er eftermiddagsbønnen (Al-^asr), hvis tid varer fra middagsbønnens " +
                "udtrædelse til solnedgang (når hele solskiven er forsvundet).\n\n" +
                "Den tredje bøn er solnedgangsbønnen (Al-Maghrib), hvis tid indtræder fra " +
                "eftermiddagsbønnens udtrædelse, og udtræder når det rødlige skumringslys " +
                "(svagt lys der dukker op i den vestlige horisont efter solnedgang) er forsvundet.\n\n" +
                "Den fjerde bøn er natbønnen (Al-^Ishaa´), hvis tid indtræder ved solnedgangsbønnens " +
                "udtrædelse, og udtræder ved frembrudet af det sande daggry (Al-Fadjir As-Saadiq), " +
                "hvilket er det vandrette lys, der viser sig i den østlige horisont, som et tyndt " +
                "skær der dernæst udbreder sig.\n\n" +
                "Den femte bøn er morgenbønnen (As-Subh), hvis tid indtræder ved natbønnens udtrædelse, " +
                "og udtræder ved solopgang (Shuruuq).";

        tvTitle.setText(text[mPage]);

        int[] billede = new int[2];

        billede[0] = R.drawable.bontider;

        if(billede[mPage] != 0){
            bontider.setVisibility(View.VISIBLE);
            bontider.setImageResource(billede[mPage]);
            tvTitle.setVisibility(View.GONE);
        }

        return view;
        }
}
