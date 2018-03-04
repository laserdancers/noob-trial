/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author User
 */
public class Game {
    public static void main(String[] args){
        Player Shooter = new Player();
        
        Shooter.name = "Col. Philmore";
        Shooter.score = 122;
        Shooter.hp = 84;
       
        
        Shooter.status();
        
        if(Shooter.FUBAR()){
            System.out.println("Mission failed!");
        }
      
    }
}
