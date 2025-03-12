package proj2;

public class Goblin extends Enemy {

    int height;
    int weight;

    int heightMin = 70;
    int heightMax = 100;

    int weightMin = 5;
    int weightMax = 10;


    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int setWeight() {

        // i did it this way so i could copy/paste it for every monster without changing variables Lol
        this.weight = (weightMin + (int)(Math.random() * ((weightMax - weightMin) + 1)));
        return weight;
    }

    public int setHeight() {

        // same with this one lol
        this.height = (heightMin + (int)(Math.random() * ((heightMax - heightMin) + 1)));
        return height;
    }

    @Override
    public void attack() {
        System.out.println("Gurgle!");
    }
}
