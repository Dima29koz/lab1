package third;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("maze runner", "fantasy");
        Book d2 = new Book("Harry Potter", "novel");
        Book d3 = new Book("tri bogatiray");
        d3.setGenre("novel");
        d1.setTitle("Maze runner");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
