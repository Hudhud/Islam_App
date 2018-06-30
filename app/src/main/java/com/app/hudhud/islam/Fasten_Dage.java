package com.app.hudhud.islam;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hadi on 08-05-2017.
 */

public class Fasten_Dage extends Fragment {

    TextView intro;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.fragment_profet, container, false);

        intro = (TextView) view.findViewById(R.id.introtilprofeter);

        intro.setText("Det er ugyldigt at faste de to højtider - ^Id al-Fitr og ^Id al-Adha, og de tre dage efter ^Id al-Adha (Tashriq-dagene). " +
                "\n\nDet er også ugyldigt at faste den sidste halvdel af Sha^ban-måneden samt dagen, hvor én som ikke er troværdig (^adl) har set månen, " +
                "medmindre man stoler på denne person." +
                "\n\nDet er dog gyldigt at faste den sidste halvdel af Sha^ban-måneden, hvis man forbinder fasten af disse dage med dagene før dem, eller ved indhentning af fasten (qada´), " +
                "opfyldelse af løfter (nadhr), eller vanemæssig belønningsværdig praksis (wird), " +
                "såsom den person, der har til vane at faste hver mandag og torsdag.");
        return view;
    }
}

