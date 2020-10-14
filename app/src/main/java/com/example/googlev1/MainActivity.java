package com.example.googlev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText tx1;
    private EditText tx2;
    private TextView tv1;
    private RadioButton rasum, rares;
    private CheckBox chbxSuma, chbxResta;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = (EditText)findViewById(R.id.tx1);
        tx2 = (EditText)findViewById(R.id.tx2);
        tv1 = (TextView)findViewById(R.id.tv1);

        rasum = (RadioButton)findViewById(R.id.rasum);
        rares = (RadioButton)findViewById(R.id.rares);
        chbxSuma = (CheckBox)findViewById(R.id.chbxSum);
        chbxResta = (CheckBox)findViewById(R.id.chbxResta);
        spinner =  (Spinner)findViewById(R.id.spinner);


        String [] opciones = {"Suma", "Restar"};

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);

        spinner.setAdapter(adapter);

        tv1.setText("Resultado");

        }

     //EVENTO POR BOTON
    /*public void Sumar (View view){
        String num1 = tx1.getText().toString();
        String num2 = tx2.getText().toString();
        int no1 = Integer.parseInt(num1);
        int no2 = Integer.parseInt(num2);
        int suma = no1 + no2;
        String resu = String.valueOf(suma);
        tv1.setText(resu);*/

    //RADIO BOTTON

   /* public void elige (View view){
        String num1 = tx1.getText().toString();
        String num2 = tx2.getText().toString();
        int uno = Integer.parseInt(num1);
        int dos = Integer.parseInt(num2);
    if(rasum.isChecked()){
        int suma = uno + dos;
        String resul = String.valueOf(suma);
        tv1.setText(resul);
    } else if (rares.isChecked()) {

        int resta = uno - dos;
        String resu = String.valueOf(resta);
        tv1.setText(resu);
        }

    }*/
    //CHECKBOX
    /*public void eligecuadro(View view){
        String num1 = tx1.getText().toString();
        String num2 = tx2.getText().toString();
        int uno = Integer.parseInt(num1);
        int dos = Integer.parseInt(num2);

        if (chbxSuma.isChecked()){
            int suma = uno + dos;
            String resul = String.valueOf(suma);
            tv1.setText(resul);
        }else if(chbxResta.isChecked())
            chbxSuma.isEnabled() = false;
        }

        }


    }*/

    public void spin (View view){
        String num1 = tx1.getText().toString();
        String num2 = tx2.getText().toString();
        String selec= spinner.getSelectedItem().toString();

        int uno = Integer.parseInt(num1);
        int dos = Integer.parseInt(num2);


        switch (selec){
            case "Suma":
                int suma = uno + dos;
                String resul = String.valueOf(suma);
                tv1.setText(resul);
                break;
            case "Restar":
                int resta = uno - dos;
                String resu = String.valueOf(resta);
                tv1.setText(resu);
                break;

        }

    }

}