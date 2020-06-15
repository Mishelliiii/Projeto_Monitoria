package br.unicamp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListaMonitoresAdpter extends ArrayAdapter<Monitor>
{
    private Context context;
    private List<Monitor> listaMonitores = null;

    public ListaMonitoresAdpter(@NonNull Context context, @NonNull List<Monitor> ListaMonitores){
        super(context,0,ListaMonitores);

        this.context =  context;
        this.listaMonitores = ListaMonitores;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view,@NonNull ViewGroup parent) {

       Monitor monitor = listaMonitores.get(position); // pegando a posição

        if (view == null) { // se minha tela estiver vazia
            view = LayoutInflater.from(context).inflate(R.layout.lista_itens, null); // eu inflo ela com as coisas

            ImageView imagem = view.findViewById(R.id.image_view_monitor);//imagem
            imagem.setImageResource(monitor.getImagem());

            TextView nome = view.findViewById(R.id.tvNome);//nome dos monitores
            nome.setText(monitor.getNome());
        }
        return view;//retorna  atela
    }
}
