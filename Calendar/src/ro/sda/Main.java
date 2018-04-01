package ro.sda;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti anul dorit:  ");
        Integer an = scanner.nextInt();
        System.out.print("Introduceti luna:  ");
        Integer luna = scanner.nextInt();

        if (luna == 4 || luna == 6 || luna == 9 || luna == 11 )
        {
            System.out.print("Luna are 30 zile");
        } else if (luna == 1 || luna == 3 || luna == 5 || luna ==7 || luna == 8 || luna == 10 || luna == 12)
        {
            System.out.println("Luna are 31 zile");
        }

        if (luna ==2)
            //boolean bisect = false;
            if ((an % 4) != 0) {
                System.out.println("Luna are 28 zile ");
            } else if ((an % 100) != 0) {
                System.out.println("Luna are 29 zile " + "   anul " + an + "    este bisect");
            } else if ((an % 400) != 0) {
            System.out.println("Luna are 28 zile ");
        }  else {
            System.out.println("Luna are 29 zile " + "   anul " + an + "    este bisect");
        }

        }
// write your code here
    }
