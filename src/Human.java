abstract class Human {
    Human(){
        System.out.println("constructor is Running ");
    }
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("Breathing");
    }
}
class man extends Human{
    @Override
    void eat() {
        System.out.println("Anything Eat");
    }

    @Override
    void walk() {
        System.out.println("any Kind of walking ");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("lap dap");
    }
}
class Banuka extends man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("Banuka Breathingh");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Banuka walking");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Banuka eating ");
    }

}
class RunHuman{
    public static void main(String[] args) {
        Human h= new man();
        Human h1 = new Banuka();
        Human b = new Banuka();
        h.breathing();
        h.eat();
        h.walk();
        h1.breathing();
        h1.eat();
        h1.walk();
        b.breathing();
        b.eat();
        b.walk();
    }
}