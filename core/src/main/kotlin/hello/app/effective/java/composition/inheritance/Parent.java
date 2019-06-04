package hello.app.effective.java.composition.inheritance;

public class Parent extends GrandParent{
    
    public void show() {
        System.out.println("Parent-Show");
    }
    
    public void show2() {
        super.show2();
    }
    
}
