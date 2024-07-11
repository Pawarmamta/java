/**
 * Que1
 */
public class Search_for_intValue{
  public static void main(String[] arg)
  {
     int [] arr = {18,12,9,14,77,50};
     int t =27;
     int ans = linearsearch(arr,t);
     System.err.println(ans);
    
    
  }
  public static int linearsearch(int []arr,int t)
  {
    for(int i=0; i<arr.length; i++)
    {
       if(arr[i]==t)
       {
           System.out.println("exist in the array at index: ");
           return i;
       }
       
    }
    return -1;
  }
}
