abstract public class Section {
    Section (){
        System.out.println("The best Students in School");
    }
    abstract  void gradeSix ();
    abstract void gradeSeven();
    void gradeEight(){
        System.out.println("best Student in Grade 8-A");
    }
}

class student extends Section {
    @Override
    void gradeSix() {
        System.out.println("The english Student goes to Grade 6-A");
    }

    @Override
    void gradeSeven() {
        System.out.println("The Science Student goes to Grade 7-A");
    }

    @Override
    void gradeEight() {
        super.gradeEight();
        System.out.println("The Maths Student goes to Grade 8-A");
    }
}

class Best extends student  {
    @Override
    void gradeEight() {
        super.gradeEight();
        System.out.println("The best  Biology Student goes to Grade 12-A");
    }

    @Override
    void gradeSix() {
        super.gradeSix();
        System.out.println("The Chemistry Student goes to Grade 12-B");
    }

    @Override
    void gradeSeven() {
        super.gradeSeven();
        System.out.println("The Physics Student goes to Grade 12-G");
    }
}
class Teacher extends Best{
    @Override
    void gradeEight() {
        super.gradeEight();
        System.out.println("The Best Biology Teacher  goes to Grade 12-B");
    }

    @Override
    void gradeSix() {
        super.gradeSix();
        System.out.println("The Best Chemistry Teacher goes to Grade 12-H");
    }

    @Override
    void gradeSeven() {
        super.gradeSeven();
        System.out.println("The Physics Teacher goes to Grade 12-F");
    }
}
class runSchool{
    public static void main(String[] args) {
        Section s = new student();
        Section s1 = new Best();
        Section s2 = new Teacher();
        s.gradeSix();
        s.gradeSeven();
        s.gradeEight();
        s1.gradeSix();
        s1.gradeSeven();
        s1.gradeEight();
        s2.gradeSix();
        s2.gradeSeven();
        s2.gradeEight();
    }
}