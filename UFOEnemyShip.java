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
public class UFOEnemyShip extends EnemyShip{
    public UFOEnemyShip(){
        setName("UFO Enemy Ship");
        setDamage(20.0);
    }
    public void followHeroShip(){
        System.out.println(getName() + " always");
    }
}
