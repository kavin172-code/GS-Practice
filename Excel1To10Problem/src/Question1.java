import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {

    public static void main(String[] args) {
        System.out.println(convertToGivenFormat("aabbb"));
        System.out.println(convertToGivenFormat1("aaabb"));
    }
    //Approach1
    public static String convertToGivenFormat(String s){
        StringBuilder sb = new StringBuilder();
        Map<String, Long> map =Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        for(Map.Entry<String,Long> m: map.entrySet()){
            sb.append(m.getKey()).append(m.getValue());
        }
        return sb.toString();
    }
    //Approach2
    public static String convertToGivenFormat1(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) == s.charAt(i)){
                count++;
            }
            else{
                sb.append(s.charAt(i-1)).append(count);
                count=1;
            }
        }
        return  sb.append(s.charAt(s.length()-1)).append(count).toString();
    }
}
