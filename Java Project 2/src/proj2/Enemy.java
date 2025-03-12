package proj2;

abstract class Enemy {
    int weight;
    int height;


    public abstract void attack();

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int setWeight() {
        return weight;
    }

    public int setHeight() {
        return height;
    }

}
