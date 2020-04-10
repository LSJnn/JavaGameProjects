package com.heresy.s_heresy;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ErrorHandler implements Thread.UncaughtExceptionHandler {

    private Thread.UncaughtExceptionHandler defaultUEH;
    Activity activity;
    String sep="\n";

    public ErrorHandler(Activity activity){
        this.activity = activity;
    }

    @Override
    public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {

        StringWriter stackTrace = new StringWriter();
        e.printStackTrace(new PrintWriter(stackTrace));
        StringBuilder errorReport = new StringBuilder();
        errorReport.append("************ CAUSE OF ERROR ************\n\n");
        errorReport.append("현재 뷰 번호 : "+ StartStory.getViewNum()+" 현재 페이지 : "+ StartStory.getPage()+"\n\n");
        errorReport.append(stackTrace.toString());

        errorReport.append("\n************ DEVICE INFORMATION ***********\n");
        errorReport.append("Brand: " + Build.BRAND+" Device: "+Build.DEVICE);
        errorReport.append(sep);
        errorReport.append("Model: ");
        errorReport.append(Build.MODEL);
        errorReport.append(sep);
        errorReport.append("Id: ");
        errorReport.append(Build.ID);
        errorReport.append(sep);
        errorReport.append("Product: ");
        errorReport.append(Build.PRODUCT);
        errorReport.append(sep);
        errorReport.append("\n************ FIRMWARE ************\n");
        errorReport.append("SDK: ");
        errorReport.append(Build.VERSION.SDK);
        errorReport.append(sep);
        errorReport.append("Release: ");
        errorReport.append(Build.VERSION.RELEASE);
        errorReport.append(sep);
        errorReport.append("Incremental: ");
        errorReport.append(Build.VERSION.INCREMENTAL);
        errorReport.append(sep);

        Intent intent = new Intent(activity, ErrorStory.class);
        intent.putExtra("error", errorReport.toString());
        Log.e(activity.toString(),"Applicaiont ERROR MESSAGE === "+e.toString());

        activity.startActivity(intent);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(10);
    }
}
