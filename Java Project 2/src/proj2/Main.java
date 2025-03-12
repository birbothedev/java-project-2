package proj2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Ghost ghost = new Ghost();
        int ghostheight = ghost.setHeight();
        System.out.print(ghostheight);

        Goblin goblin = new Goblin();
        int goblinheight = goblin.setHeight();
        System.out.print(golbinheight);
    }
}