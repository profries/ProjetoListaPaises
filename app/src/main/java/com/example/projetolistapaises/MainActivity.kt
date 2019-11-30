package com.example.projetolistapaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var listaPaises = ArrayList<String>();

    lateinit var arrayAdapter: ArrayAdapter<String>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var listViewPaises: ListView = findViewById(R.id.listViewPaises);

        iniciaListaPaises();

        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            listaPaises);

        listViewPaises.adapter = this.arrayAdapter;


    }

    private fun iniciaListaPaises() {
        listaPaises.add("Argentina");
        listaPaises.add("Brasil");
        listaPaises.add("Chile");
        listaPaises.add("Dinamarca");
        listaPaises.add("Equador");
    }


}
