import java.util.Scanner;

public class input {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("range:" + n);
        int arr[] = new int[n];
        System.out.println("enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("print array:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        String s[] = new String[n];
        System.out.println(s[3]);
        sc.close();
    }

}