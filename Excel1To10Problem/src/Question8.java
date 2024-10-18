import java.util.HashMap;

public class Question8 {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("12345"));
        System.out.println(firstNonRepeatingChar("abbacd"));
    }
    public static Character firstNonRepeatingChar(String s){
        HashMap<Character, Integer>  map= new HashMap<>();
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Character c: s.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return null;
    }
}
