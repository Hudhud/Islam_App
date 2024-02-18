package com.app.hudhud.islam;

import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hudhud on 3/7/16.
 */
public class PageFragment_Wudu extends Fragment implements View.OnClickListener{

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;
    private Button start, stop;
    private MediaPlayer mediaPlayer;
    int [] filer = new int[5];



    public static PageFragment_Wudu newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Wudu fragment = new PageFragment_Wudu();
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
        View view = inflater.inflate(R.layout.fragment_boenner, container, false);
        TextView tvTitle = view.findViewById(R.id.handling);
        ImageView stilling = view.findViewById(R.id.stilling);

      /*  start = (Button) view.findViewById(R.id.start);
        start.setOnClickListener(this);

        stop = (Button) view.findViewById(R.id.stop);
        stop.setOnClickListener(this);

        filer[0] = R.raw.bismillah;

        if(filer[mPage] != 0){
            start.setVisibility(View.VISIBLE);
            stop.setVisibility(View.VISIBLE);
            mediaPlayer = MediaPlayer.create(getActivity().getBaseContext(), filer[mPage]);
        }*/

        String[] text = new String[7];
       /* text[0] = "Sige Bismillah";
        text[1] = "Vaske af hænderne 3 gange til og med håndleddene ";
        text[2] = "Skylde munden 3 gange";
        text[3] = "Skylde næsen 3 gange";*/
        text[0] = "Wudu har en række søjler og et antal sunan. Uden alle søjlerne er wudu' ugyldig, hvorimod man kan undlade sunan uden at wudu' gøres ugyldig, omend man mister belønning for disse sunan.\n\nI det følgende gennemgås søjlerne.";
        text[1] = "At udføre en hensigt f.eks. \"Nawaytul wudu' \" dvs. \"Jeg har til hensigt at udføre wudu' lillah (for Allah's skyld)\" e.l.";
        text[2] = "At vaske ansigtet, fra den normale hårgrænse til hagen og fra det ene øre til det andet, både håret og huden, men ikke indersiden af en mands tætte skæg og tætte bakkenbarter.";
        text[3] = "At vaske hænderne og underarmene til og med albuerne og det, der er på dem.";
        text[4] = "At stryge på hovedet eller noget af det med en våd hånd.";
        //text[4] = "Stryge ørene 3 gange"; //SPØRG OM MAN KAN SIGE STRYYGE
        text[5] = "At vaske fødderne til og med anklerne.";
        text[6] = "At overholde denne rækkefølge, for ellers er ens wudu' ikke gyldig.";

        tvTitle.setText(text[mPage]);

        int[] billede = new int[7];
       /* billede[1] = R.mipmap.haender;
        billede[2] = R.mipmap.mund;
        billede[3] = R.mipmap.naese; */
        billede[2] = R.mipmap.ansigt;
        billede[3] = R.mipmap.arme;
        billede[4] = R.mipmap.hoved;
     //   billede[8] = R.mipmap.oere;
        billede[5] = R.mipmap.ankler;

        if(billede[mPage] != 0){
            stilling.setVisibility(View.VISIBLE);
            stilling.setImageResource(billede[mPage]);
        }

        return view;
    }

    @Override
    public void onClick(View v) {
        if(v == start){
            mediaPlayer.start();
        }

        else if(v == stop){
            mediaPlayer.pause();
        }
    }
}
