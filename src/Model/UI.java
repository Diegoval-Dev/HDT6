package Model;

import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);

    /**
     * Imprimir
     * @param s texto a imprimir
     */
    public void print(String s){
        System.out.println(s);
    }

    /**
     * Leer ingreso del usuario
     * @return
     */
    public String read(){
        return sc.nextLine();
    }
}
