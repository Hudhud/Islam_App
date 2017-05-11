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
public class PageFragment_Wudu_Betingelser extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment_Wudu_Betingelser newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment_Wudu_Betingelser fragment = new PageFragment_Wudu_Betingelser();
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

        String[] text = new String[5];
        text[0] = "At være Muslim.";
        text[1] = "At have nået At-Tamjjiz-alderen, dvs. den alder, hvor barnet forstår det stillede spørgsmål og kan svare tilbage på det.";
        text[2] = "At der ikke er noget på kroppen, der forhindrer vandet i at nå de steder, der skal vaskes.";
        text[3] = "At vandet skal være rindende.";
        text[4] = "At bruge rensende (mutahhir) vand, dvs. det vand, der ikke er forandret ved at blive blandet med et rent (tahir) stof, som man nemt kan skærme vandet fra, såsom mælk, blæk eller lignende.\n\n" +
                "Hvis vandet forandres til en sådan grad, at det ikke længere kaldes vand, så er dette vand ikke egnet til renselse.\n\n" +
                "Hvis vandet imidlertid forandres pga. dets sammenblanding med et stof, som er på sit oprindelige sted eller dets afløb eller lignende, og fra hvilket vandet ikke nemt kan beskyttes, så påvirker dette ikke vandets rensende egenskab, også selvom der er tale om en stor forandring.\n\n" +
                "Vandet må heller ikke forandres af noget nadjis-smuds (urent), selv ikke en lille forandring. Hvis vandet var mindre end to qullah (ca. 216 liter), er det betinget af, at ufritaget nadjis-smuds ikke kommer i kontakt med vandet, selv hvis det ikke forandrer vandet, samt at vandet ikke havde været anvendt i en rituel afvaskning eller fjernelse af noget nadjasah.\n";

        tvTitle.setText(text[mPage]);

        return view;
    }

}