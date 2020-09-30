package com.olmo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonRest = (Button) findViewById(R.id.buttonRest);
        Button buttonSum = (Button) findViewById(R.id.buttonSum);
        ImageButton buttonEq = (ImageButton) findViewById(R.id.buttonEq);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonRest.setOnClickListener(this);
        buttonSum.setOnClickListener(this);
        buttonEq.setOnClickListener(this);




/* public void onClick(View v, String valor) {
                valor = this.id;
                text.setText(text.getText() + valor);
            }*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                text.setText(text.getText() + "1");
                break;
            case R.id.button2:
                text.setText(text.getText() + "2");
                break;
        }
    }


    public void pulsar() {

    }


}