package com.heresy.s_heresy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    static int b;
    static IntentFilter intentFilter;

    public Receiver() {
        intentFilter = new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
    }

    @Override
    public IBinder peekService(Context myContext, Intent service) {
        return super.peekService(myContext, service);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
       String i = intent.getAction();
        System.out.println("i==========="+i);
                String reason = intent.getStringExtra("reason");
                System.out.println("reason ======="+reason);

                System.out.println("-----------RECEIVER 에서 받음----------");
        }

}