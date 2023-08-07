package Interfaces;

public class Baseball extends Ball{
    public void Baseball(String brandName){
        System.out.println("Baseball brandName: " + brandName.toUpperCase());
    }

    @Override
    public void toss() {
        System.out.println("baseball toss");
    }

    @Override
    public void bounce() {
        System.out.println("baseball bounce");
    }
}
