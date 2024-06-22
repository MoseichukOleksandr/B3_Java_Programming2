package day42_b_maps.classroom;

public class Student {
    String name;
    double age;
    int id;

    public Student(String name, double age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString(){


        return  "\nStudent info: " +
                "\n\tName: " + name+
                "\n\tage: "+age+
                "\n\tid: "+id;
    }
}
