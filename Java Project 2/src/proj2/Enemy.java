package proj2;

abstract class Enemy {
    int weight;
    int height;

    int heightMin;
    int heightMax;

    int weightMin;
    int weightMax;

    //i know this is going outside the project requirements,
    // but i wanted to challenge myself to get rid of as much redundancy as possible

    public Enemy() {}

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight() {
        // initially i had the setWeight and setHeight equations inside every subclass (see git commits)
        // but since it was so repetitive i thought it would be better here
        this.weight = (weightMin + (int)(Math.random() * ((weightMax - weightMin) + 1)));
    }

    public void setHeight() {
        this.height = (heightMin + (int)(Math.random() * ((heightMax - heightMin) + 1)));
    }

    public abstract String attack();
}

