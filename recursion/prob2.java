// print linearly from 1 to n if n=4 then print 1,2,3,4

public class prob2 {

    public static void linearno(int counter, int n){
        if(counter>n){return;}// bace case of recursion
        
        System.out.println(counter);
        linearno(counter+1, n);
    }


    public static void main(String[] args) {
        int n=4;
        linearno(1, n);
        
    }
    
}
