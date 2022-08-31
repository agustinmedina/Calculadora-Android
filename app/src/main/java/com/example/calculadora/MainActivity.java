package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button suma;
    private Button resta;
    private Button division;
    private Button multiplicacion;

    private TextView resultado;
    private EditText numero1;
    private EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = findViewById(R.id.suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( suma( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()) )+"");
            }
        });
        division = findViewById(R.id.division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( division( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()) )+"");

            }
        });

        multiplicacion = findViewById(R.id.multiplicacion);
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( multiplicacion( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()) )+"");

            }
        });

        resta = findViewById(R.id.resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( resta( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()) )+"");

            }
        });

        resultado = findViewById(R.id.resultado);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
    }
        public double suma (int a, int b){
            return a+b;
        }

        public double resta (int a, int b){
            return a-b;
        }

        public double multiplicacion (int a, int b){
            return a*b;
        }

        public double division (int a, int b){
            int resultado = 0;

            if (b!=0){
                resultado=a/b;
            }

            return resultado;
    }

}
