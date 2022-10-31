/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author DELL
 */
public abstract class Clients {
    private int paid_money ,point ,id;
    private String name; 

    public Clients(  String name ,int id,  int paid_money) {
        this.paid_money = paid_money;
        this.id = id;
        this.name = name;
    }



    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPaid_money() {
        return paid_money;
    }

    public void setPaid_money(int paid_money) {
        this.paid_money = paid_money;
    }
    
    
    
    abstract int Gain_points();

    
    @Override
    public String toString() {
        if(this instanceof Vip){
            System.out.println("** THIS VIP CLIENTS **");
        }
        return "Clients{" + "paid_money=" + paid_money + ", id=" + id + ", name=" + name + " ,Gained points is : "+Gain_points()+'}';
    }


    
    
    
    
    
    
}
