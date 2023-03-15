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
        Intent i = getIntent();
        String text = i.getStringExtra("texto");
        TextView tv = findViewById(R.id.tvExibir);
        tv.setText(text);
    }
}