package classDiagrams;

public class Main {
    public static void main(String[] args) {
        Creature creature = new Creature(3,4,45);
        Zombie zombie = new Zombie(4,8,48);
        Cat cat = new Cat(6,9,100);
        Fish fish = new Fish(3,6,64);
        creature.display();
        creature.move();
        zombie.attack(creature);
        cat.attack(fish);
        fish.glubGlub();
    }
}
