import Model.Product;
import Model.ReadFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class loadFileIntoArray {

    public ArrayList<Product> loadFileIntoArraylist(){
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
        return arrP;
    }
}
