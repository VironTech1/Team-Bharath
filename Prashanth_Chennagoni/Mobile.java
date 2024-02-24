class Mobile {
    private double balance;

   
    public Mobile() {
        this.balance = 0.0;
    }

   
    public void recharge(double amount) {
        balance += amount;
    }

    
    public void makeCall(double callCost) {
        balance -= callCost;
    }

    
    public double getBalance() {
        return balance;
    }
}

