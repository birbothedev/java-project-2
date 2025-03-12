package proj2;

public class Dragon extends Enemy{

    int height;
    int weight;

    int heightMin = 70;
    int heightMax = 100;

    int weightMin = 5;
    int weightMax = 10;

    public int getWeight() {
        return weight;
    }

    public int setWeight() {
        this.weight = (weightMin + (int)(Math.random() * ((weightMax - weightMin) + 1)));
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int setHeight() {
        this.height = (heightMin + (int)(Math.random() * ((heightMax - heightMin) + 1)));
        return height;
    }


    @Override
    public void attack() {
        System.out.println("Rawr!");
    }
}
