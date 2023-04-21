abstract public class shape {
    abstract void draw ();
}
class rectangle extends shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle ");
    }
}
class  circle extends shape{
    @Override
    void draw() {
        System.out.println("Drawing circle ");
    }
}
class text{
    public static void main(String[] args) {
        shape s= new rectangle();
        shape s2= new circle();
        s.draw();
        s2.draw();
    }
}
