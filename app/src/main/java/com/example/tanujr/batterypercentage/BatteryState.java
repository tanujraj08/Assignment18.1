package com.example.tanujr.batterypercentage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.TextView;

public class BatteryState extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int batteryLevelIntent = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 1);
        TextView batteryLevelTextView = (TextView) ((Activity)context).findViewById(R.id.batteryLevelPercentageTextView);
        batteryLevelTextView.setText("Battery Level Remaining : " +  String.valueOf(batteryLevelIntent) + " % ");
    }
}
