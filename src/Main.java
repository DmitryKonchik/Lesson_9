import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// First task
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
//  Second task
        Figure[] figures = {
                new Triangle(3, 3, 5),
                new Triangle(9, 3, 7),
                new Circle(7),
                new Rectangle(3, 7),
                new Circle(10)
        };

        double sum = 0;
        for (Figure fig : figures) {
            sum += fig.perimeter();
        }
        System.out.println("\n" + sum);
// Hard task
        ClassToClone cl1 = new ClassToClone(20, "Bob");
        ClassToClone cl2 = cl1.clone();
        System.out.println(cl1.getAge() == cl2.getAge());
        System.out.println(cl1.getName().equals(cl2.getName()));
        cl2.setAge(30);
        System.out.println(cl1.getAge() == cl2.getAge());

    }
}