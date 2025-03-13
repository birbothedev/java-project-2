package proj2;

public class Ogre extends Enemy {

    public Ogre(){

        this.heightMin = 200;
        this.heightMax = 300;

        this.weightMin = 120;
        this.weightMax = 200;

        this.setHeight();
        this.setWeight();
    }
    @Override
    public String attack() {
        return "Ugh!";
    }
}
