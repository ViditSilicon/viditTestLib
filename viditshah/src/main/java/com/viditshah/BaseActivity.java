package com.viditshah;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by android4 on 9/2/17.
 */

public class BaseActivity extends AppCompatActivity {

    public void showDisplayMessage(Context context, String Message) {
        Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();
    }
}
