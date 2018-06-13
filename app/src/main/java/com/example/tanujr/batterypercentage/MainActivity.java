package com.example.tanujr.batterypercentage;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BatteryState batteryStateReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryStateReceiver = new BatteryState();
    }

    @Override
    protected void onStart() {

        registerReceiver(batteryStateReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        super.onStart();
    }


    @Override
    protected void onStop() {

        unregisterReceiver(batteryStateReceiver);
        super.onStop();
    }
}
