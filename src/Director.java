public class Director implements PrintingPosition{


    @Override
    public void printPosition() {
        System.out.println("Должность этого человека " + getClass().getName());
    }
}
          