package com.app.mue.servicetest;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by mue on 3/5/16.
 */
public class ServiceTest extends IntentService {
    // must create a default constructor
    public ServiceTest(){
        //used to name the worker thread, important only for debugging.
        super("test-service");
    }

    @Override
    public void onCreate(){
        super.onCreate();//if you override onCreate(), make sure to call super().
        //If a Context object is needed, call getApplicationContext() here.
    }

    @Override
    protected void onHandleIntent(Intent intent){
        //This describes what will happen when service is triggered
    }
}
