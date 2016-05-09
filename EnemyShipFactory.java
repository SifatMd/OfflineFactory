/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author User
 */
public class EnemyShipFactory {
    
    public EnemyShip makeEnemyShip(String ship){
        EnemyShip theship = null;
        if(ship.equals("U")){
            theship = new UFOEnemyShip();
        }
        else if(ship.equals("R")) {
            theship = new RocketEnemyShip();
        }
        else if(ship.equals("B")){
            theship = new BigUFOEnemyShip();
        }
        
        
        return theship;
        
    }
    
}
