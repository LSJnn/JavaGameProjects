package com.heresy.s_heresy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

public class Receiver extends BroadcastReceiver {
    int a;
    static int b;
    static IntentFilter intentFilter;

    public Receiver(int a) {
        this.a= a;
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

                    if(reason!="recentapps") {
                        a = 2;
                        b = a;
                        System.out.println(reason + " , a=====" + a);
                    }else {
                        System.out.println(reason + " , a=====" + a);
                    }
        }

    public int getB() {
        return b;
    }
    public void setB(int a){
        b=a;
    }

}