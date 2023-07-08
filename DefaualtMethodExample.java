package lambdaEx;

interface MyInterface {
    default void display() {
        System.out.println("This is dummy definition");
    }
}

public class DefaualtMethodExample implements MyInterface {

    public static void main(String[] args) {
        DefaualtMethodExample obj = new DefaualtMethodExample();
        obj.display();
    }
}
