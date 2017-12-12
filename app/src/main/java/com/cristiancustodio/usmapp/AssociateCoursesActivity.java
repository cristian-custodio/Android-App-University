package com.cristiancustodio.usmapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class AssociateCoursesActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private RecyclerView.Adapter adapter;
    private List<AssociateListItem> associateListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.associate_courses_activity);


        //Inflate the actionbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.recyclerviewToolbar);
        setSupportActionBar(myToolbar);

        //Prevent landscape orientation
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        associateListItems = new ArrayList<>();


        AssociateListItem associateListItem = new AssociateListItem("SUP 101 - Revelation and Power of the Work of Jesus Christ on the Cross I", "2 Credits");
        AssociateListItem associateListItem2 = new AssociateListItem("SUP 201 - Revelation and Power of the Work of Jesus Christ on the Cross II", "2 Credits");
        AssociateListItem associateListItem3 = new AssociateListItem("SUP 110 - Revelation and Power of the Resurrection of Jesus Christ", "2 Credits");
        AssociateListItem associateListItem4 = new AssociateListItem("SUP 120 - Faith I", "2 Credits");
        AssociateListItem associateListItem5 = new AssociateListItem("SUP 220 - Faith II", "2 Credits");
        AssociateListItem associateListItem6 = new AssociateListItem("SUP 130 - Prayer I", "2 Credits");
        AssociateListItem associateListItem7 = new AssociateListItem("SUP 230 - Prayer II", "3 Credits");
        AssociateListItem associateListItem8 = new AssociateListItem("SUP 140 - Evangelism with Miracles I", "2 Credits");
        AssociateListItem associateListItem9 = new AssociateListItem("SUP 260 - Evangelism with Miracles II", "3 Credits");
        AssociateListItem associateListItem10 = new AssociateListItem("SUP 210 - Inner Healing and Deliverance", "3 Credits");
        AssociateListItem associateListItem11 = new AssociateListItem("SUP 240 - Divine Health and Healing", "3 Credits");
        AssociateListItem associateListItem12 = new AssociateListItem("SUP 250 - How to Walk in the Supernatural Power of God I", "2 Credits");
        AssociateListItem associateListItem13 = new AssociateListItem("SUP 350 - How to walk in the Supernatural Power of God II", "2 Credits");
        AssociateListItem associateListItem14 = new AssociateListItem("KPG 101 - The Apostolic Vision of the House I", "2 Credits");
        AssociateListItem associateListItem15 = new AssociateListItem("KPG 201 - The Apostolic Vision of the House II", "3 Credits");
        AssociateListItem associateListItem16 = new AssociateListItem("KPG 210 - Kingdom Economic Principles", "3 Credits");
        AssociateListItem associateListItem17 = new AssociateListItem("KPG 330 - Kingdom Advancement Through Missions", "0 Credits");
        AssociateListItem associateListItem18 = new AssociateListItem("PMI 110 - Introduction to the Five Fold Ministry", "2 Credits");
        AssociateListItem associateListItem19 = new AssociateListItem("PMI 120 - The Formation of the Character and Ministry of a Leader I", "3 Credits");
        AssociateListItem associateListItem20 = new AssociateListItem("PMI 130 - How to Find your Purpose and Calling for your Life I", "2 Credits");
        AssociateListItem associateListItem21 = new AssociateListItem("PMI 210 - Fathering, Family, Marriage and Children I", "2 Credits");
        AssociateListItem associateListItem22 = new AssociateListItem("PMI 220 - Transformation through the Renewing of the Mind", "3 Credits");
        AssociateListItem associateListItem23 = new AssociateListItem("GED 260 - The Three Pillars of Health: Diet, Exercise and Rest I", "2 Credits");
        AssociateListItem associateListItem24 = new AssociateListItem("GED 220 - English Composition", "2 Credits");
        AssociateListItem associateListItem25 = new AssociateListItem("RKG 210 - How to Hear the Voice of God", "2 Credits");
        AssociateListItem associateListItem26 = new AssociateListItem("RKG 310 - The Holy Spirit in the Now I", "2 Credits");
        AssociateListItem associateListItem27 = new AssociateListItem("BRV 103 - How to Study the Bible", "2 Credits");
        AssociateListItem associateListItem28 = new AssociateListItem("BRV 120 - Foundation of the Christian Faith", "2 Credits");
        AssociateListItem associateListItem29 = new AssociateListItem("BRV 220 - Preaching the Gospel of the Kingdom with Revelation and Authority", "3 Credits");



        associateListItems.add(associateListItem); //add the item to the ArrayList!
        associateListItems.add(associateListItem2); //add the item to the ArrayList!
        associateListItems.add(associateListItem3); //add the item to the ArrayList!
        associateListItems.add(associateListItem4); //add the item to the ArrayList!
        associateListItems.add(associateListItem5); //add the item to the ArrayList!
        associateListItems.add(associateListItem6); //add the item to the ArrayList!
        associateListItems.add(associateListItem7); //add the item to the ArrayList!
        associateListItems.add(associateListItem8); //add the item to the ArrayList!
        associateListItems.add(associateListItem9); //add the item to the ArrayList!
        associateListItems.add(associateListItem10); //add the item to the ArrayList!
        associateListItems.add(associateListItem11); //add the item to the ArrayList!
        associateListItems.add(associateListItem12); //add the item to the ArrayList!
        associateListItems.add(associateListItem13); //add the item to the ArrayList!
        associateListItems.add(associateListItem14); //add the item to the ArrayList!
        associateListItems.add(associateListItem15); //add the item to the ArrayList!
        associateListItems.add(associateListItem16); //add the item to the ArrayList!
        associateListItems.add(associateListItem17); //add the item to the ArrayList!
        associateListItems.add(associateListItem18); //add the item to the ArrayList!
        associateListItems.add(associateListItem19); //add the item to the ArrayList!
        associateListItems.add(associateListItem20); //add the item to the ArrayList!
        associateListItems.add(associateListItem21); //add the item to the ArrayList!
        associateListItems.add(associateListItem22); //add the item to the ArrayList!
        associateListItems.add(associateListItem23); //add the item to the ArrayList!
        associateListItems.add(associateListItem24); //add the item to the ArrayList!
        associateListItems.add(associateListItem25); //add the item to the ArrayList!
        associateListItems.add(associateListItem26); //add the item to the ArrayList!
        associateListItems.add(associateListItem27); //add the item to the ArrayList!
        associateListItems.add(associateListItem28); //add the item to the ArrayList!
        associateListItems.add(associateListItem29); //add the item to the ArrayList!


        adapter = new AssociateAdapter(associateListItems, this);
        //we have the adapter
        recyclerView.setAdapter(adapter);
    }

    //Inflate the action bar menu options
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);

        // Inflate and initialize the bottom menu
        ActionMenuView bottomBar = (ActionMenuView)findViewById(R.id.bottomRecyclerToolbar);
        Menu bottomMenu = bottomBar.getMenu();
        getMenuInflater().inflate(R.menu.menu_botttom, bottomMenu);
        for (int i = 0; i < bottomMenu.size(); i++) {
            bottomMenu.getItem(i).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    return onOptionsItemSelected(item);
                }
            });
        }
        return true;
    }

    //Actionbar Link Options
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_home:
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_student_login:
                Intent intent2 = new Intent(this, StudentPortalActivity.class);
                startActivity(intent2);
                return true;

            case R.id.action_admissions:
                Intent intent3 = new Intent(this, AdmissionsActivity.class);
                startActivity(intent3);
                return true;

            case R.id.action_home_bottom:
                Intent intent4 = new Intent(this, HomeActivity.class);
                startActivity(intent4);
                return true;

            case R.id.action_register_bottom:
                Intent intent5 = new Intent(this, AdmissionApplicationActivity.class);
                startActivity(intent5);
                return true;

            case R.id.action_graduation_bottom:
                Intent intent6 = new Intent(this, DegreeAuditSelectionActivity.class);
                startActivity(intent6);
                return true;

            // case R.id.action_aboutUs:
            // Intent intent7 = new Intent(this, StudentPortalActivity.class);
            //startActivity(intent7);
            //return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.

                return super.onOptionsItemSelected(item);

        }
    }

}
