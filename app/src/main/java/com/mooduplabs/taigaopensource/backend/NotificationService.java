package com.mooduplabs.taigaopensource.backend;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import com.mooduplabs.taigaopensource.R;

/**
 * Created by Robert on 21.11.2015.
 */
public class NotificationService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        showNotification();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private void showNotification(){
        final NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        final NotificationCompat.Builder phoneNotificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Test")
                .setContentText("Test Content")
                .setOnlyAlertOnce(true)
                .setGroup("GROUP")
                .setGroupSummary(true)
                .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000});

        notificationManager.notify(0,phoneNotificationBuilder.build());
    }
}
