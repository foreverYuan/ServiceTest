package com.example.cyy.servicetest.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;

import com.example.cyy.servicetest.tools.Utils;

public class StartedService extends Service {
    public StartedService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onBind()");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onUnbind()");
        return super.onUnbind(intent);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onLowMemory()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onConfigurationChanged()");
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onRebind()");
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onTaskRemoved()");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onTrimMemory()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(Utils.SERVICE_LIFE_CYCLE_TAG, this.getClass() + "------------------------onDestroy()");
    }
}
