// print linearly from n to 1 if n=4 then print 4,3,2,1

public class prob3 {

    public static void linearno(int counter, int n){
        if(counter<1){return;}// bace case of recursion
        
        System.out.println(counter);
        linearno(counter-1, n);
    }


    public static void main(String[] args) {
        int n=4;
        linearno(n, n);
        
    }
    
}
