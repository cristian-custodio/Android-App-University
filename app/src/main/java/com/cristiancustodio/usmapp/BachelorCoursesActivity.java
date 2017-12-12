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

public class BachelorCoursesActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<BachelorListItem> bachelorListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bachelor_courses_activity);


        //Inflate the actionbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.recyclerviewToolbar2);
        setSupportActionBar(myToolbar);

        //Prevent landscape orientation
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        bachelorListItems = new ArrayList<>();


        BachelorListItem bachelorListItem = new BachelorListItem("SUP 101 - Revelation and Power of the Work of Jesus Christ on the Cross I", "2 Credits");
        BachelorListItem bachelorListItem2 = new BachelorListItem("SUP 201 - Revelation and Power of the Work of Jesus Christ on the Cross II", "2 Credits");
        BachelorListItem bachelorListItem3 = new BachelorListItem("SUP 110 - Revelation and Power of the Resurrection of Jesus Christ", "2 Credits");
        BachelorListItem bachelorListItem4 = new BachelorListItem("SUP 120 - Faith I", "2 Credits");
        BachelorListItem bachelorListItem5 = new BachelorListItem("SUP 220 - Faith II", "2 Credits");
        BachelorListItem bachelorListItem6 = new BachelorListItem("SUP 130 - Prayer I", "2 Credits");
        BachelorListItem bachelorListItem7 = new BachelorListItem("SUP 230 - Prayer II", "3 Credits");
        BachelorListItem bachelorListItem8 = new BachelorListItem("SUP 140 - Evangelism with Miracles I", "2 Credits");
        BachelorListItem bachelorListItem9 = new BachelorListItem("SUP 260 - Evangelism with Miracles II", "3 Credits");
        BachelorListItem bachelorListItem10 = new BachelorListItem("SUP 210 - Inner Healing and Deliverance", "3 Credits");
        BachelorListItem bachelorListItem11 = new BachelorListItem("SUP 310 - Deliverance, the Children's Bread", "3 Credits");
        BachelorListItem bachelorListItem12 = new BachelorListItem("SUP 240 - Divine Health and Healing", "3 Credits");
        BachelorListItem bachelorListItem13 = new BachelorListItem("SUP 250 - How to Walk in the Supernatural Power of God I", "2 Credits");
        BachelorListItem bachelorListItem14 = new BachelorListItem("SUP 350 - How to walk in the Supernatural Power of God II", "2 Credits");
        BachelorListItem bachelorListItem15 = new BachelorListItem("SUP 301 - Fasting as a Spiritual Weapon", "2 Credits");
        BachelorListItem bachelorListItem16 = new BachelorListItem("SUP 320 - The Ministry of Intercession", "2 Credits");
        BachelorListItem bachelorListItem17 = new BachelorListItem("SUP 340 - The Gifts of the Holy Spirit, Here and Now I", "2 Credits");
        BachelorListItem bachelorListItem18 = new BachelorListItem("SUP 360 - The Gifts of the Holy Spirit, Here and Now II", "2Credits");
        BachelorListItem bachelorListItem19 = new BachelorListItem("KPG 101 - The Apostolic Vision of the House I", "3 Credits");
        BachelorListItem bachelorListItem20 = new BachelorListItem("KPG 201 - The Apostolic Vision of the House II", "3 Credits");
        BachelorListItem bachelorListItem21 = new BachelorListItem("KPG 210 - Kingdom Economic Principles", "2 Credits");
        BachelorListItem bachelorListItem22 = new BachelorListItem("KPG 220 - The Kingdom of Power, Dominion, Expansion and Demonstration I", "4 Credits");
        BachelorListItem bachelorListItem23 = new BachelorListItem("KPG 320 - The Kingdom of Power, Dominion, Expansion and Demonstration II", "3 Credits");
        BachelorListItem bachelorListItem24 = new BachelorListItem("KPG 330 - Kingdom Advancement through Missions", "0 Credits");
        BachelorListItem bachelorListItem25 = new BachelorListItem("PMI 110 - Introduction to the Five-fold Ministry", "3 Credits");
        BachelorListItem bachelorListItem26 = new BachelorListItem("PMI 120 - The Formation of the Character and Ministry of a Leader I", "2 Credits");
        BachelorListItem bachelorListItem27 = new BachelorListItem("PMI 230 - The Formation of the Character and Ministry of a Leader II", "2 Credits");
        BachelorListItem bachelorListItem28 = new BachelorListItem("PMI 130 - How to Find your Purpose and Calling for your Life I", "2 Credits");
        BachelorListItem bachelorListItem29 = new BachelorListItem("PMI 240 - How to Find your Purpose and Calling for your Life II", "2 Credits");
        BachelorListItem bachelorListItem30 = new BachelorListItem("PMI 210 - Fathering, Family, Marriage and Children I", "3 Credits");
        BachelorListItem bachelorListItem31 = new BachelorListItem("PMI 310 - Fathering, Family, Marriage and Children II", "3 Credits");
        BachelorListItem bachelorListItem32 = new BachelorListItem("PMI 220 - Transformation through the Renewing of the Mind", "2 Credits");
        BachelorListItem bachelorListItem33 = new BachelorListItem("PMI 320 - A Covenant of Commitment with God", "3 Credits");
        BachelorListItem bachelorListItem34 = new BachelorListItem("PMI 330 - Counseling, Pastoral Care, and Love", "3 Credits");
        BachelorListItem bachelorListItem35 = new BachelorListItem("RKG 210 - How to Hear the Voice of God", "2 Credits");
        BachelorListItem bachelorListItem36 = new BachelorListItem("RKG 310 - The Holy Spirit in the Now I", "2 Credits");
        BachelorListItem bachelorListItem37 = new BachelorListItem("RKG 320 - The Holy Spirit in the Now II", "2 Credits");
        BachelorListItem bachelorListItem38 = new BachelorListItem("BRV 101 - Old Testament I", "2 Credits");
        BachelorListItem bachelorListItem39 = new BachelorListItem("BRV 102 - Old Testament II", "2 Credits");
        BachelorListItem bachelorListItem40 = new BachelorListItem("BRV 120 - Foundation of the Christian Faith", "2 Credits");
        BachelorListItem bachelorListItem41 = new BachelorListItem("BRV 201 - New Testament I", "2 Credits");
        BachelorListItem bachelorListItem42 = new BachelorListItem("BRV 202 - New Testament II", "2 Credits");
        BachelorListItem bachelorListItem43 = new BachelorListItem("BRV 220 - Preaching the Gospel of the Kingdom with Revelation and Authority", "3 Credits");
        BachelorListItem bachelorListItem44 = new BachelorListItem("BRV 420 - Preaching the Gospel of the Kingdom with Revelation and Authority", "3 Credits");
        BachelorListItem bachelorListItem45 = new BachelorListItem("MUS 101 - Introduction to Praise and Worship", "2 Credits");
        BachelorListItem bachelorListItem46 = new BachelorListItem("MUS 110 - Introduction to Music", "2 Credits");
        BachelorListItem bachelorListItem47 = new BachelorListItem("MUS 220 - How to Raise a Prophetic Praise and Worship Team", "2 Credits");
        BachelorListItem bachelorListItem48 = new BachelorListItem("GED 110 - Financial, Legal and Administrative Processes and Procedures for Churches and Ministries", "4 Credits");
        BachelorListItem bachelorListItem49 = new BachelorListItem("GED 220 - English Composition", "2 Credits");
        BachelorListItem bachelorListItem50 = new BachelorListItem("GED 260 - The Three Pillars of Health: Diet, Exercise and Rest I", "2 Credits");
        BachelorListItem bachelorListItem51 = new BachelorListItem("GED 460 - The Three Pillars of Health: Diet, Exercise and Rest II", "2 Credits");
        BachelorListItem bachelorListItem52 = new BachelorListItem("GED 320 - Introduction to Computers and Technology", "3 Credits");








        bachelorListItems.add(bachelorListItem); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem2); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem3); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem4); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem5); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem6); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem7); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem8); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem9); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem10); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem11); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem12); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem13); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem14); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem15); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem16); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem17); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem18); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem19); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem20); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem21); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem22); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem23); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem24); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem25); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem26); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem27); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem28); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem29); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem30); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem31); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem32); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem33); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem34); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem35); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem36); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem37); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem38); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem39); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem40); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem41); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem42); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem43); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem44); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem45); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem46); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem47); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem48); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem49); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem50); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem51); //add the item to the ArrayList!
        bachelorListItems.add(bachelorListItem52); //add the item to the ArrayList!


        adapter = new BachelorAdapter(bachelorListItems, this);
        //we have the adapter
        recyclerView.setAdapter(adapter);
    }

    //Inflate the action bar menu options
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);

        // Inflate and initialize the bottom menu
        ActionMenuView bottomBar = (ActionMenuView)findViewById(R.id.bottomRecyclerToolbar2);
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
