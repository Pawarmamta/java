public class Search_In_range {
        public static void main(String[] arg)
        {
           int [] arr = {18,12,9,14,77,50};
           int t =18;
           int ans = linearsearch(arr,t ,1,4);
           System.err.println(ans);
          
          
        }
        public static int linearsearch(int []arr,int t, int start,int end)
        {
          for(int i=start; i<end; i++)
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
      