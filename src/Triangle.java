public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (maxSide() < a + b + c - maxSide()) {
            setExist(true);
        }
    }

    private int maxSide() {
        return Math.max(Math.max(a, b), c);
    }

    @Override
    public double area() {
        if (isExist()) {
            return Math.sqrt(perimeter() / 2 * ((perimeter() / 2) - a) * ((perimeter() / 2) - b) * ((perimeter() / 2) - c));
        } else {
            System.out.print("\nТреугольник не существует ");
            return 0;
        }
    }

    @Override
    public double perimeter() {
        if (isExist()) {
            return a + b + c;
        } else {
            System.out.print("\nТреугольник не существует ");
            return 0;
        }
    }
}
