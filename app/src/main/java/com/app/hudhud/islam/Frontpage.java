package com.app.hudhud.islam;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hudhud on 2/7/16.
 */
public class Frontpage extends AppCompatActivity {

    private ViewSwitcher switcher;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    protected Intent intent;
    private ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontpage);
        final Context ctx= this;

        switcher = (ViewSwitcher) findViewById(R.id.switcher);
        switcher.setDisplayedChild(1);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        ViewCompat.setNestedScrollingEnabled(expListView, true);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild, expListView);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        findViewById(R.id.contactfab).setOnClickListener(view -> {
            final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Frontpage.this);

            LayoutInflater inflater = Frontpage.this.getLayoutInflater();
            View dialogView = inflater.inflate(R.layout.dialog_contact, null);
            dialogBuilder.setView(dialogView);
            final EditText editText = (EditText) dialogView.findViewById(R.id.contactText);
            editText.setText("");
            final AlertDialog dialog = dialogBuilder.create();
            dialogView.findViewById(R.id.send_button).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String [] reciever = new String[]{"appfeedback@hotmail.com"};
                    String subject = ("Feedback/spørgsmål");
                    Intent mailIntent = new Intent(Intent.ACTION_SEND);
                    mailIntent.putExtra(Intent.EXTRA_EMAIL, reciever);
                    mailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
                    mailIntent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
                    mailIntent.setType("message/rfc822");
                    startActivity(Intent.createChooser(mailIntent, "Vælg en applikation til at sende din mail med"));
                }
            });

            dialogView.findViewById(R.id.cancel_button).setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view) {
                    dialog.cancel();
                }
            });

            dialog.show();
        });

        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener()
        {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View clickedView, int i, long l)
            {
                TextView lblListHeader = (TextView) clickedView.findViewById(R.id.lblListHeader);

                if (!parent.isGroupExpanded(i))
                    lblListHeader.setCompoundDrawablesWithIntrinsicBounds( R.drawable.show_up, 0, 0, 0);
                else
                    lblListHeader.setCompoundDrawablesWithIntrinsicBounds( R.drawable.show_down, 0, 0, 0);

                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
            }
        });


        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                if (groupPosition == 0) {
                    switch (childPosition) {
                        case 0:
                            intent = new Intent(getApplicationContext(), Egenskaber_13.class);
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }
                }
                if (groupPosition == 1) {
                    switch (childPosition) {
                        case 0:
                            ShowMsg("En profet er et menneske, udvalgt af Allah, til at videregive budskabet om islam.\n" +
                                    "I alt har der eksisteret ca. 124.000 profeter. Iblandt det, profeterne har tilfælles, er, at de alle kom med religionen islam." +
                                    " Nogle af profeterne var sendebud, hvilket er en profet, som har fået åbenbaret en ny lovgivning.\n" +
                                    "Profeten Adam var det første sendebud og den første profet, mens profeten Muhammad var det sidste sendebud og den sidste profet.");
                            break;
                        case 1:
                            intent = new Intent(getApplicationContext(), Egenskaber_Profeter.class);
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }
                }

                if (groupPosition == 2) {
                    switch (childPosition) {
                        case 0:
                            intent = new Intent(getApplicationContext(), Trosbekendelse.class);
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }
                }

                if (groupPosition == 3) {
                    switch (childPosition) {
                        case 0:
                            intent = new Intent(getApplicationContext(), Wudu.class);
                            startActivity(intent);
                            break;
                        case 1:
                            intent = new Intent(getApplicationContext(), Wudu_Betingelser.class);
                            startActivity(intent);
                            break;
                        case 2:
                            intent = new Intent(getApplicationContext(), Wudu_Afbrydelser.class);
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }
                }
                if (groupPosition == 4) {
                    switch (childPosition) {
                        case 0:
                            intent = new Intent(getApplicationContext(), Bon.class);
                            startActivity(intent);
                            break;
                        case 1:
                            intent = new Intent(getApplicationContext(), Bon_Betingelser.class);
                            startActivity(intent);
                            break;
                        case 2:
                            intent = new Intent(getApplicationContext(), Bon_Afbrydelser.class);
                            startActivity(intent);
                            break;
                        case 3:
                            intent = new Intent(getApplicationContext(), Bontider.class);
                            startActivity(intent);
                            break;
                    }
                }
                if (groupPosition == 5){
                    switch (childPosition){
                        case 0:
                            ShowMsg("Enhver ansvarlig muslim er pålagt at faste Ramadan-måneden, dog er fasten ugyldig fra kvinden under efterfødsels - eller menstruationsperiode; de skal dog begge indhente de mistede dage. \n" +
                                    "\nAt bryde fasten er tilladt for den syge person, der ikke kan udholde fasten, den gravide eller ammende kvinde, der frygter skade for sig selv eller barnet samt den, der er på en lang rejse (ca. 50km) selvom vedkommende ikke møder strabadser under sin rejse." +
                                    " Det er dem dog forpligtet at indhente de mistede dage.");
                            break;
                        case 1:
                            intent = new Intent(getApplicationContext(), Fasten_Sojler.class);
                            startActivity(intent);
                            break;
                        case 2:
                            ShowMsg("Det er ugyldigt at faste de to højtider - ^Id al-Fitr og ^Id al-Adha, og de tre dage efter ^Id al-Adha (Tashriq-dagene). " +
                                    "\n\nDet er også ugyldigt at faste den sidste halvdel af Sha^ban-måneden samt dagen, hvor én som ikke er troværdig (^adl) har set månen, " +
                                    "medmindre man stoler på denne person." +
                                    "\n\nDet er dog gyldigt at faste den sidste halvdel af Sha^ban-måneden, hvis man forbinder fasten af disse dage med dagene før dem, eller ved indhentning af fasten (qada´), " +
                                    "opfyldelse af løfter (nadhr), eller vanemæssig belønningsværdig praksis (wird), " +
                                    "såsom den person, der har til vane at faste hver mandag og torsdag.");
                        default:
                            break;
                    }
                }

                return false;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.menu_frontpage, menu);
        return (super.onCreateOptionsMenu(menu));
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Allah");
        listDataHeader.add("Profeterne");
        listDataHeader.add("Konvertering til islam");
        listDataHeader.add("Wudu");
        listDataHeader.add("Bønnen");
        listDataHeader.add("Fasten");


        List<String> first = new ArrayList<String>();
        first.add("De 13 egenskaber");

        List<String> profeterne = new ArrayList<String>();
        profeterne.add("Hvad er en profet?");
        profeterne.add("Profeternes egenskaber");

        List<String> trosbekendelsen = new ArrayList<String>();
        trosbekendelsen.add("Trosbekendelsen");

        List<String> wudu = new ArrayList<String>();
        wudu.add("Hvordan man udfører wudu");
        wudu.add("Betingelser");
        wudu.add("Afbrydelser");

        List<String> boennen = new ArrayList<String>();
        boennen.add("Søjler");
        boennen.add("Betingelser");
        boennen.add("Afbrydelser");
        boennen.add("Bøntider");

        List<String> fasten = new ArrayList<String>();
        fasten.add("Hvem er pålagt til at faste?");
        fasten.add("Fastens søjler");
        fasten.add("Dagene man ikke må faste");

        listDataChild.put(listDataHeader.get(0), first); // Header, Child data
        listDataChild.put(listDataHeader.get(1), profeterne);
        listDataChild.put(listDataHeader.get(2), trosbekendelsen);
        listDataChild.put(listDataHeader.get(3), wudu);
        listDataChild.put(listDataHeader.get(4), boennen);
        listDataChild.put(listDataHeader.get(5), fasten);

    }

    void ShowMsg(String msg)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ScrollView scroll = new ScrollView(this);
        scroll.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        TextView txt = new TextView(this);
        scroll.addView(txt);
        txt.setHint(msg);
        txt.setTextSize(22);
        txt.setPadding(100, 100, 100, 100);
        builder.setView(txt);
        builder.setView(scroll);

        builder.setNegativeButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }
}