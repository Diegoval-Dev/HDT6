package Model;

import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);
    public void print(String s){
        System.out.println(s);
    }
    public String read(){
        return sc.nextLine();
    }
}
