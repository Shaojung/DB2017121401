package com.example.student.db2017121401;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationChannel channelLove = new NotificationChannel(
                "IDLOVE",
                "Channel Love",
                NotificationManager.IMPORTANCE_HIGH);
        channelLove.setDescription("最重要的人");
        channelLove.enableLights(true);
        channelLove.enableVibration(true);
        nm.createNotificationChannel(channelLove);
    }
    public void click1(View v)
    {



        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("這是標題")
                .setContentText("這裡是通知的內容")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setChannelId("IDLOVE");
        Notification n = builder.build();

        nm.notify(1, n);

    }
}
