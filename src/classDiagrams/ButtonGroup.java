package classDiagrams;

public class ButtonGroup extends Button{
    private  int activeButton;
    private Button [] buttons;

    public ButtonGroup(Button [] buttons){
        super(buttons);
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void clicked(int nr1, int nr2) {
        super.clicked(nr1, nr2);
    }
}
