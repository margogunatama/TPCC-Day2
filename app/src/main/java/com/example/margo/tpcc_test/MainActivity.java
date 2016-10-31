package com.example.margo.tpcc_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ProgressBar pgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity_test);
        Toolbar tlb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tlb);
        pgs = (ProgressBar) findViewById(R.id.progressOK);
        btn = (Button) findViewById(R.id.buttonOk);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Anda Berhasil", Toast.LENGTH_SHORT).show();
//                pgs.setVisibility(View.VISIBLE);
                Intent i = new Intent(MainActivity.this, Activity_test.class);
                startActivity(i);
            }
        });

        Window window = getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));

    }
}
