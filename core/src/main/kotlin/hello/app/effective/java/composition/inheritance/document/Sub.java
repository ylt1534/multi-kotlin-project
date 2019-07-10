package hello.app.effective.java.composition.inheritance.document;

import java.time.Instant;

public class Sub extends Super{
    // blank final, set by constructor
    private final Instant instant;

    Sub() {
        instant = Instant.now();
    }
    // overriding method invoked by superclass constructor
    @Override public void overrideMe() {
        System.out.println("sss");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }

}
