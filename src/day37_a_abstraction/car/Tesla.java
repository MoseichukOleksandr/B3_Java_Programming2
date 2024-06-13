package day37_a_abstraction.car;

public class Tesla extends ElectricCar {

    @Override
    public void start() {
        System.out.println("start with the card");    }
    @Override
    public void charge() {
        System.out.println("Tesla charging");
    }
}
