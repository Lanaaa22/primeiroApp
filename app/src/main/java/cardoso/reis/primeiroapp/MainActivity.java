package cardoso.reis.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { // Criação da classe herdando os valores de uma outra classe chamada AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // Método onCreate, método que toda vez quando a activity é criada ele é chamado
        super.onCreate(savedInstanceState); //
        setContentView(R.layout.activity_main);
        Button btnEnviar =  findViewById(R.id.btnEnviar); //tipo Button com a váriavel do botão que está na interface, recebe uma função que captura a id do botão que está na interface
        btnEnviar.setOnClickListener(new View.OnClickListener() { //Ouvidor de clicks, assim que o botão for clicado ele será ativado
            @Override
            public void onClick(View view) { //Método acionado assim que o ouvidor for ativado
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //variável do tipo EditText e o etDigiteAqui da interface, novamente a id será capturada dessa mesma variável
                String texto = etDigiteAqui.getText().toString(); //criando uma String chamada texto que recebe o get do etDigiteAqui
                Intent intent = new Intent(MainActivity.this,ProximaActivity.class); //Cria uma intenção que vai do MainActivity até a ProximaActivity, ou seja, de uma interface a outra
                intent.putExtra("texto", texto); //leva os elementos do texto que foi inserido na linha 22 em um dicionário
                startActivity(intent); //Inicia a intenção
            }
        });
    }
}