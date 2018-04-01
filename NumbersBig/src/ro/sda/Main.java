package ro.sda;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int suma = 0;
        Scanner scanner = new Scanner (System.in);
        int[] numbers = new int[5];
        System.out.print("Introduceti numerele:  ");

        for (int i = 0; i<5; i++) {
            System.out.print("Numarul " + (i + 1) + "  este: ");
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i=0; i<5; i++){
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Maximul dintre numere este: " + max);
        System.out.println("Minimul dintre numere este: " + min);
        for (int i = 0; i<5; i++)
        {
            suma = suma + numbers[i];
        }
       // declarare media aritmetica
        int mediaNumere = suma/5;
        System.out.println("Suma numerelor este " + suma);
        System.out.println("Media numerelor este: " + mediaNumere);
    }
}
