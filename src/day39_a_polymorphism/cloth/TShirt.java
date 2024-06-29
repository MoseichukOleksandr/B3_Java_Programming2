package day39_a_polymorphism.cloth;

public class TShirt extends Clothes{

    String name;

    @Override
    public void wear(){
        System.out.println("TShirt wearing");
    }

    public void star(){
        System.out.println("TShirt staring");
    }

}
