package com.example.rubel.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDot,bBack,bAns,bEqual,bAdd,bSub,bMul,bDiv,bClear;

    double var1,var2;
    boolean add,sub,mul,div;
    TextView resultTV;
    TextView inputTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.Btn1);
        b2= (Button) findViewById(R.id.Btn2);
        b3= (Button) findViewById(R.id.Btn3);
        b4= (Button) findViewById(R.id.Btn4);
        b5= (Button) findViewById(R.id.Btn5);
        b6= (Button) findViewById(R.id.Btn6);
        b7= (Button) findViewById(R.id.Btn7);
        b8= (Button) findViewById(R.id.Btn8);
        b9= (Button) findViewById(R.id.Btn9);
        b0= (Button) findViewById(R.id.Btn0);
        bDot= (Button) findViewById(R.id.BtnPoint);
        bAdd= (Button) findViewById(R.id.BtnAdd);
        bSub= (Button) findViewById(R.id.BtnSub);
        bMul= (Button) findViewById(R.id.BtnMul);
        bDiv= (Button) findViewById(R.id.BtnDiv);
        bBack= (Button) findViewById(R.id.BtnBack);
        bAns= (Button) findViewById(R.id.BtnAns);
        bEqual= (Button) findViewById(R.id.BtnEqual);
        bClear= (Button) findViewById(R.id.BtnClear);

        inputTv= (TextView) findViewById(R.id.input);
        resultTV= (TextView) findViewById(R.id.result);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+"0");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(inputTv.getText()+".");
            }
        });





        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(inputTv.getText()+"");
                add=true;
              // inputTv.setText(inputTv.getText()+" + ");
                inputTv.setText(null);
            }
        });



        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // resultTV.setText(resultTV.getText()+"-");
                var1=Double.parseDouble(inputTv.getText()+"");
                sub=true;
                //inputTv.setText(inputTv.getText()+" - ");

                inputTv.setText(null);

            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(inputTv.getText()+"");
                mul=true;

                inputTv.setText(null);

                //inputTv.setText(inputTv.getText()+" * ");
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(inputTv.getText()+"");
                div=true;
                inputTv.setText(null);

                // inputTv.setText(inputTv.getText()+" / ");
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(inputTv.getText()+"");
                if(add==true){
                    double res=var1+var2;
                    resultTV.setText(res+"");


                    inputTv.setText(var1+" + "+var2);

                    Toast.makeText(MainActivity.this, ""+res, Toast.LENGTH_LONG).show();
                    add=false;
                }

                if(sub==true){
                    double res=var1-var2;
                    resultTV.setText(res+"");


                    inputTv.setText(var1+" - "+var2);

                    Toast.makeText(MainActivity.this, ""+res, Toast.LENGTH_LONG).show();
                    sub=false;
                }
                if(mul==true){
                    double res=var1*var2;
                    resultTV.setText(res+"");


                    inputTv.setText(var1+" * "+var2);

                    Toast.makeText(MainActivity.this, ""+res, Toast.LENGTH_LONG).show();

                    mul=false;
                }
                if(div==true){
                    double res=var1/var2;
                    resultTV.setText(res+"");


                    inputTv.setText(var1+" / "+var2);

                    Toast.makeText(MainActivity.this, ""+res, Toast.LENGTH_LONG).show();
                    div=false;
                }

            }
        });






        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTv.setText(null);
                resultTV.setText(null);
            }
        });
    }
}
