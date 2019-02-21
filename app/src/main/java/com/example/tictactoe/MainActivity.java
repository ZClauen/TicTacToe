package com.example.tictactoe;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(4000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
//                Toast.makeText(MainActivity.this, "The End", Toast.LENGTH_SHORT).show();
                Intent S = new Intent(MainActivity.this,tictactoeActivity.class);
                startActivity(S);
                finish();
            }
        }.start();
    }
}
