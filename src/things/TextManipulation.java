package things;

import java.util.Scanner;

public class TextManipulation {
   /* public static void main(String[] args) {
        //afisam la ecran  mesajul situat in ""
        System.out.println("Hello'World!");
        System.out.println("I am learning Java");
        System.out.println("Java is fun!");
        // atribim variabilei name o valoare (de tip string)
        String name="Catalin";
        System.out.println("Hello, I am "+name);
        // atribuim variabilei age o valoare (de tip integer)
        int age=18;
        // oferim o cantitate mai mica de memorie variabilei age
        byte varsta=(byte)(age);
        System.out.println(name+" are "+age+" ani");
    }*/

    public static void main(String[] args) {
        int [] age ={2,5,7,9,11,13,15};
        int numbers[] = new int[5];
        int s=0;
        int d=0;
        int p=1;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            s=s+numbers[i];
            d=d-numbers[i];
            p=p*numbers[i];
        }
        System.out.println(s);
        System.out.println(d);
        System.out.println(p);
        }


}
