package things;

public class Exercitii2 {

        public static String CamelCase(String input) {
            // Split the input string at positions where uppercase letters occur
             String[] words = input.split("(?=\\p{Upper})");
            // Join the words with spaces
             String result = String.join(" ", words);
             return result; }
             public static void main(String[] args) {
             System.out.println(CamelCase("camelCasing"));
            // Output: "camel Casing"
             System.out.println(CamelCase("nuStiu"));
            // Output: "nu Stiu" }
        }
}
