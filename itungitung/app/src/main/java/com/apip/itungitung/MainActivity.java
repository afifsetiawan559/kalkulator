package com.apip.itungitung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        final TextView tv1 = findViewById(R.id.tvHASIL);
        final EditText et1 = findViewById(R.id.editText5);
        final EditText et2 = findViewById(R.id.editText6);
        final Button bt1 = findViewById(R.id.btJUMLAH);
        final Button bt2 = findViewById(R.id.btKURANG);
        final Button bt3 = findViewById(R.id.btKALI);
        final Button bt4 = findViewById(R.id.btBAGI);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(et1.getText().toString());
                int x2 = Integer.parseInt(et2.getText().toString());
                int hasil = x1 + x2;
                String jumlah = String.valueOf(hasil);
                tv1.setText(jumlah);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(et1.getText().toString());
                int x2 = Integer.parseInt(et2.getText().toString());
                int hasil = x1 - x2;
                String jumlah = String.valueOf(hasil);
                tv1.setText(jumlah);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(et1.getText().toString());
                int x2 = Integer.parseInt(et2.getText().toString());
                int hasil = x1 * x2;
                String jumlah = String.valueOf(hasil);
                tv1.setText(jumlah);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(et1.getText().toString());
                int x2 = Integer.parseInt(et2.getText().toString());
                if (x2 != 0) {
                    int hasil = x1 / x2;
                    String jumlah = String.valueOf(hasil);
                    tv1.setText(jumlah);
                } else {
                    tv1.setText("Cannot divide by zero");
                }
            }
        });
    }

}