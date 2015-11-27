package com.roy.qrcodescan;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.lk_qrcodescan.CaptureFragment;

public class MainActivity extends AppCompatActivity implements CaptureFragment.OnQrCodeScanListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment, new CaptureFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void onScanResult(String result) {
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
    }

}
