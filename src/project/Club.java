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
public class Club {
    static double cost;
    ArrayList<Players>clubplayers=new ArrayList();

    public Club(double cost,ArrayList<Players>clubplayers) {
        Club.cost = cost;
        this.clubplayers=clubplayers;
    }
    
//    public int totalsize(){
//        int nofs=0;
//    for(Players player:clubplayers){
//    nofs++;
//}
//return nofs;
//    }
    
    
}
