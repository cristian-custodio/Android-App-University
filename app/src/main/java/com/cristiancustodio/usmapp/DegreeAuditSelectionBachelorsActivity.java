package com.cristiancustodio.usmapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class DegreeAuditSelectionBachelorsActivity extends AppCompatActivity {

    //Create SharedPreferences
    public static final String MySharedPrefs = "MyPrefs";
    SharedPreferences sharedPref;

    //29 Checkbox declarations for the courseList
    CheckBox checkbox1;CheckBox checkbox2;CheckBox checkbox3;CheckBox checkbox4;CheckBox checkbox5;CheckBox checkbox6;
    CheckBox checkbox7;CheckBox checkbox8;CheckBox checkbox9;CheckBox checkbox10;CheckBox checkbox11;CheckBox checkbox12;
    CheckBox checkbox13;CheckBox checkbox14;CheckBox checkbox15;CheckBox checkbox16;CheckBox checkbox17;CheckBox checkbox18;
    CheckBox checkbox19;CheckBox checkbox20;CheckBox checkbox21;CheckBox checkbox22;CheckBox checkbox23;CheckBox checkbox24;
    CheckBox checkbox25;CheckBox checkbox26;CheckBox checkbox28;CheckBox checkbox29;CheckBox checkbox30;CheckBox checkbox31;
    CheckBox checkbox32;CheckBox checkbox33;CheckBox checkbox34;CheckBox checkbox35;CheckBox checkbox36;CheckBox checkbox37;
    CheckBox checkbox38;CheckBox checkbox39;CheckBox checkbox40;CheckBox checkbox41;CheckBox checkbox42;CheckBox checkbox43;
    CheckBox checkbox44;CheckBox checkbox45;CheckBox checkbox46;CheckBox checkbox47;CheckBox checkbox48;CheckBox checkbox49;
    CheckBox checkbox50;CheckBox checkbox51;CheckBox checkbox52;CheckBox checkbox53;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_audit_selection_bachelors);

        //Inflate the actionbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.admissionsToolbar);
        setSupportActionBar(myToolbar);

        //Declare SharedPref
        Context context = this;
        sharedPref = context.getSharedPreferences(MySharedPrefs, Context.MODE_PRIVATE);

        //Connect all checkboxes
        ConnectAllCheckboxes();

        //Read from sharedPreferences and populate course checkboxes
        LoadPreviousCheckboxes();

        //Prevent landscape orientation
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    @Override
    //Inflate the action bar menu options
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        // Inflate and initialize the bottom menu
        ActionMenuView bottomBar = (ActionMenuView)findViewById(R.id.bottom_toolbar_Bachelors_Degree);
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

            //case R.id.action_aboutUs:
            // Intent intent4 = new Intent(this, StudentPortalActivity.class);
            //startActivity(intent4);
            //return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.

                return super.onOptionsItemSelected(item);

        }
    }


    public void onCheckboxClicked(View view) {
        //Courses Checkbox on Click Method
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        Log.v("Testing", "Is Checked");


        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.sup101:
                if (checked) {
                    sharedPref.edit().putBoolean("sup101", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup101", false).apply();
                }
                break;
            case R.id.sup201:
                if (checked) {
                    sharedPref.edit().putBoolean("sup201", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup201", false).apply();
                }
                break;
            case R.id.sup110:
                if (checked) {
                    sharedPref.edit().putBoolean("sup110", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup110", false).apply();
                }
                break;
            case R.id.sup120:
                if (checked) {
                    sharedPref.edit().putBoolean("sup120", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup120", false).apply();
                }
                break;
            case R.id.sup220:
                if (checked) {
                    sharedPref.edit().putBoolean("sup220", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup220", false).apply();
                }
                break;
            case R.id.sup130:
                if (checked) {
                    sharedPref.edit().putBoolean("sup130", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup130", false).apply();
                }
                break;
            case R.id.sup230:
                if (checked) {
                    sharedPref.edit().putBoolean("sup230", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup230", false).apply();
                }
                break;
            case R.id.sup140:
                if (checked) {
                    sharedPref.edit().putBoolean("sup140", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup140", false).apply();
                }
                break;
            case R.id.sup260:
                if (checked) {
                    sharedPref.edit().putBoolean("sup260", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup260", false).apply();
                }
                break;
            case R.id.sup210:
                if (checked) {
                    sharedPref.edit().putBoolean("sup210", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup210", false).apply();
                }
                break;
            case R.id.sup240:
                if (checked) {
                    sharedPref.edit().putBoolean("sup240", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup240", false).apply();
                }
                break;
            case R.id.sup250:
                if (checked) {
                    sharedPref.edit().putBoolean("sup250", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup250", false).apply();
                }
                break;
            case R.id.sup350:
                if (checked) {
                    sharedPref.edit().putBoolean("sup350", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup350", false).apply();
                }
                break;
            case R.id.kpg101:
                if (checked) {
                    sharedPref.edit().putBoolean("kpg101", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("kpg101", false).apply();
                }
                break;
            case R.id.kpg201:
                if (checked) {
                    sharedPref.edit().putBoolean("kpg201", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("kpg201", false).apply();
                }
                break;
            case R.id.kpg210:
                if (checked) {
                    sharedPref.edit().putBoolean("kpg210", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("kpg210", false).apply();
                }
                break;
            case R.id.kpg330:
                if (checked) {
                    sharedPref.edit().putBoolean("kpg330", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("kpg330", false).apply();
                }
                break;
            case R.id.pmi110:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi110", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi110", false).apply();
                }
                break;
            case R.id.pmi120:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi120", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi120", false).apply();
                }
                break;
            case R.id.pmi130:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi130", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi130", false).apply();
                }
                break;
            case R.id.pmi210:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi210", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi210", false).apply();
                }
                break;
            case R.id.pmi220:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi220", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi220", false).apply();
                }
                break;
            case R.id.ged260:
                if (checked) {
                    sharedPref.edit().putBoolean("ged260", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("ged260", false).apply();
                }
                break;
            case R.id.ged220:
                if (checked) {
                    sharedPref.edit().putBoolean("ged220", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("ged220", false).apply();
                }
                break;
            case R.id.rkg210:
                if (checked) {
                    sharedPref.edit().putBoolean("rkg210", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("rkg210", false).apply();
                }
                break;
            case R.id.rkg310:
                if (checked) {
                    sharedPref.edit().putBoolean("rkg310", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("rkg310", false).apply();
                }
                break;
            case R.id.brv103:
                if (checked) {
                    sharedPref.edit().putBoolean("brv103", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("brv103", false).apply();
                }
                break;
            case R.id.brv120:
                if (checked) {
                    sharedPref.edit().putBoolean("brv120", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("brv120", false).apply();
                }
                break;
            case R.id.brv220:
                if (checked) {
                    sharedPref.edit().putBoolean("brv220", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("brv220", false).apply();
                }
                break;
            case R.id.sup310:
                if (checked) {
                    sharedPref.edit().putBoolean("sup310", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup310", false).apply();
                }
                break;
            case R.id.sup301:
                if (checked) {
                    sharedPref.edit().putBoolean("sup301", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup301", false).apply();
                }
                break;
            case R.id.sup320:
                if (checked) {
                    sharedPref.edit().putBoolean("sup320", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup320", false).apply();
                }
                break;
            case R.id.sup340:
                if (checked) {
                    sharedPref.edit().putBoolean("sup340", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup340", false).apply();
                }
                break;
            case R.id.sup360:
                if (checked) {
                    sharedPref.edit().putBoolean("sup360", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("sup360", false).apply();
                }
                break;
            case R.id.kpg220:
                if (checked) {
                    sharedPref.edit().putBoolean("kpg220", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("kpg220", false).apply();
                }
                break;
            case R.id.kpg320:
                if (checked) {
                    sharedPref.edit().putBoolean("kpg320", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("kpg320", false).apply();
                }
                break;
            case R.id.pmi230:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi230", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi230", false).apply();
                }
                break;
            case R.id.pmi240:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi240", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi240", false).apply();
                }
                break;
            case R.id.pmi310:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi310", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi310", false).apply();
                }
                break;
            case R.id.pmi320:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi320", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi320", false).apply();
                }
                break;
            case R.id.pmi330:
                if (checked) {
                    sharedPref.edit().putBoolean("pmi330", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("pmi330", false).apply();
                }
                break;
            case R.id.rkg320:
                if (checked) {
                    sharedPref.edit().putBoolean("rkg320", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("rkg320", false).apply();
                }
                break;
            case R.id.brv101:
                if (checked) {
                    sharedPref.edit().putBoolean("brv101", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("brv101", false).apply();
                }
                break;
            case R.id.brv102:
                if (checked) {
                    sharedPref.edit().putBoolean("brv102", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("brv102", false).apply();
                }
                break;
            case R.id.brv201:
                if (checked) {
                    sharedPref.edit().putBoolean("brv201", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("brv201", false).apply();
                }
                break;
            case R.id.brv202:
                if (checked) {
                    sharedPref.edit().putBoolean("brv202", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("brv202", false).apply();
                }
                break;
            case R.id.brv420:
                if (checked) {
                    sharedPref.edit().putBoolean("brv420", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("brv420", false).apply();
                }
                break;
            case R.id.mus101:
                if (checked) {
                    sharedPref.edit().putBoolean("mus101", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("mus101", false).apply();
                }
                break;
            case R.id.mus110:
                if (checked) {
                    sharedPref.edit().putBoolean("mus110", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("mus110", false).apply();
                }
                break;
            case R.id.mus220:
                if (checked) {
                    sharedPref.edit().putBoolean("mus220", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("mus220", false).apply();
                }
                break;
            case R.id.ged110:
                if (checked) {
                    sharedPref.edit().putBoolean("ged110", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("ged110", false).apply();
                }
                break;
            case R.id.ged460:
                if (checked) {
                    sharedPref.edit().putBoolean("ged460", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("ged460", false).apply();
                }
                break;
            case R.id.ged320:
                if (checked) {
                    sharedPref.edit().putBoolean("ged320", true).apply();
                }
                else {
                    sharedPref.edit().putBoolean("ged320", false).apply();
                }
                break;
        }
    }
    private void ConnectAllCheckboxes() {
        checkbox1 = (CheckBox) findViewById(R.id.sup101);
        checkbox2 = (CheckBox) findViewById(R.id.sup201);
        checkbox3 = (CheckBox) findViewById(R.id.sup110);
        checkbox4 = (CheckBox) findViewById(R.id.sup120);
        checkbox5 = (CheckBox) findViewById(R.id.sup220);
        checkbox6 = (CheckBox) findViewById(R.id.sup130);
        checkbox7 = (CheckBox) findViewById(R.id.sup230);
        checkbox8 = (CheckBox) findViewById(R.id.sup140);
        checkbox9 = (CheckBox) findViewById(R.id.sup260);
        checkbox10 = (CheckBox) findViewById(R.id.sup210);
        checkbox11 = (CheckBox) findViewById(R.id.sup240);
        checkbox12 = (CheckBox) findViewById(R.id.sup250);
        checkbox13 = (CheckBox) findViewById(R.id.sup350);
        checkbox14 = (CheckBox) findViewById(R.id.kpg101);
        checkbox15 = (CheckBox) findViewById(R.id.kpg201);
        checkbox16 = (CheckBox) findViewById(R.id.kpg210);
        checkbox17 = (CheckBox) findViewById(R.id.kpg330);
        checkbox18 = (CheckBox) findViewById(R.id.pmi110);
        checkbox19 = (CheckBox) findViewById(R.id.pmi120);
        checkbox20 = (CheckBox) findViewById(R.id.pmi130);
        checkbox21 = (CheckBox) findViewById(R.id.pmi210);
        checkbox22 = (CheckBox) findViewById(R.id.pmi220);
        checkbox23 = (CheckBox) findViewById(R.id.ged260);
        checkbox24 = (CheckBox) findViewById(R.id.ged220);
        checkbox25 = (CheckBox) findViewById(R.id.rkg210);
        checkbox26 = (CheckBox) findViewById(R.id.rkg310);
        checkbox28 = (CheckBox) findViewById(R.id.brv120);
        checkbox29 = (CheckBox) findViewById(R.id.brv220);
        checkbox30 = (CheckBox) findViewById(R.id.sup310);
        checkbox31 = (CheckBox) findViewById(R.id.sup301);
        checkbox32 = (CheckBox) findViewById(R.id.sup320);
        checkbox33 = (CheckBox) findViewById(R.id.sup340);
        checkbox34 = (CheckBox) findViewById(R.id.sup360);
        checkbox35 = (CheckBox) findViewById(R.id.kpg220);
        checkbox36 = (CheckBox) findViewById(R.id.kpg320);
        checkbox37 = (CheckBox) findViewById(R.id.pmi230);
        checkbox38 = (CheckBox) findViewById(R.id.pmi240);
        checkbox39 = (CheckBox) findViewById(R.id.pmi310);
        checkbox40 = (CheckBox) findViewById(R.id.pmi320);
        checkbox41 = (CheckBox) findViewById(R.id.pmi330);
        checkbox42 = (CheckBox) findViewById(R.id.rkg320);
        checkbox43 = (CheckBox) findViewById(R.id.brv101);
        checkbox44 = (CheckBox) findViewById(R.id.brv102);
        checkbox45 = (CheckBox) findViewById(R.id.brv201);
        checkbox46 = (CheckBox) findViewById(R.id.brv202);
        checkbox47 = (CheckBox) findViewById(R.id.brv420);
        checkbox48 = (CheckBox) findViewById(R.id.mus101);
        checkbox49 = (CheckBox) findViewById(R.id.mus110);
        checkbox50 = (CheckBox) findViewById(R.id.mus220);
        checkbox51 = (CheckBox) findViewById(R.id.ged110);
        checkbox52 = (CheckBox) findViewById(R.id.ged460);
        checkbox53 = (CheckBox) findViewById(R.id.ged320);

    }
    private void LoadPreviousCheckboxes() {
        if (sharedPref.getBoolean("sup101",false) == true)  {
            checkbox1.setChecked(true);

        }
        if (sharedPref.getBoolean("sup201",false) == true)  {
            checkbox2.setChecked(true);

        }
        if (sharedPref.getBoolean("sup110",false) == true)  {
            checkbox3.setChecked(true);

        }
        if (sharedPref.getBoolean("sup120",false) == true)  {
            checkbox4.setChecked(true);

        }
        if (sharedPref.getBoolean("sup220",false) == true)  {
            checkbox5.setChecked(true);

        }
        if (sharedPref.getBoolean("sup130",false) == true)  {
            checkbox6.setChecked(true);

        }
        if (sharedPref.getBoolean("sup230",false) == true)  {
            checkbox7.setChecked(true);

        }
        if (sharedPref.getBoolean("sup140",false) == true)  {
            checkbox8.setChecked(true);

        }
        if (sharedPref.getBoolean("sup260",false) == true)  {
            checkbox9.setChecked(true);

        }
        if (sharedPref.getBoolean("sup210",false) == true)  {
            checkbox10.setChecked(true);

        }
        if (sharedPref.getBoolean("sup240",false) == true)  {
            checkbox11.setChecked(true);

        }
        if (sharedPref.getBoolean("sup250",false) == true)  {
            checkbox12.setChecked(true);
        }
        if (sharedPref.getBoolean("sup350",false) == true)  {
            checkbox13.setChecked(true);
        }

        if (sharedPref.getBoolean("kpg101",false) == true)  {
            checkbox14.setChecked(true);

        }
        if (sharedPref.getBoolean("kpg201",false) == true)  {
            checkbox15.setChecked(true);

        }
        if (sharedPref.getBoolean("kpg210",false) == true)  {
            checkbox16.setChecked(true);

        }
        if (sharedPref.getBoolean("kpg330",false) == true)  {
            checkbox17.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi110",false) == true)  {
            checkbox18.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi120",false) == true)  {
            checkbox19.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi130",false) == true)  {
            checkbox20.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi210",false) == true)  {
            checkbox21.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi220",false) == true)  {
            checkbox22.setChecked(true);

        }
        if (sharedPref.getBoolean("ged260",false) == true)  {
            checkbox23.setChecked(true);

        }
        if (sharedPref.getBoolean("ged220",false) == true)  {
            checkbox24.setChecked(true);

        }
        if (sharedPref.getBoolean("rkg210",false) == true)  {
            checkbox25.setChecked(true);

        }
        if (sharedPref.getBoolean("rkg310",false) == true)  {
            checkbox26.setChecked(true);

        }

        if (sharedPref.getBoolean("brv120",false) == true)  {
            checkbox28.setChecked(true);

        }
        if (sharedPref.getBoolean("brv220",false) == true)  {
            checkbox29.setChecked(true);

        }
        if (sharedPref.getBoolean("sup310",false) == true)  {
            checkbox30.setChecked(true);

        }
        if (sharedPref.getBoolean("sup301",false) == true)  {
            checkbox31.setChecked(true);

        }
        if (sharedPref.getBoolean("sup320",false) == true)  {
            checkbox32.setChecked(true);

        }
        if (sharedPref.getBoolean("sup340",false) == true)  {
            checkbox33.setChecked(true);

        }
        if (sharedPref.getBoolean("sup360",false) == true)  {
            checkbox34.setChecked(true);

        }
        if (sharedPref.getBoolean("kpg220",false) == true)  {
            checkbox35.setChecked(true);

        }
        if (sharedPref.getBoolean("kpg320",false) == true)  {
            checkbox36.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi230",false) == true)  {
            checkbox37.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi240",false) == true)  {
            checkbox38.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi310",false) == true)  {
            checkbox39.setChecked(true);

        }
        if (sharedPref.getBoolean("pmi320",false) == true)  {
            checkbox40.setChecked(true);

        }
        if (sharedPref.getBoolean("rkg320",false) == true)  {
            checkbox41.setChecked(true);

        }
        if (sharedPref.getBoolean("rkg320",false) == true)  {
            checkbox42.setChecked(true);

        }
        if (sharedPref.getBoolean("brv101",false) == true)  {
            checkbox43.setChecked(true);

        }
        if (sharedPref.getBoolean("brv102",false) == true)  {
            checkbox44.setChecked(true);

        }
        if (sharedPref.getBoolean("brv201",false) == true)  {
            checkbox45.setChecked(true);

        }
        if (sharedPref.getBoolean("brv202",false) == true)  {
            checkbox46.setChecked(true);

        }
        if (sharedPref.getBoolean("brv420",false) == true)  {
            checkbox47.setChecked(true);

        }
        if (sharedPref.getBoolean("mus101",false) == true)  {
            checkbox48.setChecked(true);

        }
        if (sharedPref.getBoolean("mus110",false) == true)  {
            checkbox49.setChecked(true);

        }
        if (sharedPref.getBoolean("mus220",false) == true)  {
            checkbox50.setChecked(true);

        }
        if (sharedPref.getBoolean("ged110",false) == true)  {
            checkbox51.setChecked(true);

        }
        if (sharedPref.getBoolean("ged460",false) == true)  {
            checkbox52.setChecked(true);

        }
        if (sharedPref.getBoolean("ged320",false) == true)  {
            checkbox53.setChecked(true);

        }

    }
    public void generateReportButton (View view) {
        Intent intent = new Intent(this, BachelorsDegreeAuditResultsActivity.class);
        startActivity(intent);
    }
}


