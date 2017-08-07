package com.app.hudhud.islam;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by hudhud on 3/2/16.
 */
public class PageFragment_Bon extends Fragment implements View.OnClickListener{

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;
    private Button start, stop, replay;
    private MediaPlayer mediaPlayer;
    int [] filer = new int[18];


    public static PageFragment_Bon newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Bon fragment = new PageFragment_Bon();
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
        TextView tvTitle = (TextView) view.findViewById(R.id.handling);
        ImageView stilling = (ImageView) view.findViewById(R.id.stilling);
        TextView tvTitle2 = (TextView) view.findViewById(R.id.arabisk);

        start = (Button) view.findViewById(R.id.start);
        start.setOnClickListener(this);

        stop = (Button) view.findViewById(R.id.stop);
        stop.setOnClickListener(this);

        replay = (Button) view.findViewById(R.id.replay);
        replay.setOnClickListener(this);

        filer[2] = R.raw.takbira;
        filer[4] = R.raw.alfatiha;
        filer[14] = R.raw.tashahhud;
        filer[15] = R.raw.salat;
        filer[16] = R.raw.assalam;

        if(filer[mPage] != 0){
            start.setVisibility(View.VISIBLE);
            stop.setVisibility(View.VISIBLE);
            replay.setVisibility(View.VISIBLE);
        }


        String [] text = new String [19];
        text[0] = "Bønnen har en række søjler og et antal sunan. Uden alle søjlerne er bønnen ugyldig, hvorimod man kan undlade sunan uden at bønnen gøres ugyldig, omend man mister belønning for disse sunan\n\nI det følgende gennemgås søjlerne.";
        text[1] = "At have en hensigt i hjertet om at udføre bønnen. Man skal specificere bønnen, når den har en speciel anledning eller tid, samt at have en hensigt om at udføre forpligtelsen i de pligtige bønner.";
        text[2] = "At sige ”Allahu Akbar” (den indledende takbirah) mindst så højt, at man kan høre sig selv, som det er påkrævet i enhver mundtlig søjle.";
        text[3] = "At stå op (qiyam) i de forpligtede bønner, hvis man magter det.";
        text[4] = "At læse Al-Fatihah\n\n" + "\"Bismillahir-Rahmanir-Rahim.\n" +
                "Al-Hamdu lillahi Rabbil- ^alamin\n" +
                "Ar-Rahmanir-Rahim.\n" +
                "Maliki yawmid-Din.\n" +
                "Iyyaka na^budu wa iyyaka nasta^in.\n" +
                "Ihdinas-siratal-mustaqim\n" +
                "Siratal-ladhina an ^amta ^alayhim, Ghayril-maghdubi ^alayhim wa lad-dallin\"";
        text[5] = "At bukke sig således at håndfladerne kan nå knæene (ruku^).";
        text[6] = "At være stille (tuma´ninah) i bukningen så længe som det tager at sige ”Subhanallah”. Dvs. at alle kroppens knogler skal falde til ro på en gang.";
        text[7] = "At rette sig op (I^tidal) til opretstående stilling efter bukningen.";
        text[8] = "At være stille (tuma´ninah) i denne opretstående stilling.";
        text[9] = "At knæle (udføre sudjud) to gange ved at sætte hele eller en del af sin utildækkede pande på bedestedet med et let tryk og med sin bagdel højere end sin øvre del af kroppen, samt at sætte dele af sine knæ, håndflader og tæerspidserne på bedestedet.";
        text[10] = "At være stille (tuma´ninah) i knælningen.";
        text[11] = "At sidde mellem de to knælninger.";
        text[12] = "At være stille (tuma´ninah) mens man sidder.";
        text[13] = "At sidde for at sige den-sidste-tashahhud, As-salatu ^alan-Nabiy, og den afsluttende salam.";
        text[14] = "At sige den sidste tashahhud: \n" +
                "\n" +
                "\"At-tahiyyatul-mubarakatus-salawatut-tayyibatu lillah,\n" +
                "As-salamu ^alayka ayyuhan-nabiyyu wa rahmatullahi wa barakatuh,\n" +
                "as-salamu ^alayna wa ^ala ^ibadil-lahis-salihin\n" +
                "Ash hadu alla ilaha illal-lah wa ash hadu anna Muhammadar-rasuulullah\"";
        text[15] = "At sige As-Salatu ^alan-nabiyy, må Allah ophøje hans rang. \n\n\"Allahumma salli ^ala Muhammad\"";
        text[16] = "At sige den afsluttende salam\n\"As-salamu ^alaykum\"";
        text[17] = "At overholde rækkefølgen for søjlerne. Bevidst udeladelse af denne gennemgåede rækkefølge ugyldiggør bønnen.";


        tvTitle.setText(text[mPage]);

        String Path2font = "DroidNaskh-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), Path2font);
        tvTitle2.setTypeface(tf);

        String[] text2 = new String [18];
        text2[4] = "\"بِسْمِ اللَّـهِ الرَّ\u200Cحْمَـٰنِ الرَّ\u200Cحِيمِ ﴿١﴾ الْحَمْدُ لِلَّـهِ رَ\u200Cبِّ الْعَالَمِينَ ﴿٢﴾ الرَّ\u200Cحْمَـٰنِ الرَّ\u200Cحِيمِ ﴿٣﴾ مَالِكِ يَوْمِ الدِّينِ ﴿٤﴾ إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ ﴿٥﴾ اهْدِنَا الصِّرَ\u200Cاطَ الْمُسْتَقِيمَ ﴿٦﴾ صِرَ\u200Cاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ\u200C الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ ﴿٧﴾\"";
        text2[14] = "\"التَّحِيَّاتُ الْمُبَارَكَاتُ الصَّلَوَاتُ الطَّيِّبَاتُ لِلَّهِ، السَّلَامُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ، السَّلَامُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ، أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللَّهُ، وَأَشْهَدُ أَنَّ مُحَمَّدًا رَسُولُ اللَّهِ\"";
        text2[15] = "\"اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ\"";
        text2[16] = "\"السَّلاَمُ عَلَيْكُمْ\"";

        if (text2[mPage] != null){
            tvTitle2.setVisibility(View.VISIBLE);
            tvTitle2.setText(text2[mPage]);
        }

        int[] billede = new int[18];
        billede[2] = R.mipmap.sojle1;
        billede[3] = R.mipmap.sojle4;
        billede[4] = R.mipmap.sojle2;
        billede[5] = R.mipmap.sojle3;
        billede[7] = R.mipmap.sojle4;
        billede[9] = R.mipmap.sojle6;
        billede[11] = R.mipmap.sojle7;
        billede[13] = R.mipmap.sojle8;
        billede[16] = R.mipmap.sojle9;


        if(billede[mPage] != 0){
            stilling.setVisibility(View.VISIBLE);
            stilling.setImageResource(billede[mPage]);
        }

        return view;
    }

/*   @Override
    public void onResume() {
        super.onResume();

        if(mediaPlayer != null)
        {
                mediaPlayer.start();

        }

    }*/

    @Override
    public void onPause() {
        super.onPause();

        if(mediaPlayer != null)
        {
            mediaPlayer.stop();

        }

        mediaPlayer = null;

    }



    @Override
    public void onClick(View v) {

        if(mediaPlayer == null)
            mediaPlayer = MediaPlayer.create(getActivity().getBaseContext(), filer[mPage]);//add this line

        if(v == start){
                try {
                    mediaPlayer.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        else if(v == stop){
            mediaPlayer.pause();
        }

        else if(v == replay){
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if(!isVisibleToUser){

            if(mediaPlayer!=null) {
                if (mediaPlayer.isPlaying()) {
                    try {
                        mediaPlayer.pause();
                        mediaPlayer.seekTo(0);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    }
                }
            }

        }
    }





