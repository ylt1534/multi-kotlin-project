package hello.app.effective.java.composition.inheritance;

public class GrandParent {
    
    public void show() {
        System.out.println("Grand-Parent-Show");
    }
    
    public void show2() {
        show();
    }
    
}
