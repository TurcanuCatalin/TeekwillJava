package things;


    public class Singleton {
        private static Singleton singleton;

        private Singleton(){
            System.out.println("Inside a singleton constructor");
            System.out.println("Print me");
        }

        public static Singleton createSingleton(){
            if (singleton == null){
                singleton = new Singleton();
            }
            return singleton;
        }
    }

