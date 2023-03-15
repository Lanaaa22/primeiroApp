package cardoso.reis.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProximaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxima);
        Intent i = getIntent(); //armazena a intenção na variavel i
        String text = i.getStringExtra("texto"); //Adiciona o valor da chave
        TextView tv = findViewById(R.id.tvExibir);  //recebe o id da tvExibir que está na interface
        tv.setText(text);  //coloca o text no tv
    }
}