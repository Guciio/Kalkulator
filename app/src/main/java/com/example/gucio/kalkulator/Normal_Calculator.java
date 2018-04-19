package com.example.gucio.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Normal_Calculator extends AppCompatActivity {


    private Button zero,one,two,three,four,five,six,seven,eight,nine,dod,udejm,mnoz,dziel,usun,rowna,kropka,cofnij,plusMinus;
    private TextView wynik;

    private BigDecimal wartPierwsza;
    private BigDecimal wartDruga;

    String tekstOkienko = "";
    String odpowiedz = "";

    protected int idOdpowiedzi = 0;
    int operacjaPoRowna = 0;

    void setupNormalCalculator(){
        zero = findViewById(R.id.btn0);
        one =findViewById(R.id.btn1);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
        dod = findViewById(R.id.btnDod);
        udejm = findViewById(R.id.btnMinus);
        mnoz = findViewById(R.id.btnMnoz);
        dziel = findViewById(R.id.btnDziel);
        kropka = findViewById(R.id.btnKrop);
        wynik = findViewById(R.id.wynik);
        usun = findViewById(R.id.btnC);
        rowna = findViewById(R.id.btnRowna);
        cofnij = findViewById(R.id.btnBksp);
        plusMinus = findViewById(R.id.btnPlusMinus);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupNormalCalculator();
        normalCalculator();
    }

    protected int getLayoutId()
    {
        return R.layout.activity_normal_calculator;
    }

    public void normalCalculator(){

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstOkienko = tekstOkienko + "0";
                wynik.setText(tekstOkienko);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tekstOkienko = tekstOkienko + "1";
                wynik.setText(tekstOkienko);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tekstOkienko = tekstOkienko + "2";
                wynik.setText(tekstOkienko);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstOkienko = tekstOkienko + "3";
                wynik.setText(tekstOkienko);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstOkienko = tekstOkienko + "4";
                wynik.setText(tekstOkienko);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstOkienko = tekstOkienko + "5";
                wynik.setText(tekstOkienko);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tekstOkienko = tekstOkienko + "6";
                wynik.setText(tekstOkienko);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstOkienko = tekstOkienko + "7";
                wynik.setText(tekstOkienko);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstOkienko = tekstOkienko + "8";
                wynik.setText(tekstOkienko);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstOkienko = tekstOkienko + "9";
                wynik.setText(tekstOkienko);
            }
        });

        dod.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();

                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    idOdpowiedzi = 1;
                    tekstOkienko = "";
                }
            }

        });
        udejm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {

                    wartPierwsza = new BigDecimal(tekstOkienko);
                    idOdpowiedzi = 2;
                    tekstOkienko = "";
                }
            }
        });
        mnoz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {

                    wartPierwsza = new BigDecimal(tekstOkienko);
                    idOdpowiedzi = 3;
                    tekstOkienko = "";
                }
            }
        });
        dziel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {

                    wartPierwsza = new BigDecimal(tekstOkienko);
                    idOdpowiedzi = 4;
                    tekstOkienko = "";
                }
            }
        });
        kropka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String tmp = tekstOkienko + ".";
                try {
                    Double.parseDouble(tmp);
                    tekstOkienko = tmp;

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if(tekstOkienko.isEmpty()) tekstOkienko ="0.";
                wynik.setText(tekstOkienko);

            }
        });

        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstOkienko = "";
                odpowiedz = "";
                wynik.setText(tekstOkienko);
                idOdpowiedzi = 0;
                operacjaPoRowna = 0;
                wartPierwsza = new BigDecimal(0);
                wartDruga = new BigDecimal(0);
            }
        });

        cofnij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tekstOkienko.isEmpty()) {
                    tekstOkienko = tekstOkienko.substring(0, tekstOkienko.length() - 1);
                    wynik.setText(tekstOkienko);
                }
            }
        });

        cofnij.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tekstOkienko = "";
                wynik.setText(tekstOkienko);
                return true;
            }
        });

        rowna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tekstOkienko.isEmpty() && idOdpowiedzi == 0){
                    odpowiedz = "";
                    wartPierwsza = new BigDecimal(0);
                    wartDruga = new BigDecimal(0);
                    operacjaPoRowna = 0;
                }

                if(idOdpowiedzi != 0)
                    operacjaPoRowna = idOdpowiedzi;

                if (!tekstOkienko.isEmpty() && idOdpowiedzi != 0 ) {
                    wartDruga = new BigDecimal(tekstOkienko);
                    tekstOkienko = "";
                }

                if(operacjaPoRowna != 0) {
                    odpowiedz = doMathOperation(operacjaPoRowna);
                    wynik.setText(odpowiedz);
                    wartPierwsza = new BigDecimal(odpowiedz);
                    idOdpowiedzi = 0;
                }

            }
        });

        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tekstOkienko.isEmpty()){
                    BigDecimal d = new BigDecimal(tekstOkienko);
                    if(!d.equals(new BigDecimal(0))) tekstOkienko = String.valueOf(d.multiply(BigDecimal.valueOf(-1)));
                    wynik.setText(tekstOkienko);
                }

                else if(!odpowiedz.isEmpty()){
                    wartPierwsza= new BigDecimal(-1).multiply(wartPierwsza);
                    BigDecimal d = new BigDecimal(odpowiedz);
                    if(!d.equals(new BigDecimal(0)) ) odpowiedz = String.valueOf(d.multiply(BigDecimal.valueOf(-1)));
                    wynik.setText(odpowiedz);
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }


    private void checkWhichMathOperationAndDo(){
        if(idOdpowiedzi > 0 && !tekstOkienko.isEmpty())  {
            wartDruga = new BigDecimal(tekstOkienko);

            odpowiedz = doMathOperation(idOdpowiedzi);
            tekstOkienko = odpowiedz;
            odpowiedz ="";
            wynik.setText(tekstOkienko);
        }

        if(tekstOkienko.isEmpty() && !odpowiedz.isEmpty()) {
            tekstOkienko = odpowiedz;
            odpowiedz ="";
            wartDruga = new BigDecimal(tekstOkienko);
        }
    }

    private String doMathOperation(int whichOperation){
        switch (whichOperation) {
            case 0:
                break;
            case 1:
                return String.valueOf(wartPierwsza.add(wartDruga));
            case 2:
                return String.valueOf(wartPierwsza.subtract(wartDruga));
            case 3:
                return String.valueOf(wartPierwsza.multiply(wartDruga));
            case 4:
                if(!wartDruga.equals(new BigDecimal(0)) )
                    return String.valueOf(wartPierwsza.divide(wartDruga,RoundingMode.DOWN));
                else {
                    Toast.makeText(Normal_Calculator.this, "No co TY ! Nie dziel przez zero !", Toast.LENGTH_LONG).show();
                    wartPierwsza = new BigDecimal(0);
                    wartDruga = new BigDecimal(0);
                    return odpowiedz ="0";
                }
        }
        return odpowiedz;
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
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            return true;
        }
        if(id == R.id.exit){
            finish();
            return false;
        }


        return super.onOptionsItemSelected(item);
    }

}
