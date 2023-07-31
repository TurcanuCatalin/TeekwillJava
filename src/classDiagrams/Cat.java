package classDiagrams;

public class Cat extends Creature{
    public Cat(float x,float y, float lifeforce){
        super(x, y, lifeforce);
    }

    @Override
    public void display() {
        System.out.println("This is a cat");
    }

    @Override
    public void attack(Creature c) {
        System.out.println("The cat has Attacked" + c);
    }

    @Override
    public void move() {
        System.out.println("The cat has moved");
    }
}
