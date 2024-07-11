public class Search_for_String {
    public static void main(String[] args) {
        String name = "Kunal Sir";
        char target = 'r';
        System.out.println(search1stmethode(name,target));
        System.out.println(search2ndtmethode(name,target));
    }

    public static boolean search1stmethode(String name, char target)
    {

        if (name.length()==0)
        {
            return false;
        }
        for(int i=0; i<name.length(); i++)
        {
            if(target== name.charAt(i))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean search2ndtmethode( String name, char t) {
        if(name.length()==0)
        {
            return false;
        }
         for(char ch :name.toCharArray()){ // Here string is first converting in charecter array .
            if(ch == t)
            {
                return true;
            }
         }
         return false;

        
    }
    
}
