/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public class bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ArrayList <Clients>clients=new ArrayList<>();
        clients.add(new Normal("ali",1,5000));         //****************
        clients.add(new Normal("ibrahim",2,2000));        
        clients.add(new Normal("hossam",3,3000)); 
        clients.add(new Vip("carem",4,1000));         
        clients.add(new Vip("ibrahim",5,20000));        
        clients.add(new Vip("hossam",6,16000)); 

        

        TheBank bank=new TheBank(clients);
                 

        for(Clients c :clients){
//           if (c instanceof Vip){
//               System.out.println("0.0");              
//           }
            System.out.println(c.toString());
            
        }
        
    }
    
}
