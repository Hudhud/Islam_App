package com.app.hudhud.islam;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Hadi on 09-08-2016.
 */
public class Kontakt extends Fragment implements View.OnClickListener{

    Button sendmail;
    EditText msg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_kontakt, container, false);

        ((Frontpage) getActivity()).setActionBarTitle("Kontakt os");

        sendmail = (Button) view.findViewById(R.id.sendknap);
        sendmail.setOnClickListener(this);

        msg = (EditText) view.findViewById(R.id.besked);


        return view;
    }

    public void sendEmail()
    {
        String [] reciever = new String[]{"Appfeedback@hotmail.com"};
        String subject = ("Feedback/Spørgsmål");
        Intent mailIntent = new Intent(Intent.ACTION_SEND);
        mailIntent.putExtra(Intent.EXTRA_EMAIL, reciever);
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        mailIntent.putExtra(Intent.EXTRA_TEXT, msg.getText().toString());
        mailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(mailIntent, "Vælg en applikation til at sende din mail med"));
    }

    @Override
    public void onClick(View v) {
        if (v == sendmail){
            sendEmail();
        }
    }
}