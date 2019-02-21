package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tictactoeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);

    }
    Button btn;
    int cont=0;
    String var;
    TextView txv;

    public void btnb2(View v){
        findViewById(R.id.b2);
      if(cont==0){
        btn.setText("X");
        btn.setEnabled(false);
        cont++;
        var = "X";
      }
      else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
      }

    }
    public void btna1(View v){
        findViewById(R.id.a1);
        if(cont==0){
            btn.setText("X");
            btn.setEnabled(false);
            cont++;
            var = "X";
        }
        else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
        }
    }
    public void btna2(View v){

        findViewById(R.id.a2);
        if(cont==0){
            btn.setText("X");
            btn.setEnabled(false);
            cont++;
            var = "X";
        }
        else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
        }

    }
    public void btna3(View v){

        findViewById(R.id.a3);
        if(cont==0){
            btn.setText("X");
            btn.setEnabled(false);
            cont++;
            var = "X";
        }
        else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
        }

    }
    public void btnb1(View v){

        findViewById(R.id.b1);
        if(cont==0){
            btn.setText("X");
            btn.setEnabled(false);
            cont++;
            var = "X";
        }
        else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
        }

    }
    public void btnb3(View v){

        findViewById(R.id.b3);
        if(cont==0){
            btn.setText("X");
            btn.setEnabled(false);
            cont++;
            var = "X";
        }
        else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
        }

    }
    public void btnc1(View v){

        findViewById(R.id.c1);
        if(cont==0){
            btn.setText("X");
            btn.setEnabled(false);
            cont++;
            var = "X";
        }
        else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
        }

    }
    public void btnc2(View v){

        findViewById(R.id.c2);
        if(cont==0){
            btn.setText("X");
            btn.setEnabled(false);
            cont++;
            var = "X";
        }
        else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
        }

    }
    public void btnc3(View v){

        findViewById(R.id.c3);
        if(cont==0){
            btn.setText("X");
            btn.setEnabled(false);
            cont++;
            var = "X";
        }
        else{
            btn.setText("O");
            btn.setEnabled(false);
            cont=0;
            var = "O";
        }

    }
}
