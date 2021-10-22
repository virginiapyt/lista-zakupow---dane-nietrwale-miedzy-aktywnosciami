package pl.tomczyk.zakupy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowListActivity extends AppCompatActivity {
    public ListView lista;
    public ShoppingList listazakupow;
    public ArrayList<String> shoppingList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);
        listazakupow = new ShoppingList();
        shoppingList=listazakupow.getShoppingList();


        ArrayAdapter<String> pokazlisteadapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, shoppingList);



        lista = (ListView) findViewById(R.id.lista_zakupow);
        lista.setAdapter(pokazlisteadapter);

    }

}



