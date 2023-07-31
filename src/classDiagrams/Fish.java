package classDiagrams;

public class Fish extends Creature{
    public Fish(float x,float y, float lifeforce){
        super(x, y, lifeforce);
    }

    @Override
    public void display() {
        System.out.println("This is a cat");
    }

    @Override
    public void move() {
        System.out.println("The fish has moved");
    }

    public void glubGlub(){
        System.out.println("Glub Glub");
    }
}
