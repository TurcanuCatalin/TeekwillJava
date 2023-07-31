package nested;

public class Slist {
    private Element head;

    public  void insertFirst(Object value){
        head = new Element(value, head);
    }
     private static class Element{
        private Object value;
        private Element next;

        public  Element(Object value, Element next){
            this.value = value;
            this.next = next;
        }
         public Element(Object value){
             this.value = value;
             this.next = null;
         }
     }
     private class InterClass{
        public InterClass(){
            System.out.println("Hello");
        }
     }
}
