package com.lingdiao.lingdiao_ble_demo;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /**
     * Called when the activity is first created.
     */
    private Button autopairbtn = null;
    private BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autopairbtn = (Button) findViewById(R.id.button1);
        autopairbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!bluetoothAdapter.isEnabled()) {
                    bluetoothAdapter.enable();//异步的，不会等待结果，直接返回。
                } else {
                    bluetoothAdapter.startDiscovery();
                }
            }
        });

    }
}
