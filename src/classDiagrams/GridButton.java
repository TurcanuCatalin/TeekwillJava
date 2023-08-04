package classDiagrams;

public class GridButton extends Button {
    public GridButton(float x, float y){
        super(x,y);
    }

    @Override
    public void display() {
        System.out.println("GridDisplay: ");
    }
}
