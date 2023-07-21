package things;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int sumt =0;
        int sumr[]=new int[3];
        int sumc[]=new int[5];
        int numbers[][]=new int[3][5];
        Scanner num=new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j]=num.nextInt();
            }
        }

        int max=numbers[0][0];
        int min=numbers[0][0];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                max=Math.max(numbers[i][j],max);
                min=Math.min(numbers[i][j],min);
                sumt += numbers[i][j];

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            ;

            for (int j = 0; j < numbers[i].length; j++) {
                int i1 = numbers[i][j];
                sumr[i] += i1;
                int j1 = numbers[i][j];
                sumc[j] +=j1;

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
                System.out.print(Arrays.toString(numbers[i]));
            System.out.println();
        }
        System.out.println("max="+ max);
        System.out.println("min=" + min);
        System.out.println("sumt=" + sumt);
        System.out.println("sumr="+Arrays.toString(sumr));
        System.out.println("sumc="+ Arrays.toString(sumc));



    }
}
