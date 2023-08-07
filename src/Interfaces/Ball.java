package Interfaces;

public class Ball implements Tossable{
    private String brandName;


    public void Ball(String brandName){
        System.out.println("ball brandName: " + brandName.toUpperCase());

    }
    public String getBrandName() {
        return brandName;
    }
    @Override
    public void toss() {
        System.out.println("ball's method");
    }
    public void bounce(){
        System.out.println("ball bounce");
    }
}
