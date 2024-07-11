public class Minimum_no {
    public static void main(String[] args) {
         int [] arr =  {20,14,90,17,99,30,56,9,100};
         int ans = minimumno(arr);
         System.out.println(ans);
    }
    public static int minimumno(int []arr) {
        int small =arr[0];
         for(int i=0; i<arr.length; i++)
         {
            if(arr[i]<small)
            {
                small=arr[i];

            }
         }
         return small;
    }
    
}
