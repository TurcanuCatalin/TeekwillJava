package classDiagrams;

import java.time.LocalDate;

public class Document {
    String [] authors;
    LocalDate date;

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthor(String name){
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
