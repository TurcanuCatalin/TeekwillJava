package classDiagrams;

import java.awt.*;

public class Button {
    protected  float x,y,w,h;
    protected  Color selectedColor;
    protected  Color defaultColor;
    protected  boolean selected;
    protected  String label;
    public Button(float x, float y, String label){
        this.x = x;
        this.y = y;
        this.label =label;
    }
    public void display(){
        System.out.println("the display: ");
    }
    public void clicked(int nr1, int nr2){
        System.out.println("nr1=" + nr1 + "nr2=" + nr2);
    }
}
