public class Toggle_string_charecter{
    public static void main(String [] arg){
        String str = "Hello World!";
         StringBuilder result = new StringBuilder();
         for(int i= 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(ch);
            }
         }
         System.out.println(result.toString());
    }
}