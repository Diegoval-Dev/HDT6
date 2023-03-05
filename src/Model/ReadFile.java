package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    //URL DEL ARCHIVO A LEER, FAVOR DE MODIFICAR ANTES DE USAR.
    public String fileURL = "D:\\EstructuraDeDatosUVG\\HDT6\\src\\TXTFiles\\ListadoProducto.txt";
    public ArrayList<String> postFixExpresion = new ArrayList<>();

    /**
     * Funcion para leer el documento de texto
     * @return ArrayList con una linea del calculo en cada elemento
     */
    public ArrayList<String> returnText(){
        try {
            File myObj = new File(fileURL);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                postFixExpresion.add(line);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            //ERROR
        }
        return postFixExpresion;
    }
}
