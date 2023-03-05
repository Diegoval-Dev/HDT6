package Test;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {


    @Test
    void main() {
        //Prueba introducir datos
        Map<String, LinkedList<String>> mapHashMap = new HashMap<>();
        LinkedList<String> listMuebesDeTerraza = new LinkedList<>();
        listMuebesDeTerraza.add("Mesas de jardin");
        listMuebesDeTerraza.add("Sillas de jardín");

        mapHashMap.put("Mueble de terraza", listMuebesDeTerraza);

        listMuebesDeTerraza.add("Conjuntos mesas y sillas de jardín");

        mapHashMap.put("Mueble de terraza", listMuebesDeTerraza);

        if(mapHashMap.containsKey("Mueble de terraza")){
            LinkedList<String> m = mapHashMap.get("Mueble de terraza");
            for(String n: m){
                if (n.equals("Conjuntos mesas y sillas de jardín")){
                    System.out.println("Existen " + n);
                }
            }
        }else {
            System.out.println("no existen");
        }
        System.out.println(mapHashMap);
        /*for (String key : mapHashMap.keySet()) {
            System.out.println(key + ":");
            LinkedList<String> values = mapHashMap.get(key);
            for (String value : values) {
                System.out.println("  " + value);
            }
        }*/
    }
}