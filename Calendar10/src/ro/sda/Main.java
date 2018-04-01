package ro.sda;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        String[]  monthNames = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        System.out.print ("Input your month number: ");
        Scanner scanner = new Scanner (System.in);
        int monthNumber = scanner.nextInt();

        if ((monthNumber<1) || (monthNumber>12)) {
            System.out.println("The month number is invalid. ");
        } else {
            String monthName = monthNames[monthNumber - 1];
            System.out.print("The mont name is:   " + monthName);
        }

    }
}
