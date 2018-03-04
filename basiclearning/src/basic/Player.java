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
public class Player {
    String name;
    int score;
    int hp;
    
    void status(){
        System.out.println(name+" is waiting for mission");
        System.out.println("current score : "+score);
        System.out.println("Health : "+hp);
    }
    
    boolean FUBAR(){
        if(hp <=0) return true;
        return false;
    }
}
