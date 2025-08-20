package atmproject;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        AtmOperationInterface op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmPin = 123;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Atm Number : ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter Pin : ");
        int pin = sc.nextInt();

        if ((atmnumber == atmNumber) && (atmPin == pin)) {
            while (true) {
                System.out.println("\n===== ATM Menu =====");
                System.out.println("1. Check Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");
                System.out.print("Enter Choice : ");

                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        op.withDrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter Amount to Deposit: ");
                        double depositeAmount = sc.nextDouble();
                        op.depositeAmount(depositeAmount);
                        break;
                    case 4:
                        op.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect your Atm card.\nThank you for using ATM!");
                        sc.close();
                        System.exit(0); // Exit properly
                        break;
                    default:
                        System.out.println("Invalid Choice. Try Again!");
                }
            }
        } else {
            System.out.println("Atm Number or Pin incorrect");
            System.exit(0);
        }
    }
}
