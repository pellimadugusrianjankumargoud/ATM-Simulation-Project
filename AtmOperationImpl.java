package atmproject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AtmOperationImpl implements AtmOperationInterface {

    Atm atm = new Atm();
    List<String> ministmt = new ArrayList<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override
    public void withDrawAmount(double withDrawAmount) {
        if (withDrawAmount <= 0) {
            System.out.println("Invalid amount entered!");
        } else if (withDrawAmount > atm.getBalance()) {
            System.out.println("Insufficient Balance !!");
        } else if (withDrawAmount > 10000) {
            System.out.println("You can withdraw a maximum of ₹10,000 per transaction.");
        } else {
            System.out.println("Collect the cash : " + withDrawAmount);
            atm.setBalance(atm.getBalance() - withDrawAmount);
            ministmt.add(LocalDateTime.now() + " - " + withDrawAmount + " Withdrawn");
            viewBalance();
        }
    }

    @Override
    public void depositeAmount(double depositeAmount) {
        if (depositeAmount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            atm.setBalance(atm.getBalance() + depositeAmount);
            ministmt.add(LocalDateTime.now() + " - " + depositeAmount + " Deposited");
            System.out.println(depositeAmount + " Deposited Successfully");
            viewBalance();
        }
    }

    @Override
    public void viewMiniStatement() {
        if (ministmt.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("----- Mini Statement -----");
            for (String transaction : ministmt) {
                System.out.println(transaction);
            }
        }
    }
}
