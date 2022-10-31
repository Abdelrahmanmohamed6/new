/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author DELL
 */
public class Vip extends Clients{

    public Vip(String name, int id, int paid_money) {
        super(name, id, paid_money);
    }
    
    
    @Override
    int Gain_points(){
        setPoint(20);
        return getPaid_money()*getPoint()/1000;
    }
    
}
