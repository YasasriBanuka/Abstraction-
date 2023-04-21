abstract public class Bike  {
    abstract void ride ();
}
class yamahaFZ extends Bike{
    @Override
    void ride() {
        System.out.println("Ride Safety");
    }

    public static void main(String[] args) {
        Bike  y = new  yamahaFZ ();
        y.ride();
    }
}