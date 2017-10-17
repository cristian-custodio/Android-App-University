package com.cristiancustodio.usmapp;



import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.graphics.BitmapCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


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
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        //Inflate the viewPager
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

    }

    //Home Page OnLick Method links
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

    //Academic Programs OnClickMethod
    public void AcademicPrograms (View view) {
        Intent intent = new Intent(this, AcademicPrograms.class);
        startActivity(intent);
    }

    //Inflate the action bar menu options
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
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

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.

                return super.onOptionsItemSelected(item);

        }
    }

}