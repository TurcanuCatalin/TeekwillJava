package classDiagrams;

import java.time.LocalDate;
import java.util.ArrayList;

public class Document {
    ArrayList<String> authors = new ArrayList<>();
    LocalDate date;

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String name){
        authors.add(name);
        System.out.println(name + " is the author of the book");
    }
    public void getDate(){
        date = LocalDate.now();
        System.out.println(date);
    }
//ArrayList<String> theAuthors = new ArrayList<String>();
//    Scanner sc = new Scanner(System.in);
//    String name = sc.nextLine();
//     while (nam)
//    {
//        theAuthors.add(name);
//        System.out.println(theAuthors.toString());
//    }

}
