package test.lab11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private float price;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap book:");
        isbn = sc.nextLine();
        bookName = sc.nextLine();
        author = sc.nextLine();
        publisher = sc.nextLine();
        price = Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
