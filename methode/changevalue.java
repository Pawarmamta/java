import java.util.Arrays;

public class changevalue {
    public static void change(int [] num)
    {
        num[0]=89; //if u make a change to the via this refference variable, same object will be change
    }
    public static void main(String [] arg)
    {
        int arr[] ={1,2,3,4,5};
        change(arr);  
        System.out.println(Arrays.toString(arr));

    }
    
}
