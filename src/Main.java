import Model.Product;
import Model.ReadFile;
import Model.UI;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    static UI ui = new UI();
    static Factory factory = new Factory();
    static loadFileIntoArray loadFileIntoArray = new loadFileIntoArray();
    public static void main(String[] args) {
        Map<String, LinkedList<String>> map = fillMap();

    }
    public static int menu(){
        ui.print("----MENU----");
        ui.print("1. Agregar al carrito");
        ui.print("2. Mostrar categoria del producto");
        ui.print("3. Mostrar los datos del producto");
        return 0;
    }
    public static Map<String,LinkedList<String>> fillMap(){
        Map<String, LinkedList<String>> map = factory.wichMap(ui.read());
        ArrayList<Product> productos = loadFileIntoArray.loadFileIntoArraylist();
        LinkedList<String> listMueblesDeTerraza = new LinkedList<>();
        LinkedList<String> listSillonesDeMasaje = new LinkedList<>();
        LinkedList<String> listBebidas = new LinkedList<>();
        LinkedList<String> listCondimentos = new LinkedList<>();
        LinkedList<String> listFrutas = new LinkedList<>();
        LinkedList<String> listCarnes = new LinkedList<>();
        LinkedList<String> listLacteos= new LinkedList<>();

        for (Product producto: productos){
            switch (producto.getCategoria()){
                case "Mueble de terraza":
                    listMueblesDeTerraza.add(producto.getNombre());
                    break;
                case "Sillones de masaje":
                    listSillonesDeMasaje.add(producto.getNombre());
                    break;
                case "Bebidas":
                    listBebidas.add(producto.getNombre());
                    break;
                case "Condimentos":
                    listCondimentos.add(producto.getNombre());
                    break;
                case "Frutas":
                    listFrutas.add(producto.getNombre());
                    break;
                case "Carnes":
                    listCarnes.add(producto.getNombre());
                    break;
                case "Lácteos":
                    listLacteos.add(producto.getNombre());
                    break;
            }
        }
        map.put("Mueble de terraza",listMueblesDeTerraza);
        map.put("Sillones de masaje",listSillonesDeMasaje);
        map.put("Bebidas",listBebidas);
        map.put("Condimentos",listCondimentos);
        map.put("Frutas",listFrutas);
        map.put("Carnes",listCarnes);
        map.put("Lácteos",listLacteos);
        return map;
    }
}