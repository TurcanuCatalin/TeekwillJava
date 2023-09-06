package things;

public class Homework {

    public static String stringy(int size) {
        String result = " ";
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result += '1';
            } else {
                result +='0';
            }
        }
        return result.toString();
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(stringy(6));
        System.out.println(stringy(4));
        System.out.println(stringy(12));
    }

}
