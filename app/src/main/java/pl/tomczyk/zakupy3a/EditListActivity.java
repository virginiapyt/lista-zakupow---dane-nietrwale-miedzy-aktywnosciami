package pl.tomczyk.zakupy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class EditListActivity extends AppCompatActivity {
    public Button clear, add;
    public EditText editText;
    public ShoppingList listazakupow;
    public ArrayList<String> shoppingList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_list);

        listazakupow = new ShoppingList();
        shoppingList=listazakupow.getShoppingList();

        clear = (Button) findViewById(R.id.btn_clear);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shoppingList.clear();

            }
        });


    }
}