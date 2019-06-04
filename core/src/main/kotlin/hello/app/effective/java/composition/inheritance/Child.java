package hello.app.effective.java.composition.inheritance;

public class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child-Show");
    }
    
    @Override
    public void show2() {
        super.show2();
    }
}
