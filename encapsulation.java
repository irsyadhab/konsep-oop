class Account {
    private double balance;

    // Getter method to access the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to modify the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
