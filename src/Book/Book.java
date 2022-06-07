package Book;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Author author = new Author();
        System.out.println("Напишіть автора :");
        author.setAuthor(in.nextLine());
        Title title = new Title();
        System.out.println("Вкажіть назву обкладинки: ");
        title.setTitle(in.nextLine());
        Content content = new Content();
        System.out.println("Вкажіть вміст книги: ");
        content.setContent(in.nextLine());


        author.show();
        title.show();
        content.show();

    }
}
