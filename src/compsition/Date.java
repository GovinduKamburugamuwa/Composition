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
public class Date {
    
    private int day;
    private int month;
    private int year;
    

    
    public void inputDate()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Day: ");  
        this.day=in.nextInt();
        System.out.println("Enter Month: ");  
        this.month=in.nextInt();
        System.out.println("Enter Year: ");  
        this.year=in.nextInt();
    }
    
    public String toString()
    {
        return "The Date :"+this.day+" "+this.month+" "+this.year;
    }
    
}

