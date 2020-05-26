
package gestion_ressources_humains;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;
public class promotion {
    private float date;
    private ArrayList<Employées> Employees;
    
    //constructeur

    public promotion(float date) {
        this.date= date;//la date cité l'hors du jour
        this.Employees = new ArrayList<>();
    }
    //getters and setters

    public float getdate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public ArrayList<Employées> getEmployees() {
        return Employees;
    }

    public void setEmployees(ArrayList<Employées> Employees) {
        this.Employees = Employees;
    }
    
    
    //méthodes
     public void calcule_duré(int k, String r){
         for (int i = 0; i<Employees.size();i++)
             if(Employees.get(i).getdate()<6)
             { if(k==1)//réussi le concours
               {
                 System.out.println("le nouveau échellon est:"+r);
                 Employees.get(i).setEchllon(r);
               } 
               else if(k==0)//échc
                 {
                 
                 Employees.get(i).setEchllon(Employees.get(i).getEchllon());
                 }
            
             
            }else if(Employees.get(i).getdate()>=6)
               {
                System.out.println("le nouveau échellon est:"+r);
                 Employees.get(i).setEchllon(r); 
               }
         
     }
    //affichage

    @Override
    public String toString() {
        return "promotion{" + "date=" + date + ", Employees=" + Employees + '}';
    }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
