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
public class Name {
    
    private String firstname;
    private String middlename;
    private String lastname;
    
  
    
    public void inputName()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name: ");  
        this.firstname=input.nextLine();
        System.out.println("Enter Middle Name: ");  
        this.middlename=input.nextLine();
        System.out.println("Enter Last Name: ");  
        this.lastname=input.nextLine();
    }
    
    public String toString()
    {
        return "The Full Name :"+this.firstname+" "+this.middlename+" "+this.lastname;
    }
    
}
