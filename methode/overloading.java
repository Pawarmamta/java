public class overloading {
    public static void main(String[] args) {
        fun("mamta", "pawar");
        fun(113 ,"ishi");
    }

    public static void fun(String fname, String lname) {

        System.out.println(fname + lname);

    }

    public static void fun(int a ,String name) {
        System.out.println(a);
        System.out.println(name);
    }
}
