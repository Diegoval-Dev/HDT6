import Model.Product;
import Model.ReadFile;
import Model.UI;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    static UI ui = new UI();
    static Factory factory = new Factory();
    static loadFileIntoArray loadFileIntoArray = new loadFileIntoArray();
    public static void main(String[] args) {
        ui.print("Seleccione que Map quiere usar");
        ui.print("1. HashMap");
        ui.print("2. TreeMap");
        ui.print("3. LinkedHashMap");
        String type = ui.read();
        Map<String, LinkedList<String>> map = fillMap(type);
        Map<String, LinkedList<String>> userMap = factory.wichMap(type);

        menu();
        int op = Integer.parseInt(ui.read());
        while (op != 5){
            switch (op){
                case 1:
                    printMap(map);
                    agregarPedido(map,userMap);
                    menu();
                    op = Integer.parseInt(ui.read());
                    break;
                case 2:
                    ui.print("Ingrese le producto para saber su categoria: ");
                    String prod = ui.read();
                    mostrarCategoria(prod, map);
                    menu();
                    break;
                case 3:
                    ui.print("Listado de los productos del usuario");
                    printMap(userMap);
                    menu();
                    break;
                case 4:
                    ui.print("Listado de los productos del supermercado");
                    printMap(map);
                    menu();
                    break;
            }
        }

    }
    public static void menu(){
        ui.print("----MENU----");
        ui.print("1. Agregar al carrito");
        ui.print("2. Mostrar categoria del producto");
        ui.print("3. Mostrar los datos del producto");
        ui.print("4. Mostrar la lista de productos en el inventario");
        ui.print("5. Salir");
    }
    public static void printMap(Map<String, LinkedList<String>> map){
        for (String key : map.keySet()) {
            ui.print(key + ":");
            LinkedList<String> values = map.get(key);
            for (String value : values) {
                ui.print("  " + value);
            }
        }
    }
    public static Map<String,LinkedList<String>> fillMap(String type){
        Map<String, LinkedList<String>> map = factory.wichMap(type);
        ArrayList<Product> productos = loadFileIntoArray.loadFileIntoArraylist();
        LinkedList<String> listMueblesDeTerraza = new LinkedList<>();
        LinkedList<String> listSillonesDeMasaje = new LinkedList<>();
        LinkedList<String> listBebidas = new LinkedList<>();
        LinkedList<String> listCondimentos = new LinkedList<>();
        LinkedList<String> listFrutas = new LinkedList<>();
        LinkedList<String> listCarnes = new LinkedList<>();
        LinkedList<String> listLacteos= new LinkedList<>();
        for (Product producto: productos){
            if (producto.getCategoria().equals("Mueble de terraza")){
                listMueblesDeTerraza.add(producto.getNombre());
            }
            if (producto.getCategoria().equals("Sillones de masaje")) {
                listSillonesDeMasaje.add(producto.getNombre());
            }
            if (producto.getCategoria().equals("Bebidas")) {
                listBebidas.add(producto.getNombre());
            }
            if (producto.getCategoria().equals("Condimentos")) {
                listCondimentos.add(producto.getNombre());
            }
            if (producto.getCategoria().equals("Frutas")) {
                listFrutas.add(producto.getNombre());
            }
            if (producto.getCategoria().equals("Carnes")) {
                listCarnes.add(producto.getNombre());
            }
            if (producto.getCategoria().equals("Lácteos")) {
                listLacteos.add(producto.getNombre());
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

    public static  Map<String, LinkedList<String>> agregarPedido(Map<String,LinkedList<String>> map, Map<String,LinkedList<String>> userMap){

        ui.print("Ingrese la categoria del producto a usar");
        for (String key : map.keySet()){
            ui.print(key);
        }
        String categoria = ui.read();
        if(map.containsKey(categoria)){
            LinkedList<String> listProd = map.get(categoria);
            for(String prod : listProd){
                ui.print(prod);
            }
            ui.print("Ingrese el producto");
            String prodIngres = ui.read();
            for(String prod : listProd){
                if (prod.equals(prodIngres)){
                    LinkedList<String> list = new LinkedList<>();
                    list.add(prodIngres);
                    userMap.put(categoria,list);
                }
            }

        }else{
            ui.print("La categoria no se encontro");
            agregarPedido(map,userMap);
        }
        ui.print("Carrito del usuario: ");
        printMap(userMap);
        return userMap;
    }

    public static void mostrarCategoria(String prod,Map<String,LinkedList<String>> map){
        for (String key : map.keySet()) {
            LinkedList<String> values = map.get(key);
            for (String value : values) {
                if(value.equals(prod)){
                    ui.print("Categoria del producto: "+key);
                }
            }
        }
    }
}