/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compsition;

import java.util.Scanner;

/**
 *
 * @author MAX
 */
public class Employee {
    
    public Name name;
    public Date date;
    public String nic;

    public Employee() {
    }
     
    
    public Employee(Name name,Date date)
    {
         this.name= name;
         this.date=date;

    }
    
       public void inputNic()
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter NIC: ");  
        this.nic=inp.nextLine();
    }
    public String toString()
    {
        return this.name+"\n"+this.date+"\n"+"The NIC:"+this.nic;
    }
    
}
