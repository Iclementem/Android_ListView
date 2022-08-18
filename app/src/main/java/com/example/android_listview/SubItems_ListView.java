package com.example.android_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SubItems_ListView extends AppCompatActivity {

    int total=0;
    int total0=0;
    int total1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subitems_listview);

        ListView listView = (ListView) findViewById(R.id.listView);


        HashMap<String,String> listMap = new HashMap<>();

        //AVISO: DE ESTA FORMA AL NO TENER CLAVE-VALOR NOS VA A DEVOLVER LOS ELEMENTOS SIN UN ORDEN

        for (int i = 0; i < 100; ++i) {
            listMap.put("elemento"+i+"", "elemento 2");
        }




        List<HashMap<String,String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
                new String[] {"First Line", "Second Line"},
                new int[]{R.id.item,R.id.subitem});




        Iterator it = listMap.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultsMap);


        }


        listView.setAdapter(adapter);



    }
}