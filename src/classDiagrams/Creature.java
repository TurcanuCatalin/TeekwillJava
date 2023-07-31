package classDiagrams;

public class Creature {
    float x, y, lifeforce;

    public Creature(float x, float y, float lifeforce) {
        this.x = x;
        this.y = y;
        this.lifeforce = lifeforce;
    }

    public void display() {
        System.out.println("This is a creature");
    }

    public void attack(Creature c) {
        System.out.println(c + "has been attacked");
    }

    public void move() {
        System.out.println("The creature has moved");
    }
}
