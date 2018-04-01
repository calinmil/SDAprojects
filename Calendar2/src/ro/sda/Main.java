package ro.sda;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti anul dorit:  ");
        Integer an = scanner.nextInt();
        System.out.print("Introduceti luna:  ");
        Integer luna = scanner.nextInt();

        switch (luna) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Luna are 31 zile   ");
                break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("Luna are 30 zile   ");
                break;
            case 2:
                if ((an % 4) != 0) {
                    System.out.println("Luna are 28 zile ");
                } else if ((an % 100) != 0) {
                    System.out.println("Luna are 29 zile " + "   anul " + an + "    este bisect");
                } else if ((an % 400) != 0) {
                    System.out.println("Luna are 28 zile ");
                }  else {
                    System.out.println("Luna are 29 zile " + "   anul " + an + "    este bisect");
                }
                break;

        }
    }
}


