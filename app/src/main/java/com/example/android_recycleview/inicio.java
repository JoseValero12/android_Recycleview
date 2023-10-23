package com.example.android_recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;

public class inicio extends AppCompatActivity {

    private Button botonBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        LottieAnimationView animationView = findViewById(R.id.animationView);
        animationView.setAnimation(R.raw.animation_lo2xv133);
        animationView.playAnimation();

        botonBienvenida = findViewById(R.id.botonBienvenida);
        botonBienvenida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarCuentaRegresiva();
            }
        });
    }

    private void iniciarCuentaRegresiva() {
        botonBienvenida.setEnabled(false);
        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                botonBienvenida.setText("Iniciando en " + (millisUntilFinished / 1000) + " segundos");
            }

            @Override
            public void onFinish() {
                botonBienvenida.setText("Iniciar");
                botonBienvenida.setEnabled(true);
                abrirNuevaActividad();
            }
        }.start();
    }

    private void abrirNuevaActividad() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


