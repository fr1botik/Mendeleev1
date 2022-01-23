package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.hanks.htextview.base.HTextView;

import java.util.concurrent.TimeUnit;



public class LogoActivity extends AppCompatActivity {

ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);

        imageView = findViewById(R.id.mendeleev);
        HTextView textView = (HTextView) findViewById(R.id.typer);
        textView.animateText("Интерактивная Таблица Менделеева");


        /*Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        imageView.startAnimation(animation);*/

        Thread thread = new Thread(){

            public void run(){
                try{
                    TimeUnit.SECONDS.sleep(6);
                    Intent intent = new Intent(LogoActivity.this, MainActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();

    }


    }
