public class Main {
    public static void main(String[] args) {

        /*CivilService service1 = new CivilService();
        System.out.println("Days left: " + service1.getDaysLeft());
        service1.work();
        System.out.println("Days left: " + service1.getDaysLeft());
        MilitaryService service2 = new MilitaryService(50);
        System.out.println("Days left: " + service2.getDaysLeft());
        service2.work();
        System.out.println("Days left: " + service2.getDaysLeft());*/

        /*Book book1 = new Book("Writer 1", "Name 1", 1);
        Book book2 = new Book("Writer 2", "Name 2", 1);
        Book book3 = new Book("Writer 3", "Name 3", 1);
        CD cd1 = new CD("Artist 1", "Title 1", 2001);
        CD cd2 = new CD("Artist 2", "Title 2", 2001);
        CD cd3 = new CD("Artist 3", "Title 3", 2001);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);*/

        Storehouse store = new Storehouse();
        store.addProduct("milk", 2, 50);
        store.addProduct("tea", 1.5, 25);
        System.out.println("prices: ");
        System.out.println("milk: " + store.price("milk"));
        System.out.println("tea: " + store.price("tea"));
        System.out.println("sugar: " + store.price("sugar"));
        System.out.println("We take a milk: " + store.take("milk"));
        System.out.println("We take a tea: " + store.take("tea"));
        System.out.println("We take a sugar: " + store.take("sugar"));
        System.out.println("stock: ");
        System.out.println("milk: " + store.stock("milk"));
        System.out.println("tea: " + store.stock("tea"));
        System.out.println("sugar: " + store.stock("sugar"));
        System.out.println(store.products);
    }
}