package com.cristiancustodio.usmapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.design.widget.TabLayout;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;


import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;


public class HomeActivity extends AppCompatActivity {

    //Declare ViewPager for Home Slideshow
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Notification creation and Implementation
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.mipmap.ic_usmlogo);
        builder.setContentTitle("Supernatural Immersive Experience");
        builder.setContentText("Register for the Internship...");
        Intent intent = new Intent(this,InternshipActivity.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(InternshipActivity.class);
        stackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);
        NotificationManager NM = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        NM.notify(0,builder.build());





        //Inflate the actionbar
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        //Inflate the viewPager
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        //Set the swipe icons for the ViewPager

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        //Adjust Banner ImageView
        ImageView imageView = findViewById(R.id.imageView2);
        ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) imageView.getLayoutParams();
        params.height = 270;

        // existing height is ok as is, no need to edit it
        imageView.setLayoutParams(params);



        //Prevent landscape orientation
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    //Home Page OnClick Method links
    public void StudentPortalActivity(View view) {
        Intent intent = new Intent(this, StudentPortalActivity.class);
        startActivity(intent);
    }
    public void InternshipActivity(View view) {
        Intent intent = new Intent(this, InternshipActivity.class);
        startActivity(intent);
    }
    public void AdmissionsActivity(View view) {
        Intent intent = new Intent(this, AdmissionsActivity.class);
        startActivity(intent);
    }
    public void CertificateActivity(View view) {
        Intent intent = new Intent(this, CertificateActivity.class);
        startActivity(intent);
    }
    public void NonCreditActivity(View view) {
        Intent intent = new Intent(this, NonCreditActivity.class);
        startActivity(intent);
    }
    public void AcademicPrograms (View view) {
        Intent intent = new Intent(this, AcademicProgramsActivity.class);
        startActivity(intent);
    }
    public void degreeAuditSelection (View view) {
        Intent intent = new Intent(this, DegreeAuditSelectionActivity.class);
        startActivity(intent);
    }
    public void contactUsEmail (View view) {

        //Gather report data from sharedPrefs


        final Intent emailIntent = new Intent( android.content.Intent.ACTION_SEND);

        emailIntent.setType("plain/text");

        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,
                new String[] { "university@kingjesusministry.org" });

        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
                "Contact Us (USM App)");

        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
                " ");

        startActivity(Intent.createChooser(
                emailIntent, "Send mail..."));
    }


    //Inflate the action bar menu options
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);

        // Inflate and initialize the bottom menu
        ActionMenuView bottomBar = (ActionMenuView)findViewById(R.id.bottom_toolbar_home);
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