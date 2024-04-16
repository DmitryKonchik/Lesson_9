public abstract class Figure {
    private boolean isExist = false;

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    public abstract double area();

    public abstract double perimeter();
}
