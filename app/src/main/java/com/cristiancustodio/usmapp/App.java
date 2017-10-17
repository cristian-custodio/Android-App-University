package com.cristiancustodio.usmapp;

import android.app.Application;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));
    }
}
