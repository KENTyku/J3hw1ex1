/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3hw1ex1;
/**
 *
 * @author Yuri Tveritin
 */
public class J3hw1ex1{
    
    public static void main(String[] args) {           
            Obj[] ar = new Obj[2];
            ar[0] = new Obj("Yuri",33);   
            ar[1] = new Obj("Ron",30);            
            ArrayObj mas=new ArrayObj(ar);
            System.out.print(mas.getAr()[0].getName());
            System.out.println(mas.getAr()[0].getAge());
            mas.arrayChange(mas);            
            System.out.print(mas.getAr()[0].getName());
            System.out.println(mas.getAr()[0].getAge());
    }
}



	