import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 1, 5, 6, 8, 59);
        multiple(168, 340, "mamta");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("v: " + Arrays.toString(v)); // Print array of strings
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
