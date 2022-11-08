// connected to task3

public class LyrraCard {
    private double balance;

    public LyrraCard (double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + balance + " euro";
    }

    public void payEconomical() {
        if (balance >= 2.50) {
            balance -= 2.50;
        }
    }

    public void payGourmet() {
        if(balance >= 4.00){
            balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if(amount>0){
            balance += amount;
            if(balance>150){
                balance = 150;
            }
        }
    }

}