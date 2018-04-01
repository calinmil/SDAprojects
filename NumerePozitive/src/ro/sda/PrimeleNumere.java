package ro.sda;

import java.util.Scanner;
public class PrimeleNumere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // initializare numarul de numere folosit ca si contor pentru cele pozitive
         int nrNumere=0;
         // initializare tabloul pentru numerele pozitive gasite
        int[] numerePoz = new int[5];
        // initializare variabila contor pentru cate numere au fost introduse
        int contor = 0;
        // initializare variabila maxim pentru a gasi maximul dintre numere pozitive
        int maxim = 0;
        int contorNumere = 0;
        // incepem bucla while pentru a vedea acele numere daca sunt pozitive sau nagative
        while (nrNumere<5) {
            System.out.println("Please enter n:  ");
            int n = scanner.nextInt();
            System.out.println("n: " + n);
            contorNumere++;
        if (n>0){
                nrNumere++;
                System.out.println("Numarul  " + n + "  este pozitiv");
                numerePoz[contor]=n;
                contor++;
            } else {
                System.out.println("Numarul  " + n + " este negativ");
            }
        if (maxim<n) {
         maxim = n;
                //   System.out.println("Numarul maxim este:  " + n);
            }
        }
        System.out.println("-----------------------------------------------");
        System.out.println("S-a atins limita de 5 numere pozitive");
        System.out.println("--------------------------------------------------");
        System.out.println("Numarul maxim este:  " + maxim);
        System.out.println("-------------------------------------------------");
        System.out.println("Numarul de numere tastat este:  " + contorNumere);
        System.out.println();
        for (int i = 0; i<5; i++) {
            System.out.println("Numerele pozitive sunt: " + numerePoz[i]);
        }

    }
}
