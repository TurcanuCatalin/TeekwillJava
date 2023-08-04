package classDiagrams;

public class PImageButton  extends Button{
 private PImageButton img;

    public PImageButton(float x, float y, PImageButton img) {
        super(x,y, img.toString());
    }
    @Override
    public void display(){
        System.out.println("the image display: ");
    }
//    public void display(){
//        System.out.println("this is the image;");
//    }
}
