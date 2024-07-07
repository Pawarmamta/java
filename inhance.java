import java.util.Scanner;
import java.util.Arrays;
public class inhance {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter range");
         int n = sc.nextInt();
         int arr[] = new int [n];

         System.out.println("enter array");
         for(int i=0; i<n; i++)
         {
             arr[i] = sc.nextInt();
         }

         System.out.println("array:");
        /*  for(int num :arr)     //for every element in array, print the element.
         {
            System.out.println(num);
         }*/
        System.out.println(Arrays.toString(arr));
         sc.close();
    }
}
