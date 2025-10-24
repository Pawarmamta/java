// sum of first n numbers :
// 1. Parameterised

// public class prob6{
//     public static void sum(int i , int sum)
//     {
//         if (i<0) {
//             System.err.println(sum);
//             return;
//         }
//         sum(i-1,sum+i);

//     }
//     public static void main(String[] arg)
//     {
//        int i=3;
//        sum(i ,0);
//     }
// }

// 2. functional
public class prob6 {
    public static int sum(int n) {
        if (n == 0) {
            return 0;           // base case
        }
        return n + sum(n - 1);  // recursive case
    }

    public static void main(String[] arg) {
        int i = 3;
        System.out.print(sum(i));
    }
}
