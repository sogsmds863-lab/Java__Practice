
import java.util.Scanner;

public class InternetPackage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter package volume (GB): ");
        String volumeText = input.nextLine();

        System.out.print("Enter wallet balance (Toman): ");
        String balanceText = input.nextLine();

        double volume = Double.parseDouble(volumeText);
        double balance = Double.parseDouble(balanceText);

        if (volume <= 0 || balance < 0) {
            System.out.println("Invalid package volume or balance!");
        } else {

            double price = volume * 5000;

            if (volume > 10) {
                price = price * 0.85;
            }

            if (balance >= price) {
                double remaining = balance - price;

                System.out.println("Purchase successful!");
                System.out.println("Remaining balance: " + remaining + " Toman");
            } else {
                double shortage = price - balance;

                System.out.println("Insufficient balance!");
                System.out.println("Shortage amount: " + shortage + " Toman");
            }
        }

        input.close();
    }
}

