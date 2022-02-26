import java.util.Scanner;

import java.util.Scanner;
public class MovieTheater {
        public static void test() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Ticket Price = ");
            int ticketPrice = sc.nextInt();
            int totalGroup = 6;
            double deductedPrice = ticketPrice - ((double)ticketPrice/3);
            double totalPrice = 3*totalGroup*deductedPrice;
            System.out.print("Gross Amount: "+totalPrice);
        }
    }

