package test.static2306;

public class TestStatic2306 {
    int anInt;
    static int staticInt;

    public static void main(String[] args) {
        TestStatic2306 c1 = new TestStatic2306();
        System.out.println("anInt of c1 = " + (++c1.anInt));
        System.out.println("staticInt of c1 = " + (++c1.staticInt));
        TestStatic2306 c2 = new TestStatic2306();
        System.out.println("anInt of c2 = " + (++c2.anInt));
        System.out.println("staticInt of c2 = " + (++c2.staticInt));
    }
}
