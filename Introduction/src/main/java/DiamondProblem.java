
interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B {
    default void show() {
        System.out.println("B's show");
    }
}

class C implements A, B {
    @Override
    public void show() {
        // Explicitly resolve the conflict
        A.super.show();  // or B.super.show()
        System.out.println("C's own show");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}