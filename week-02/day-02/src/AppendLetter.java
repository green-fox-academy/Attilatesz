import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    private static List<String> appendA(List<String> far) {
        String a = "a";
        List<String> letter = new ArrayList<String>();
        for (int i = 0; i < far.size(); i++) {
            letter.add(far.get(i)+a);
        }return letter;
    }
}