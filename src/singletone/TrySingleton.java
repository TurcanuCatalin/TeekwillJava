package singletone;

public class TrySingleton {
    private static TrySingleton obj;
    private TrySingleton() {
    }
    public static TrySingleton getObj() {
        if (obj == null) {
            obj = new TrySingleton();
        }
        return obj;
    }
    public void showObj(){
        System.out.println("The Singleton Object");
    }
}
