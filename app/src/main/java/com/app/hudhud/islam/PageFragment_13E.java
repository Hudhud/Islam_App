package com.app.hudhud.islam;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 *Created by hudhud on 2/7/16.
 */
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
        TextView tvTitle = (TextView) view.findViewById(R.id.text);
        TextView tvTitle2 = (TextView) view.findViewById(R.id.textView);
        TextView tvTitle3 = (TextView) view.findViewById(R.id.textView2);

        String [] text = new String [14];
        text[0] = "Før Allah skabte himlen, tronen, stedet, tiden og alle andre skabninger, eksisterede Han uden dem, og Han eksisterer nu som han altid har gjort, da Han ikke forandrer Sig. Ergo eksisterer Allah uden tid og sted, da de er skabt af Ham. \n\n" +
                "Profeten, må Allah ophøje hans rang, sagde:";

        text[1] = "Allah er Én og har ingen partner i Sin guddommelighed. Han er Én i Sit selv, Én i Sine egenskaber og Én i Sine handlinger.\n\n"+
        "Allah, være ophøjet, sagde i Surat Muhammad, vers 19:";

        text[2] = "Allah har ingen begyndelse på Sin eksistens og intet andet end Ham er evigt. Han eksisterede før Han skabte alle skabningerne som f.eks. tid og sted.\n\n"+
        "Profeten, må Allah ophøje hans rang, sagde: ";

        text[3] = "Allah er uophørlig dvs. Han ingen slutning har på Sin eksistens. Han forgår ikke, ej heller udslettes Han.\n\nAllah, være ophøjet, siger i Surat Al-Hadid, vers 3:";

        text[4] = "Allah har ikke brug for nogen eller noget, mens alle skabninger har brug for Ham.\n\n"+ "Allah, være ophøjet, sagde i Surat Al-Ikhlas, vers 2:";

        text[5] = "Allah magter alt, dvs. Han formår alt, hvad Han vil.\n\n" +
                "Allah, være ophøjet, sagde i Surat Al-Mulk, vers 1:";

        text[6] = "Alt i universet sker med Allahs vilje. Intet sker mod Hans vilje.\n" +
                "\n"+ "Abou  Dawoud  har  berettet  i  sin  ”Sunan”,  at  profeten, må  Allah  ophøje  hans  rang, lærte nogle af sine døtre at sige:";

        text[7] = "Allah er vidende om alt før det sker. Intet er skjult for Ham.\n\n"+
                "Allah, være ophøjet, sagde i Surat Al-Anfal, vers 75:";

        text[8] = "Allah hører alt uden ører eller andre redskaber.\n\n"+"ِِAllah, være ophøjet, sagde i Surat Ash-Shura, vers 11:";

        text[9] = "Allah ser alt uden øjne eller andre redskaber.\n\n"+"Allah, være ophøjet, sagde i Surat Ash-Shura, vers 11:";

        text[10] = "Allah er beskrevet med et evigt liv, der ikke er med sjæl, kød, blod eller andet.\n\n"+
        "Allah, være ophøjet, sagde i Surat Al-Baqarah, vers 255:";

        text[11] = "Allahs tale er ikke med lyd, bogstaver eller sprog, og den ligner ikke vores tale. Det, der står i koranen på arabisk, er et udtryk for Allahs evige tale."+
        "\n\nAllah, være ophøjet, sagde i Surat An-Nisaa', vers 164:";


        text[12] = "Allah ligner ikke nogen eller noget. Hvad end man forestiller sig i sin fantasi og illusion, er Allah ikke lig det.\n\n"+
                "Allah, være ophøjet, sagde Surat Ash-Shura vers 11:";


        tvTitle.setText(text[mPage]);

        String Path2font = "DroidNaskh-Regular.ttf";

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), Path2font);
        tvTitle2.setTypeface(tf);

        String[] text2 = new String [14];
        text2[0] = "\"كَانَ اللهُ وَلَمْ يَكُنْ شَيْءٌ غَيْرُهُ\"";
        text2[1] = "\"فَاعْلَمْ أَنَّهُ لَا إِلَٰهَ إِلَّا اللهُ\"";
        text2[2] = "\"كَانَ اللهُ وَلَمْ يَكُنْ شَيْءٌ غَيْرُهُ\"";
        text2[3] = "\"هُوَ الأَوَّلُ وَالآخِرُ\"";
        text2[4] = "\"اللهُ الصَّمَدُ\"";
        text2[5] = "“وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ”";
        text2[6] = "\"مَا شَاءَ اللَّهُ كَانَ وَمَا لَمْ يَشَأْ لَمْ يَكُنْ\"";
        text2[7] = "\"إِنََّ اللهَ بِكُلِّ شَيْءٍ عَلِيمٌ\"";
        text2[8] = "\"وَهُوَ السَّمِيعُ الْبَصِيرُ\"";
        text2[9] = "\"وَهُوَ السَّمِيعُ الْبَصِيرُ\"";
        text2[10] = "\"اللهُ لاَ إِلَٰهَ إِلاَّ هُوَ الْحَيُّ\"";
        text2[11] = "\"وَكَلَّمَ اللهُ مُوسَى تَكْلِيمًا\"";
        text2[12] = "\"لَيْسَ كَمِثْلِهِ شَيْءٌ\"";

        tvTitle2.setText(text2[mPage]);

        String[] text3 = new String [14]; //TJEK OM BETYDNINGER ER KORREKTE
        text3[0] = "hvilket betyder: \n\"Allah eksisterede i al evighed og der var intet andet end Ham\", berettet af Al-Bukhariy.";
        text3[1] = "hvilket betyder: \n\"Vid (Oh Muhammad), at Han (Allah) er den eneste Gud\".";
        text3[2] = "hvilket betyder: \n\"Allah eksisterede i al evighed og der var intet andet end Ham\", berettet af Al-Bukhariy.";
        text3[3] = "hvilket betyder: \n\"Han er Al-Awwal (Den evige) og Al-Akhir (Den uophørlige)\".";
        text3[4] = "hvilket betyder: \n\"Allah har ikke brug for nogen eller noget, mens alt har brug for Ham\".";
        text3[5] = "hvilket betyder: \n\"Og Han magter alting\".";
        text3[6] = "hvilket betyder: \n\"Det, som Allah vil have skal ske, vil ske, og det, som Han ikke vil have skal ske, vil ikke ske\".";
        text3[7] = "hvilket betyder: \n\"Sandelig er Allah velvidende om alt\".";
        text3[8] = "hvilket betyder: \n\"Og Han er Den althørende og Den altseende\".";
        text3[9] = "hvilket betyder: \n\"Og Han er Den althørende og Den altseende\".";
        text3[10] = "hvilket betyder: \n\"Allah, der er ingen anden Gud end Ham. Han er Al-Hayy (Den, der er beskrevet med et evigt liv)\".";
        text3[11] = "hvilket betyder: \n\"Og Allah talte (med Sin evige tale) til Musa\".";
        text3[12] = "hvilket betyder: \n\"Der er absolut intet lig Ham (Allah)\".";

        tvTitle3.setText(text3[mPage]);

        return view;
    }
}
