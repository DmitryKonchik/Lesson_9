public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();

        Figure[] figures = {
                new Triangle(3, 3, 5),
                new Circle(7),
                new Triangle(9, 3, 7),
                new Rectangle(3, 7),
                new Circle(10),
        };

        double sum = 0;
        for (Figure fig : figures) {
            sum += fig.perimeter();
        }
        System.out.println("\n" + sum);
    }
}