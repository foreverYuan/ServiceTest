package com.example.cyy.servicetest.tools;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/**
 * Created by cyy on 2017/7/18.
 */

public class Utils {
    public static final String SERVICE_LIFE_CYCLE_TAG = "service_life_cycle_tag";

    /**
     * 显示intent启动一个服务，不传递数据
     * @param packageContext
     * @param cls
     */
    public static void startService(Context packageContext, Class<?> cls){
        Intent intent = new Intent(packageContext, cls);
        packageContext.startService(intent);
    }

    /**
     * 显示intent绑定一个服务，不传递数据
     * @param packageContext
     * @param cls
     * @param conn
     * @param flags
     */
    public static void bindService(Context packageContext, Class<?> cls, ServiceConnection conn, int flags){
        Intent intent = new Intent(packageContext, cls);
        packageContext.bindService(intent, conn, flags);
    }
}
