package proj2;

public class Ghost extends Enemy{

    public Ghost(){
        this.heightMin = 90;
        this.heightMax = 150;

        this.setHeight();
        this.weight = 0;
    }


    @Override
    public String attack() {
        return "Boo!";
    }
}
