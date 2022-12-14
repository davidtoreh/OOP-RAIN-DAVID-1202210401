import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        int orderQty, customerID;
        try {

            System.out.println("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.println("Enter how much food to made: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(restaurant);
            Waiters waiters = new Waiters(orderQty, customerID);
            Thread t2 = new Thread(waiters);

            t1.start(); 
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
    }
}