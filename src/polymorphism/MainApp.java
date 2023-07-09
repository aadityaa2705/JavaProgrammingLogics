package polymorphism;

public class MainApp {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Jumbo","Chicken",65,"White Sesame");
        hamburger.addHamburgerAddition2("Tomato",10);
        hamburger.addHamburgerAddition2("Cheese",20);
        hamburger.addHamburgerAddition3("Cola",25);
        double totalBill = hamburger.itemizeHamburger();
        System.out.println("Total Bill : "+totalBill+" Rs");
    }
}
