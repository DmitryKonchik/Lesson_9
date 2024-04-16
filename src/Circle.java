public class Circle extends Figure {
    private int r;

    public Circle(int r) {
        this.r = r;
        if (r > 0) {
            setExist(true);
        }
    }

    @Override
    public double area() {
        if (isExist()) {
            return Math.PI * Math.pow(r, 2);
        } else {
            System.out.print("\nКруг не существует ");
            return 0;
        }
    }

    @Override
    public double perimeter() {
        if (isExist()) {
            return 2 * Math.PI * r;
        } else {
            System.out.print("\nКруг не существует ");
            return 0;
        }
    }
}
