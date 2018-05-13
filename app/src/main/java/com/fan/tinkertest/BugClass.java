package com.fan.tinkertest;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by f on 2018/5/13.
 */

public class BugClass {
    public void bug(Context context) {
        //throw new RuntimeException("挂掉了");
        Toast.makeText(context,"fixed",Toast.LENGTH_SHORT).show();
    }
}
