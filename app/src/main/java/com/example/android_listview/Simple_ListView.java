package com.example.android_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Simple_ListView extends AppCompatActivity {

    private ListView listView;

    List<String> list = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EJEMPLO MUY SIMPLE DE LISTVIEW

        setContentView(R.layout.simple_listview);

        listView = findViewById(R.id.listView);

        list.add("primer elemento.");
        list.add("segundo elemento.");
        list.add("tercero elemento.");
        list.add("cuarto elemento.");
        list.add("quinto elemento.");
        list.add("sexto elemento.");
        list.add("septimo elemento.");
        list.add("octavo elemento.");
        list.add("noveno elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");
        list.add("... elemento.");


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }
}