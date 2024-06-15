package day39_a_polymorphism.cloth;

public class Jacket extends Clothes implements HasHood{


    @Override
    public void wear() {
        System.out.println("Jacket wear");
    }

    public void putOnHood(){
        System.out.println("Jacket put on hood");
    }
}
