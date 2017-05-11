package com.app.hudhud.islam;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hudhud on 2/7/16.
 */
public class Frontpage extends AppCompatActivity {

    private ViewSwitcher switcher;
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    protected Intent intent;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontpage);

        image = (ImageView) findViewById(R.id.imageView3);

        switcher = (ViewSwitcher) findViewById(R.id.switcher);
        switcher.setDisplayedChild(1);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild, expListView);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {

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
                            Fragment fragment = new Profet();
                            getFragmentManager().beginTransaction()
                                    .add(R.id.kontaktfrag, fragment)
                                    .addToBackStack(null)
                                    .commit();
                            switcher.setDisplayedChild(0);
                            image.setVisibility(View.GONE);
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
                    }
                }
                if (groupPosition == 5){
                    switch (childPosition){
                        case 0:
                            Fragment fragment = new Fasten();
                            getFragmentManager().beginTransaction()
                                    .add(R.id.kontaktfrag, fragment)
                                    .addToBackStack(null)
                                    .commit();
                            switcher.setDisplayedChild(0);
                            image.setVisibility(View.GONE);
                            break;
                        case 1:
                            intent = new Intent(getApplicationContext(), Fasten_Sojler.class);
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }
                }

                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            this.finish();
            switcher.setDisplayedChild(1);
            getSupportActionBar().setTitle("Islam");
            image.setVisibility(View.VISIBLE);
        } else {
            getFragmentManager().popBackStack();
            switcher.setDisplayedChild(1);
            getSupportActionBar().setTitle("Islam");
            image.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.menu_frontpage, menu);
        return (super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.Kontakt) {
            Fragment fragment = new Kontakt();
            getFragmentManager().beginTransaction()
                    .add(R.id.kontaktfrag, fragment)
                    .addToBackStack(null)
                    .commit();
            switcher.setDisplayedChild(0);
            image.setVisibility(View.GONE);
        } /*else if (item.getItemId() == R.id.følgfb) {
            launhFBgroup();
        } else if (item.getItemId() == R.id.følgyt) {
            launhyt();
        }*/
        return super.onOptionsItemSelected(item);
    }

   /* private void launhFBgroup() {
        String FBURL = "https://www.facebook.com/groups/539057376281241/";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(FBURL));
        startActivity(browserIntent);
    }

    private void launhyt() {
        String YTURL = "https://www.youtube.com/channel/UCOkx6g7Kv8JuuhjFwyzgNbQ";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(YTURL));
        startActivity(browserIntent);
    }*/

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Allah");
        listDataHeader.add("Profeterne");
        listDataHeader.add("Konvertering til islam");
        listDataHeader.add("Wudu'");
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

        List<String> fasten = new ArrayList<String>();
        fasten.add("Hvem er pålagt til at faste?");
        fasten.add("Fastens søjler");

        listDataChild.put(listDataHeader.get(0), first); // Header, Child data
        listDataChild.put(listDataHeader.get(1), profeterne);
        listDataChild.put(listDataHeader.get(2), trosbekendelsen);
        listDataChild.put(listDataHeader.get(3), wudu);
        listDataChild.put(listDataHeader.get(4), boennen);
        listDataChild.put(listDataHeader.get(5), fasten);

    }
}


