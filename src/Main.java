import Model.Product;
import Model.ReadFile;
import Model.UI;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    static UI ui = new UI();
    static Factory factory = new Factory();
    static loadFileIntoArray loadFileIntoArray = new loadFileIntoArray();
    public static void main(String[] args) {
        Map<String,String> map = factory.wichMap(ui.read());
        ArrayList<Product> productos = loadFileIntoArray.loadFileIntoArraylist();
    }
    public static int menu(){
        ui.print("----MENU----");
        ui.print("1. Agregar al carrito");
        ui.print("2. Mostrar categoria del producto");
        ui.print("3. Mostrar los datos del producto");
        return 0;
    }
}