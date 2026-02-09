import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item;
        double prize;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to buy? : ");
        item = sc.nextLine();
        System.out.print("What is the price for each? : ");
        prize = sc.nextDouble();
        System.out.print("How many items would you like to buy? : ");
        quantity = sc.nextInt();

        total = prize * quantity;

        System.out.println("The total for " + quantity + " " + item + "/s would be: " + currency + total);
        System.out.println("Thanks for buying!");

        sc.close();
    }
}