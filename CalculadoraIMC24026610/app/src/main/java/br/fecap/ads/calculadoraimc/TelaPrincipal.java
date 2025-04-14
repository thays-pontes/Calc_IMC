package br.fecap.ads.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);
    }

    public void abrirCalculadora(View view) {
        Intent intent = new Intent(this, MainActivity.class); // abre a TELA DE CÁLCULO
        startActivity(intent);
    }
}