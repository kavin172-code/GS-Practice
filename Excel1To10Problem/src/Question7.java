import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        System.out.println(prefix(arr, prefix));
    }

    public static List<String> prefix(String[] str, String prefix) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith(prefix)) {
                result.add(str[i]);
            }
        }
        return result;
    }
}
