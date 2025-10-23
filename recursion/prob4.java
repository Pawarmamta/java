
// print linearly from 1 to n without  linearno(counter+1, n)
//  hint:-backtraking

public class prob4 {

    public static void linearno(int counter, int n){
        if(counter<1){return;}// bace case of recursion
        
        
        linearno(counter-1, n);
        System.out.println(counter);//kept after the call
    }


    public static void main(String[] args) {
        int n=4;
        linearno(n, n);
        
    }
    
}
