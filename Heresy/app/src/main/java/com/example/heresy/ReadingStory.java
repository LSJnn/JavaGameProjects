package com.example.heresy;

import android.os.Message;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class ReadingStory {

    private Timer timer;
    private TimerTask timerTask;

    String saying;
    String[] arr;
    TextView tv;
    ReadingStory(){}

    ReadingStory(String saying, TextView tv){
        this.saying = saying;
        this.tv = tv;
    }

    public void setSettings(String saying,TextView tv, String[] arr){
        this.saying = saying;
        this.tv = tv;
        this.arr=arr;
    }


    public void readingTimerTask(){

        timer = new Timer();

            timerTask = new TimerTask() {

                @Override
                public void run(){
                    tv.post(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(saying);
                            tv.append(saying);
                        }
                    });
                }

            };
            timer.scheduleAtFixedRate(timerTask, 1000, 1500);
    }



        public void stopTimerTask() {
            if (timerTask != null) {
                timerTask.cancel();
                timer.cancel();
                timerTask=null;
            }
        }
}

