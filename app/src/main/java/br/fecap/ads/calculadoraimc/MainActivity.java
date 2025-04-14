package br.fecap.ads.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button btnSet;
    private Button btnReset;
    private EditText campoAltura;
    private EditText campoPeso;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // A tela de conteúdo onde o cálculo será realizado

        // Inicializando os componentes da tela
        btnSet = findViewById(R.id.btnSet);
        btnReset = findViewById(R.id.btnReset);
        campoAltura = findViewById(R.id.editTextAltura);
        campoPeso = findViewById(R.id.editTextPeso);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calculaIMC(View view) {
        // Recuperando as entradas de altura e peso
        String altura = campoAltura.getText().toString();
        String peso = campoPeso.getText().toString();

        // Verificando se os campos não estão vazios
        if (altura.isEmpty() || peso.isEmpty()) {
            textResultado.setText("Por favor, preencha todos os campos.");
            return;
        }

        // Convertendo os dados para numéricos e realizando o cálculo do IMC
        try {
            double numAltura = Double.parseDouble(altura);
            double numPeso = Double.parseDouble(peso);
            double numImc = numPeso / (numAltura * numAltura);

            // Formatando o resultado com 2 casas decimais
            DecimalFormat df = new DecimalFormat("##.##");
            String imc = df.format(numImc);

            // Exibindo o resultado na tela
            textResultado.setText(imc + " kg/m²");
        } catch (NumberFormatException e) {
            textResultado.setText("Entrada inválida. Por favor, verifique os valores.");
        }
    }

    public void abrirCalculadora(View view) {
        // Abrindo a tela de cálculo de IMC
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}