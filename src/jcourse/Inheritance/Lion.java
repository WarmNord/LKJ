package jcourse.Inheritance;

public class Lion extends CatFamily {

    public Lion() {
        super(2,5,true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Antelope");
    }
}
