package Book;

public class Author {
    public String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    void show(){
        System.out.println("Імя автора: " + author);
    }
}