import java.util.ArrayList;

public class ArrayListExample { // Renamed class to follow Java naming conventions
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
       list.add(28);
       list.add(20);
       list.add(28);
       list.add(20);
       list.add(80);
       
       list.set(2 ,3);
       list.remove(0);

       System.out.println(list);
     }
}
