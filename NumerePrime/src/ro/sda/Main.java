package ro.sda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
       Scanner scanner = new Scanner (System.in);
        System.out.print("Introduceti numarul:  ");
        int nr = scanner.nextInt();

        // se initializeaza numarul nostru prim cu 0
        int prim = 0;
        // se pleaca de la numarul 2 (primul numar prim)
        for (int i=1; i<=nr; i++) {
            // daca restul impartirii numarului nostru la i este zero
            if (nr % i == 0) {
                // se incrementeaza cu cate o unitate numarul prim
                prim ++;
            }
        }
        // Se verifica daca numarul este prim sau nu
        if(prim == 2){
            System.out.println(nr + " is a prime number ");
        } else {
            System.out.println(nr + "  it is not a prime number");
        }
    }
}
