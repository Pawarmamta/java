
// print linearly from n to 1 without  linearno(counter-1, n)
//  hint:-backtraking

public class prob5 {

    public static void linearno(int counter, int n){
        if(counter>n){return;}// bace case of recursion
        
        
        linearno(counter+1, n);
         System.out.println(counter);
        //kept after the call
    }


    public static void main(String[] args) {
        int n=4;
        linearno(1, n);
        
    }
    
}
