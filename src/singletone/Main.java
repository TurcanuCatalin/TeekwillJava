package singletone;

public class Main {
        public static void main(String[] args) {
            TrySingleton onlyOne = TrySingleton.getObj();
            onlyOne.showObj();
            System.out.println(onlyOne.hashCode());
            TrySingleton onlyOne2 = TrySingleton.getObj();
            onlyOne2.showObj();
            System.out.println(onlyOne2.hashCode());
        }
}
