package classDiagrams;

import java.awt.*;

public class Button {
    float x,y,w,h;
    Color selectedColor;
    Color defaultColor;
    boolean selected;
    String label;
    public Button(float x, float y, String label){
        this.x = x;
        this.y = y;
        this.label =label;
    }
    public void display(){
        System.out.println();
    }
}
