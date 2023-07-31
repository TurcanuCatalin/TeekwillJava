package classDiagrams;

public class Zombie extends Creature{
    public Zombie(float x,float y, float lifeforce){
        super(x, y, lifeforce);
    }

    @Override
    public void display() {
        System.out.println("This is a zomie");
    }

    @Override
    public void attack(Creature c) {
        System.out.println("The zombie has Attacked" + c);
    }

    @Override
    public void move() {
        System.out.println("The zombie has moved ");
    }
}
