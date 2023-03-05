package Test;

import Model.Product;
import Model.ReadFile;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class loadFileIntoHashTest {

    @org.junit.jupiter.api.Test
    void load() {
        ReadFile rd = new ReadFile();
        Map<String, String> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Product> arrP = new ArrayList<>();
        arr = rd.returnText();

        for(String producto : arr){
            String[] productoIndividual = producto.split("\\|");
            Product p = new Product(productoIndividual[0],productoIndividual[1]);
            arrP.add(p);
        }

        System.out.println(arrP.get(0).getCategoria());
    }
}