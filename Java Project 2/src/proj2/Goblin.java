package proj2;

public class Goblin extends Enemy {

    public Goblin(){

        this.heightMin = 70;
        this.heightMax = 100;

        this.weightMin = 5;
        this.weightMax = 10;

        this.setHeight();
        this.setWeight();
    }

    @Override
    public String attack() {
        return "Gurgle!";
    }
}
