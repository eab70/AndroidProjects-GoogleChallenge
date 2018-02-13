package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;

// (9) Create a class called SunshineSyncUtils
public class SunshineSyncUtils {
    // (10) Create a public static void method called startImmediateSync
    public static void startImmediateSync(final Context context) {
        // (11) Within that method, start the SunshineSyncIntentService
        Intent intentToSyncImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentToSyncImmediately);
    }
}
