package polymorphism;

public class MainApp {
    public static void main(String[] args) {
        Burger burger = new Burger("Jumbo","Chicken",65,"White Sesame");
        burger.addBurgerAddition2("Tomato",10);
        burger.addBurgerAddition2("Cheese",20);
        burger.addBurgerAddition3("Cola",25);
        double totalBill = burger.itemizeBurger();
        System.out.println("Total Bill : "+totalBill+" Rs");
    }
}
