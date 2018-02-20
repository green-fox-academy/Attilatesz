public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


        String toDo = "My todo: \n";
        String downloads = " - Download games\n";
        String diablo = "     - Diablo";

        todoText = toDo.concat(todoText).concat(downloads.concat(diablo));
        System.out.print(todoText);
    }
}