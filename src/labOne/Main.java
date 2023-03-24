package labOne;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Desktop(2,16,256,false,true,1000);
        System.out.println(comp1.calculatePrice());
        System.out.println((int)comp1.calculateShippingCost());
        Computer comp2 = new Laptop(2,16,256,false,true,1000,12);
        System.out.println(comp2.calculatePrice());
        System.out.println((int)comp2.calculateShippingCost());
    }
}
