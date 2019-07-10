package hello.app.effective.java.composition.inheritance.prefer.interfacee;

public interface DefaultMethodsInterface {

    String show();

    default String slogan() {
        return "hello world";
    }

    default void display() {
        System.out.println(slogan());
    }
}
