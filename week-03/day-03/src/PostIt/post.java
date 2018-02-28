package PostIt;

public class post {
  public static void main(String[] args) {
    postit postIt = new postit("Orange","Idea1", "Blue");
    postit postIt1 = new postit("Pink","Awesome", "Black");
    postit postIt2 = new postit("Yellow","Superb", "Green");
    System.out.println(postIt2.toString());
  }
}
