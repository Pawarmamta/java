import java.util.*;
public class passint{
     public static int summ(int n, int m)
     {
        
        int sum =n+m;
       return sum;
     }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();
        System.out.println("m:");
        int m = sc.nextInt();
         int addition =summ(n,m);
         System.out.println(addition);
        sc.close();
    }
}