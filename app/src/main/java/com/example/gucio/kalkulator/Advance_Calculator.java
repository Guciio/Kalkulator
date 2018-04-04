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

import static java.lang.Math.cos;
import static java.lang.Math.log;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class Advance_Calculator extends AppCompatActivity {
    private Button zero,one,two,three,four,five,six,seven,eight,nine,dod,udejm,
                   mnoz,dziel,usun,rowna,kropka,cofnij,plusMinus,sin,cos,tang,ln,sqrt,log,x2,xy;
    private TextView wynik;

    private double wartPierwsza;
    private double wartDruga;

    String tekstOkienko = "";
    String odpowiedz = "";

    protected int idOdpowiedzi = 0;
    int operacjaPoRowna = 0;

    void setupNormalCalculator(){
        zero = findViewById(R.id.btn0);
        one = findViewById(R.id.btn1);
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

        //Advance

        sin =  findViewById(R.id.btnSin);
        cos =  findViewById(R.id.btnCos);
        tang =  findViewById(R.id.btnTan);
        ln=  findViewById(R.id.btnIn);
        sqrt =  findViewById(R.id.btnSqrt);
        log =  findViewById(R.id.btnLog);
        x2 =  findViewById(R.id.btnX2);
        xy =  findViewById(R.id.btnXY);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_calculator);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupNormalCalculator();
        advanceCalculator();

    }

    private void advanceCalculator()
    {
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
            public void onClick(View view) {wynik.setText(wynik.getText() + "4");
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
                checkWhichMathOperationAndDo();

                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    idOdpowiedzi = 1;
                    tekstOkienko = "";
                }
            }

        });
        udejm.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {

                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    idOdpowiedzi = 2;
                    tekstOkienko = "";
                }
            }
        });
        mnoz.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {

                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    idOdpowiedzi = 3;
                    tekstOkienko = "";
                }
            }
        });
        dziel.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {

                    wartPierwsza = Double.parseDouble(tekstOkienko);
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
                wartPierwsza= 0;
                wartDruga = 0;
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
                    wartPierwsza = 0;
                    wartDruga = 0;
                    operacjaPoRowna = 0;
                }

                if(idOdpowiedzi != 0)
                    operacjaPoRowna = idOdpowiedzi;

                if (!tekstOkienko.isEmpty() && idOdpowiedzi != 0 ) {
                    wartDruga = Double.parseDouble(tekstOkienko);
                    tekstOkienko = "";
                }

                if(operacjaPoRowna != 0) {
                    odpowiedz = doMathOperation(operacjaPoRowna);
                    wynik.setText(odpowiedz);
                    wartPierwsza = Double.parseDouble(odpowiedz);
                    idOdpowiedzi = 0;
                }
            }
        });

        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tekstOkienko.isEmpty()){
                    Double d = Double.parseDouble(tekstOkienko);
                    if(d != 0) tekstOkienko = String.valueOf(d * -1);
                    wynik.setText(tekstOkienko);
                }

                else if(!odpowiedz.isEmpty()){
                    wartPierwsza=wartPierwsza * -1;
                    Double d = Double.parseDouble(odpowiedz);
                    if(d != 0) odpowiedz = String.valueOf(d * -1);
                    wynik.setText(odpowiedz);
                }

            }
        });

        xy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWhichMathOperationAndDo();
                if(!tekstOkienko.isEmpty()) {
                    wartPierwsza = Double.parseDouble(tekstOkienko);
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
                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    odpowiedz = Pow(wartPierwsza);
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
                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    odpowiedz = Sin(wartPierwsza);
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
                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    odpowiedz = Cos(wartPierwsza);
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
                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    odpowiedz = Sqrt(wartPierwsza);
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
                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    odpowiedz = Log(wartPierwsza);
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
                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    odpowiedz = LN(wartPierwsza);
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
                    wartPierwsza = Double.parseDouble(tekstOkienko);
                    odpowiedz = Tan(wartPierwsza);
                    tekstOkienko = "";
                    wynik.setText(odpowiedz);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    private String Add(double x, double y){
        return String.valueOf(x + y);
    }
    private String Sub(double x, double y){
        return String.valueOf(x - y);
    }
    private String Multi(double x, double y){
        return String.valueOf(x * y);
    }
    private String Div(double x, double y){
        return String.valueOf(x / y);
    }
    private String PowY(double x, double y){ return String.valueOf(pow(x, y));}

    private String Pow(double x){return String.valueOf(x * x);}
    private String Sqrt(double x){return String.valueOf(sqrt(x));}

    private String Cos(double x){return String.valueOf(cos(x));}
    private String Sin(double x){return String.valueOf(sin(x));}
    private String Tan(double x){return String.valueOf(tan(x));}

    private String LN(double x){return String.valueOf(log(x));}
    private String Log(double x){return String.valueOf(log10(x));}

    private void checkWhichMathOperationAndDo(){
        if(idOdpowiedzi > 0 && !tekstOkienko.isEmpty())  {
            wartDruga = Double.parseDouble(tekstOkienko);

            odpowiedz = doMathOperation(idOdpowiedzi);
            tekstOkienko = odpowiedz;
            odpowiedz ="";
            wynik.setText(tekstOkienko);
        }

        if(tekstOkienko.isEmpty() && !odpowiedz.isEmpty()) {
            tekstOkienko = odpowiedz;
            odpowiedz ="";
            wartDruga = Double.parseDouble(tekstOkienko);
        }
    }

    private String doMathOperation(int whichOperation){
        switch (whichOperation) {
            case 0:
                break;
            case 1:
                return Add(wartPierwsza, wartDruga);
            case 2:
                return Sub(wartPierwsza, wartDruga);
            case 3:
                return Multi(wartPierwsza, wartDruga);
            case 4:
                if(wartPierwsza != 0)
                    return Div(wartPierwsza, wartDruga);
            case 5:
                return PowY(wartPierwsza, wartDruga);

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


        if (id == R.id.advance) {
            Intent i = new Intent(getApplicationContext(), Advance_Calculator.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.normal) {
            Intent i = new Intent(getApplicationContext(), Normal_Calculator.class);
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
