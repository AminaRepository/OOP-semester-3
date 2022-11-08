/*The University of Helsinki students use so-called Lyrra cards to pay for their meals in student cafeterias.
In this assignment, we implement the class LyrraCard that simulates the Lyrra card.
Start by adding the class LyrraCard to your project. Then implement the LyrraCard constructor
that gets the starting balance of the card as a parameter. The card saves the balance in the object variable balance.
Implement also the toString method that returns a string of the form "The card has X euros".
Method payEconomical should decrease the balance by 2.50 euros and method payGourmet by 4.00 euros.*/

public class task3 {
    public static void main(String[] args){
        LyrraCard cardPekka = new LyrraCard(20);
        LyrraCard cardBrian = new LyrraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}