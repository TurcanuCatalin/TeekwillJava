package things;

import java.util.HashMap;

public class Lesson {
    public static void main(String[] args) {

        HashMap<String, Integer> pachete = new HashMap<String, Integer>();
        pachete.put("Romania", 8);
        pachete.put("Grecia",6);
        pachete.put("Spania",15);
        pachete.put("Italia", 30);
        pachete.put("Germania",27);
        System.out.println("Pachete - " + pachete);

        HashMap<String, Integer> colete = new HashMap<String, Integer>();
        colete.putAll(pachete);
        System.out.println("Colete - " + colete);

        System.out.println(pachete.remove("Grecia"));
        System.out.println(pachete);
        System.out.println(colete.replace("Romania",8,20));
        System.out.println(colete);
        colete.clear();
        System.out.println("Colete - " + colete);
        System.out.println("Pachete - " + pachete);
    }
}
