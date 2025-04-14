package br.fecap.ads.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Obesidade1 extends AppCompatActivity {

    private TextView txtAltura, txtPeso, txtIMC, txtClassificacao, txtMensagem;
    private ImageView imgFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abaixodopeso);

        // Referências
        txtAltura = findViewById(R.id.txtAltura);
        txtPeso = findViewById(R.id.txtPeso);
        txtIMC = findViewById(R.id.txtIMC);
        txtClassificacao = findViewById(R.id.txtClassificacao);
        txtMensagem = findViewById(R.id.txtMensagem);
        imgFeedback = findViewById(R.id.imgFeedback);

        // Recebe os dados da MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            txtAltura.setText(getString(R.string.altura_formatada, extras.getString("altura")));
            txtPeso.setText(getString(R.string.peso_formatado, extras.getString("peso")));
            txtIMC.setText(getString(R.string.imc_formatado, extras.getString("imc")));
            txtClassificacao.setText(getString(R.string.class_abaixo));
            txtMensagem.setText(getString(R.string.msg_obesidade1));
            imgFeedback.setImageResource(R.drawable.tabela_imc);
        }
    }

    public void fechar(View view) {
        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
        finish();
    }
}