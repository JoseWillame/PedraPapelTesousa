package br.edu.unifametro.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.net.Uri;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Fluxo","Método onCreate() chamado");

        Button btnJogar = findViewById(R.id.btnJogar);

        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int [] jokeArray = {
                R.drawable.papel,
                R.drawable.pedra,
                R.drawable.tesoura,
        };
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numberRandom = new Random();
                int number = numberRandom.nextInt(3);//aleatorio [0,2]
                leftDice.setImageResource(jokeArray[number]);
                int number1 = numberRandom.nextInt(3);//aleatorio [0,2]
                rightDice.setImageResource(jokeArray[number1]);
            }
        });
    }
    public void tutorial(View v){
        Intent intentLink = new Intent();
        intentLink.setAction(Intent.ACTION_VIEW);
        intentLink.addCategory(Intent.CATEGORY_DEFAULT);
        intentLink.setData(Uri.parse("https://www.youtube.com/watch?v=BDQQ8VjDR-s"));

        startActivity(intentLink);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Fluxo","Método onStart() chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Fluxo","Método onResume() chamado");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Fluxo","Método onPause() chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Fluxo","Método onStop() chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Fluxo","Método onDestroy() chamado");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Fluxo","Método onRestart() chamado");
    }
}