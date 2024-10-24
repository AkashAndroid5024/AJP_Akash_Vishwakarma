package akash;

class Bank {
    // Instance variable to store the balance amount
    private double amount;

    // Parameterized constructor to initialize the amount to 10000
    public Bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw amount with condition using ternary operator
    public void withdraw(double withdrawalAmount) {
        String message = (amount >= withdrawalAmount)
                ? "Withdraw successful!"
                : "Insufficient balance!";
        System.out.println(message);

        // Update balance if withdrawal is successful
        amount = (amount >= withdrawalAmount) ? (amount - withdrawalAmount) : amount;
    }

    // Method to deposit amount in the account
    public void deposit(double depositAmount) {
        amount += depositAmount; // Increase the balance by deposit amount
        System.out.println(depositAmount + " deposited successfully!");
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    // Main method to test the Bank class
    public static void main(String[] args) {
        // Create a Bank object with initial amount 10000
        Bank account = new Bank(10000);

        // Withdraw 3000 from the account
        account.withdraw(3000);

        // Deposit 5000 into the account
        account.deposit(5000);

        // Display the final balance
        account.displayBalance();
    }
}
