package com.pucmm.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.CALL_PHONE;
import static android.Manifest.permission.CAMERA;
import static android.Manifest.permission.READ_CONTACTS;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;

public class MainActivity extends ListActivity {

    public static final String info_src = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] food = new String[]{"Lasagna", "Hot dog", "Hamburguer", "Jugo de Tamarindo", "Arroz con leche"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_main, R.id.text, food);

        setListAdapter(arrayAdapter);

        ListView listView = getListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {

                String receta;
                switch(((TextView) v).getText().toString()){
                    case "Lasagna":
                        receta = "Ingredientes para Lasaña de carne: \n"+
                                    "2 cebollas y 2 dientes de ajo \n" +
                                    "2 pimientos rojos \n" +
                                    "2 zanahorias \n" +
                                    "Sal y pimienta negra recién molida (al gusto) \n" +
                                    "150 g. de bacon o panceta \n" +
                                    "500 g. de carne (una mezcla de cerdo y ternera) \n" +
                                    "12 láminas de lasaña o lasagna Garofalo " +
                                    "100 g. de queso rallado tipo Parmesano \n" +
                                    "100 ml. de aceite de oliva virgen extra \n" +
                                    "1 vaso de tomate natural \n" +
                                    "1 vaso de vino blanco \n" +
                                    "Bechamel (la suficiente para cubrir la lasaña)";
                        break;

                    case "Hot dog":
                        receta = "Ingredientes para Hot dog de aguacate: \n"+
                        "8 salchichas para perros calientes \n" +
                        "2 aguacates picados \n" +
                        "1 pimiento rojo picado \n" +
                        "1 1/2 cucharadita de sal \n"+
                        "3/4 cucharada de pimienta recién molida \n" +
                        "Jugo de 1 limón \n" +
                        "2 cucharadas de cilantro picado \n" +
                        "8 panes para hot dog" ;
                        break;
                    case "Hamburguer":
                        receta = "Ingredientes para Hamburguesa: \n" +
                        "250 gr de carne picada \n" +
                        "1/2 cebolla picada \n" +
                        "1 cucharada de mostaza de dijon \n" +
                        "1 cucharada de ketchup \n"+
                        "1 huevo \n" +
                        "1 cucharada de pan rallado \n" +
                        "sal";
                        break;
                    case "Jugo de Tamarindo":
                        receta =  "Ingredientes para jugo de tamarindo: \n"+
                                "2 tazas de pulpa de tamarindo \n" +
                                "1 taza de azúcar \n" +
                                "10 tazas de agua \n"+
                                "Hielo" ;
                        break;
                    case "Arroz con leche":
                        receta = "Ingredientes para arroz con leche: \n" +
                                "200 gr de arroz \n" +
                                "1 litro de leche \n"+
                                "100 gr de azúcar \n"+
                                "2 ramas de canela \n" +
                                "La cáscara de un limón";
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + v.getId());
                }

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(info_src, receta);
                startActivity(intent);
            }
        });
    }
}