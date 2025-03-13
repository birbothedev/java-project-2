package proj2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Enemy> enemyList = new ArrayList<>();

        for(int i=0; i < 10; i++){
            // get random number 1-4
            int randomNumber = (int)((Math.random() * 4) + 1);

            Enemy generatedEnemies = generateEnemy(randomNumber);
            enemyList.add(generatedEnemies);
        }

        // loop through enemies array
         for(Enemy enemy : enemyList){
             System.out.println(enemy.attack());
//             System.out.println(enemy.getHeight());
//             System.out.println(enemy.getWeight());
         }
    }

    // initially i had all this happening inside the for loop but i wanted to clean up the main class so i added a function to do it
    public static Enemy generateEnemy(int i){
        if (i == 1){
            Ghost ghost = new Ghost();
            ghost.setHeight();
            ghost.setWeight();
            return ghost;
        } else if (i == 2){
            Goblin goblin = new Goblin();
            goblin.setHeight();
            goblin.setWeight();
            return goblin;
        } else if (i == 3){
            Ogre ogre = new Ogre();
            ogre.setHeight();
            ogre.setWeight();
            return ogre;
        } else {
            Dragon dragon = new Dragon();
            dragon.setHeight();
            dragon.setWeight();
            return dragon;
        }
    }
}