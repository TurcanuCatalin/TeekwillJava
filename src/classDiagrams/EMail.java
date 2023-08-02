package classDiagrams;

import java.util.Scanner;

public class EMail extends Document{
    String subject;
    String [] to;

    public String getSubject() {
        System.out.println("The subject is: ");
        Scanner scanner = new Scanner(System.in);
        subject = scanner.nextLine();
        return subject;
    }

    public String [] getTo() {
        System.out.println("To: ");
        Scanner scanner = new Scanner(System.in);
        to = new String[]{scanner.nextLine()};
        return to;
    }
}
