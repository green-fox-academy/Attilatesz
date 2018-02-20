import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        containsSeven(list);


        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray"
        // otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }

    private static ArrayList containsSeven(ArrayList<Integer> arrayList) {
            if (arrayList.contains(7)){
                System.out.println("Hoorray");
            }else {
                System.out.println("Nooooo");
            }

        return arrayList;
    }
}