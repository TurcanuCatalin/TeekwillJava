package classDiagrams;

public class ButtonGroup {
    private  int activeButton;
    private Button [] buttons;

    public ButtonGroup(Button [] buttons){
        for( Button button: buttons){
            button.display();
        }
    }

    public void display() {
        System.out.println("display");;
    }

    public void clicked(int nr1, int nr2) {
        System.out.println();
    }
}
