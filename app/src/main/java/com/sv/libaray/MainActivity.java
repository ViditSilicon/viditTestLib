package com.sv.libaray;

import android.os.Bundle;

import com.viditshah.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDisplayMessage(MainActivity.this, "Vidit Shah Test");
    }
}
