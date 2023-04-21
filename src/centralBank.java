abstract public class centralBank {
    abstract int interestRate();

}
class BOC extends centralBank{
    @Override
    int interestRate() {
        return 5;
    }
}
class NDB extends centralBank {
    @Override
    int interestRate() {
        return 18;
    }
}
class run {
    public static void main(String[] args) {
        centralBank cb;
        cb = new BOC();
        System.out.println("BOC Bank interestRate is :- cb.interestRate() + %");
        cb = new NDB();
        System.out.println("NDB Bank interestRate is + cb.interestRate() + %");

    }
}