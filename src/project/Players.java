/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
enum Player{football_players,handball_players};
public class Players {
    String name;
    int shirt_number;
    Player player;
    
//    ArrayList<String>football_players=new ArrayList();
//    ArrayList<String>handball_players=new ArrayList();    //Not important
    

    public Players(String name, int shirt_number,String type) {
        this.name = name;
        this.shirt_number = shirt_number;
        this.player=Player.valueOf(type);
    }

    
    public double F_b_contractrenewal(){
        return Club.cost*1.1;
    }
    
    public double h_b_contractrenewal(){
        return Club.cost*1.05;
    }
    
        public void info(){
            System.out.println("Player information: \n name :"+name+"\n T-shirt number: "+shirt_number);
            if (player==Player.football_players){
                System.out.println("Football players cost: "+F_b_contractrenewal());   //or directly w.o method
                System.out.println("");
            }
            else{
                System.out.println("handball players cost: "+h_b_contractrenewal());
                System.out.println("");


            }  
        }
        
        
//    public void fbSize(){
//        football_players.size();
//    }
//    
//    public void hbSize(){
//        handball_players.size();
//    }
    
//    public void size(){
//        System.out.println("The number of football players is "+football_players.size()+"\n"+"The number of handball players is "+handball_players.size());
//    }
        
    
}
