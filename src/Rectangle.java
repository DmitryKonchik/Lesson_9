public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        if (a > 0 && b > 0) {
            setExist(true);
        }
    }

    @Override
    public double area() {

        if (isExist()) {
            return a * b;
        } else {
            System.out.print("\nПрямоугольник не существует ");
            return 0;
        }
    }

    @Override
    public double perimeter() {

        if (isExist()) {
            return (a * 2) + (b * 2);
        } else {
            System.out.print("\nПрямоугольник не существует ");
            return 0;
        }
    }
}
