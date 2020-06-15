package br.unicamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NouamiActivity extends AppCompatActivity {

    TextView tvNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouami);


        tvNome = findViewById(R.id.tvNome);


    }
}
