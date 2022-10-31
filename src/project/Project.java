/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;
import static project.Club.cost;

/**
 *
 * @author DELL
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Players p1=new Players("ahmed",1,"football_players");
        Players p2=new Players("mohamed",2,"football_players");
        Players p3=new Players("ibrahim",3,"handball_players");
        
        ArrayList<Players>football_players=new ArrayList();
        football_players.add(p1);
        football_players.add(p2);
                
        ArrayList<Players>handball_players=new ArrayList();
        handball_players.add(p3);
        
        Club c1=new Club(5000,football_players);
        Club c2=new Club(5000,handball_players);
        
        
        //anoter soln with for !!!
        System.out.println("The number of football players is "+football_players.size()+"\n"+"The number of handball players is "+handball_players.size());
        p1.info();
        p2.info();
        p3.info();
        System.out.print("total is : ");
       System.out.println(cost*1.1*football_players.size()+cost*1.05*handball_players.size());
//        System.out.println(c1.totalsize());
    }
    
}
