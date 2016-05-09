
package factory;
import java.util.Scanner;

public class Factory {

    
    public static void main(String[] args) {
        EnemyShipFactory fact = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        
        theEnemy = new UFOEnemyShip();
        theEnemy.followHeroShip();
        
        /*System.out.println("Enter choice:(U/R/B) ");
        Scanner a = new Scanner(System.in);
        if(a.hasNextLine()){
            String b = a.nextLine();
            theEnemy = fact.makeEnemyShip(b);
        }
        if(theEnemy!=null){
            doStuffEnemy(theEnemy);
        }
        else System.out.println("Enter R/U/B");*/
        
         
    }
    public static void doStuffEnemy(EnemyShip theship){
        theship.displayEnemyShip();
        theship.followHeroShip();
        theship.enemyShipShoots();
    }
    
}
