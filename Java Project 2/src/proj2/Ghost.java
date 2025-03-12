package proj2;

public class Ghost extends Enemy{

    int weight;
    int height;

    int heightMin = 90;
    int heightMax = 150;

    public Ghost (){
        this.weight = 0;
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
        System.out.println("Boo!");
    }
}
