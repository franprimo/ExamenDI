package com.example.franprimo.examendi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SeleccionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);

        //Creo un array con los elementos que va a tener la lista
        String[] items = {"Invitado", "Organizador", "Revisor", "Autor"};
        //Lo convierto en un ArrayList porque es lo que le voy a pasar al ListView
        ArrayList<String> itemsLista = new ArrayList<String>(Arrays.asList(items));
        //Le paso la lista al adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), R.layout.activity_seleccion, itemsLista);
        //Declaro y creo el view
        ListView lv = (ListView) findViewById(R.id.listView);
        //Le paso el adapter a la lista
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_seleccion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
