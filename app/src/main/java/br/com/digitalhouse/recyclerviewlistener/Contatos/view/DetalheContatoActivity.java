package br.com.digitalhouse.recyclerviewlistener.Contatos.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.digitalhouse.recyclerviewlistener.Contatos.model.Contato;
import br.com.digitalhouse.recyclerviewlistener.R;

public class DetalheContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_contato);

        if (getIntent() != null && getIntent().getExtras() != null) {
            Contato contato = getIntent().getParcelableExtra("Contato");

            if (contato != null) {
                //Posso usar o contato para mostrar os dados na tela
            }
        }

    }
}
