import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int s=0;

        Scanner randuri= new Scanner(System.in);
        Scanner coloane= new Scanner(System.in);
        int numbers[][]=new int[3][5];
        Scanner num=new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j]=num.nextInt();
                System.out.println("randul"+i+"are valorile"+numbers[i][j]);
            }

        }


    }
}
