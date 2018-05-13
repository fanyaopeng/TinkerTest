package com.fan.tinkertest;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private File mPatchFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPatchFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator
                + "patch_signed_7zip.apk");
        if (mPatchFile.exists())
            TinkerInstaller.onReceiveUpgradePatch(MainActivity.this, mPatchFile.getAbsolutePath());
    }

    public void bug(View view) {
        BugClass bugClass = new BugClass();
        bugClass.bug(this);
    }

    @Override
    protected void onDestroy() {
//        if (mPatchFile.exists()) {
//            Log.e("main", "删除 " + mPatchFile.delete());
//        }
        super.onDestroy();
    }
}
