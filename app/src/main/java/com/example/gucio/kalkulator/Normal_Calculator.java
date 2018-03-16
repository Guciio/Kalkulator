package com.example.gucio.kalkulator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Normal_Calculator extends AppCompatActivity {


    private Button zero,one,two,three,four,five,six,seven,eight,nine,dod,udejm,mnoz,dziel,usun,rowna,kropka;
    private TextView wynik;

    private double wartPierwsza;
    private double wartDruga;

    private boolean dodawanie ,odejmowanie,mnozenie ,dzielenie ;



    void setupNormalCalculator(){
        zero = (Button) findViewById(R.id.btn0);
        one =(Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        dod = (Button) findViewById(R.id.btnDod);
        udejm = (Button) findViewById(R.id.btnMinus);
        mnoz = (Button) findViewById(R.id.btnMnoz);
        dziel = (Button) findViewById(R.id.btnDziel);
        kropka = (Button) findViewById(R.id.btnKrop);
        wynik = (TextView) findViewById(R.id.wynik);
        usun = (Button) findViewById(R.id.btnBksp);
        rowna = (Button) findViewById(R.id.btnRowna);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_calculator);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupNormalCalculator();
        normalCalculator();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if(id == R.id.normal){
            Intent i = new Intent(getApplicationContext(), Normal_Calculator.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.advance) {
            Intent i = new Intent(getApplicationContext(), Advance_Calculator.class);
            startActivity(i);
            return true;
        }
        if(id == R.id.about){
            setContentView(R.layout.content_about);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            return true;
        }
        if(id == R.id.exit){
            finish();
            return false;
        }


        return super.onOptionsItemSelected(item);
    }

    public void normalCalculator(){

        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {wynik.setText(wynik.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                wynik.setText(wynik.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                wynik.setText(wynik.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {wynik.setText(wynik.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {                wynik.setText(wynik.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {wynik.setText(wynik.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                wynik.setText(wynik.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {wynik.setText(wynik.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {wynik.setText(wynik.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {wynik.setText(wynik.getText() + "9");
            }
        });
        dod.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                wartPierwsza = Double.parseDouble(wynik.getText()+"");
                dodawanie = true;
                wynik.setText(null);
            }
        });
        udejm.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                wartPierwsza = Double.parseDouble(wynik.getText()+"");
                odejmowanie = true;
                wynik.setText(null);
            }
        });
        mnoz.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                wartPierwsza = Double.parseDouble(wynik.getText()+"");
                mnozenie = true;
                wynik.setText(null);
            }
        });
        dziel.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                wartPierwsza = Double.parseDouble(wynik.getText()+"");
                dzielenie = true;
                wynik.setText(null);
            }
        });
        kropka.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {wynik.setText(wynik.getText() + ".");
            }
        });

        rowna.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                wartDruga = Double.parseDouble(wynik.getText()+"");

                if(dodawanie){
                    wynik.setText(wartPierwsza+wartPierwsza+"");
                    dodawanie=false;
                }
                if(odejmowanie){
                    wynik.setText(wartPierwsza-wartPierwsza+"");
                    odejmowanie=false;
                }
                if(mnozenie){
                    wynik.setText(wartPierwsza * wartPierwsza+"");
                    mnozenie=false;
                }
                if(dzielenie){
                    wynik.setText(wartPierwsza / wartPierwsza+"");
                    dzielenie=false;
                }
            }
        });
        usun.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {wynik.setText("");
            }
        });
    }

}
