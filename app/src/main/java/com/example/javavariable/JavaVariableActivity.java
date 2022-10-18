package com.example.javavariable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JavaVariableActivity extends AppCompatActivity {

    TextView byteMaxTextView;
    TextView byteMinTextView;

    TextView shortMaxTextView;
    TextView shortMinTextView;

    TextView intMaxTextView;
    TextView intMinTextView;

    TextView longMaxTextView;
    TextView longMinTextView;

    TextView floatMaxTextView;
    TextView floatMinTextView;

    TextView doubleMaxTextView;
    TextView doubleMinTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_variable);

        byteMaxTextView = findViewById(R.id.byte_max_text_view);
        byteMinTextView = findViewById(R.id.byte_min_text_view);

        shortMaxTextView = findViewById(R.id.short_max_text_view);
        shortMinTextView = findViewById(R.id.short_min_text_view);

        intMaxTextView = findViewById(R.id.int_max_text_view);
        intMinTextView = findViewById(R.id.int_min_text_view);

        longMaxTextView = findViewById(R.id.long_max_text_view);
        longMinTextView = findViewById(R.id.long_min_text_view);

        floatMaxTextView = findViewById(R.id.float_max_text_view);
        floatMinTextView= findViewById(R.id.float_min_text_view);

        doubleMaxTextView = findViewById(R.id.double_max_text_view);
        doubleMinTextView = findViewById(R.id.double_min_text_view);

        byteMaxTextView.setText(String.valueOf(Byte.MAX_VALUE));
        byteMinTextView.setText(String.valueOf(Byte.MIN_VALUE));

        shortMaxTextView.setText(String.valueOf(Short.MAX_VALUE));
        shortMinTextView.setText(String.valueOf(Short.MIN_VALUE));

        intMaxTextView.setText(String.valueOf(Integer.MAX_VALUE));
        intMinTextView.setText(String.valueOf(Integer.MIN_VALUE));

        longMaxTextView.setText(String.valueOf(Long.MAX_VALUE));
        longMinTextView.setText(String.valueOf(Long.MIN_VALUE));

        floatMaxTextView.setText(String.valueOf(Float.MAX_VALUE));
        floatMinTextView.setText(String.valueOf(Float.MIN_VALUE));

        doubleMaxTextView.setText(String.valueOf(Double.MAX_VALUE));
        doubleMinTextView.setText(String.valueOf(Double.MIN_VALUE));
    }
}