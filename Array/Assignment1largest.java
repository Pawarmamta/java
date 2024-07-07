import java.util.Arrays;
public class Assignment1largest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        int big = arr[0];
        for(int i=0; i<5; i++)
        {
            if(arr[i]>big)
            {
                  big = arr[i];                     //O(n)
            }
        }
        System.out.println("largest element is:"+ big);
        Arrays.sort(arr);                         //O(nlogn)
        for(int i=0; i<5; i++)
        {
            System.out.println(arr[i]);          //O(n)
        }

        
    }
    
}
