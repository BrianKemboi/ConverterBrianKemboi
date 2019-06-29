package com.example.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The Widgets
        Button convert_btn = findViewById(R.id.convert_btn);
        Button exit_btn = findViewById(R.id.exit_btn);

        final EditText mill_txt = findViewById(R.id.mill_txt);
        final EditText inch_txt = findViewById(R.id.inch_txt);

        //Click listener

        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mill;
                try {
                    mill = Double.parseDouble(
                            mill_txt.getText().toString()
                    );

                } catch (Exception e){
                    mill_txt.setError("Input Invalid \uD83D\uDE15!\nExpected a number");
                    return;
                }

                double inch = mill/25.4;

                inch_txt.setText(String.valueOf(inch));
            }
        });

        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
