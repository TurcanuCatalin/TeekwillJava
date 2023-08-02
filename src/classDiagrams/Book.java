package classDiagrams;

import java.util.Scanner;

public class Book extends Document{
    String title;


    public String getTitle() {
        System.out.println("The title of the book is");
        Scanner scanner = new Scanner(System.in);
        title = scanner.nextLine();
        return title;
    }
}
