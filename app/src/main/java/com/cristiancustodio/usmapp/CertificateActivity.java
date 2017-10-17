package com.cristiancustodio.usmapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CertificateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);


        //Inflate the actionbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.CertificateToolbar);
        setSupportActionBar(myToolbar);

        //Set the default layout view
        Fragment fragment;
        if (savedInstanceState == null) {
            //Creates a fragment using AcademicProgramsDefault xml
            fragment = new CertificateProgramsDefault();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentAcedemicPlaceholder, fragment);
            fragmentTransaction.commit();
        }

    }

    //Change Academic (Fragment Programs Method)
    public void changeFragment(View view) {
        Fragment fragment;
        if(view == findViewById(R.id.pastoralCareCertificate)){
            fragment = new pastoralcare();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentAcedemicPlaceholder, fragment);
            fragmentTransaction.commit();
        }
        if(view == findViewById(R.id.supernaturalCertificate)){
            fragment = new supernatural();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentAcedemicPlaceholder, fragment);
            fragmentTransaction.commit();
        }

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

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

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.

                return super.onOptionsItemSelected(item);

        }
    }



}
