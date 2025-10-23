//print name n time;
import java.util.Scanner;

class prob1{

    public static void name(int count ,int n)
    {   
        if( count==n){
         return;
        }
         System.out.println("XYZ");
       
        name(count+1,n);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
          System.out.println("You entered: " + n);
        name(0, n);
        
    }

}

// tc:- O(n)
// stack space:- o(n)(hypothetical)