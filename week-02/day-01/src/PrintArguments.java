//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourth")
// ...



public class PrintArguments {
    public static void main(String[] args) {

        String[] words = {"cat", "dog", "bird", "snake"};

        list(words[2]);

    }

    static void list(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}