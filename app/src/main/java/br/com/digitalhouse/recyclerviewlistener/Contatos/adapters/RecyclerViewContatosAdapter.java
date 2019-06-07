package br.com.digitalhouse.recyclerviewlistener.Contatos.adapters;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.recyclerviewlistener.R;
import br.com.digitalhouse.recyclerviewlistener.Contatos.RecyclerViewClickListener;
import br.com.digitalhouse.recyclerviewlistener.Contatos.model.Contato;

public class RecyclerViewContatosAdapter extends RecyclerView.Adapter<RecyclerViewContatosAdapter.ViewHolder> {

    private List<Contato> contatos;
    private RecyclerViewClickListener listener;

    public RecyclerViewContatosAdapter(List<Contato> contatos, RecyclerViewClickListener listener) {
        this.contatos = contatos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        View itemView = LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.contato_recyrcleview_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Contato contato = contatos.get(position);
        viewHolder.setConteudoNaTela(contato);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                listener.onClick(Contato);
            }
        }};
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }

    //Atributos dos elementos
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewFoto;
        private TextView TextViewNome;
        private TextView TextViewTelefone;
    }
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //Inicializarmos as Views
            imageViewFoto = itemView.findViewById(R.id.imageViewFoto);
            TextViewNome = itemView.findViewById(R.id.textViewNome);
            TextViewTelefone = itemView.findViewById(R.id.textViewTelefone);


        }

        // Atribui o as views os valores da variavel contato
        public void setConteudoNaTela(Contato contato) {
            imageViewFoto.setImageDrawable(ContextCompat.getDrawable(imageViewFoto.getContext(), contato.getFoto()));
            TextViewNome.setText(contato.getNome());
            TextViewTelefone.setText(contato.getNumero());
        }
    }


}