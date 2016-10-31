package com.example.margo.tpcc_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class countDown extends AppCompatActivity {
    Button btnMin;
    Button btnPlus;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down);
        btnMin = (Button) findViewById(R.id.btnMin);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        txt = (TextView) findViewById(R.id.numText);


        String value = txt.getText().toString();

        int parval = Integer.parseInt(value);

        final int minus = parval -= 1;
        final int plus = parval += 1;

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(countDown.this, ""+plus, Toast.LENGTH_SHORT).show();
                    txt.setText(""+plus);
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(countDown.this, ""+minus, Toast.LENGTH_SHORT).show();
                txt.setText(""+minus);
            }
        });


    }
}
