package com.febo.onesignal;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.location.Location;
import android.util.Log;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.onesignal.OneSignal;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.IDisplayableMutableNotification;
import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationServiceExtension;


public class NotificationServiceExtension extends Activity implements INotificationServiceExtension {
    @Override
    public void onNotificationReceived(INotificationReceivedEvent event) {
        Log.d("HIIII", "ITS ME JOHNNY!!!!");
        event.preventDefault();
    }
}
