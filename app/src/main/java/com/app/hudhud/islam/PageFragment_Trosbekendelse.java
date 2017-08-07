package com.app.hudhud.islam;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hadi on 13-11-2016.
 */

public class PageFragment_Trosbekendelse extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment_Trosbekendelse newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Trosbekendelse fragment = new PageFragment_Trosbekendelse();
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

        String [] text = new String [2];
        text[0] = "Førend man kan blive muslim, skal man have den rette tro på Allah og Hans profeter samt at fremsige trosbekendelsen, " +
                "der kan blive fremsagt i hvilket som helst sprog:\n";
        text[1] = "Eftersom de to vidnesbyrd udgør grundlaget for islams kald, er det forpligtet enhver muslim at være bekendt med deres betydninger.\n" +
                "\nBetydningen af ”Ash-hadu allaa ilaaha illallaah” (Jeg bevidner, at der ingen anden guddom end Allah er) er: Jeg ved, tror dvs. godtager i mit hjerte, underkaster mig samt erklærer med min tunge, at intet er tilbedt med rette undtagen Allah. Dvs. " +
                "ingen fortjener at blive tilbedt - hvilket vil sige at man ydmyger sig selv til det yderste for - undtagen Allah. " +
                "\n\n" +
                "Betydningen af det andet vidnesbyrd, som lyder ”Ash-hadu anna Muhammadar-rasuulullaah” (Jeg bevidner, at Muhammad er Allahs profet), " +
                "må Allah ophøje hans rang, er: Jeg ved, tror, godtager, underkaster mig i mit hjerte og erklærer " +
                "med min tunge, at Muhammad, søn af ^Abdullah - qurayshianeren (dvs. den som stammer fra den mest ærværdige stamme Quraysh), " +
                "er Allahs skabning og sendebud til alle skabninger blandt mennesker og djin." +
                " Dette indbefatter ligeledes troen på, at han blev født i Makkah og fik sin åbenbaring om profetien déri. " +
                "Han emigrerede fra Makkah og rejste på Allahs befaling til Al-Madinah, den belyste by, " +
                "hvori han døde og blev begravet.";


        tvTitle.setText(text[mPage]);

        String Path2font = "DroidNaskh-Regular.ttf";

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), Path2font);
        tvTitle2.setTypeface(tf);

        String[] text2 = new String [2];
        text2[0] = "\"أَشْهَدُ أَنْ لاَ إِلَٰهَ إِلاَّ اللهُ وأَشْهَدُ أَنَّ مُحَمَّدًا رَسُولُ اللهِ\"";

        tvTitle2.setText(text2[mPage]);

        String[] text3 = new String [2];
        text3[0] = "”Ash-hadu allaa ilaaha illallaah wa ash-hadu anna Muhammadar-rasuulullaah”\n\nhvilket betyder: \n\"Jeg bevidner, at der ingen anden guddom end Allah er, og bevidner, at \n" +
                "Muhammad er Allahs sendebud\".\n\nMan kan også fremsige et andet udtryk med en lignende betydning såsom ”Der er ingen anden guddom end Gud og Muhammad er Guds profet”.";

        tvTitle3.setText(text3[mPage]);

        return view;
    }
}
