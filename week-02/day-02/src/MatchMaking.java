import java.util.*;

public class MatchMaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> boysAndGirls = new ArrayList<>();
        int listLenght = 0;
        for (int i = 0; i < boys.size(); i++) {

            if (girls.size()<= listLenght);
            girls.add(":(((");

            boysAndGirls.add(girls.get(i)+ " + " + boys.get(i));

            listLenght++;


        }return boysAndGirls;
    }
}