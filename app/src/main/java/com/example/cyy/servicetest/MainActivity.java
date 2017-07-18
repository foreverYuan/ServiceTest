package com.example.cyy.servicetest;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.cyy.servicetest.service.BindedService;
import com.example.cyy.servicetest.service.StartedService;
import com.example.cyy.servicetest.tools.Utils;

public class MainActivity extends AppCompatActivity {
    ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doClick(View v){
        Intent intent_start = new Intent(this, StartedService.class);
        switch (v.getId()) {
            case R.id.btn_start_service:
                this.startService(intent_start);
                break;

            case R.id.btn_stop_service:
                if(intent_start != null) {
                    this.stopService(intent_start);
                }
                break;

            case R.id.btn_bind_service:
                Intent intent_bind = new Intent(this, BindedService.class);
                this.bindService(intent_bind, conn, 0);
                break;

            case R.id.btn_unBind_service:
                unbindService(conn);
                break;
        }
    }
}
