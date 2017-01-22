// Done (5) Create a new class called SunshineSyncIntentService that extends IntentService
//  Done (6) Create a constructor that calls super and passes the name of this class
//  Done (7) Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;

public class SunshineSyncIntentService extends IntentService{

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public SunshineSyncIntentService() {
        super("SunshineSyncIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}