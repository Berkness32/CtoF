package com.example.ctof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ctof.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    EditText value;
    Button button;
    TextView convertedValue;

    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = mainBinding.getRoot();
        setContentView(view);

        value = mainBinding.ctofEnteredValueEditText;
        button = mainBinding.ctofConvertButton;
        convertedValue = mainBinding.ctofConvertedValueTextView;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "It worked!", Toast.LENGTH_SHORT).show();
                convertValue();
            }
        });
    }

    void convertValue() {
        String valueFromDisplay = value.getText().toString();
        double farenheit = 0.0;
        try {
            farenheit = Double.parseDouble(valueFromDisplay);
        } catch (NumberFormatException e){
            Toast.makeText(this, "Could not convert" + valueFromDisplay, Toast.LENGTH_SHORT).show();
        }
        farenheit = Util.cToF(farenheit);
        convertedValue.setText(Double.toString(farenheit));
    }
}