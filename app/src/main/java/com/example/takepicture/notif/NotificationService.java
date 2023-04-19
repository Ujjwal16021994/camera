package com.example.takepicture.notif;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class NotificationService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("token" ,"token =   "+token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        if(message.getNotification()!=null)
        {
            call(message.getNotification().getTitle(),
                    message.getNotification().getBody());
        }
    }

    private void call(String title, String body) {

        NotificationManager notifManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification newNotification;
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.O){
            newNotification = NotificationBui
        }
    }

}
