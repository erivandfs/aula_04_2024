package br.com.erivan.aula_04_2024;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Thread thread1 = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(5000);
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    finish();

                }catch (InterruptedException e){
                    throw new RuntimeException(e);

                }
            }
        }; thread1.start();
    }
}