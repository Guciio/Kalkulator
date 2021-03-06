package com.example.gucio.kalkulator;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.cos;
import static java.lang.Math.log;
import static java.lang.Math.log10;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class Advance_Calculator extends Normal_Calculator {

    private Button sin,cos,tang,ln,sqrt,log,x2,xy,proc;

    void setupAdvanceCalculator(){
        //Advance
        wynik = findViewById(R.id.wynik);
        sin =  findViewById(R.id.btnSin);
        cos =  findViewById(R.id.btnCos);
        tang =  findViewById(R.id.btnTan);
        ln=  findViewById(R.id.btnIn);
        sqrt =  findViewById(R.id.btnSqrt);
        log =  findViewById(R.id.btnLog);
        x2 =  findViewById(R.id.btnX2);
        xy =  findViewById(R.id.btnXY);
        proc = findViewById(R.id.proc);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_calculator);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        super.setupNormalCalculator();
        super.normalCalculator();

        this.setupAdvanceCalculator();
        this.advanceCalculator();

    }

    public void advanceCalculator()
    {

        xy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    idOdpowiedzi= 5;
                    tekstOkienko = "";
                }

            }
        });

        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    odpowiedz = String.valueOf(wartPierwsza.pow(2));
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    odpowiedz = Sin(wartPierwsza.doubleValue());
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    odpowiedz = Cos(wartPierwsza.doubleValue());
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    odpowiedz = Sqrt(wartPierwsza.doubleValue());
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    odpowiedz = Log(wartPierwsza.doubleValue());
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    odpowiedz = LN(wartPierwsza.doubleValue());
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });

        tang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = new BigDecimal(tekstOkienko);
                    odpowiedz = Tan(wartPierwsza.doubleValue());
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });

        proc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idOdpowiedzi == 0 && !tekstOkienko.isEmpty()) {
                    odpowiedz = "0.0";
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
                else if(!tekstOkienko.isEmpty()){
                    wartDruga = new BigDecimal(tekstOkienko);
                    wartDruga = wartPierwsza.multiply(wartDruga.divide(new BigDecimal(100)));
                    odpowiedz = doMathOperation(idOdpowiedzi);
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });
    }

    private String Sqrt(double x){return String.valueOf(sqrt(x));}

    private String Cos(double x){return String.valueOf(cos(x));}
    private String Sin(double x){return String.valueOf(sin(x));}
    private String Tan(double x){return String.valueOf(tan(x));}

    private String LN(double x){return String.valueOf(log(x));}
    private String Log(double x){return String.valueOf(log10(x));}

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
                    return String.valueOf(wartPierwsza.divide(wartDruga, RoundingMode.HALF_DOWN));
                else {
                    Toast.makeText(Advance_Calculator.this, "No co TY ! Nie dziel przez zero !", Toast.LENGTH_LONG).show();
                    wartPierwsza = new BigDecimal(0);
                    wartDruga = new BigDecimal(0);
                    return odpowiedz ="0";
                }
            case 5:
                return String.valueOf(wartPierwsza.pow(wartDruga.intValue()));

        }
        return odpowiedz;
    }

}
