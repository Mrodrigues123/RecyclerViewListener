package br.com.digitalhouse.recyclerviewlistener.Contatos.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.recyclerviewlistener.Contatos.model.Contato;
import br.com.digitalhouse.recyclerviewlistener.R;
import br.com.digitalhouse.recyclerviewlistener.Contatos.adapters.RecyclerViewContatosAdapter;

public class ContatoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewContatosAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Activity_Contato);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerViewContatos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewContatosAdapter(getContatos(), this);
        recyclerView.setAdapter(adapter);
    }

    private List<Contato> getContatos() {
        List<Contato> contatos = new ArrayList<>();
        Contato.add(new Contato("Tairo", "11-6543-4354", R.drawable.android_logo));
        Contato.add(new Contato("Murillo", "11-6543-6554", R.drawable.android_logo));
        Contato.add(new Contato("Jessica", "11-6543-6374", R.drawable.android_logo));
        Contato.add(new Contato("Samuel", "11-6543-6954", R.drawable.android_logo));
        Contato.add(new Contato("Carlos", "11-6543-1354", R.drawable.android_logo));


        return null;
    }

    @Override
    public void onClick(Contato contato) {

    }
}

