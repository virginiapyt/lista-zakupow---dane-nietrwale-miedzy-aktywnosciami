package pl.tomczyk.zakupy3a;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
  //tu brakowało tylko new ArrayList, czyli tworzymy pustą listę i dopiero potem można dodawać
    public  ArrayList<String> shoppingList1 = new ArrayList<>() ;

    public ShoppingList() {
        this.shoppingList1.add("mleko");
        this.shoppingList1.add("owoce");
    }

    public ArrayList<String> getShoppingList() {
        return shoppingList1;
    }



}












