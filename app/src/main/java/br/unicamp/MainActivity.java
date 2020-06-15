package br.unicamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonitores;
    TextView tvHorariosTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHorariosTela = findViewById(R.id.tvHorariosTela);

        lvMonitores = findViewById(R.id.lvMonitores);

        ArrayList<Monitor> listaMonitor = incluirNoArrayList();

        ListaMonitoresAdpter nossoAdpterMonitor = new ListaMonitoresAdpter(this,listaMonitor);

        lvMonitores.setAdapter(nossoAdpterMonitor);




        lvMonitores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:goSilva();
                        break;
                    case 1:goArruda();
                        break;
                    case 2:goNouami();
                        break;
                    case 3:goIsa();
                        break;
                    case 4:goNicolas();
                        break;
                    case 5:finish();
                        break;
                }
            }
        });

    }
    private ArrayList<Monitor> incluirNoArrayList() {
        ArrayList<Monitor>AdicionaNaListaMonitores = new ArrayList<Monitor>();

        AdicionaNaListaMonitores.add(gerarModelo("Lucas Silva",10,R.drawable.silva));
        AdicionaNaListaMonitores.add(gerarModelo("Gabriel arruda",10,R.drawable.arruda));
        AdicionaNaListaMonitores.add(gerarModelo("Gabriel nouani",10,R.drawable.nouami));
        AdicionaNaListaMonitores.add(gerarModelo("Isabela Paulino",10,R.drawable.isa));
        AdicionaNaListaMonitores.add(gerarModelo("Nicolas",10,R.drawable.nicolas));

        return AdicionaNaListaMonitores;

    }

    private void goSilva()
    {
        Intent intentVaiSilva = new Intent(MainActivity.this,SilvaActivity.class);
        startActivity(intentVaiSilva);
    }
    private void goArruda()
    {
        Intent intentVaiArruda = new Intent(MainActivity.this,ArrudaActivity.class);
        startActivity(intentVaiArruda);
    }
    private void goNouami()
    {
        Intent intentVaiNouami = new Intent(MainActivity.this,NouamiActivity.class);
        startActivity(intentVaiNouami);
    }
        private void goIsa()
    {
        Intent intentVaiIsa = new Intent(MainActivity.this,IsaActivity.class);
        startActivity(intentVaiIsa);
    }
    private void goNicolas()
    {
        Intent intentVaiNicolas = new Intent(MainActivity.this,NicolasActivity.class);
        startActivity(intentVaiNicolas);
    }

    private Monitor gerarModelo(String nome, int horario,int imagem)
    {
        Monitor monitor = new Monitor();
        monitor.setNome(nome);
        monitor.setHorario(horario);
        monitor.setImagem(imagem);


        return monitor;

    }
}
