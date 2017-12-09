package com.cristiancustodio.usmapp;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NonCreditActivity extends AppCompatActivity {

    private WebView mWebview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_credit);

        //Inflate the actionbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.internshipToolbar);
        setSupportActionBar(myToolbar);

        //Prevent landscape orientation
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }


    //Inflate the action bar menu options
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        // Inflate and initialize the bottom menu
        ActionMenuView bottomBar = (ActionMenuView)findViewById(R.id.bottom_toolbar);
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

    public void nonCreditLink (View view) {
        Intent intent = new Intent(this, NonCreditApplicationActivity.class);
        startActivity(intent);
    }
}
