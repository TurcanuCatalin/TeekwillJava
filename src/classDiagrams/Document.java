package classDiagrams;

import java.time.LocalDate;
import java.util.Date;

public class Document {
    String [] authors;
    Date date;

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthor(String name){
        System.out.println(name + "is one of the authors of the book");
    }
    public void getDate(){
        System.out.println(LocalDate.now());
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
