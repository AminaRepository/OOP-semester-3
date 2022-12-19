/*a constructor public Purchase(String product, int amount, int unitPrice),
which creates a purchase corresponding to the parameter product. The product unit amount of purchase is clarified
by the parameter amount, and the third parameter is the unit price */

public class Purchase {
    String product;
    int amount;
    int unitPrice;
    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    public int price(){
        return this.amount * this.unitPrice;
    }
    public void increaseAmount(){
        this.amount += 1;
    }
    public String toString(){
        return this.product + ": " + this.amount;
    }
}