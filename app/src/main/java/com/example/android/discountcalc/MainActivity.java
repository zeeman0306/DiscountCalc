package com.example.android.discountcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText price;
    private EditText discountPercent;

    private TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        price = (EditText) findViewById(R.id.price);
        discountPercent = (EditText) findViewById(R.id.discountPercent);

        Button calculate = (Button) findViewById(R.id.calculate);

        total = (TextView) findViewById(R.id.total);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                    calculate();
            }
        });
    }

    private void calculate ( ){

        double n1 = Double.valueOf(price.getText().toString());
        double n2 = Double.valueOf(discountPercent.getText().toString());

        double result = n1 * ((100 - n2) / 100);

        total.setText("$" + result);


    }

    Button clear = (Button) findViewById(R.id.clear);


    private void clear(View view){

        price.setText("");
        discountPercent.setText("");

    }

}
