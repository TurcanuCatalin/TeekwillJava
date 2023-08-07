package Interfaces;

public class Football extends Ball{
    public void Football(String brandName){
        System.out.println("Football brandName: " + brandName.toUpperCase());
    }
    @Override
    public void toss() {
        System.out.println("football toss method");
    }

    @Override
    public void bounce() {
        System.out.println("football bounce");
    }
}
