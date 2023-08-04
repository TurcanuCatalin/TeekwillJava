package classDiagrams;

public class PShapeButton extends Button {
    private PShapeButton s;
    public PShapeButton(float x,float y, PShapeButton s){
        super(x,y,s.toString());
    }
    @Override
    public void display(){
            System.out.println("the shape display: ");
    }

}
