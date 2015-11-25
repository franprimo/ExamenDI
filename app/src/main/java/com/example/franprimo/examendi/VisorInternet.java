package com.example.franprimo.examendi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VisorInternet extends Activity {

    //En la practica que hicimos como esta parte del examen, ya me ocurria lo mismo, si el webview
    //esta en el MainActivity, si que funciona, pero si lo cambio de activity no cargaba.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_internet);

        //Declaro y creo el view
        WebView web = (WebView) findViewById(R.id.webView);
        //Variable que contiene la direccion donde ir
        String url = "http://www.floridaoberta.com/";
        //Metodo con el que cargo dicha url
        web.loadUrl(url);

        //Con este codigo evitamos que se abra el navegador del dispositivo para ir a las
        //direcciones introducidas.
        web.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView webview, String url) {
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_visor_internet, menu);
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
