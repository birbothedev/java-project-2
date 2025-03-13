package proj2;

public class Dragon extends Enemy{

    public Dragon(){

        this.heightMin = 750;
        this.heightMax = 2000;

        this.weightMin = 1000;
        this.weightMax = 1500;

        this.setHeight();
        this.setWeight();
    }

    @Override
    public String attack() {
        return "Rawr!";
    }
}
