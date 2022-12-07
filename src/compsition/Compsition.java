/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compsition;

/**
 *
 * @author MAX
 */
public class Compsition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date ob1 = new Date();
        Name ob2 = new Name();
        Employee ob3 = new Employee(ob2,ob1);
        
        ob2.inputName();
        ob1.inputDate();
        ob3.inputNic();
        System.out.println(ob3);
    }
    
}
