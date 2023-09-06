package things;

public class Exercise {
//     static ArrayList <Integer> arr =new ArrayList<Integer>();
//    static void multiple(int number, int limit){
//        for (int i = number; i <=limit ; i++) {
//            if (i % number == 0){
//                arr.add(i);
//            }
//        }
//        System.out.println(arr);
//    }
//public static void findMissingLetter(char[] array)
//{
//    char missedLetter = 0;
//    if (array.length >= 2) {
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] + 1 != array[i + 1]) {
//                missedLetter = (char) (array[i] + 1);
//            }
//        }
//    }
//    System.out.println(missedLetter);
//}

static void missing(char[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if ((arr[i+1] - arr[i]) != 1) {
            int ch = (int) arr[i];
            char ch2 = (char)( ch +1);
            System.out.println(ch2);
        }
    }
}

    public static void main(String[] args) {
//        multiple(3,10);
        missing(new char[]{'a', 'b', 'c', 'e'});
    }
}
